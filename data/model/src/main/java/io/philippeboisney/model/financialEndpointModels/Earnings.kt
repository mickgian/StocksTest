package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class Earnings(
    @SerializedName("earningsChart")
    val earningsChart: EarningsChart? = null,
    @SerializedName("financialCurrency")
    val financialCurrency: String? = null,
    @SerializedName("financialsChart")
    val financialsChart: FinancialsChart? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null
)