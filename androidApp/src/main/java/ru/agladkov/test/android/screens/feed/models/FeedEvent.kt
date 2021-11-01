package ru.agladkov.test.android.screens.feed.models

sealed class FeedEvent {
    object ScreenShown : FeedEvent()
}