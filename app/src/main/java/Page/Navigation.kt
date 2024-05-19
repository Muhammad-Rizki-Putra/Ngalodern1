package Page

import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ngalodern.Page.Dashboard

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
    }
}