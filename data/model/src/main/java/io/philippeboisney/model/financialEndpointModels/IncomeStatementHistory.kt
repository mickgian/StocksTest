package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class IncomeStatementHistory(
    @SerializedName("incomeStatementHistory")
    val incomeStatementHistory: List<IncomeStatementHistoryX>? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null
)