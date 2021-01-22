package io.philippeboisney.local.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy

abstract class StocksBaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract suspend fun insert(stocks: List<T>)
}