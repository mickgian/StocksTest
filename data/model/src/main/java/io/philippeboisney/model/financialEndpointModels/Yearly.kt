package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class Yearly(
    @SerializedName("date")
    val date: Int? = null,
    @SerializedName("earnings")
    val earnings: EarningsXX? = null,
    @SerializedName("revenue")
    val revenue: RevenueX? = null
)