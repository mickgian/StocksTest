package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class BalanceSheetStatementX(
    @SerializedName("accountsPayable")
    val accountsPayable: AccountsPayableX? = null,
    @SerializedName("capitalSurplus")
    val capitalSurplus: CapitalSurplusX? = null,
    @SerializedName("cash")
    val cash: CashX? = null,
    @SerializedName("commonStock")
    val commonStock: CommonStockX? = null,
    @SerializedName("deferredLongTermAssetCharges")
    val deferredLongTermAssetCharges: DeferredLongTermAssetChargesX? = null,
    @SerializedName("endDate")
    val endDate: EndDateX? = null,
    @SerializedName("goodWill")
    val goodWill: GoodWillX? = null,
    @SerializedName("intangibleAssets")
    val intangibleAssets: IntangibleAssetsX? = null,
    @SerializedName("longTermDebt")
    val longTermDebt: LongTermDebtX? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null,
    @SerializedName("netReceivables")
    val netReceivables: NetReceivablesX? = null,
    @SerializedName("netTangibleAssets")
    val netTangibleAssets: NetTangibleAssetsX? = null,
    @SerializedName("otherAssets")
    val otherAssets: OtherAssetsX? = null,
    @SerializedName("otherCurrentAssets")
    val otherCurrentAssets: OtherCurrentAssetsX? = null,
    @SerializedName("otherCurrentLiab")
    val otherCurrentLiab: OtherCurrentLiabX? = null,
    @SerializedName("otherLiab")
    val otherLiab: OtherLiabX? = null,
    @SerializedName("otherStockholderEquity")
    val otherStockholderEquity: OtherStockholderEquityX? = null,
    @SerializedName("propertyPlantEquipment")
    val propertyPlantEquipment: PropertyPlantEquipmentX? = null,
    @SerializedName("retainedEarnings")
    val retainedEarnings: RetainedEarningsX? = null,
    @SerializedName("shortLongTermDebt")
    val shortLongTermDebt: ShortLongTermDebtX? = null,
    @SerializedName("totalAssets")
    val totalAssets: TotalAssetsX? = null,
    @SerializedName("totalCurrentAssets")
    val totalCurrentAssets: TotalCurrentAssetsX? = null,
    @SerializedName("totalCurrentLiabilities")
    val totalCurrentLiabilities: TotalCurrentLiabilitiesX? = null,
    @SerializedName("totalLiab")
    val totalLiab: TotalLiabX? = null,
    @SerializedName("totalStockholderEquity")
    val totalStockholderEquity: TotalStockholderEquityX? = null,
    @SerializedName("treasuryStock")
    val treasuryStock: TreasuryStockX? = null
)