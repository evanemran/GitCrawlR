package com.evanemran.gitcrawlr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.evanemran.gitcrawlr.databinding.ActivityDetailsBinding
import com.evanemran.gitcrawlr.models.FeedItem
import com.evanemran.gitcrawlr.utils.AppDateFormatter
import com.squareup.picasso.Picasso

class DetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val selectedFeed: FeedItem = intent.getSerializableExtra("content") as FeedItem

        populateViews(selectedFeed)

    }

    private fun populateViews(selectedFeed: FeedItem) {
        binding.textViewDescTitle.text = selectedFeed.fullName
        binding.textViewDescDesc.text = selectedFeed.description

        Picasso.get().load(selectedFeed.owner?.avatarUrl).into(binding.imageViewDesc)

        binding.textViewOwner.text = "Owner: ${selectedFeed.owner!!.login}"
        binding.textViewStars.text = "Stars Count: ${selectedFeed.stargazersCount}"
        binding.textViewUpdated.text = "Last Updated: ${AppDateFormatter().formatUpdatedDate(selectedFeed.updatedAt)}"
    }

}