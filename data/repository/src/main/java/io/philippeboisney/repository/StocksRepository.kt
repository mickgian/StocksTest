package io.philippeboisney.repository

import android.util.Log
import io.philippeboisney.model.Stocks
import io.philippeboisney.model.SummaryStock
import io.philippeboisney.remote.StockDataSource
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.Deferred

interface StocksRepository {
    suspend fun getStocksResource() : Resource<Stocks>
    suspend fun getStocksDetailResource(symbol: String) : Resource<SummaryStock>
}

class StocksRepositoryImpl(private val dataSource: StockDataSource) : StocksRepository {
    override suspend fun getStocksResource(): Resource<Stocks> {

        return try {
            val response = dataSource.fetchStocksAsync().await()
            Resource(Resource.Status.SUCCESS, response)
        } catch (e: Exception) {
            Resource(Resource.Status.ERROR)
        }
    }

    override suspend fun getStocksDetailResource(symbol: String): Resource<SummaryStock> {
        return try {
            val response = dataSource.fetchStocksDetailsAsync(symbol).await()
            Log.d(response.toString(), "Test")
            Resource(Resource.Status.SUCCESS, response)
        } catch (e: Exception) {
            Resource(Resource.Status.ERROR)
        }
    }
}