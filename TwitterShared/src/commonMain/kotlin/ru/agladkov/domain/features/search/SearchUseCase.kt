package ru.agladkov.domain.features.search

import ru.agladkov.data.features.search.SearchRepository
import ru.agladkov.data.features.tweets.TweetsRepository
import ru.agladkov.data.features.tweets.models.TweetsResponse
import ru.agladkov.data.features.user.UserRepository

class SearchUseCase(
    private val userRepository: UserRepository,
    private val searchRepository: SearchRepository,
    private val tweetsRepository: TweetsRepository
) {

    suspend fun execute(searchId: Long): TweetsResponse {
        val query = searchRepository.getLatestSearches(searchId)
        val localTweets = tweetsRepository.getLocalTweets(0, SEARCH_COUNT * 2)
        return TweetsResponse(
            nextId = localTweets.nextId,
            tweets = localTweets.tweets.filter { it.text.contains(query) }
        )
    }

    companion object {
        const val SEARCH_COUNT = 20
    }
}