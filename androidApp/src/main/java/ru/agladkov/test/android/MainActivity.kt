package ru.agladkov.test.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.agladkov.test.Greeting
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ru.agladkov.test.android.screens.feed.FeedScreen

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FeedScreen()
        }
    }
}
