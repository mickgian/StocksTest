package io.philippeboisney.remote

class StockDataSource(private val stocksService: StocksService) {
    fun fetchAStocksAsync() = stocksService.fetchStocksAsync()
}