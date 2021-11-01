package ru.agladkov.test.android.screens.feed.models

import ru.agladkov.data.features.tweets.models.TweetModel

data class FeedViewState(
    val tweets: List<TweetModel> = emptyList()
)