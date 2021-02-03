package io.philippeboisney.detail.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import io.philippeboisney.model.SummaryStock
import io.philippeboisney.repository.StocksRepository
import io.philippeboisney.repository.utils.Resource

/**
 * Use case that gets a [Resource] [User] from [UserRepository]
 * and makes some specific logic actions on it.
 *
 * In this Use Case, I'm just doing nothing... ¯\_(ツ)_/¯
 */
class GetStocksDetailUseCase(private val repository: StocksRepository) {

    suspend operator fun invoke(symbol: String): LiveData<Resource<SummaryStock>> {
        return repository.getStocksDetailResource(symbol).let { resource ->
            val liveData = MutableLiveData<Resource<SummaryStock>> ()
            liveData.postValue(resource)

            Transformations.map(liveData) {
//                val getStocksList: MutableList<SummaryStock> = mutableListOf()
                resource.data.let {
//                    getStocksList.add(it)
                    return@map Resource(
                            data = it,
                            status = resource.status,
                            error = resource.error
                    )
                }

            }
        }
    }
}
