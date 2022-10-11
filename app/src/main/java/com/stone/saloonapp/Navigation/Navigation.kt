package com.stone.saloonapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stone.saloonapp.Navigation.Screen
import com.stone.saloonapp.Screens.LoginPage
import com.stone.saloonapp.Screens.Signup

@Composable
fun Navigation(navController: NavHostController){
    Box() {



NavHost(navController = navController, startDestination =Screen.LoginScreen.route ){
    composable(route = Screen.LoginScreen.route){
        LoginPage(navController)
    }
    composable(route = Screen.SignupScreen.route){
        Signup()
    }
}
}}