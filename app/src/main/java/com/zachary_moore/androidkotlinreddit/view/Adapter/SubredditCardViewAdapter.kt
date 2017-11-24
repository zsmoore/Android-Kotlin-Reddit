package com.zachary_moore.androidkotlinreddit.view.Adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.zachary_moore.androidkotlinreddit.R
import com.zachary_moore.androidkotlinreddit.databinding.SubredditCardBinding
import com.zachary_moore.androidkotlinreddit.view.MainActivity
import com.zachary_moore.androidkotlinreddit.view.SubredditCardViewModel

class SubredditCardViewAdapter(data: Array<String>, activity: MainActivity): RecyclerView.Adapter<SubredditCardViewAdapter.ViewHolder> (){
    class ViewHolder(v: CardView) : RecyclerView.ViewHolder(v) {
        val cardView = v
    }

    private val dataSet = data
    private val mainActivity = activity

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val newCard = DataBindingUtil
                .inflate<SubredditCardBinding>(LayoutInflater.from(parent?.context),
                        R.layout.subreddit_card, parent, false)
        return ViewHolder(newCard.root as CardView)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val binding = DataBindingUtil.getBinding<SubredditCardBinding>(holder?.cardView)
        binding.cardViewModel = SubredditCardViewModel(dataSet[position])
        binding.mainActivity = mainActivity
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}