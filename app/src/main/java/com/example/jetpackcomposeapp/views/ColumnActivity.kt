package com.example.jetpackcomposeapp.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ColumnActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreateColumnWithModifier()
        }
    }

    @Preview(name = "Normal Column")
    @Composable
    private fun CreateColumn() {
        Column {
            Text(
                text = "Column Text 1",
                Modifier
                    .background(Color.Red)
                    .padding(horizontal = 8.dp),
                color = Color.White
            )
            Text(
                text = "Column Text 2",
                Modifier
                    .background(Color.Blue)
                    .padding(horizontal = 8.dp),
                color = Color.White
            )
            Text(
                text = "Column Text 3",
                Modifier
                    .background(Color.DarkGray)
                    .padding(horizontal = 8.dp),
                color = Color.White
            )
        }
    }


    @Preview(name = "Column With Modifier")
    @Composable
    private fun CreateColumnWithModifier() {
        Column(
            Modifier
                .background(Color.White)
                .height(100.dp)
                .width(150.dp),
            Arrangement.SpaceEvenly,
            Alignment.CenterHorizontally
        ) {
            Text(text = "Column Text 1")
            Text(text = "Column Text 2")
            Text(text = "Column Text 3")
        }
    }

}