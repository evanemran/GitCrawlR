package com.evanemran.gitcrawlr.components

import com.evanemran.gitcrawlr.DetailsActivity
import com.evanemran.gitcrawlr.MainActivity
import com.evanemran.gitcrawlr.modules.DataModule
import com.evanemran.gitcrawlr.modules.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, DataModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: DetailsActivity)
}