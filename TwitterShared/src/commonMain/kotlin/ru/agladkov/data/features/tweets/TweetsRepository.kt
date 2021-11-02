package ru.agladkov.data.features.tweets

import ru.agladkov.data.features.tweets.mock.MockTweetsLocalDataSource
import ru.agladkov.data.features.tweets.mock.MockTweetsRemoteDataSource
import ru.agladkov.data.features.tweets.models.TweetsResponse
import ru.agladkov.data.features.tweets.models.mapToTweetsResponse

val tweetsRepository = TweetsRepository(
    remoteDataSource = MockTweetsRemoteDataSource(),
    localDataSource = MockTweetsLocalDataSource()
)

class TweetsRepository(
    private val localDataSource: TweetsLocalDataSource,
    private val remoteDataSource: TweetsRemoteDataSource
) {

    suspend fun fetchTweets(token: String, nextId: Long, count: Int): TweetsResponse {
        val remoteResponse = remoteDataSource
            .fetchTweets(nextId = nextId, token = token)

        localDataSource.storeTweets(remoteResponse)
        return remoteResponse.mapToTweetsResponse() ?: throw IllegalStateException("Invalid response")
    }

    suspend fun getLocalTweets(nextId: Long, count: Int): TweetsResponse {
        return localDataSource.fetchTweets(nextId = nextId, count)
            .mapToTweetsResponse()
    }
}