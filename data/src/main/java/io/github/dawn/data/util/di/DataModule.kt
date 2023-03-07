package io.github.dawn.data.util.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.dawn.data.util.ConnectivityManagerNetworkMonitor
import io.github.dawn.data.util.NetworkMonitor

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsNetworkModule(
        networkModule: ConnectivityManagerNetworkMonitor
    ): NetworkMonitor
}
