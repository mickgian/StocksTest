package io.philippeboisney.repository

import android.util.Log
import io.philippeboisney.model.Stocks
import io.philippeboisney.remote.StockDataSource
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.Deferred

interface StocksRepository {
    suspend fun getStocksWithCache() : Stocks
}

class StocksRepositoryImpl(private val dataSource: StockDataSource) : StocksRepository {
    override suspend fun getStocksWithCache(): Stocks {
        val response = dataSource.fetchStocksAsync().await()
        return response
    }
}