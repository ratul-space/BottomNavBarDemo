package com.example.bottomnavbardemo.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.bottomnavbardemo.Route.NAV_ROUTE_HOME
import com.example.bottomnavbardemo.Route.NAV_ROUTE_PROFILE
import com.example.bottomnavbardemo.Route.NAV_ROUTE_SETTINGS

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = NAV_ROUTE_HOME,
        title = "Home",
        icon = Icons.Default.Home,
    )
    object Profile : BottomBarScreen(
        route = NAV_ROUTE_PROFILE,
        title = "Profile",
        icon = Icons.Default.Person,
    )
    object Settings : BottomBarScreen(
        route = NAV_ROUTE_SETTINGS,
        title = "Settings",
        icon = Icons.Default.Settings
    )
}
