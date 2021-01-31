package io.philippeboisney.remote

import io.philippeboisney.model.Stocks
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface StocksService {

    @GET("market/v2/get-summary")
    fun fetchStocksAsync(@Query("region") region: String = "IT"): Deferred<Stocks>

//    @GET("users/{login}")
//    fun fetchStocksDetailsAsync(@Path("login") login: String): Deferred<Stocks>
}