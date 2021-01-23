package io.philippeboisney.remote

class StockDataSource(private val stocksService: StocksService) {
    fun fetchStocksAsync() = stocksService.fetchStocksAsync()
}