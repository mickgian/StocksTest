package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class Quarterly(
    @SerializedName("actual")
    val `actual`: Actual? = null,
    @SerializedName("date")
    val date: String? = null,
    @SerializedName("estimate")
    val estimate: Estimate? = null
)