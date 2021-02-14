package com.example.stocks_rank

import io.philippeboisney.model.financialEndpointModels.StockFinancialModel
import io.philippeboisney.model.financialUiModels.StockFinancialDetailsUI


class StockFinancialDetailsUiBuilder {

    fun createStockFinancialDetailsUI(
        stockFinancialModel : StockFinancialModel
    ) : StockFinancialDetailsUI {

        // earningBeforeInterestsAndTax
        val ebit = stockFinancialModel.incomeStatementHistory?.incomeStatementHistory?.get(0)?.ebit?.raw


        /**
         * ROIC calculation
         */
        val totalCurrentAssets =
            stockFinancialModel.balanceSheetHistory?.balanceSheetStatements?.get(0)?.totalCurrentAssets?.raw
        val totalCurrentLiabilities =
            stockFinancialModel.balanceSheetHistory?.balanceSheetStatements?.get(0)?.totalCurrentLiabilities?.raw

        // net working capital definition: https://www.investopedia.com/terms/w/workingcapital.asp
        val netWorkingCapital = totalCurrentLiabilities?.let { totalCurrentAssets?.minus(it) }

        val netFixedAssets =
            stockFinancialModel.balanceSheetHistory?.balanceSheetStatements?.get(0)?.netTangibleAssets?.raw

        val temp = netWorkingCapital?.plus(netFixedAssets!!)

        val totalAssetExample =
            stockFinancialModel.balanceSheetHistory?.balanceSheetStatements?.get(0)?.totalAssets?.raw
        val totalAssetExample2 =
            stockFinancialModel.balanceSheetHistory?.balanceSheetStatements?.get(0)?.totalAssets?.fmt
        val totalAssetExample3 =
            stockFinancialModel.balanceSheetHistory?.balanceSheetStatements?.get(0)?.totalAssets?.longFmt

        var roic = (ebit?.toDouble()?.div(temp!!))?.times(100)


        /**
         * earningsYield calculation
         */
        val marketCapitalization =
            stockFinancialModel.price?.marketCap?.raw

        val netInterestBearingDebt =
            stockFinancialModel.incomeStatementHistory?.incomeStatementHistory?.get(0)?.interestExpense?.raw

        val temp2 = marketCapitalization?.plus(netInterestBearingDebt!!)
        val earningsYield = (ebit?.toDouble()?.div(temp2!!))?.times(100)


        //TODO: temp result, needs review
        return StockFinancialDetailsUI(
            roic = formatPercentage(roic) + "%",
            earningsYield = formatPercentage(earningsYield) + "%"
        )
    }

    private fun formatPercentage(value: Double?): String? {
        return String.format("%.2f", value)
    }

    companion object {
        const val TAG = "StockFinancialDetailsUiBuilder"
    }


}
