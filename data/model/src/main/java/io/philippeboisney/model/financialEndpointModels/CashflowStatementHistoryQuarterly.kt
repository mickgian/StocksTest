package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class CashflowStatementHistoryQuarterly(
    @SerializedName("cashflowStatements")
    val cashflowStatements: List<CashflowStatementX>? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null
)