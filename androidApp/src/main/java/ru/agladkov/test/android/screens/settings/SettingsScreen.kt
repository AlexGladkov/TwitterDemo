package ru.agladkov.test.android.screens.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SettingsScreen() {
    Box {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Text("Hello, Settings")
        }
    }
}