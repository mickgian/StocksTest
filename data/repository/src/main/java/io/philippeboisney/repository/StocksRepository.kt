package io.philippeboisney.repository

import androidx.lifecycle.LiveData
import io.philippeboisney.local.dao.StocksDao
import io.philippeboisney.model.ApiResult
import io.philippeboisney.model.Stocks
import io.philippeboisney.remote.StockDataSource
import io.philippeboisney.repository.utils.NetworkBoundResource
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.Deferred

interface StocksRepository {
    suspend fun getStocksWithCache(forceRefresh: Boolean = false) : LiveData<Resource<List<Stocks.Result>>>
}

class StocksRepositoryImpl(private val dataSource: StockDataSource, private val dao: StocksDao) : StocksRepository {
    override suspend fun getStocksWithCache(forceRefresh: Boolean): LiveData<Resource<List<Stocks.Result>>> {
        return object : NetworkBoundResource<List<Stocks.Result>, ApiResult<Stocks.Result>>() {

            override fun processResponse(response: ApiResult<Stocks.Result>): List<Stocks.Result> {
                val ciccio = response.items
                return ciccio
            }

            override suspend fun saveCallResults(items: List<Stocks.Result>)
                = dao.save(items)

            override fun shouldFetch(data: List<Stocks.Result>?): Boolean
                = data == null || data.isEmpty() || forceRefresh

            override suspend fun loadFromDb(): List<Stocks.Result>
                = dao.getStocks()

            override fun createCallAsync(): Deferred<ApiResult<Stocks.Result>>
                = dataSource.fetchStocksAsync()

        }.build().asLiveData()
    }
}