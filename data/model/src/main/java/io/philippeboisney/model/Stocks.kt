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
    val financialsTemplate: FinancialsTemplate?,
    
    @SerializedName("pageViews")
    val pageViews: PageViews?
) {
    class FinancialsTemplate()

    class PageViews()

    data class Price(
            @SerializedName("averageDailyVolume10Day")
            val averageDailyVolume10Day: FmtLongfmtRawDataClass?,

            @SerializedName("averageDailyVolume3Month")
            val averageDailyVolume3Month: FmtLongfmtRawDataClass?,

            @SerializedName("circulatingSupply")
            val circulatingSupply: EmpityDataClass?,

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
            val fromCurrency: String?,

            @SerializedName("lastMarket")
            val lastMarket: String?,

            @SerializedName("longName")
            val longName: String?,

            @SerializedName("marketCap")
            val marketCap: EmpityDataClass?,

            @SerializedName("marketState")
            val marketState: String?,

            @SerializedName("maxAge")
            val maxAge: Int?,

            @SerializedName("openInterest")
            val openInterest: EmpityDataClass?,

            @SerializedName("postMarketChange")
            val postMarketChange: EmpityDataClass?,

            @SerializedName("postMarketPrice")
            val postMarketPrice: EmpityDataClass?,

            @SerializedName("preMarketChange")
            val preMarketChange: EmpityDataClass?,

            @SerializedName("preMarketPrice")
            val preMarketPrice: EmpityDataClass?,

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
            val strikePrice: EmpityDataClass?,

            @SerializedName("symbol")
            val symbol: String?,

            @SerializedName("toCurrency")
            val toCurrency: String?,

            @SerializedName("underlyingSymbol")
            val underlyingSymbol: String?,

            @SerializedName("volume24Hr")
            val volume24Hr: EmpityDataClass?,

            @SerializedName("volumeAllCurrencies")
            val volumeAllCurrencies: EmpityDataClass?
    ) {
        data class FmtLongfmtRawDataClass(
                @SerializedName("fmt")
                val fmt: String?,

                @SerializedName("longFmt")
                val longFmt: String?,

                @SerializedName("raw")
                val raw: Int?
        )

        class EmpityDataClass()

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
            val algorithm: String?,

            @SerializedName("ask")
            val ask: FtmString_RawIndDataClass?,

            @SerializedName("askSize")
            val askSize: FmtLongfmtRawDataClass?,

            @SerializedName("averageDailyVolume10DayX")
            val averageDailyVolume10DayX: FmtLongfmtRawDataClass?,

            @SerializedName("averageVolume")
            val averageVolume: FmtLongfmtRawDataClass?,

            @SerializedName("averageVolume10days")
            val averageVolume10days: FmtLongfmtRawDataClass?,

            @SerializedName("beta")
            val beta: EmpityDataClass?,

            @SerializedName("bid")
            val bid: FtmString_RawIndDataClass?,

            @SerializedName("bidSize")
            val bidSize: FmtLongfmtRawDataClass?,

            @SerializedName("circulatingSupply")
            val circulatingSupply: EmpityDataClass?,

            @SerializedName("currency")
            val currency: String?,

            @SerializedName("dayHigh")
            val dayHigh: FtmString_RawDoubleDataClass?,

            @SerializedName("dayLow")
            val dayLow: FtmString_RawDoubleDataClass?,

            @SerializedName("dividendRate")
            val dividendRate: EmpityDataClass?,

            @SerializedName("dividendYield")
            val dividendYield: EmpityDataClass?,

            @SerializedName("exDividendDate")
            val exDividendDate: EmpityDataClass?,

            @SerializedName("expireDate")
            val expireDate: EmpityDataClass?,

            @SerializedName("fiftyDayAverage")
            val fiftyDayAverage: FtmString_RawDoubleDataClass?,

            @SerializedName("fiftyTwoWeekHigh")
            val fiftyTwoWeekHigh: FtmString_RawIndDataClass?,

            @SerializedName("fiftyTwoWeekLow")
            val fiftyTwoWeekLow: FtmString_RawIndDataClass?,

            @SerializedName("fiveYearAvgDividendYield")
            val fiveYearAvgDividendYield: EmpityDataClass?,

            @SerializedName("forwardPE")
            val forwardPE: EmpityDataClass?,

            @SerializedName("fromCurrency")
            val fromCurrency: String?,

            @SerializedName("lastMarket")
            val lastMarket: String?,

            @SerializedName("marketCap")
            val marketCap: EmpityDataClass?,

            @SerializedName("maxAge")
            val maxAge: Int?,

            @SerializedName("maxSupply")
            val maxSupply: EmpityDataClass?,

            @SerializedName("navPrice")
            val navPrice: EmpityDataClass?,

            @SerializedName("open")
            val `open`: FtmString_RawDoubleDataClass?,

            @SerializedName("openInterest")
            val openInterest: EmpityDataClass?,

            @SerializedName("payoutRatio")
            val payoutRatio: EmpityDataClass?,

            @SerializedName("previousClose")
            val previousClose: FtmString_RawDoubleDataClass?,

            @SerializedName("priceHint")
            val priceHint: FmtLongfmtRawDataClass?,

            @SerializedName("priceToSalesTrailing12Months")
            val priceToSalesTrailing12Months: EmpityDataClass?,

            @SerializedName("regularMarketDayHigh")
            val regularMarketDayHigh: FtmString_RawDoubleDataClass?,

            @SerializedName("regularMarketDayLow")
            val regularMarketDayLow: FtmString_RawDoubleDataClass?,

            @SerializedName("regularMarketOpen")
            val regularMarketOpen: FtmString_RawDoubleDataClass?,

            @SerializedName("regularMarketPreviousClose")
            val regularMarketPreviousClose: FtmString_RawDoubleDataClass?,

            @SerializedName("regularMarketVolume")
            val regularMarketVolume: FmtLongfmtRawDataClass?,

            @SerializedName("startDate")
            val startDate: EmpityDataClass?,

            @SerializedName("strikePrice")
            val strikePrice: EmpityDataClass?,

            @SerializedName("toCurrency")
            val toCurrency: String?,

            @SerializedName("totalAssets")
            val totalAssets: EmpityDataClass?,

            @SerializedName("tradeable")
            val tradeable: Boolean?,

            @SerializedName("trailingAnnualDividendRate")
            val trailingAnnualDividendRate: EmpityDataClass?,

            @SerializedName("trailingAnnualDividendYield")
            val trailingAnnualDividendYield: EmpityDataClass?,

            @SerializedName("twoHundredDayAverage")
            val twoHundredDayAverage: FtmString_RawDoubleDataClass?,

            @SerializedName("volume")
            val volume: FmtLongfmtRawDataClass?,

            @SerializedName("volume24Hr")
            val volume24Hr: EmpityDataClass?,

            @SerializedName("volumeAllCurrencies")
            val volumeAllCurrencies: EmpityDataClass?,

            @SerializedName("yield")
            val yield: EmpityDataClass?,

            @SerializedName("ytdReturn")
            val ytdReturn: EmpityDataClass?
    ) {
        data class FtmString_RawIndDataClass(

                @SerializedName("fmt")
                val fmt: String?,

                @SerializedName("raw")
                val raw: Int?
        )

        data class FmtLongfmtRawDataClass(
                @SerializedName("fmt")
                val fmt: String?,

                @SerializedName("longFmt")
                val longFmt: String?,

                @SerializedName("raw")
                val raw: Int?
        )

        class EmpityDataClass()

        data class FtmString_RawDoubleDataClass(
                @SerializedName("fmt")
                val fmt: String?,

                @SerializedName("raw")
                val raw: Double?
        )
    }
}