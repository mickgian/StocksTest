package io.philippeboisney.model

import com.google.gson.annotations.SerializedName

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

                @SerializedName("firstTradeDateMilliseconds")
                val firstTradeDateMilliseconds: Int?,

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

                @SerializedName("regularMarketPreviousClose")
                val regularMarketPreviousClose: RegularMarketPreviousClose,

                @SerializedName("regularMarketTime")
                val regularMarketTime: RegularMarketTime?,

                @SerializedName("shortName")
                val shortName: String?,

                @SerializedName("sourceInterval")
                val sourceInterval: Int?,

                @SerializedName("spark")
                val spark: Spark?,

                @SerializedName("symbol")
                val symbol: String?,

                @SerializedName("gmtOffSetMilliseconds")
                val gmtOffSetMilliseconds: Int?,

                @SerializedName("tradeable")
                val tradeable: Boolean?,


                @SerializedName("triggerable")
                val triggerable: Boolean?
        ) {
            data class RegularMarketTime(
                @SerializedName("raw")
                val raw: Int?,

                @SerializedName("fmt")
                val fmt: String?
            )

            data class RegularMarketPreviousClose(
                @SerializedName("fmt")
                val fmt: String,

                @SerializedName("raw")
                val raw: Double
            )

            data class Spark(
                @SerializedName("symbol")
                val symbol: String?,

                @SerializedName("end")
                val end: Int?,

                @SerializedName("start")
                val start: Int?,

                @SerializedName("timestamp")
                val timestamp: List<Int>?,

                @SerializedName("dataGranularity")
                val dataGranularity: Int?,

                @SerializedName("previousClose")
                val previousClose: Int?,

                @SerializedName("chartPreviousClose")
                val chartPreviousClose: Int?,

                @SerializedName("close")
                val close: List<Double>?
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