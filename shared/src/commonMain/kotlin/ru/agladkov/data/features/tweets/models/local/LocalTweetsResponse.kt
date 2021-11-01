package ru.agladkov.data.features.tweets.models.local

data class LocalTweetsResponse(
    val nextId: Long,
    val tweets: List<LocalTweetModel>
)

data class LocalTweetModel(
    val tweetId: Long,
    val text: String
)