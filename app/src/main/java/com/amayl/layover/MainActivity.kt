package com.amayl.layover

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.amayl.layover.navigation.NavGraph

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //navGraph is responsible for the navigation
        setContent {
            val navController = rememberNavController()

            NavGraph(navController)
        }
    }
}