package com.zachary_moore.androidkotlinreddit.view

import android.content.Intent
import android.net.Uri
import java.util.logging.Logger


class SubredditCardViewModel (name: String){
    val subRedditName = name
    private val link = "https://www.reddit.com/r/$subRedditName"
    fun goToLink(activity: MainActivity) {
        Logger.getLogger(MainActivity::class.java.name).warning("here")
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(link)
        activity.startActivity(intent)
    }
}