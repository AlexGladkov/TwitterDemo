package ru.agladkov.test.android.screens.auth

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun AuthScreen() {
    Box {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Text("Hello, Auth")
            Button(onClick = {
                // TODO Go to Main
            }) {
                Text("Go to Main")
            }
        }
    }
}