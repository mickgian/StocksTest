package io.philippeboisney.remote

import io.philippeboisney.model.Stocks
import io.philippeboisney.model.SummaryStock
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface StocksService {

    @GET("market/v2/get-summary")
    fun fetchStocksAsync(@Query("region") region: String = "IT"): Deferred<Stocks>

    @GET("stock/v2/get-summary")
    fun fetchStocksDetailsAsync(@Query("symbol") symbol: String,  @Query("region") region: String = "IT"): Deferred<SummaryStock>
}