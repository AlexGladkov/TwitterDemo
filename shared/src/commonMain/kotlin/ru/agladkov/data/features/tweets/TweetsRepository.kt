package ru.agladkov.data.features.tweets

import ru.agladkov.data.features.tweets.models.TweetsResponse

class TweetsRepository(
    val localDataSource: TweetsLocalDataSource,
    private val remoteDataSource: TweetsRemoteDataSource
) {

    suspend fun fetchTweets(token: String, nextId: Long, count: Int): TweetsResponse {
        val remoteResponse = remoteDataSource
            .fetchTweets(nextId = nextId, token = token)

        localDataSource.storeTweets(remoteResponse)
        return remoteResponse
    }
}