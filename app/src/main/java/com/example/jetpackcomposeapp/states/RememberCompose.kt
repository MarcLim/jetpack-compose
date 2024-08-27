package com.example.jetpackcomposeapp.states

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

class RememberCompose : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Counter()
                RememberSaveableExample()
            }
        }
    }


    /*
    *      Remember
    *      - A fundamental part of Jetpack Compose's state management system.
    *      - Used to create and remember a value within a composable function.
    *      - When you use remember, the value is retained across recompositions of the composable,
    *      - ensuring that the state persists as long as the composable is active.
    */

    @Composable
    fun Counter() {
        var count by remember { mutableStateOf(0) }
        Button(
            onClick = { count++ },
        ) {
            Text(text = "Increment Counter")
        }
        Text(text = "Count: $count")
    }


    /*
    *      RememberSaveable
    *      - On the other hand, RememberSaveable is used for preserving a value across configuration changes
    *      - such as screen rotation or changes in device orientation.
    *      - This is particularly useful when you want to retain state information
    *      - during these configuration changes, which would otherwise cause the composable to lose its state.
    */

    @Composable
    fun RememberSaveableExample() {
        val savedText = rememberSaveable { mutableStateOf("Initial Text") }

        TextField(
            value = savedText.value,
            onValueChange = { newText ->
                savedText.value = newText
            }
        )
        Text(text = "Text Entered: $savedText")
    }

}