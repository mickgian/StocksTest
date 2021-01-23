package io.philippeboisney.home

import androidx.lifecycle.*
import io.philippeboisney.common.base.BaseViewModel
import io.philippeboisney.common.utils.Event
import io.philippeboisney.home.domain.GetTopUsersUseCase
import io.philippeboisney.model.Stocks
import io.philippeboisney.model.User
import io.philippeboisney.repository.AppDispatchers
import io.philippeboisney.repository.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * A simple [BaseViewModel] that provide the data and handle logic to communicate with the model
 * for [HomeFragment].
 */
class HomeViewModel(private val getTopUsersUseCase: GetTopUsersUseCase,
                    private val dispatchers: AppDispatchers) : BaseViewModel() {

    // FOR DATA
//    private val _users = MediatorLiveData<Resource<List<User>>>()
//    val users: LiveData<Resource<List<User>>> get() = _users
//    private var usersSource: LiveData<Resource<List<User>>> = MutableLiveData()

    private val _stocks = MediatorLiveData<Resource<List<Stocks.Result>>>()
    val stocks: LiveData<Resource<List<Stocks.Result>>> get() = _stocks
    private var stocksSource: LiveData<Resource<List<Stocks.Result>>> = MutableLiveData()

    init {
//        getUsers(false)
        getStocks(false)
    }

    // PUBLIC ACTIONS ---
    fun userClicksOnItem(stocks: Stocks.Result)
            = navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(stocks.fullExchangeName))

//    fun userRefreshesItems()
//            = getUsers(true)

    fun userRefreshesItems()
        = getStocks(true)

    // ---

//    private fun getUsers(forceRefresh: Boolean) = viewModelScope.launch(dispatchers.main) {
//        _users.removeSource(usersSource) // We make sure there is only one source of livedata (allowing us properly refresh)
//        withContext(dispatchers.io) { usersSource = getTopUsersUseCase(forceRefresh = forceRefresh) }
//        _users.addSource(usersSource) {
//            _users.value = it
//            if (it.status == Resource.Status.ERROR) _snackbarError.value = Event(R.string.an_error_happened)
//        }
//    }

    private fun getStocks(forceRefresh: Boolean) = viewModelScope.launch(dispatchers.main) {
        _stocks.removeSource(stocksSource) // We make sure there is only one source of livedata (allowing us properly refresh)
        withContext(dispatchers.io) { stocksSource = getTopUsersUseCase(forceRefresh = forceRefresh) }
        _stocks.addSource(stocksSource) {
            _stocks.value = it
            if (it.status == Resource.Status.ERROR) _snackbarError.value = Event(R.string.an_error_happened)
        }
    }
}