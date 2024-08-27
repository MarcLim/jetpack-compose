package com.example.jetpackcomposeapp.states

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

class StateCompose : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                ColorBox()
                Spacer(modifier = Modifier.height(20.dp))
                ColorNoRemember()
            }
        }
    }


    @Preview
    @Composable
    private fun ColorBox() {
        val color = remember { mutableStateOf(Color.Blue) }
        Box(modifier = Modifier
            .background(color.value)
            .fillMaxWidth()
            .height(200.dp)
            .clickable {
                color.value = Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f)
            }) {
        }
    }


    @Preview
    @Composable
    private fun ColorNoRemember() {
        var color = Color.Yellow
        Box(modifier = Modifier
            .background(color)
            .fillMaxWidth()
            .height(200.dp)
            .clickable {
                color = Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f)
            })
    }

}