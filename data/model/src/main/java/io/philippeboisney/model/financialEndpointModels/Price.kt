package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class Price(
    @SerializedName("averageDailyVolume10Day")
    val averageDailyVolume10Day: AverageDailyVolume10Day? = null,
    @SerializedName("averageDailyVolume3Month")
    val averageDailyVolume3Month: AverageDailyVolume3Month? = null,
    @SerializedName("circulatingSupply")
    val circulatingSupply: CirculatingSupply? = null,
    @SerializedName("currency")
    val currency: String? = null,
    @SerializedName("currencySymbol")
    val currencySymbol: String? = null,
    @SerializedName("exchange")
    val exchange: String? = null,
    @SerializedName("exchangeDataDelayedBy")
    val exchangeDataDelayedBy: Int? = null,
    @SerializedName("exchangeName")
    val exchangeName: String? = null,
    @SerializedName("fromCurrency")
    val fromCurrency: Any? = null,
    @SerializedName("lastMarket")
    val lastMarket: Any? = null,
    @SerializedName("longName")
    val longName: String? = null,
    @SerializedName("marketCap")
    val marketCap: MarketCap? = null,
    @SerializedName("marketState")
    val marketState: String? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null,
    @SerializedName("openInterest")
    val openInterest: OpenInterest? = null,
    @SerializedName("postMarketChange")
    val postMarketChange: PostMarketChange? = null,
    @SerializedName("postMarketChangePercent")
    val postMarketChangePercent: PostMarketChangePercent? = null,
    @SerializedName("postMarketPrice")
    val postMarketPrice: PostMarketPrice? = null,
    @SerializedName("postMarketSource")
    val postMarketSource: String? = null,
    @SerializedName("postMarketTime")
    val postMarketTime: Int? = null,
    @SerializedName("preMarketChange")
    val preMarketChange: PreMarketChange? = null,
    @SerializedName("preMarketPrice")
    val preMarketPrice: PreMarketPrice? = null,
    @SerializedName("preMarketSource")
    val preMarketSource: String? = null,
    @SerializedName("priceHint")
    val priceHint: PriceHint? = null,
    @SerializedName("quoteSourceName")
    val quoteSourceName: String? = null,
    @SerializedName("quoteType")
    val quoteType: String? = null,
    @SerializedName("regularMarketChange")
    val regularMarketChange: RegularMarketChange? = null,
    @SerializedName("regularMarketChangePercent")
    val regularMarketChangePercent: RegularMarketChangePercent? = null,
    @SerializedName("regularMarketDayHigh")
    val regularMarketDayHigh: RegularMarketDayHigh? = null,
    @SerializedName("regularMarketDayLow")
    val regularMarketDayLow: RegularMarketDayLow? = null,
    @SerializedName("regularMarketOpen")
    val regularMarketOpen: RegularMarketOpen? = null,
    @SerializedName("regularMarketPreviousClose")
    val regularMarketPreviousClose: RegularMarketPreviousClose? = null,
    @SerializedName("regularMarketPrice")
    val regularMarketPrice: RegularMarketPrice? = null,
    @SerializedName("regularMarketSource")
    val regularMarketSource: String? = null,
    @SerializedName("regularMarketTime")
    val regularMarketTime: Int? = null,
    @SerializedName("regularMarketVolume")
    val regularMarketVolume: RegularMarketVolume? = null,
    @SerializedName("shortName")
    val shortName: String? = null,
    @SerializedName("strikePrice")
    val strikePrice: StrikePrice? = null,
    @SerializedName("symbol")
    val symbol: String? = null,
    @SerializedName("toCurrency")
    val toCurrency: Any? = null,
    @SerializedName("underlyingSymbol")
    val underlyingSymbol: Any? = null,
    @SerializedName("volume24Hr")
    val volume24Hr: Volume24Hr? = null,
    @SerializedName("volumeAllCurrencies")
    val volumeAllCurrencies: VolumeAllCurrencies? = null
)