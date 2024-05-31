package com.example.ngalodern

import Page.Belajar
import Page.Navigation
import Page.Navigation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.rememberScrollState
import com.example.ngalodern.Page.Dashboard
import Object.*
//Global var


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Data()
            val scrollState = rememberScrollState()
            Navigation(scrollState = scrollState)
        }
    }
}



