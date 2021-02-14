package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class EarningsChart(
    @SerializedName("currentQuarterEstimate")
    val currentQuarterEstimate: CurrentQuarterEstimate? = null,
    @SerializedName("currentQuarterEstimateDate")
    val currentQuarterEstimateDate: String? = null,
    @SerializedName("currentQuarterEstimateYear")
    val currentQuarterEstimateYear: Int? = null,
    @SerializedName("earningsDate")
    val earningsDate: List<EarningsDate>? = null,
    @SerializedName("quarterly")
    val quarterly: List<Quarterly>? = null
)