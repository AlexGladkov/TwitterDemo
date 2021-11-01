package ru.agladkov.test.android.screens.feed

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.agladkov.test.android.common.TweetCell
import ru.agladkov.test.android.screens.feed.models.FeedEvent

@Composable
fun FeedScreen(
    feedViewModel: FeedViewModel = viewModel()
) {
    val viewState = feedViewModel.viewState.observeAsState()

    viewState.value?.let {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            content = {
                it.tweets.forEach { tweetModel ->
                    item {
                        TweetCell(tweetModel)
                    }
                }
            })
    }

    LaunchedEffect(Unit) {
        feedViewModel.obtainEvent(FeedEvent.ScreenShown)
    }
}