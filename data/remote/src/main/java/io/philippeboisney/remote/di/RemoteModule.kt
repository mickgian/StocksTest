package io.philippeboisney.remote.di

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import io.philippeboisney.remote.StockDataSource
import io.philippeboisney.remote.StocksService
import io.philippeboisney.remote.UserDatasource
import io.philippeboisney.remote.UserService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun createRemoteModule(baseUrl: String) = module {

    factory<Interceptor> {
        HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    factory { OkHttpClient.Builder().addInterceptor(get()).addInterceptor(ApiKeyInterceptor()).build() }

    single {
        Retrofit.Builder()
                .client(get())
                .baseUrl(baseUrl)
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    // factory{ get<Retrofit>().create(UserService::class.java) }
    // factory { UserDatasource(get()) }

    factory { get<Retrofit>().create(StocksService::class.java) }
    factory { StockDataSource(get()) }
}

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val originalRequest = chain.request()
        val requestBuilder = originalRequest.newBuilder()
            .header("x-rapidapi-key", "cf182eb482msh0cf768cef2fa79ap1e6143jsn07159361db23")
            .header("useQueryString", "true")
        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}