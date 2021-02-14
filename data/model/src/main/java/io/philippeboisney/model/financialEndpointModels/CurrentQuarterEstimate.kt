package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class CurrentQuarterEstimate(
    @SerializedName("fmt")
    val fmt: String? = null,
    @SerializedName("raw")
    val raw: Double? = null
)