package ru.agladkov.data.features.tweets.mock

import kotlinx.coroutines.delay
import ru.agladkov.data.features.tweets.TweetsLocalDataSource
import ru.agladkov.data.features.tweets.models.local.LocalTweetsResponse
import ru.agladkov.data.features.tweets.models.remote.RemoteTweetsResponse

class MockTweetsLocalDataSource : TweetsLocalDataSource {

    override suspend fun storeTweets(remoteTweetsResponse: RemoteTweetsResponse) {
        delay(2000)
    }

    override suspend fun fetchTweets(nextId: Long, count: Int): LocalTweetsResponse {
        return LocalTweetsResponse(nextId = 0, tweets = emptyList())
    }
}