package ru.agladkov.test.android.screens.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.agladkov.domain.features.feed.feedUseCase
import ru.agladkov.mvi.EventHandler
import ru.agladkov.test.android.screens.feed.models.FeedEvent
import ru.agladkov.test.android.screens.feed.models.FeedViewState

class FeedViewModel : ViewModel(), EventHandler<FeedEvent> {

    private val _viewState: MutableLiveData<FeedViewState> = MutableLiveData(FeedViewState())
    val viewState: LiveData<FeedViewState> = _viewState

    override fun obtainEvent(event: FeedEvent) {
        when (event) {
            FeedEvent.ScreenShown -> fetchInitialThread()
        }
    }

    private fun fetchInitialThread() {
        viewModelScope.launch {
            val response = feedUseCase.execute(20)
            _viewState.postValue(
                _viewState.value?.copy(
                    tweets = response.tweets
                )
            )
        }
    }
}
