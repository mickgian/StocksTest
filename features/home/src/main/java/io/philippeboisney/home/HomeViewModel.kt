package io.philippeboisney.home

import androidx.lifecycle.*
import io.philippeboisney.common.base.BaseViewModel
import io.philippeboisney.common.utils.Event
import io.philippeboisney.home.domain.GetStocksUseCase
import io.philippeboisney.model.StocksUI
import io.philippeboisney.repository.AppDispatchers
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * A simple [BaseViewModel] that provide the data and handle logic to communicate with the model
 * for [HomeFragment].
 */
class HomeViewModel(private val getStocksUseCase: GetStocksUseCase,
                    private val dispatchers: AppDispatchers) : BaseViewModel() {


    private val _stocks = MediatorLiveData<Resource<List<StocksUI>>>()
    val stocks: LiveData<Resource<List<StocksUI>>> get() = _stocks
    private var stocksSource: LiveData<Resource<List<StocksUI>>> = MutableLiveData()

    init {
        getStocks()
    }

    // PUBLIC ACTIONS ---
    fun userClicksOnItem(stocks: StocksUI)
            = navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(stocks.fullExchangeName))

    fun userRefreshesItems()
        = getStocks()

    // ---

    private fun getStocks() = viewModelScope.launch(dispatchers.main) {
        _stocks.removeSource(stocksSource) // We make sure there is only one source of livedata (allowing us properly refresh)
        withContext(dispatchers.io) { stocksSource = getStocksUseCase() }
        _stocks.addSource(stocksSource) {
            _stocks.value = it
            if (it.status == Resource.Status.ERROR) _snackbarError.value = Event(R.string.an_error_happened)
        }
    }
}