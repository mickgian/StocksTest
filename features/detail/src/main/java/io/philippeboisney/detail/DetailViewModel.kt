package io.philippeboisney.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import io.philippeboisney.common.base.BaseViewModel
import io.philippeboisney.common.utils.Event
import io.philippeboisney.detail.domain.GetStocksDetailUseCase
import io.philippeboisney.model.SummaryStock
import io.philippeboisney.model.User
import io.philippeboisney.repository.AppDispatchers
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * A simple [BaseViewModel] that provide the data and handle logic to communicate with the model
 * for [DetailFragment].
 */
class DetailViewModel(private val getStocksDetailUseCase: GetStocksDetailUseCase,
                      private val dispatchers: AppDispatchers): BaseViewModel() {

    // PRIVATE DATA
    private lateinit var argsSymbol: String
    private var stockDetailSource: LiveData<Resource<SummaryStock>> = MutableLiveData()

    private val _stockDetail = MediatorLiveData<SummaryStock>()
    val stockDetail: LiveData<SummaryStock> get() = _stockDetail
    private val _isLoading = MutableLiveData<Resource.Status>()
    val isLoading: LiveData<Resource.Status> get() = _isLoading

    // PUBLIC ACTIONS ---
    fun loadDataWhenActivityStarts(symbol: String) {
        argsSymbol = symbol
        getStockDetail()
    }

    fun reloadDataWhenUserRefreshes()
            = getStockDetail()

//    fun userClicksOnAvatarImage(stockDetail: SummaryStock)
//            = navigate(DetailFragmentDirections.actionDetailFragmentToImageDetailFragment(user.avatarUrl))

    // ---

    private fun getStockDetail() = viewModelScope.launch(dispatchers.main) {
        _stockDetail.removeSource(stockDetailSource) // We make sure there is only one source of livedata (allowing us properly refresh)
        withContext(dispatchers.io) { stockDetailSource = getStocksDetailUseCase(argsSymbol) }
        _stockDetail.addSource(stockDetailSource) {
            _stockDetail.value = it.data
            _isLoading.value = it.status
            if (it.status == Resource.Status.ERROR) _snackbarError.value = Event(R.string.an_error_happened)
        }
    }
}