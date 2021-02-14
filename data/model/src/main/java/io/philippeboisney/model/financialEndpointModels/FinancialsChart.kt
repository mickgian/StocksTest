package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class FinancialsChart(
    @SerializedName("quarterly")
    val quarterly: List<QuarterlyX>? = null,
    @SerializedName("yearly")
    val yearly: List<Yearly>? = null
)