package com.evanemran.gitcrawlr

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.evanemran.gitcrawlr.adapters.FeedListAdapter
import com.evanemran.gitcrawlr.databinding.ActivityMainBinding
import com.evanemran.gitcrawlr.listeners.ClickListener
import com.evanemran.gitcrawlr.listeners.ResponseListener
import com.evanemran.gitcrawlr.models.FeedItem
import com.evanemran.gitcrawlr.models.FeedResponse
import com.evanemran.gitcrawlr.network.RequestManager

class MainActivity : AppCompatActivity() {
    lateinit var dialog: ProgressDialog
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        dialog = ProgressDialog(this)
        dialog.setTitle("Loading")

        val requestManager: RequestManager = RequestManager()

        requestManager.getFeed("Flutter", "stars")
        dialog.show()
    }

    private val headlineResponseListener: ResponseListener<FeedResponse> = object : ResponseListener<FeedResponse> {
        override fun didFetch(message: String, response: FeedResponse) {
            dialog.dismiss()
            binding.recyclerViewHome.setHasFixedSize(true)
            binding.recyclerViewHome.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            val adapter: FeedListAdapter = FeedListAdapter(this@MainActivity, response.items, clickListener)
            binding.recyclerViewHome.adapter = adapter

        }

        override fun didError(message: String) {
            dialog.dismiss()
            Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
        }

    }

    private val clickListener: ClickListener<FeedItem> = object : ClickListener<FeedItem> {
        override fun onClicked(item: FeedItem) {
            startActivity(
                Intent(this@MainActivity, DetailsActivity::class.java)
                    .putExtra("content", item))
        }

    }

}