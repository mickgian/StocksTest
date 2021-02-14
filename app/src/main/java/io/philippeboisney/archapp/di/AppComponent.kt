package io.philippeboisney.archapp.di

import com.example.stocks_rank.di.stockRankModule
import io.philippeboisney.detail.di.featureDetailModule
import io.philippeboisney.home.di.featureHomeModule
import io.philippeboisney.remote.di.createRemoteModule
import io.philippeboisney.repository.di.repositoryModule

val appComponent= listOf(
    createRemoteModule("https://apidojo-yahoo-finance-v1.p.rapidapi.com/"),
    repositoryModule,
    featureHomeModule,
    featureDetailModule,
    stockRankModule
)
