package ru.agladkov.data.features.tweets.models

import ru.agladkov.data.features.tweets.models.local.LocalTweetModel
import ru.agladkov.data.features.tweets.models.local.LocalTweetsResponse
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

fun RemoteTweetModel.mapToTweetModel(): TweetModel? {
    return TweetModel(
        tweetId = tweetId ?: return null,
        text = content?.title ?: return null
    )
}

fun RemoteTweetsResponse.mapToTweetsResponse(): TweetsResponse? {
    return TweetsResponse(
        nextId = nextId ?: return null,
        tweets = tweets?.mapNotNull { it.mapToTweetModel() } ?: emptyList()
    )
}

fun LocalTweetModel.mapToTweetModel() = TweetModel(
    tweetId = tweetId,
    text = text
)

fun LocalTweetsResponse.mapToTweetsResponse() = TweetsResponse(
    nextId = nextId,
    tweets = tweets.map { it.mapToTweetModel() }
)
