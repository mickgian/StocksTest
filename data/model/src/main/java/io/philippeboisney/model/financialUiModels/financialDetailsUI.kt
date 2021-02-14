package io.philippeboisney.model.financialUiModels


data class StockFinancialDetailsUI (
    // earningBeforeInterestsAndTax / (netWorkingCapital + netFixedAssets)
    val roic: String?,
    // earningBeforeInterestsAndTax / (marketCapitalization + netInterestBearingDebt)
    val earningsYield: String?
)

data class StockFinancialForCalculations (
    val marketCapitalization: Double?, //Must greater than 50 millions
    val earningBeforeInterestsAndTax: Double?,  //EBIT  api: financial/ebit
    val netWorkingCapital: Double?, //capitale circolante netto
    val netFixedAssets: Double,    //immobilizzazioni nette
    val netInterestBearingDebt: Double //maybe is 'Interest expense' in  financial endpoint
)