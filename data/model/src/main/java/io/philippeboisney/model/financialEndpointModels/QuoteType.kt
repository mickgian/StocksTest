package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class QuoteType(
    @SerializedName("exchange")
    val exchange: String? = null,
    @SerializedName("exchangeTimezoneName")
    val exchangeTimezoneName: String? = null,
    @SerializedName("exchangeTimezoneShortName")
    val exchangeTimezoneShortName: String? = null,
    @SerializedName("gmtOffSetMilliseconds")
    val gmtOffSetMilliseconds: String? = null,
    @SerializedName("isEsgPopulated")
    val isEsgPopulated: Boolean? = null,
    @SerializedName("longName")
    val longName: String? = null,
    @SerializedName("market")
    val market: String? = null,
    @SerializedName("messageBoardId")
    val messageBoardId: String? = null,
    @SerializedName("quoteType")
    val quoteType: String? = null,
    @SerializedName("shortName")
    val shortName: String? = null,
    @SerializedName("symbol")
    val symbol: String? = null
)