package io.philippeboisney.home.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import io.philippeboisney.model.Stocks
import io.philippeboisney.model.StocksUI
import io.philippeboisney.model.User
import io.philippeboisney.repository.StocksRepository
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.Deferred

/**
 * Use case that gets a [Resource][List][User] from [UserRepository]
 * and makes some specific logic actions on it.
 *
 * In this Use Case, I'm just doing nothing... ¯\_(ツ)_/¯
 */
//class GetTopUsersUseCase(private val repository: UserRepository) {
//
//    suspend operator fun invoke(forceRefresh: Boolean = false): LiveData<Resource<List<User>>> {
//        return Transformations.map(repository.getTopUsersWithCache(forceRefresh)) {
//            it // Place here your specific logic actions
//        }
//    }
//}

class GetTopUsersUseCase(private val repository: StocksRepository) {

    suspend operator fun invoke(): LiveData<Resource<List<StocksUI>>> {
        return repository.getStocksWithCache().let { resource ->
            val liveData = MutableLiveData<Resource<List<Stocks>>> ()
            liveData.postValue(resource)

            Transformations.map(liveData) {
                val getStocksList: MutableList<StocksUI> = mutableListOf()
                resource.data?.forEach { stock ->
                    stock.marketSummaryAndSparkResponse.let { stockResult ->
                        stockResult.result.let { stockResultList ->
                            stockResultList.forEach {
                                val stockUI =
                                    StocksUI(
                                        fullExchangeName = it.fullExchangeName,
                                        symbol = it.symbol
                                    )
                                getStocksList.add(stockUI)
                            }
                        }
                    }
                }
                return@map Resource<List<StocksUI>>(
                    data = getStocksList,
                    status = resource.status,
                    error = resource.error
                )
            }
        }
    }
}
