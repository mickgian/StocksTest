package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class CashflowStatement(
    @SerializedName("capitalExpenditures")
    val capitalExpenditures: CapitalExpenditures? = null,
    @SerializedName("changeInCash")
    val changeInCash: ChangeInCash? = null,
    @SerializedName("changeToAccountReceivables")
    val changeToAccountReceivables: ChangeToAccountReceivables? = null,
    @SerializedName("changeToLiabilities")
    val changeToLiabilities: ChangeToLiabilities? = null,
    @SerializedName("changeToNetincome")
    val changeToNetincome: ChangeToNetincome? = null,
    @SerializedName("changeToOperatingActivities")
    val changeToOperatingActivities: ChangeToOperatingActivities? = null,
    @SerializedName("depreciation")
    val depreciation: Depreciation? = null,
    @SerializedName("dividendsPaid")
    val dividendsPaid: DividendsPaid? = null,
    @SerializedName("effectOfExchangeRate")
    val effectOfExchangeRate: EffectOfExchangeRate? = null,
    @SerializedName("endDate")
    val endDate: EndDateXX? = null,
    @SerializedName("investments")
    val investments: Investments? = null,
    @SerializedName("issuanceOfStock")
    val issuanceOfStock: IssuanceOfStock? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null,
    @SerializedName("netBorrowings")
    val netBorrowings: NetBorrowings? = null,
    @SerializedName("netIncome")
    val netIncome: NetIncome? = null,
    @SerializedName("otherCashflowsFromFinancingActivities")
    val otherCashflowsFromFinancingActivities: OtherCashflowsFromFinancingActivities? = null,
    @SerializedName("otherCashflowsFromInvestingActivities")
    val otherCashflowsFromInvestingActivities: OtherCashflowsFromInvestingActivities? = null,
    @SerializedName("repurchaseOfStock")
    val repurchaseOfStock: RepurchaseOfStock? = null,
    @SerializedName("totalCashFromFinancingActivities")
    val totalCashFromFinancingActivities: TotalCashFromFinancingActivities? = null,
    @SerializedName("totalCashFromOperatingActivities")
    val totalCashFromOperatingActivities: TotalCashFromOperatingActivities? = null,
    @SerializedName("totalCashflowsFromInvestingActivities")
    val totalCashflowsFromInvestingActivities: TotalCashflowsFromInvestingActivities? = null
)