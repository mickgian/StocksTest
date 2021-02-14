package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("end")
    val end: Int? = null,
    @SerializedName("start")
    val start: Int? = null,
    @SerializedName("symbol")
    val symbol: String? = null,
    @SerializedName("timeUnit")
    val timeUnit: String? = null
)