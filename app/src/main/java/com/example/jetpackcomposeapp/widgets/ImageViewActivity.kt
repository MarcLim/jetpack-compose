package com.example.jetpackcomposeapp.widgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeapp.R

class ImageViewActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.verticalScroll(rememberScrollState())) {
                CreateImageView()
                ContentScaleFillBound()
                ContentScaleFit()
                ContentScaleCrop()
                ContentScaleInside()
                ContentScaleFillWidth()
                ContentScaleFillHeight()
            }
        }
    }

    @Preview
    @Composable
    private fun CreateImageView() {
        Box(
            Modifier
                .wrapContentWidth()
                .wrapContentHeight()
                .padding(8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.img_android),
                contentDescription = "Sample Image",
                contentScale = ContentScale.FillBounds,
            )
        }
    }


    @Preview(name = "Fill Bound")
    @Composable
    private fun ContentScaleFillBound() {
        CreateScaleTypeImageView(ContentScale.FillBounds)
    }


    @Preview(name = "Fit")
    @Composable
    private fun ContentScaleFit() {
        CreateScaleTypeImageView(ContentScale.Fit)
    }


    @Preview(name = "Crop")
    @Composable
    private fun ContentScaleCrop() {
        CreateScaleTypeImageView(ContentScale.Crop)
    }


    @Preview(name = "Inside")
    @Composable
    private fun ContentScaleInside() {
        CreateScaleTypeImageView(ContentScale.Inside)
    }


    @Preview(name = "Fill Width")
    @Composable
    private fun ContentScaleFillWidth() {
        CreateScaleTypeImageView(ContentScale.FillWidth)
    }


    @Preview(name = "Fill Height")
    @Composable
    private fun ContentScaleFillHeight() {
        CreateScaleTypeImageView(ContentScale.FillHeight)
    }


    @Composable
    private fun CreateScaleTypeImageView(scaleType : ContentScale) {
        Box(
            Modifier
                .width(200.dp)
                .height(180.dp)
                .padding(8.dp)
                .border(width = 1.dp, color = Color.DarkGray)
        )
        {
            Image(
                painter = painterResource(R.drawable.img_android),
                contentDescription = "Sample Image",
                contentScale = scaleType
            )
        }
    }

}