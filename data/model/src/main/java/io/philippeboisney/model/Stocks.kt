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
                val firstTradeDateMilliseconds: Double?,

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
                val previousClose: Double?,

                @SerializedName("chartPreviousClose")
                val chartPreviousClose: Double?,

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
    val symbol: String?,

    @SerializedName("end")
    val end: String?
) 

data class SummaryStock(
    @SerializedName("price")
    val price: Price?,

    @SerializedName("quoteType")
    val quoteType: QuoteType?,

    @SerializedName("summaryDetail")
    val summaryDetail: SummaryDetail?,

    @SerializedName("symbol")
    val symbol: String?,

    @SerializedName("financialsTemplate")
    val financialsTemplate: Any?,
    
    @SerializedName("pageViews")
    val pageViews: Any?
) {
    data class Price(
            @SerializedName("averageDailyVolume10Day")
            val averageDailyVolume10Day: FmtLongfmtRawDataClass?,

            @SerializedName("averageDailyVolume3Month")
            val averageDailyVolume3Month: FmtLongfmtRawDataClass?,

            @SerializedName("circulatingSupply")
            val circulatingSupply: Any?,

            @SerializedName("currency")
            val currency: String?,

            @SerializedName("currencySymbol")
            val currencySymbol: String?,

            @SerializedName("exchange")
            val exchange: String?,

            @SerializedName("exchangeDataDelayedBy")
            val exchangeDataDelayedBy: Int?,

            @SerializedName("exchangeName")
            val exchangeName: String?,

            @SerializedName("fromCurrency")
            val fromCurrency: Any?,

            @SerializedName("lastMarket")
            val lastMarket: Any?,

            @SerializedName("longName")
            val longName: Any?,

            @SerializedName("marketCap")
            val marketCap: Any?,

            @SerializedName("marketState")
            val marketState: String?,

            @SerializedName("maxAge")
            val maxAge: Int?,

            @SerializedName("openInterest")
            val openInterest: Any?,

            @SerializedName("postMarketChange")
            val postMarketChange: Any?,

            @SerializedName("postMarketPrice")
            val postMarketPrice: Any?,

            @SerializedName("preMarketChange")
            val preMarketChange: Any?,

            @SerializedName("preMarketPrice")
            val preMarketPrice: Any?,

            @SerializedName("priceHint")
            val priceHint: FmtLongfmtRawDataClass?,

            @SerializedName("quoteType")
            val quoteType: String?,

            @SerializedName("regularMarketChange")
            val regularMarketChange: FmtRawDataClass?,

            @SerializedName("regularMarketChangePercent")
            val regularMarketChangePercent: FmtRawDataClass?,

            @SerializedName("regularMarketDayHigh")
            val regularMarketDayHigh: FmtRawDataClass?,

            @SerializedName("regularMarketDayLow")
            val regularMarketDayLow: FmtRawDataClass?,

            @SerializedName("regularMarketOpen")
            val regularMarketOpen: FmtRawDataClass?,

            @SerializedName("regularMarketPreviousClose")
            val regularMarketPreviousClose: FmtRawDataClass?,

            @SerializedName("regularMarketPrice")
            val regularMarketPrice: FmtRawDataClass?,

            @SerializedName("regularMarketSource")
            val regularMarketSource: String?,

            @SerializedName("regularMarketTime")
            val regularMarketTime: Int?,

            @SerializedName("regularMarketVolume")
            val regularMarketVolume: FmtLongfmtRawDataClass?,

            @SerializedName("shortName")
            val shortName: String?,

            @SerializedName("strikePrice")
            val strikePrice: Any?,

            @SerializedName("symbol")
            val symbol: String?,

            @SerializedName("toCurrency")
            val toCurrency: Any?,

            @SerializedName("underlyingSymbol")
            val underlyingSymbol: Any?,

            @SerializedName("volume24Hr")
            val volume24Hr: Any?,

            @SerializedName("volumeAllCurrencies")
            val volumeAllCurrencies: Any?
    ) {
        data class FmtLongfmtRawDataClass(
                @SerializedName("fmt")
                val fmt: String?,

                @SerializedName("longFmt")
                val longFmt: String?,

                @SerializedName("raw")
                val raw: Int?
        )

        data class FmtRawDataClass(
                @SerializedName("fmt")
                val fmt: String?,

                @SerializedName("raw")
                val raw: Double?
        )
    }

    data class QuoteType(
            @SerializedName("exchange")
            val exchange: String?,

            @SerializedName("exchangeTimezoneName")
            val exchangeTimezoneName: String?,

            @SerializedName("exchangeTimezoneShortName")
            val exchangeTimezoneShortName: String?,

            @SerializedName("gmtOffSetMilliseconds")
            val gmtOffSetMilliseconds: String?,

            @SerializedName("isEsgPopulated")
            val isEsgPopulated: Boolean?,

            @SerializedName("market")
            val market: String?,

            @SerializedName("messageBoardId")
            val messageBoardId: String?,

            @SerializedName("quoteType")
            val quoteType: String?,

            @SerializedName("shortName")
            val shortName: String?,

            @SerializedName("symbol")
            val symbol: String?
    )

    data class SummaryDetail(
            @SerializedName("algorithm")
            val algorithm: Any?,

            @SerializedName("ask")
            val ask: FtmStringRawIndDataClass?,

            @SerializedName("askSize")
            val askSize: FmtLongfmtRawDataClass?,

            @SerializedName("averageDailyVolume10DayX")
            val averageDailyVolume10DayX: FmtLongfmtRawDataClass?,

            @SerializedName("averageVolume")
            val averageVolume: FmtLongfmtRawDataClass?,

            @SerializedName("averageVolume10days")
            val averageVolume10days: FmtLongfmtRawDataClass?,

            @SerializedName("beta")
            val beta: Any?,

            @SerializedName("bid")
            val bid: FtmStringRawIndDataClass?,

            @SerializedName("bidSize")
            val bidSize: FmtLongfmtRawDataClass?,

            @SerializedName("circulatingSupply")
            val circulatingSupply: Any?,

            @SerializedName("currency")
            val currency: String?,

            @SerializedName("dayHigh")
            val dayHigh: FtmStringRawDoubleDataClass?,

            @SerializedName("dayLow")
            val dayLow: FtmStringRawDoubleDataClass?,

            @SerializedName("dividendRate")
            val dividendRate: Any?,

            @SerializedName("dividendYield")
            val dividendYield: Any?,

            @SerializedName("exDividendDate")
            val exDividendDate: Any?,

            @SerializedName("expireDate")
            val expireDate: Any?,

            @SerializedName("fiftyDayAverage")
            val fiftyDayAverage: FtmStringRawDoubleDataClass?,

            @SerializedName("fiftyTwoWeekHigh")
            val fiftyTwoWeekHigh: FtmStringRawIndDataClass?,

            @SerializedName("fiftyTwoWeekLow")
            val fiftyTwoWeekLow: FtmStringRawIndDataClass?,

            @SerializedName("fiveYearAvgDividendYield")
            val fiveYearAvgDividendYield: Any?,

            @SerializedName("forwardPE")
            val forwardPE: Any?,

            @SerializedName("fromCurrency")
            val fromCurrency: Any?,

            @SerializedName("lastMarket")
            val lastMarket: Any?,

            @SerializedName("marketCap")
            val marketCap: Any?,

            @SerializedName("maxAge")
            val maxAge: Int?,

            @SerializedName("maxSupply")
            val maxSupply: Any?,

            @SerializedName("navPrice")
            val navPrice: Any?,

            @SerializedName("open")
            val `open`: FtmStringRawDoubleDataClass?,

            @SerializedName("openInterest")
            val openInterest: Any?,

            @SerializedName("payoutRatio")
            val payoutRatio: Any?,

            @SerializedName("previousClose")
            val previousClose: FtmStringRawDoubleDataClass?,

            @SerializedName("priceHint")
            val priceHint: FmtLongfmtRawDataClass?,

            @SerializedName("priceToSalesTrailing12Months")
            val priceToSalesTrailing12Months: Any?,

            @SerializedName("regularMarketDayHigh")
            val regularMarketDayHigh: FtmStringRawDoubleDataClass?,

            @SerializedName("regularMarketDayLow")
            val regularMarketDayLow: FtmStringRawDoubleDataClass?,

            @SerializedName("regularMarketOpen")
            val regularMarketOpen: FtmStringRawDoubleDataClass?,

            @SerializedName("regularMarketPreviousClose")
            val regularMarketPreviousClose: FtmStringRawDoubleDataClass?,

            @SerializedName("regularMarketVolume")
            val regularMarketVolume: FmtLongfmtRawDataClass?,

            @SerializedName("startDate")
            val startDate: Any?,

            @SerializedName("strikePrice")
            val strikePrice: Any?,

            @SerializedName("toCurrency")
            val toCurrency: Any?,

            @SerializedName("totalAssets")
            val totalAssets: Any?,

            @SerializedName("tradeable")
            val tradeable: Boolean?,

            @SerializedName("trailingAnnualDividendRate")
            val trailingAnnualDividendRate: Any?,

            @SerializedName("trailingAnnualDividendYield")
            val trailingAnnualDividendYield: Any?,

            @SerializedName("twoHundredDayAverage")
            val twoHundredDayAverage: FtmStringRawDoubleDataClass?,

            @SerializedName("volume")
            val volume: FmtLongfmtRawDataClass?,

            @SerializedName("volume24Hr")
            val volume24Hr: Any?,

            @SerializedName("volumeAllCurrencies")
            val volumeAllCurrencies: Any?,

            @SerializedName("yield")
            val yield: Any?,

            @SerializedName("ytdReturn")
            val ytdReturn: Any?
    ) {
        data class FtmStringRawIndDataClass(

                @SerializedName("fmt")
                val fmt: String?,

                @SerializedName("raw")
                val raw: Int?
        )

        data class FmtLongfmtRawDataClass(
                @SerializedName("fmt")
                val fmt: Any?,

                @SerializedName("longFmt")
                val longFmt: String?,

                @SerializedName("raw")
                val raw: Int?
        )

        data class FtmStringRawDoubleDataClass(
                @SerializedName("fmt")
                val fmt: String?,

                @SerializedName("raw")
                val raw: Double?
        )
    }
}