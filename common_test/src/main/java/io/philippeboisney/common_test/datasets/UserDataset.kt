package io.philippeboisney.common_test.datasets

import io.philippeboisney.model.StocksUI
import java.util.*

object UserDataset {

    val DATE_REFRESH: Date = GregorianCalendar(2018, 5, 12).time
    val FAKE_STOCKS = listOf(
            StocksUI(fullExchangeName = "Prova", symbol = "ProvaSymbol"),
            StocksUI(fullExchangeName = "Prova2", symbol = "ProvaSymbol2"),
            StocksUI(fullExchangeName = "Prova3", symbol = "ProvaSymbol3")
    )
}