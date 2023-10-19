package com.evanemran.gitcrawlr.listeners

import com.evanemran.gitcrawlr.models.FeedResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("search/repositories")
    fun search(
        @Query("q") keyword: String,
        @Query("sort") sort: String,
    ): Call<FeedResponse>

}
