package io.philippeboisney.repository

import androidx.lifecycle.LiveData
import io.philippeboisney.local.dao.StocksBaseDao
import io.philippeboisney.model.ApiResult
import io.philippeboisney.model.Stocks
import io.philippeboisney.remote.StockDataSource
import io.philippeboisney.repository.utils.NetworkBoundResource
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.Deferred
import java.util.*

interface StocksRepository {
    suspend fun getStocksWithCache(forceRefresh: Boolean = false) : LiveData<Resource<<List<Stocks.Result>>>
}

class StocksRepositoryImpl(private val dataSource: StockDataSource, private val dao: StocksBaseDao<Stocks.Result>) : StocksRepository {
    override suspend fun getStocksWithCache(forceRefresh: Boolean): LiveData<Resource<Stocks.Result>> {
        return object : NetworkBoundResource<List<Stocks.Result>, ApiResult<Stocks.Result>>() {
            override fun createCallAsync(): Deferred<ApiResult<Stocks.Result>> {
                TODO("Not yet implemented")
            }

            override suspend fun loadFromDb(): List<Stocks.Result> {
                TODO("Not yet implemented")
            }

            override fun processResponse(response: List<Stocks.Result>): List<Stocks.Result> {
                TODO("Not yet implemented")
            }

            override suspend fun saveCallResults(items: List<Stocks.Result>) {
                TODO("Not yet implemented")
            }

            override fun shouldFetch(data: List<Stocks.Result>?): Boolean {
                TODO("Not yet implemented")
            }

        }
    }
}