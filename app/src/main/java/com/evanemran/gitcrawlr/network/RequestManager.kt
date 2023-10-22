package com.evanemran.gitcrawlr.network

import android.content.Context
import com.evanemran.gitcrawlr.config.AppConfig
import com.evanemran.gitcrawlr.listeners.ApiInterface
import com.evanemran.gitcrawlr.listeners.ResponseListener
import com.evanemran.gitcrawlr.models.FeedItem
import com.evanemran.gitcrawlr.models.FeedResponse
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RequestManager() {
    val okHttpClient = OkHttpClient.Builder()
        .readTimeout(60, TimeUnit.SECONDS)
        .connectTimeout(60, TimeUnit.SECONDS)
        .addInterceptor { chain ->
            chain.proceed(
                chain.request()
                    .newBuilder()
                    .also {
                        it.addHeader("package", "com.evanemran.gitcrawler")
                    }
                    .build()
            )
        }
        .build()

    val retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(AppConfig().getBaseUrl())
        .addConverterFactory(GsonConverterFactory.create())
        .build()



    fun getFeed(keyword: String, sortBy: String) : List<FeedItem> {

        var feedList: List<FeedItem> = mutableListOf()

        val call = retrofit.create(ApiInterface::class.java).search(keyword, sortBy)
        call.enqueue(object : Callback<FeedResponse> {
            override fun onResponse(
                call: Call<FeedResponse>,
                response: Response<FeedResponse>
            ) {
                if(response.isSuccessful) {
                    feedList = response.body()!!.items
                }
            }
            override fun onFailure(call: Call<FeedResponse>, t: Throwable) {

            }
        })
        return  feedList

    }

}