package com.example.stocks_rank.di

import com.example.stocks_rank.GetStockFinancialUseCase
import com.example.stocks_rank.StockFinancialDetailsUiBuilder
import com.example.stocks_rank.StockRankViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val stockRankModule = module {
    factory { StockFinancialDetailsUiBuilder() }
    factory { GetStockFinancialUseCase( get(), get() )}
    viewModel { StockRankViewModel( get(), get()) }
}