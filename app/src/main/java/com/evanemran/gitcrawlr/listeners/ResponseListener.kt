package com.evanemran.gitcrawlr.listeners


interface ResponseListener<T> {
    fun didFetch(message: String, response: T)
    fun didError(message: String)
}
