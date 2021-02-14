package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class TrailingInterestExpense(
    @SerializedName("asOfDate")
    val asOfDate: String? = null,
    @SerializedName("currencyCode")
    val currencyCode: String? = null,
    @SerializedName("dataId")
    val dataId: Int? = null,
    @SerializedName("periodType")
    val periodType: String? = null,
    @SerializedName("reportedValue")
    val reportedValue: ReportedValueXXXXXXXXXXXXXXXXXXXX? = null
)