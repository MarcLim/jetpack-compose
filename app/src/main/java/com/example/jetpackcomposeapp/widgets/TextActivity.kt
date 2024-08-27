package com.example.jetpackcomposeapp.widgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeapp.R

class TextActivity : ComponentActivity() {


    // Normal
    // Italic
    // Bold

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                CreateNormalText()
                CreateFontText()
                CreateBoldText()
                CreateItalicText()
                CreateUnderlineText()
                CreateAllInOneText()
                CreateOverflowText()
            }
        }
    }


    @Preview("Normal Text")
    @Composable
    private fun CreateNormalText() {
        Text(
            text = "Font Text",
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
    }


    @Preview("Font Text")
    @Composable
    private fun CreateFontText() {
        Text(
            text = "Custom Font Text",
            fontSize = 24.sp,
            color = Color.Black,
            fontFamily = FontFamily(Font(R.font.light)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
    }

    @Preview("Bold Text")
    @Composable
    private fun CreateBoldText() {
        Text(
            text = "Bold Text",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            letterSpacing = 4.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }


    @Preview("Italic Text")
    @Composable
    private fun CreateItalicText() {
        Text(
            text = "Italic Text",
            fontSize = 24.sp,
            fontWeight = FontWeight.Light,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            letterSpacing = 4.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }


    @Preview("Underlined Text")
    @Composable
    private fun CreateUnderlineText() {
        Text(
            text = "Underlined Text",
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Center,
            letterSpacing = 4.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }


    @Preview("All In One Text")
    @Composable
    private fun CreateAllInOneText() {
        Text(
            text = "All In One Text",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.LineThrough,
            textAlign = TextAlign.Center,
            letterSpacing = 4.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }


    @Preview("Overflow Text")
    @Composable
    private fun CreateOverflowText() {
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            letterSpacing = 4.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }

}