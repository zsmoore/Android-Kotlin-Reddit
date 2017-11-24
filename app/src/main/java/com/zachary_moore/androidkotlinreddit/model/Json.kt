package com.zachary_moore.androidkotlinreddit.model

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser

data class TrendingSubreddits(val names: Array<String>,
                              val commentCount: Int,
                              val commentURL: String)

fun loadIntoJson(jsonString : String) = Parser().parse(StringBuilder(jsonString)) as JsonObject

fun loadTrending(jsonString: String): TrendingSubreddits {
    val jsonObj: JsonObject = loadIntoJson(jsonString)

    @Suppress("UNCHECKED_CAST")
    val jsonArr = jsonObj.getValue("subreddit_names") as JsonArray<String>

    return TrendingSubreddits(jsonArr.value.toTypedArray(),
            jsonObj.getValue("comment_count") as Int,
            jsonObj.getValue("comment_url") as String)
}
