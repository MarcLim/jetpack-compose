package com.example.jetpackcomposeapp.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class BoxActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreateBoxView()
        }
    }


    /*
    *      MODIFIERS
    *      - are the fundamental building blocks for customizing and enhancing your composable in Jetpack Compose
    *      - You can apply this to any of compose objects, view or ui
    *      - It is used to change size, colors, appearance, bg, paddings, borders and more.
    */

    @Preview(name = "Sample Box View")
    @Composable
    private fun CreateBoxView() {
        Box(
            Modifier
                .wrapContentWidth()
                .height(180.dp)
                .padding(5.dp)
                .border(width = 1.dp, color = Color.Green)
        ) {

            Text(
                text = "Sample Text",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Box(
                Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomStart)
                    .border(width = 2.dp, color = Color.Red)
            ) {
                Text(
                    text = "Sample Text",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }


    @Preview(name = "Sample Second Box View")
    @Composable
    private fun CreateSecondBoxView() {

        Box(
            Modifier
                .wrapContentWidth()
                .height(180.dp)
                .padding(5.dp)
                .background(Color.Red)
                .border(width = 1.dp, color = Color.Blue)
        ) {

            Text(
                text = "Sample Text",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center)
            )
        }
    }


}