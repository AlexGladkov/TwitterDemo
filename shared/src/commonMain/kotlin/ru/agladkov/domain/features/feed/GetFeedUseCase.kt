package ru.agladkov.domain.features.feed

import ru.agladkov.data.features.tweets.TweetsRepository
import ru.agladkov.data.features.tweets.models.TweetsResponse
import ru.agladkov.data.features.tweets.tweetsRepository
import ru.agladkov.data.features.user.UserRepository
import ru.agladkov.data.features.user.userRepository

val feedUseCase = GetFeedUseCase(
    userRepository = userRepository,
    tweetsRepository = tweetsRepository
)

class GetFeedUseCase(
    private val userRepository: UserRepository,
    private val tweetsRepository: TweetsRepository
) {

    suspend fun execute(count: Int): TweetsResponse =
        tweetsRepository.fetchTweets(
            token = userRepository.getAccessToken(),
            count = count,
            nextId = 0
        )

}