package io.philippeboisney.detail.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import io.philippeboisney.model.StockDetailUI
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

    suspend operator fun invoke(symbol: String): LiveData<Resource<StockDetailUI>> {
        return repository.getStocksDetailResource(symbol).let { resource ->
            val liveData = MutableLiveData<Resource<SummaryStock>> ()
            liveData.postValue(resource)

            Transformations.map(liveData) {
//                val getStocksList: StockDetailUI = listOf()
                resource.data.let {
                    return@map Resource(
                            data =
                                StockDetailUI(
                                    symbol = it?.symbol,
                                    shortName = it?.quoteType?.shortName,
                                    regularMarketPrice = it?.price?.regularMarketPrice?.fmt
                                ),
                            status = resource.status,
                            error = resource.error
                    )
                }
            }
        }
    }
}
