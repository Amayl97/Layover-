package com.amayl.layover.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.amayl.layover.ui.screens.HomeScreen
import com.amayl.layover.ui.screens.SplashScreen

@Composable
fun NavGraph(navController: NavHostController) {
  NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable("splash") {
            SplashScreen(navController)
        }
        composable("home"){
            HomeScreen()
        }
    }
}