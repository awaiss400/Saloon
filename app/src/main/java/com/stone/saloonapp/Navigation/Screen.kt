package com.stone.saloonapp.Navigation

sealed class Screen(val route:String){
    object LoginScreen:Screen("login_Screen")
    object SignupScreen:Screen("signup_Screen")
    object HomeScreen:Screen("home_Screen")
}
