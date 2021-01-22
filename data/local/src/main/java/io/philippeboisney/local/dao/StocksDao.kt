package io.philippeboisney.local.dao

import androidx.room.Dao
import androidx.room.Query
import io.philippeboisney.model.Stocks
import java.util.*

@Dao
internal abstract class StockDao : StocksBaseDao<Stocks.Result>() {

    @Query("SELECT * FROM Stocks")
    abstract suspend fun getStocks(): List<Stocks.Result>

    suspend fun save(stock: List<Stocks.Result>) {
        insert(stock.apply { forEach { it.lastRefreshed = Date() } })
    }
}