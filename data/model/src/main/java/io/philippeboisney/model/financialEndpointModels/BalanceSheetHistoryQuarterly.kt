package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class BalanceSheetHistoryQuarterly(
    @SerializedName("balanceSheetStatements")
    val balanceSheetStatements: List<BalanceSheetStatementX>? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null
)