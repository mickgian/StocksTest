package io.philippeboisney.repository

import io.philippeboisney.model.Stocks
import io.philippeboisney.remote.StockDataSource
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.Deferred

interface StocksRepository {
    suspend fun getStocksWithCache() : Resource<List<Stocks>>
}

class StocksRepositoryImpl(private val dataSource: StockDataSource) : StocksRepository {
    override suspend fun getStocksWithCache(): Resource<List<Stocks>> {
        val response = dataSource.fetchStocksAsync()
        return Resource.success(data = response)
    }
}