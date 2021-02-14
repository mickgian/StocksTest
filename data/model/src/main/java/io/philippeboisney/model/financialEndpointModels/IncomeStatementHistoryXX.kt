package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class IncomeStatementHistoryXX(
    @SerializedName("costOfRevenue")
    val costOfRevenue: CostOfRevenueX? = null,
    @SerializedName("discontinuedOperations")
    val discontinuedOperations: DiscontinuedOperationsX? = null,
    @SerializedName("ebit")
    val ebit: EbitX? = null,
    @SerializedName("effectOfAccountingCharges")
    val effectOfAccountingCharges: EffectOfAccountingChargesX? = null,
    @SerializedName("endDate")
    val endDate: EndDateXXXXX? = null,
    @SerializedName("extraordinaryItems")
    val extraordinaryItems: ExtraordinaryItemsX? = null,
    @SerializedName("grossProfit")
    val grossProfit: GrossProfitX? = null,
    @SerializedName("incomeBeforeTax")
    val incomeBeforeTax: IncomeBeforeTaxX? = null,
    @SerializedName("incomeTaxExpense")
    val incomeTaxExpense: IncomeTaxExpenseX? = null,
    @SerializedName("interestExpense")
    val interestExpense: InterestExpenseX? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null,
    @SerializedName("minorityInterest")
    val minorityInterest: MinorityInterestX? = null,
    @SerializedName("netIncome")
    val netIncome: NetIncomeXXX? = null,
    @SerializedName("netIncomeApplicableToCommonShares")
    val netIncomeApplicableToCommonShares: NetIncomeApplicableToCommonSharesX? = null,
    @SerializedName("netIncomeFromContinuingOps")
    val netIncomeFromContinuingOps: NetIncomeFromContinuingOpsX? = null,
    @SerializedName("nonRecurring")
    val nonRecurring: NonRecurringX? = null,
    @SerializedName("operatingIncome")
    val operatingIncome: OperatingIncomeX? = null,
    @SerializedName("otherItems")
    val otherItems: OtherItemsX? = null,
    @SerializedName("otherOperatingExpenses")
    val otherOperatingExpenses: OtherOperatingExpensesX? = null,
    @SerializedName("researchDevelopment")
    val researchDevelopment: ResearchDevelopmentX? = null,
    @SerializedName("sellingGeneralAdministrative")
    val sellingGeneralAdministrative: SellingGeneralAdministrativeX? = null,
    @SerializedName("totalOperatingExpenses")
    val totalOperatingExpenses: TotalOperatingExpensesX? = null,
    @SerializedName("totalOtherIncomeExpenseNet")
    val totalOtherIncomeExpenseNet: TotalOtherIncomeExpenseNetX? = null,
    @SerializedName("totalRevenue")
    val totalRevenue: TotalRevenueX? = null
)