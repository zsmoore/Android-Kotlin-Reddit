package com.zachary_moore.androidkotlinreddit.model

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.zachary_moore.androidkotlinreddit.view.Adapter.SubredditCardViewAdapter
import com.zachary_moore.androidkotlinreddit.view.MainActivity

fun trendingSubreddit (subredditView: RecyclerView, mainActivity: MainActivity) {
    val apiReturn: TrendingSubreddits = loadTrending(requestTrendingSubreddits())
    subredditView.adapter = SubredditCardViewAdapter(apiReturn.names, mainActivity)
    subredditView.layoutManager = LinearLayoutManager(subredditView.context)
}