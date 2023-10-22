package com.evanemran.gitcrawlr.modules

import com.evanemran.gitcrawlr.network.RequestManager
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    fun provideApiService(): RequestManager {
        return RequestManager()
    }
}