package com.evanemran.gitcrawlr.modules

import com.evanemran.gitcrawlr.components.DataRepository
import com.evanemran.gitcrawlr.network.RequestManager
import dagger.Module
import dagger.Provides

@Module
class DataModule {
    @Provides
    fun provideDataRepository(apiService: RequestManager): DataRepository {
        return DataRepository(apiService)
    }
}