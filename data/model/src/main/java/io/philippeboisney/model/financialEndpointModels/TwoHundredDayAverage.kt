package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class TwoHundredDayAverage(
    @SerializedName("fmt")
    val fmt: String? = null,
    @SerializedName("raw")
    val raw: Double? = null
)