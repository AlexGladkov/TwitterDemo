package ru.agladkov.test.android.screens.feed

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun FeedScreen() {
    Box {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Text("Hello, Feed")
        }
    }
}