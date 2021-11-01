package ru.agladkov.data.features.tweets.models

import ru.agladkov.data.features.tweets.models.remote.RemoteTweetModel
import ru.agladkov.data.features.tweets.models.remote.RemoteTweetsResponse

data class TweetsResponse(
    val nextId: Long,
    val tweets: List<TweetModel>
)

data class TweetModel(
    val tweetId: Long,
    val text: String
)

fun RemoteTweetModel.mapToTweetModel() = TweetModel(
    tweetId = tweetId,
    text = text
)

fun RemoteTweetsResponse.mapToTweetsResponse() = TweetsResponse(
    nextId = nextId,
    tweets = tweets
)
