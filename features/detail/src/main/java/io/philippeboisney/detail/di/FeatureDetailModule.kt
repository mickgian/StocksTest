package io.philippeboisney.detail.di

import io.philippeboisney.detail.DetailImageViewModel
import io.philippeboisney.detail.DetailViewModel
import io.philippeboisney.detail.domain.GetStocksDetailUseCase
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureDetailModule = module {
    factory { GetStocksDetailUseCase(get()) }
    viewModel { DetailViewModel(get(), get()) }
    viewModel { DetailImageViewModel() }
}