package com.example.bottomnavigationbar

sealed class Routes(val route: String) {
    object Welcome : Routes("welcomeScreen")
}