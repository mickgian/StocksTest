package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class QuarterlyX(
    @SerializedName("date")
    val date: String? = null,
    @SerializedName("earnings")
    val earnings: EarningsX? = null,
    @SerializedName("revenue")
    val revenue: Revenue? = null
)