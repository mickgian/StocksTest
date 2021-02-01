package io.philippeboisney.home.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import io.philippeboisney.model.Stocks
import io.philippeboisney.model.StocksUI
import io.philippeboisney.repository.StocksRepository
import io.philippeboisney.repository.utils.Resource

/**
 * Use case that gets a [Resource][List][User] from [UserRepository]
 * and makes some specific logic actions on it.
 *
 * In this Use Case, I'm just doing nothing... ¯\_(ツ)_/¯
 */

class GetStocksUseCase(private val repository: StocksRepository) {

    suspend operator fun invoke(): LiveData<Resource<List<StocksUI>>> {
        return repository.getStocksResource().let { resource ->
            val liveData = MutableLiveData<Resource<Stocks>> ()
            liveData.postValue(resource)

            Transformations.map(liveData) {
                val getStocksList: MutableList<StocksUI> = mutableListOf()
                resource.data.let { stocks ->
                    stocks?.marketSummaryAndSparkResponse?.result?.forEach {
                        getStocksList.add(StocksUI(
                                fullExchangeName = it.fullExchangeName,
                                symbol = it.symbol
                        ))
                    }
                }

                return@map Resource(
                    data = getStocksList,
                    status = resource.status,
                    error = resource.error
                )
            }
        }
    }
}
