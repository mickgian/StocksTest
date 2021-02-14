package io.philippeboisney.repository

import android.util.Log
import io.philippeboisney.model.Stocks
import io.philippeboisney.model.SummaryStock
import io.philippeboisney.model.financialEndpointModels.StockFinancialModel
import io.philippeboisney.remote.StockDataSource
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.Deferred

const val TAG = "StockRepository"

interface StocksRepository {
    suspend fun getStocksResource()
    : Resource<Stocks>
    suspend fun getStocksDetailResource(
        symbol: String
    ) : Resource<SummaryStock>
    suspend fun getStockFinancial(
        symbol: String,
        region: String?
    ) : Resource<StockFinancialModel>
}

class StocksRepositoryImpl(private val dataSource: StockDataSource) : StocksRepository {

    override suspend fun getStocksResource(): Resource<Stocks> {

        return try {
            val response = dataSource.fetchStocksAsync()
            Resource.success(response)
        } catch (e: Exception) {
            Resource.error(e.message)
        }
    }

    override suspend fun getStocksDetailResource(symbol: String): Resource<SummaryStock> {
        return try {
            val response = dataSource.fetchStocksDetailsAsync(symbol)
            Log.d(TAG, ": $response")
            Resource.success(response)
        } catch (e: Exception) {
            Resource.error(e.message)
        }
    }

    override suspend fun getStockFinancial(
        symbol: String,
        region: String?
    ): Resource<StockFinancialModel> {

        return try {
            val response = dataSource.fetchStockFinancialAsync(
                url = STOCK_FINANCIAL_ENDPOINT,
                symbol = symbol,
                region = region
            )
            Resource.success(response)
        } catch (e: Exception) {
            Resource.error(e.message)
        }
    }

    companion object{
        const val STOCK_FINANCIAL_ENDPOINT = "stock/v2/get-financials"
    }

}