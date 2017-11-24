package com.zachary_moore.androidkotlinreddit.model

import java.net.URL

val trendingSubreddit = "https://www.reddit.com/api/trending_subreddits.json"

fun getRequest(url : String) = URL(url).readText()

fun requestTrendingSubreddits() = getRequest(trendingSubreddit)