package com.example.jetpackcomposeapp.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class RowActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreateRow()
        }
    }

    @Preview(name = "Normal Row")
    @Composable
    private fun CreateRow() {
        Row {
            Text(
                text = "Row Text 1",
                Modifier
                    .background(Color.Red)
                    .padding(horizontal = 8.dp),
                color = Color.White
            )
            Text(
                text = "Row Text 2",
                Modifier
                    .background(Color.Blue)
                    .padding(horizontal = 8.dp),
                color = Color.White
            )
            Text(
                text = "Row Text 3",
                Modifier
                    .background(Color.DarkGray)
                    .padding(horizontal = 8.dp),
                color = Color.White
            )
        }
    }

    @Preview(name = "Row With Modifier")
    @Composable
    private fun CreateRowWithModifier() {
        Row(
            Modifier
                .background(Color.White)
                .height(60.dp)
                .fillMaxWidth(),
            Arrangement.SpaceEvenly,
            Alignment.CenterVertically
        ) {
            Text(text = "Column Text 1")
            Text(text = "Column Text 2")
            Text(text = "Column Text 3")
        }
    }

}