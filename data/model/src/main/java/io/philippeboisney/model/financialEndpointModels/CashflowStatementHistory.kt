package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class CashflowStatementHistory(
    @SerializedName("cashflowStatements")
    val cashflowStatements: List<CashflowStatement>? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null
)