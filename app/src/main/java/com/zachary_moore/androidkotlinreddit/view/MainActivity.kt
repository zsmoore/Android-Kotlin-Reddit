package com.zachary_moore.androidkotlinreddit.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.support.v4.app.ActivityCompat
import android.support.v7.widget.RecyclerView
import android.widget.Button
import com.zachary_moore.androidkotlinreddit.R
import com.zachary_moore.androidkotlinreddit.model.trendingSubreddit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StrictMode.setThreadPolicy(
                StrictMode.ThreadPolicy.Builder()
                        .permitAll()
                        .build())

        ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.INTERNET),
                1)

        val button = findViewById<Button>(R.id.main_button)
        val subredditList = findViewById<RecyclerView>(R.id.subreddit_list)
        button.setOnClickListener { trendingSubreddit(subredditList, this) }
    }
}
