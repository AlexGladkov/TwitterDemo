package ru.agladkov.data.features.tweets

import ru.agladkov.data.features.tweets.models.remote.RemoteTweetsResponse

interface TweetsRemoteDataSource {
    suspend fun fetchTweets(token: String, nextId: Long): RemoteTweetsResponse
}