package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class PageViews(
    @SerializedName("longTermTrend")
    val longTermTrend: String? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null,
    @SerializedName("midTermTrend")
    val midTermTrend: String? = null,
    @SerializedName("shortTermTrend")
    val shortTermTrend: String? = null
)