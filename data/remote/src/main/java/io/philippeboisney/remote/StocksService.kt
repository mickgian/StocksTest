package io.philippeboisney.remote

import io.philippeboisney.model.Stocks
import io.philippeboisney.model.SummaryStock
import io.philippeboisney.model.financialEndpointModels.StockFinancialModel
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import retrofit2.http.Url

interface StocksService {

    @GET("market/v2/get-summary")
    suspend fun fetchStocksAsync(@Query("region") region: String = "IT"): Stocks

    @GET("stock/v2/get-summary")
    suspend fun fetchStocksDetailsAsync(@Query("symbol") symbol: String): SummaryStock

    @GET
    suspend fun fetchStockFinancialAsync(
        @Url url: String,
        @Query("symbol") symbol: String,
        @Query("region") region: String?
    ): StockFinancialModel
}