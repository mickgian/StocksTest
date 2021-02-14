package com.example.stocks_rank

import androidx.lifecycle.*
import io.philippeboisney.common.base.BaseViewModel
import io.philippeboisney.common.utils.Event
import io.philippeboisney.model.financialUiModels.StockFinancialDetailsUI
import io.philippeboisney.repository.AppDispatchers
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class StockRankViewModel(
    private val getStockFinancialUseCase: GetStockFinancialUseCase,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // TODO: Implement the ViewModel


    private val _stockFinancialUI = MediatorLiveData<StockFinancialDetailsUI>()
    val stockFinancialUI: LiveData<StockFinancialDetailsUI> get() = _stockFinancialUI
    private var stockFinancialSource: LiveData<Resource<StockFinancialDetailsUI>> = MutableLiveData()

    private val _returnOfInvestmentFormula = MutableLiveData<String>()
    val returnOfInvestmentFormula : LiveData<String> get() = _returnOfInvestmentFormula

    private val _earningsYield = MutableLiveData<String>()
    val earningsYield : LiveData<String> get() = _earningsYield

    init {
        getFinancial()
    }

    private fun getFinancial() = viewModelScope.launch(dispatchers.main) {
        _stockFinancialUI.removeSource(stockFinancialSource)
        withContext(dispatchers.io) {
            stockFinancialSource = getStockFinancialUseCase(
                symbol = "HRB"
            )
        }

        _stockFinancialUI.addSource(stockFinancialSource) { resource ->
            _stockFinancialUI.value = resource.data
            when(resource.status) {
                Resource.Status.SUCCESS -> {
                    setReturnOfInvestmentFormula(resource.data?.roic)
                    setEarningsYield(resource.data?.earningsYield)
                }
                Resource.Status.ERROR -> _snackbarError.value = Event(R.string.an_error_happened)
            }
        }
    }


    private fun setReturnOfInvestmentFormula(returnOfInvestmentFormula: String?) {
        _returnOfInvestmentFormula.value = returnOfInvestmentFormula
    }

    private fun setEarningsYield(earningsYield: String?) {
        _earningsYield.value = earningsYield
    }
}