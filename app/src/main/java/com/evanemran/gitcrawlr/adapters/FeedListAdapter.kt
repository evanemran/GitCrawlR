package com.evanemran.gitcrawlr.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.evanemran.gitcrawlr.R
import com.evanemran.gitcrawlr.listeners.ClickListener
import com.evanemran.gitcrawlr.models.FeedItem
import com.squareup.picasso.Picasso

class FeedListAdapter(
    val context: Context,
    val list: List<FeedItem>,
    val listener: ClickListener<FeedItem>
) : RecyclerView.Adapter<FeedViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        return FeedViewHolder(LayoutInflater.from(context).inflate(R.layout.feed_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        val item = list[position]

        holder.textView_feed_title.text = item.fullName
        holder.textView_feed_desc.text = item.description
        Picasso.get().load(item.owner?.avatarUrl).into(holder.imageView_feed)
        holder.feed_container.setOnClickListener {
            listener.onClicked(item)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}


class FeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val feed_container = itemView.findViewById<CardView>(R.id.feed_container)
    val imageView_feed = itemView.findViewById<ImageView>(R.id.imageView_feed)
    val textView_feed_title = itemView.findViewById<TextView>(R.id.textView_feed_title)
    val textView_feed_desc = itemView.findViewById<TextView>(R.id.textView_feed_desc)
}
