package com.example.ngalodern.Page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ngalodern.R
import Page.*
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.verticalScroll

@Preview
@Composable
fun Profile(scrollState: ScrollState, navController: NavController){
    Scaffold (
        bottomBar = {
            navbar(navController)
        }
    ){ innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(50.dp)
                .padding(innerPadding)
                .verticalScroll(scrollState),
        ) {
            Text(
                text = "On Work",
                fontSize = 60.sp
            )
        }
    }
}