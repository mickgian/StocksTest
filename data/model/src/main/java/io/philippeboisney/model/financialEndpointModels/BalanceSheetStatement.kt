package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class BalanceSheetStatement(
    @SerializedName("accountsPayable")
    val accountsPayable: AccountsPayable? = null,
    @SerializedName("capitalSurplus")
    val capitalSurplus: CapitalSurplus? = null,
    @SerializedName("cash")
    val cash: Cash? = null,
    @SerializedName("commonStock")
    val commonStock: CommonStock? = null,
    @SerializedName("deferredLongTermAssetCharges")
    val deferredLongTermAssetCharges: DeferredLongTermAssetCharges? = null,
    @SerializedName("endDate")
    val endDate: EndDate? = null,
    @SerializedName("goodWill")
    val goodWill: GoodWill? = null,
    @SerializedName("intangibleAssets")
    val intangibleAssets: IntangibleAssets? = null,
    @SerializedName("longTermDebt")
    val longTermDebt: LongTermDebt? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null,
    @SerializedName("netReceivables")
    val netReceivables: NetReceivables? = null,
    @SerializedName("netTangibleAssets")
    val netTangibleAssets: NetTangibleAssets? = null,
    @SerializedName("otherAssets")
    val otherAssets: OtherAssets? = null,
    @SerializedName("otherCurrentAssets")
    val otherCurrentAssets: OtherCurrentAssets? = null,
    @SerializedName("otherCurrentLiab")
    val otherCurrentLiab: OtherCurrentLiab? = null,
    @SerializedName("otherLiab")
    val otherLiab: OtherLiab? = null,
    @SerializedName("otherStockholderEquity")
    val otherStockholderEquity: OtherStockholderEquity? = null,
    @SerializedName("propertyPlantEquipment")
    val propertyPlantEquipment: PropertyPlantEquipment? = null,
    @SerializedName("retainedEarnings")
    val retainedEarnings: RetainedEarnings? = null,
    @SerializedName("shortLongTermDebt")
    val shortLongTermDebt: ShortLongTermDebt? = null,
    @SerializedName("totalAssets")
    val totalAssets: TotalAssets? = null,
    @SerializedName("totalCurrentAssets")
    val totalCurrentAssets: TotalCurrentAssets? = null,
    @SerializedName("totalCurrentLiabilities")
    val totalCurrentLiabilities: TotalCurrentLiabilities? = null,
    @SerializedName("totalLiab")
    val totalLiab: TotalLiab? = null,
    @SerializedName("totalStockholderEquity")
    val totalStockholderEquity: TotalStockholderEquity? = null,
    @SerializedName("treasuryStock")
    val treasuryStock: TreasuryStock? = null
)