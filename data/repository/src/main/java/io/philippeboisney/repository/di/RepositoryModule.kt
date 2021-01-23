package io.philippeboisney.repository.di

import io.philippeboisney.repository.*
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module.module

val repositoryModule = module {
    factory { AppDispatchers(Dispatchers.Main, Dispatchers.IO) }
    // factory { UserRepositoryImpl(get(), get()) as UserRepository }
    factory { StocksRepositoryImpl(get(), get()) as StocksRepository }
}