package ru.agladkov.test.android.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.agladkov.data.features.tweets.models.TweetModel

@Composable
fun TweetCell(model: TweetModel) {
    Text(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        text = model.text
    )
}