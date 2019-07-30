package com.example.rihport

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_news.view.*

class NewsAdapter (val context: Context) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    var news: List<NewsStory> = emptyList()

    class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view)

    val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        // Called when a new, empty view is created
        val view = inflater.inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return news.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.itemView.headline.text = news[position].headline
        holder.itemView.summary.text = news[position].summary
    }

    fun updateNews(news: List<NewsStory>) {
        this.news = news
        notifyDataSetChanged()
    }
}
