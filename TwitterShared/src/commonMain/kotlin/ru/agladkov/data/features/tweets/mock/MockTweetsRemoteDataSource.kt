package ru.agladkov.data.features.tweets.mock

import kotlinx.coroutines.delay
import ru.agladkov.data.features.tweets.TweetsRemoteDataSource
import ru.agladkov.data.features.tweets.models.remote.RemoteTweetContentModel
import ru.agladkov.data.features.tweets.models.remote.RemoteTweetModel
import ru.agladkov.data.features.tweets.models.remote.RemoteTweetsResponse

class MockTweetsRemoteDataSource : TweetsRemoteDataSource {

    override suspend fun fetchTweets(token: String, nextId: Long): RemoteTweetsResponse {
        delay(1000)
        return RemoteTweetsResponse(
            nextId = 30, tweets =
            listOf(
                RemoteTweetModel(
                    0, RemoteTweetContentModel(
                        title = "Hello, Android", isExpanded = false, isFavorite = false
                    )
                ),
                RemoteTweetModel(
                    1, RemoteTweetContentModel(
                        title = "Hello, iOS", isExpanded = false, isFavorite = false
                    )
                ),
                RemoteTweetModel(
                    2, RemoteTweetContentModel(
                        title = "Hello, Compose", isExpanded = false, isFavorite = false
                    )
                )
            )
        )
    }
}