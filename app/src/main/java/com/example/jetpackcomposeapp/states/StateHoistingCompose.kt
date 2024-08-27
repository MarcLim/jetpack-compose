package com.example.jetpackcomposeapp.states

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class StateHoistingCompose : ComponentActivity() {

    /*
    *      INITIALIZATION
    *      - If you ever encounter error for adding TextField just add this two imports
    *      - import androidx.compose.runtime.getValue
    *      - import androidx.compose.runtime.setValue
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.padding(30.dp)) {
                HelloScreen()
            }
        }
    }


    /*
    *      STATE HOISTING
    *      - State hoisting in Compose is a pattern of moving state to a composable's caller to make a composable stateless.
    *      - The general pattern for state hoisting in Jetpack Compose is to replace the state variable with two parameters:
    */

    @Composable
    fun HelloScreenNotHoist() {
        var name by rememberSaveable { mutableStateOf("") }

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Hello, $name",
                modifier = Modifier.padding(bottom = 8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
            OutlinedTextField(value = name,
                onValueChange = {
                    name = it
                }, label = { Text("Name") })
        }
    }


    /*
    *      STATE HOISTING
    *      - By hoisting the state out of HelloContent, it's easier to reason about the composable,
    *      - reuse it in different situations, and test.
    *      - HelloContent is decoupled from how its state is stored.
    *      - Decoupling means that if you modify or replace HelloScreen, you don't have to change how HelloContent is implemented.
    */

    @Composable
    fun HelloScreen() {
        var name by rememberSaveable { mutableStateOf("") }

        HelloContent(name = name, onNameChange = { name = it })
    }

    @Composable
    fun HelloContent(name: String, onNameChange: (String) -> Unit) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Hello, $name",
                modifier = Modifier.padding(bottom = 8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
            OutlinedTextField(value = name, onValueChange = onNameChange, label = { Text("Name") })
        }
    }


}