package io.philippeboisney.remote

class StockDataSource(private val stocksService: StocksService) {
    suspend fun fetchStocksAsync() = stocksService.fetchStocksAsync()

    suspend fun fetchStocksDetailsAsync(symbols: String) =
            stocksService.fetchStocksDetailsAsync(symbols)

    suspend fun fetchStockFinancialAsync(
        url: String,
        symbol: String,
        region: String?
    ) = stocksService.fetchStockFinancialAsync(
        url,
        symbol,
        region
    )
}