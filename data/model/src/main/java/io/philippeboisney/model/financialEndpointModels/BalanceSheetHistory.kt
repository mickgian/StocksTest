package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class BalanceSheetHistory(
    @SerializedName("balanceSheetStatements")
    val balanceSheetStatements: List<BalanceSheetStatement>? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null
)