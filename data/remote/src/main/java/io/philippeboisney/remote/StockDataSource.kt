package io.philippeboisney.remote

class StockDataSource(private val stocksService: StocksService) {
    suspend fun fetchStocksAsync() = stocksService.fetchStocksAsync()
}