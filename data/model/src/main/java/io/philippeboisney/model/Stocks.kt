package io.philippeboisney.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*
import kotlin.collections.ArrayList

data class Stocks(
    @SerializedName("marketSummaryAndSparkResponse")
    val marketSummaryAndSparkResponse: MarketSummaryAndSparkResponse) {

    data class MarketSummaryAndSparkResponse(
            @SerializedName("error")
            val error: Any?,

            @SerializedName("result")
            val result: List<Result>
    ) {
        data class Result(
                @SerializedName("fullExchangeName")
                val fullExchangeName: String,

                @SerializedName("exchange")
                val exchange: String?,

                @SerializedName("exchangeDataDelayedBy")
                val exchangeDataDelayedBy: Int?,

                @SerializedName("exchangeTimezoneName")
                val exchangeTimezoneName: String?,

                @SerializedName("exchangeTimezoneShortName")
                val exchangeTimezoneShortName: String?,

                @SerializedName("language")
                val language: String?,

                @SerializedName("market")
                val market: String?,

                @SerializedName("marketState")
                val marketState: String?,

                @SerializedName("priceHint")
                val priceHint: Int?,

                @SerializedName("quoteType")
                val quoteType: String?,

                @SerializedName("region")
                val region: String?,

                @SerializedName("shortName")
                val shortName: String?,

                @SerializedName("symbol")
                val symbol: String?,

                var lastRefreshed: Date,

                @Expose(serialize = false)
                val regularMarketTime: RegularMarketTime?,

                val spark: Spark?,

                @SerializedName("gmtOffSetMilliseconds")
                val gmtOffSetMilliseconds: Int?,

                @SerializedName("firstTradeDateMilliseconds")
                val firstTradeDateMilliseconds: Int?,

                @SerializedName("tradeable")
                val tradeable: Boolean?,

                @SerializedName("sourceInterval")
                val sourceInterval: Int?,

                @SerializedName("triggerable")
                val triggerable: Boolean?
        ) {
            data class RegularMarketTime(
                @SerializedName("raw")
                val raw: Int?,

                @SerializedName("fmt")
                val fmt: String?
            )

            data class Spark(
                @SerializedName("symbol")
                val symbol: String?,

                @SerializedName("end")
                val end: Int?,

                @SerializedName("start")
                val start: Int?,

                @SerializedName("time")
                val time: List<Int>?,

                @SerializedName("dataGranularity")
                val dataGranularity: Int?,

                @SerializedName("previousClose")
                val previousClose: Int?,

                @SerializedName("chartPreviousClose")
                val chartPreviousClose: Int?,

                @SerializedName("close")
                val close: List<Float>?
            )
        }
    }
}

data class StocksUI(
    @SerializedName("fullExchangeName")
    val fullExchangeName: String,

    @SerializedName("symbol")
    val symbol: String?
)