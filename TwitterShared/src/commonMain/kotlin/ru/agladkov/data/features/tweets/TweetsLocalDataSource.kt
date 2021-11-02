package ru.agladkov.data.features.tweets

import ru.agladkov.data.features.tweets.models.local.LocalTweetsResponse
import ru.agladkov.data.features.tweets.models.remote.RemoteTweetsResponse

interface TweetsLocalDataSource {
    suspend fun storeTweets(remoteTweetsResponse: RemoteTweetsResponse)
    suspend fun fetchTweets(nextId: Long, count: Int): LocalTweetsResponse
}