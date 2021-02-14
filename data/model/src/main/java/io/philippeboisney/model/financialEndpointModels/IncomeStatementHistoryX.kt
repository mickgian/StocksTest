package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class IncomeStatementHistoryX(
    @SerializedName("costOfRevenue")
    val costOfRevenue: CostOfRevenue? = null,
    @SerializedName("discontinuedOperations")
    val discontinuedOperations: DiscontinuedOperations? = null,
    @SerializedName("ebit")
    val ebit: Ebit? = null,
    @SerializedName("effectOfAccountingCharges")
    val effectOfAccountingCharges: EffectOfAccountingCharges? = null,
    @SerializedName("endDate")
    val endDate: EndDateXXXX? = null,
    @SerializedName("extraordinaryItems")
    val extraordinaryItems: ExtraordinaryItems? = null,
    @SerializedName("grossProfit")
    val grossProfit: GrossProfit? = null,
    @SerializedName("incomeBeforeTax")
    val incomeBeforeTax: IncomeBeforeTax? = null,
    @SerializedName("incomeTaxExpense")
    val incomeTaxExpense: IncomeTaxExpense? = null,
    @SerializedName("interestExpense")
    val interestExpense: InterestExpense? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null,
    @SerializedName("minorityInterest")
    val minorityInterest: MinorityInterest? = null,
    @SerializedName("netIncome")
    val netIncome: NetIncomeXX? = null,
    @SerializedName("netIncomeApplicableToCommonShares")
    val netIncomeApplicableToCommonShares: NetIncomeApplicableToCommonShares? = null,
    @SerializedName("netIncomeFromContinuingOps")
    val netIncomeFromContinuingOps: NetIncomeFromContinuingOps? = null,
    @SerializedName("nonRecurring")
    val nonRecurring: NonRecurring? = null,
    @SerializedName("operatingIncome")
    val operatingIncome: OperatingIncome? = null,
    @SerializedName("otherItems")
    val otherItems: OtherItems? = null,
    @SerializedName("otherOperatingExpenses")
    val otherOperatingExpenses: OtherOperatingExpenses? = null,
    @SerializedName("researchDevelopment")
    val researchDevelopment: ResearchDevelopment? = null,
    @SerializedName("sellingGeneralAdministrative")
    val sellingGeneralAdministrative: SellingGeneralAdministrative? = null,
    @SerializedName("totalOperatingExpenses")
    val totalOperatingExpenses: TotalOperatingExpenses? = null,
    @SerializedName("totalOtherIncomeExpenseNet")
    val totalOtherIncomeExpenseNet: TotalOtherIncomeExpenseNet? = null,
    @SerializedName("totalRevenue")
    val totalRevenue: TotalRevenue? = null
)