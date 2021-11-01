package ru.agladkov.domain.features.feed

import ru.agladkov.data.features.tweets.TweetsRepository
import ru.agladkov.data.features.tweets.models.TweetsResponse
import ru.agladkov.data.features.user.UserRepository

class GetMoreTweetsUseCase(
    private val userRepository: UserRepository,
    private val tweetsRepository: TweetsRepository
) {

    suspend fun execute(nextId: Long, count: Int): TweetsResponse =
        tweetsRepository.fetchTweets(
            token = userRepository.getAccessToken(),
            count = count,
            nextId = 0
        )
}