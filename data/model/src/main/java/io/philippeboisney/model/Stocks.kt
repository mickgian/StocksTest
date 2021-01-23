package io.philippeboisney.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

data class Stocks(
    val error: Any,
    val result: List<Result>
) {
    @Entity
    data class Result(
        @PrimaryKey
        @SerializedName("fullExchangeName")
        val fullExchangeName: String,

        @SerializedName("exchange")
        val exchange: String,

        @SerializedName("exchangeDataDelayedBy")
        val exchangeDataDelayedBy: Int,

        @SerializedName("exchangeTimezoneName")
        val exchangeTimezoneName: String,

        @SerializedName("exchangeTimezoneShortName")
        val exchangeTimezoneShortName: String,

        @SerializedName("language")
        val language: String,

        @SerializedName("market")
        val market: String,

        @SerializedName("marketState")
        val marketState: String,

        @SerializedName("priceHint")
        val priceHint: Int,

        @SerializedName("quoteType")
        val quoteType: String,

        @SerializedName("region")
        val region: String,

        @SerializedName("shortName")
        val shortName: String,

        @SerializedName("symbol")
        val symbol: String,

        var lastRefreshed: Date
    )
}