package com.example.jetpackcomposeapp.sideeffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch


class SideEffectCompose : ComponentActivity() {

    // What is Side Effect?
    // Something that escape the scope of composable function

    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text by remember { mutableStateOf("") }

            Column {
                Button(onClick = { text += "#" }) {
                    number++
                    Text(text = text)
                }
            }
        }
    }


    @Composable
    private fun LaunchedEffectCompose() {
        val text by remember { mutableStateOf("") }

        Column {
            LaunchedEffect(key1 = true) {
                delay(1000L)
                print(text)
            }
        }
    }


    @Composable
    private fun RememberCoroutineScopeCompose() {
        val scope = rememberCoroutineScope()

        Button(onClick = {
            scope.launch {
                delay(1000L)
                print("Hello World")
            }
        }) {

        }
    }


}