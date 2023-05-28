package com.example.backgroundlocationtackingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.backgroundlocationtackingapp.ui.theme.BackgroundLocationTackingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BackgroundLocationTackingAppTheme {

            }
        }
    }
}
