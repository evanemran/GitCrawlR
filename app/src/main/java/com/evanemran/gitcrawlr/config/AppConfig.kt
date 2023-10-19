package com.evanemran.gitcrawlr.config

class AppConfig {
    val flavor = AppType.DEV

    public fun getBaseUrl(): String {

        return when (flavor) {
            AppType.DEV -> "https://api.github.com/"
            AppType.QA -> "https://api.github.com/"
            AppType.PROD -> "https://api.github.com/"
        }
    }
}

enum class AppType {
    DEV,
    QA,
    PROD
}
