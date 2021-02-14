package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class RegularMarketDayHighX(
    @SerializedName("fmt")
    val fmt: String? = null,
    @SerializedName("raw")
    val raw: Double? = null
)