package io.philippeboisney.remote

class StockDataSource(private val stocksService: StocksService) {
    fun fetchStocksAsync() = stocksService.fetchStocksAsync()

    fun fetchStocksDetailsAsync(symbols: String) =
            stocksService.fetchStocksDetailsAsync(symbols)
}