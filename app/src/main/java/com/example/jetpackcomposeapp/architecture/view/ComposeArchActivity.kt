package com.example.jetpackcomposeapp.architecture.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.mox.compose.architecture.ComposeArchLayout

class ComposeArchActivity : ComponentActivity() {

    private val viewModel: ComposeArchViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArchLayout(viewModel = viewModel)
        }
    }

}