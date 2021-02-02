package io.philippeboisney.home.di

import io.philippeboisney.home.HomeViewModel
import io.philippeboisney.home.domain.GetStocksUseCase
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureHomeModule = module {
    factory { GetStocksUseCase(get()) }
    viewModel { HomeViewModel(get(), get()) }
}