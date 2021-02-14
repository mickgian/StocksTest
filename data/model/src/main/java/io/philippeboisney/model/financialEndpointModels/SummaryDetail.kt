package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class SummaryDetail(
    @SerializedName("algorithm")
    val algorithm: Any? = null,
    @SerializedName("ask")
    val ask: Ask? = null,
    @SerializedName("askSize")
    val askSize: AskSize? = null,
    @SerializedName("averageDailyVolume10Day")
    val averageDailyVolume10Day: AverageDailyVolume10DayX? = null,
    @SerializedName("averageVolume")
    val averageVolume: AverageVolume? = null,
    @SerializedName("averageVolume10days")
    val averageVolume10days: AverageVolume10days? = null,
    @SerializedName("beta")
    val beta: Beta? = null,
    @SerializedName("bid")
    val bid: Bid? = null,
    @SerializedName("bidSize")
    val bidSize: BidSize? = null,
    @SerializedName("circulatingSupply")
    val circulatingSupply: CirculatingSupplyX? = null,
    @SerializedName("currency")
    val currency: String? = null,
    @SerializedName("dayHigh")
    val dayHigh: DayHigh? = null,
    @SerializedName("dayLow")
    val dayLow: DayLow? = null,
    @SerializedName("dividendRate")
    val dividendRate: DividendRate? = null,
    @SerializedName("dividendYield")
    val dividendYield: DividendYield? = null,
    @SerializedName("exDividendDate")
    val exDividendDate: ExDividendDate? = null,
    @SerializedName("expireDate")
    val expireDate: ExpireDate? = null,
    @SerializedName("fiftyDayAverage")
    val fiftyDayAverage: FiftyDayAverage? = null,
    @SerializedName("fiftyTwoWeekHigh")
    val fiftyTwoWeekHigh: FiftyTwoWeekHigh? = null,
    @SerializedName("fiftyTwoWeekLow")
    val fiftyTwoWeekLow: FiftyTwoWeekLow? = null,
    @SerializedName("fiveYearAvgDividendYield")
    val fiveYearAvgDividendYield: FiveYearAvgDividendYield? = null,
    @SerializedName("forwardPE")
    val forwardPE: ForwardPE? = null,
    @SerializedName("fromCurrency")
    val fromCurrency: Any? = null,
    @SerializedName("lastMarket")
    val lastMarket: Any? = null,
    @SerializedName("marketCap")
    val marketCap: MarketCapX? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null,
    @SerializedName("maxSupply")
    val maxSupply: MaxSupply? = null,
    @SerializedName("navPrice")
    val navPrice: NavPrice? = null,
    @SerializedName("open")
    val `open`: Open? = null,
    @SerializedName("openInterest")
    val openInterest: OpenInterestX? = null,
    @SerializedName("payoutRatio")
    val payoutRatio: PayoutRatio? = null,
    @SerializedName("previousClose")
    val previousClose: PreviousClose? = null,
    @SerializedName("priceHint")
    val priceHint: PriceHintX? = null,
    @SerializedName("priceToSalesTrailing12Months")
    val priceToSalesTrailing12Months: PriceToSalesTrailing12Months? = null,
    @SerializedName("regularMarketDayHigh")
    val regularMarketDayHigh: RegularMarketDayHighX? = null,
    @SerializedName("regularMarketDayLow")
    val regularMarketDayLow: RegularMarketDayLowX? = null,
    @SerializedName("regularMarketOpen")
    val regularMarketOpen: RegularMarketOpenX? = null,
    @SerializedName("regularMarketPreviousClose")
    val regularMarketPreviousClose: RegularMarketPreviousCloseX? = null,
    @SerializedName("regularMarketVolume")
    val regularMarketVolume: RegularMarketVolumeX? = null,
    @SerializedName("startDate")
    val startDate: StartDate? = null,
    @SerializedName("strikePrice")
    val strikePrice: StrikePriceX? = null,
    @SerializedName("toCurrency")
    val toCurrency: Any? = null,
    @SerializedName("totalAssets")
    val totalAssets: TotalAssetsXX? = null,
    @SerializedName("tradeable")
    val tradeable: Boolean? = null,
    @SerializedName("trailingAnnualDividendRate")
    val trailingAnnualDividendRate: TrailingAnnualDividendRate? = null,
    @SerializedName("trailingAnnualDividendYield")
    val trailingAnnualDividendYield: TrailingAnnualDividendYield? = null,
    @SerializedName("trailingPE")
    val trailingPE: TrailingPE? = null,
    @SerializedName("twoHundredDayAverage")
    val twoHundredDayAverage: TwoHundredDayAverage? = null,
    @SerializedName("volume")
    val volume: Volume? = null,
    @SerializedName("volume24Hr")
    val volume24Hr: Volume24HrX? = null,
    @SerializedName("volumeAllCurrencies")
    val volumeAllCurrencies: VolumeAllCurrenciesX? = null,
    @SerializedName("yield")
    val yield: Yield? = null,
    @SerializedName("ytdReturn")
    val ytdReturn: YtdReturn? = null
)