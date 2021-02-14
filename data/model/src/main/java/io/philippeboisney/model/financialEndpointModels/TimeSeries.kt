package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class TimeSeries(
    @SerializedName("annualBasicAverageShares")
    val annualBasicAverageShares: List<AnnualBasicAverageShare>? = null,
    @SerializedName("annualBasicEPS")
    val annualBasicEPS: List<AnnualBasicEPS>? = null,
    @SerializedName("annualCostOfRevenue")
    val annualCostOfRevenue: List<AnnualCostOfRevenue>? = null,
    @SerializedName("annualDilutedAverageShares")
    val annualDilutedAverageShares: List<AnnualDilutedAverageShare>? = null,
    @SerializedName("annualDilutedEPS")
    val annualDilutedEPS: List<AnnualDilutedEPS>? = null,
    @SerializedName("annualEbitda")
    val annualEbitda: List<AnnualEbitda>? = null,
    @SerializedName("annualGrossProfit")
    val annualGrossProfit: List<AnnualGrossProfit>? = null,
    @SerializedName("annualInterestExpense")
    val annualInterestExpense: List<AnnualInterestExpense>? = null,
    @SerializedName("annualNetIncome")
    val annualNetIncome: List<AnnualNetIncome>? = null,
    @SerializedName("annualNetIncomeCommonStockholders")
    val annualNetIncomeCommonStockholders: List<AnnualNetIncomeCommonStockholder>? = null,
    @SerializedName("annualNetIncomeContinuousOperations")
    val annualNetIncomeContinuousOperations: List<AnnualNetIncomeContinuousOperation>? = null,
    @SerializedName("annualOperatingExpense")
    val annualOperatingExpense: List<AnnualOperatingExpense>? = null,
    @SerializedName("annualOperatingIncome")
    val annualOperatingIncome: List<AnnualOperatingIncome>? = null,
    @SerializedName("annualOtherIncomeExpense")
    val annualOtherIncomeExpense: List<AnnualOtherIncomeExpense>? = null,
    @SerializedName("annualPretaxIncome")
    val annualPretaxIncome: List<AnnualPretaxIncome>? = null,
    @SerializedName("annualResearchAndDevelopment")
    val annualResearchAndDevelopment: List<Any>? = null,
    @SerializedName("annualSellingGeneralAndAdministration")
    val annualSellingGeneralAndAdministration: List<AnnualSellingGeneralAndAdministration>? = null,
    @SerializedName("annualTaxProvision")
    val annualTaxProvision: List<AnnualTaxProvision>? = null,
    @SerializedName("annualTotalRevenue")
    val annualTotalRevenue: List<AnnualTotalRevenue>? = null,
    @SerializedName("timestamp")
    val timestamp: List<Int>? = null,
    @SerializedName("trailingBasicAverageShares")
    val trailingBasicAverageShares: List<Any>? = null,
    @SerializedName("trailingBasicEPS")
    val trailingBasicEPS: List<Any>? = null,
    @SerializedName("trailingCostOfRevenue")
    val trailingCostOfRevenue: List<TrailingCostOfRevenue>? = null,
    @SerializedName("trailingDilutedAverageShares")
    val trailingDilutedAverageShares: List<Any>? = null,
    @SerializedName("trailingDilutedEPS")
    val trailingDilutedEPS: List<Any>? = null,
    @SerializedName("trailingGrossProfit")
    val trailingGrossProfit: List<TrailingGrossProfit>? = null,
    @SerializedName("trailingInterestExpense")
    val trailingInterestExpense: List<TrailingInterestExpense>? = null,
    @SerializedName("trailingNetIncome")
    val trailingNetIncome: List<TrailingNetIncome>? = null,
    @SerializedName("trailingNetIncomeCommonStockholders")
    val trailingNetIncomeCommonStockholders: List<TrailingNetIncomeCommonStockholder>? = null,
    @SerializedName("trailingNetIncomeContinuousOperations")
    val trailingNetIncomeContinuousOperations: List<TrailingNetIncomeContinuousOperation>? = null,
    @SerializedName("trailingOperatingExpense")
    val trailingOperatingExpense: List<TrailingOperatingExpense>? = null,
    @SerializedName("trailingOperatingIncome")
    val trailingOperatingIncome: List<TrailingOperatingIncome>? = null,
    @SerializedName("trailingOtherIncomeExpense")
    val trailingOtherIncomeExpense: List<TrailingOtherIncomeExpense>? = null,
    @SerializedName("trailingPretaxIncome")
    val trailingPretaxIncome: List<TrailingPretaxIncome>? = null,
    @SerializedName("trailingResearchAndDevelopment")
    val trailingResearchAndDevelopment: List<Any>? = null,
    @SerializedName("trailingSellingGeneralAndAdministration")
    val trailingSellingGeneralAndAdministration: List<TrailingSellingGeneralAndAdministration>? = null,
    @SerializedName("trailingTaxProvision")
    val trailingTaxProvision: List<TrailingTaxProvision>? = null,
    @SerializedName("trailingTotalRevenue")
    val trailingTotalRevenue: List<TrailingTotalRevenue>? = null
)