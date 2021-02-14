package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class StockFinancialModel(
    @SerializedName("balanceSheetHistory")
    val balanceSheetHistory: BalanceSheetHistory? = null,
    @SerializedName("balanceSheetHistoryQuarterly")
    val balanceSheetHistoryQuarterly: BalanceSheetHistoryQuarterly? = null,
    @SerializedName("cashflowStatementHistory")
    val cashflowStatementHistory: CashflowStatementHistory? = null,
    @SerializedName("cashflowStatementHistoryQuarterly")
    val cashflowStatementHistoryQuarterly: CashflowStatementHistoryQuarterly? = null,
    @SerializedName("earnings")
    val earnings: Earnings? = null,
    @SerializedName("errorList")
    val errorList: List<Any>? = null,
    @SerializedName("financialsTemplate")
    val financialsTemplate: FinancialsTemplate? = null,
    @SerializedName("incomeStatementHistory")
    val incomeStatementHistory: IncomeStatementHistory? = null,
    @SerializedName("incomeStatementHistoryQuarterly")
    val incomeStatementHistoryQuarterly: IncomeStatementHistoryQuarterly? = null,
    @SerializedName("loading")
    val loading: Boolean? = null,
    @SerializedName("meta")
    val meta: Meta? = null,
    @SerializedName("pageViews")
    val pageViews: PageViews? = null,
    @SerializedName("price")
    val price: Price? = null,
    @SerializedName("quoteType")
    val quoteType: QuoteType? = null,
    @SerializedName("summaryDetail")
    val summaryDetail: SummaryDetail? = null,
    @SerializedName("symbol")
    val symbol: String? = null,
    @SerializedName("timeSeries")
    val timeSeries: TimeSeries? = null
)