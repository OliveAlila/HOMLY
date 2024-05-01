package com.olive.homly.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.olive.homly.ui.theme.screens.CartScreen.CartScreen
import com.olive.homly.ui.theme.screens.DeliveryScreen.DeliveryScreen
import com.olive.homly.ui.theme.screens.HomeScreen.HomeScreen
import com.olive.homly.ui.theme.screens.LoginScreen.LoginScreen
import com.olive.homly.ui.theme.screens.OrderScreen.PlaceOrderScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.CategoriesScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.ProductdetailsScreen
import com.olive.homly.ui.theme.screens.ShoppingScreen.ProductlistScreen
import com.olive.homly.ui.theme.screens.SplashScreen.SplashScreen


@Composable
fun AppNavHost(modifier : Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_SPLASH){
    NavHost(navController = navController,
        startDestination= startDestination ,
        modifier= modifier){
        composable( ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController )
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController )
        }
        composable(ROUTE_CART){
            CartScreen(navController )
        }
        composable(ROUTE_DELIVERY){
            DeliveryScreen(navController )
        }
        composable(ROUTE_ORDER){
            PlaceOrderScreen(navController )
        }
        composable(ROUTE_CATEGORIES){
            CategoriesScreen(navController )
        }
        composable(ROUTE_DETAILS){
            ProductdetailsScreen(navController )
        }
        composable(ROUTE_LIST){
            ProductlistScreen(navController )
        }
    }

}