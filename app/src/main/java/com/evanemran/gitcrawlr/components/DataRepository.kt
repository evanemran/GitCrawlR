package com.evanemran.gitcrawlr.components

import com.evanemran.gitcrawlr.models.FeedItem
import com.evanemran.gitcrawlr.network.RequestManager

class DataRepository(private val apiService: RequestManager) {

    fun fetchData(): List<FeedItem> {
        // In a real application, this method would make an API request
        // using the 'apiService' to fetch a list of data items.
        // For the sake of this example, let's assume it returns a mock list.

        return apiService.getFeed("Flutter", "stars")
    }
}