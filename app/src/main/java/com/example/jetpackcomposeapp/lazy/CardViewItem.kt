package com.example.jetpackcomposeapp.lazy

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class CardViewCompose {


    // Note : We can't show preview if the compose function required to pass an argument or data
    @Preview
    @Composable
    fun PreviewCardView() {
        val userModel = UserDataModel(1, "First Name", "Last Name")
        Create(userDataModel = userModel)
    }


    @Composable
    fun Create(userDataModel: UserDataModel) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            shape = RoundedCornerShape(15.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(text = userDataModel.firstName)
                Text(text = userDataModel.lastName)
            }
        }
    }

}