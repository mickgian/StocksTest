package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class CashflowStatementX(
    @SerializedName("capitalExpenditures")
    val capitalExpenditures: CapitalExpendituresX? = null,
    @SerializedName("changeInCash")
    val changeInCash: ChangeInCashX? = null,
    @SerializedName("changeToAccountReceivables")
    val changeToAccountReceivables: ChangeToAccountReceivablesX? = null,
    @SerializedName("changeToLiabilities")
    val changeToLiabilities: ChangeToLiabilitiesX? = null,
    @SerializedName("changeToNetincome")
    val changeToNetincome: ChangeToNetincomeX? = null,
    @SerializedName("changeToOperatingActivities")
    val changeToOperatingActivities: ChangeToOperatingActivitiesX? = null,
    @SerializedName("depreciation")
    val depreciation: DepreciationX? = null,
    @SerializedName("dividendsPaid")
    val dividendsPaid: DividendsPaidX? = null,
    @SerializedName("effectOfExchangeRate")
    val effectOfExchangeRate: EffectOfExchangeRateX? = null,
    @SerializedName("endDate")
    val endDate: EndDateXXX? = null,
    @SerializedName("issuanceOfStock")
    val issuanceOfStock: IssuanceOfStockX? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null,
    @SerializedName("netBorrowings")
    val netBorrowings: NetBorrowingsX? = null,
    @SerializedName("netIncome")
    val netIncome: NetIncomeX? = null,
    @SerializedName("otherCashflowsFromFinancingActivities")
    val otherCashflowsFromFinancingActivities: OtherCashflowsFromFinancingActivitiesX? = null,
    @SerializedName("otherCashflowsFromInvestingActivities")
    val otherCashflowsFromInvestingActivities: OtherCashflowsFromInvestingActivitiesX? = null,
    @SerializedName("repurchaseOfStock")
    val repurchaseOfStock: RepurchaseOfStockX? = null,
    @SerializedName("totalCashFromFinancingActivities")
    val totalCashFromFinancingActivities: TotalCashFromFinancingActivitiesX? = null,
    @SerializedName("totalCashFromOperatingActivities")
    val totalCashFromOperatingActivities: TotalCashFromOperatingActivitiesX? = null,
    @SerializedName("totalCashflowsFromInvestingActivities")
    val totalCashflowsFromInvestingActivities: TotalCashflowsFromInvestingActivitiesX? = null
)