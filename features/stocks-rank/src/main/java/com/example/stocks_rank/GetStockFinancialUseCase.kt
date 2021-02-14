package com.example.stocks_rank

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import io.philippeboisney.model.financialEndpointModels.StockFinancialModel
import io.philippeboisney.model.financialUiModels.StockFinancialDetailsUI
import io.philippeboisney.repository.StocksRepository
import io.philippeboisney.repository.utils.Resource


class GetStockFinancialUseCase(
    private val repository: StocksRepository,
    private val stockFinancialDetailsUiBuilder: StockFinancialDetailsUiBuilder
) {
    suspend operator fun invoke(
        symbol: String,
        region: String? = null
    ): LiveData<Resource<StockFinancialDetailsUI>> {

        return repository.getStockFinancial(
            symbol = symbol,
            region = region
        ).let { resource ->

            val liveData = MutableLiveData<Resource<StockFinancialModel>> ()

            liveData.postValue(resource)
            Transformations.map(liveData) {
                //Initializing empty StockFinancialDetailsUI object
                var stockFinancialDetailsUI = StockFinancialDetailsUI(
                    roic = null,
                    earningsYield = null
                )

                resource.data.let { model ->

                    val stockFinancialModel = model ?: return@let
                    stockFinancialDetailsUI = stockFinancialDetailsUiBuilder.createStockFinancialDetailsUI(
                        stockFinancialModel
                    )
                }

                return@map Resource<StockFinancialDetailsUI>(
                    data = stockFinancialDetailsUI,
                    status = resource.status,
                    error = resource.error
                )

            }
        }
    }
}
