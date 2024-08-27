package com.example.jetpackcomposeapp.widgets

import android.os.Bundle
import android.widget.Space
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ButtonActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(24.dp))
                CreateButton()
                Spacer(modifier = Modifier.height(24.dp))
                CreateRoundCornerButton()
                Spacer(modifier = Modifier.height(24.dp))
                CreateElevatedButton()
            }
        }
    }


    @Preview("Normal Button")
    @Composable
    fun CreateButton() {
        Button(
            onClick = { toastFunction() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            ),
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
        ) {
            Text(text = "Simple Button", Modifier.padding(12.dp))
        }
    }


    @Preview("Round Corner Button")
    @Composable
    fun CreateRoundCornerButton() {
        Button(
            onClick = { toastFunction() },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White
            ),
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
        ) {
            Text(text = "Round Corner Button", Modifier.padding(12.dp))
        }
    }


    @Preview("Elevated Button")
    @Composable
    fun CreateElevatedButton() {
        Button(
            onClick = { toastFunction() },
            shape = RoundedCornerShape(8.dp),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
        ) {
            Text(text = "Elevated Button", Modifier.padding(12.dp))
        }
    }


    private fun toastFunction() {
        Toast.makeText(this, "Toast", Toast.LENGTH_SHORT).show()
    }

}