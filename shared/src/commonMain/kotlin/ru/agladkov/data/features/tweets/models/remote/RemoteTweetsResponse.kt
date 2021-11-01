package ru.agladkov.data.features.tweets.models.remote

data class RemoteTweetsResponse(
    val nextId: Long?,
    val tweets: List<RemoteTweetModel>?
)

data class RemoteTweetModel(
    val tweetId: Long?,
    val content: RemoteTweetContentModel?
)

data class RemoteTweetContentModel(
    val title: String?,
    val isExpanded: Boolean?,
    val isFavorite: Boolean?
)