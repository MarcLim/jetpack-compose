package com.mox.compose.architecture

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeapp.architecture.view.ComposeArchViewModel


@Composable
fun ComposeArchLayout(
    viewModel: ComposeArchViewModel
) {
    val context = LocalContext.current
    val items = viewModel.items.collectAsState().value
    val loading = viewModel.loading.observeAsState(initial = true)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {
            item {
                Spacer(
                    modifier = Modifier
                        .height(10.dp)
                        .fillMaxWidth(),
                )
            }
            items(items.size) {
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = items[it].title,
                    fontSize = 20.sp,
                    color = Color.Black
                )
                Text(items[it].description)
                Spacer(modifier = Modifier.height(12.dp))
            }
        }

        if (loading.value) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.Center),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

    }
}