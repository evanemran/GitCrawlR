package com.evanemran.gitcrawlr

import android.app.Application
import com.evanemran.gitcrawlr.components.AppComponent
import com.evanemran.gitcrawlr.modules.DataModule
import com.evanemran.gitcrawlr.modules.NetworkModule


class MyApplication : Application() {
    var appComponent: AppComponent? = null
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .networkModule(NetworkModule())
            .dataModule(DataModule())
            .build()
    }
}