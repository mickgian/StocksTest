package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class IncomeStatementHistoryQuarterly(
    @SerializedName("incomeStatementHistory")
    val incomeStatementHistory: List<IncomeStatementHistoryXX>? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null
)