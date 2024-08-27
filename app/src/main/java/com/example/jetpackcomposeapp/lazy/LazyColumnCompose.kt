package com.example.jetpackcomposeapp.lazy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class LazyColumnCompose : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                CreateLazyColumnCompose()
            }
        }
    }


    private fun listOfUsers() = mutableListOf(
        UserDataModel(1, "Marc Ivan", "Touchpoint"),
        UserDataModel(2, "Greggy", "Touchpoint"),
        UserDataModel(3, "Jobert", "Touchpoint"),
        UserDataModel(4, "Sandro", "Touchpoint"),
        UserDataModel(5, "Roland", "Touchpoint"),
    )


    @Preview
    @Composable
    private fun CreateLazyColumnCompose() {
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(listOfUsers()) {
                CardViewCompose().Create(userDataModel = it)
            }
        }
    }

}