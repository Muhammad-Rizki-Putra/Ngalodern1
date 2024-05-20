package Page

import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ngalodern.Page.Dashboard
import com.example.ngalodern.Page.Profile

@Composable
fun Navigation(scrollState: ScrollState){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Dashboard") {
        composable("Dashboard") {
            Dashboard(
                scrollState = scrollState,
                navController = navController
            )
        }

        composable("Belajar") {
            Belajar(
                scrollState = scrollState,
                navController = navController
            )
        }

        composable("Latihan") {
            Latihan(
                scrollState = scrollState,
                navController = navController
            )
        }

        composable("Profile") {
            Profile(
                scrollState = scrollState,
                navController = navController
            )
        }
    }
}