package Page

import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ngalodern.Page.Dashboard
import com.example.ngalodern.Page.Profile
import Object.*

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

        composable("Materi") {
            Materi(
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

        val dongengList = get_Dongeng()
        dongengList.forEachIndexed() { index, dongeng ->
            composable("Dongeng_$index"){
                dongeng.board(
                    scrollState = scrollState,
                    navController = navController
                )
            }
        }

        val hadistList = get_Hadist()
        hadistList.forEachIndexed() { index, hadist ->
            composable("Hadist_$index"){
                hadist.board(
                    scrollState = scrollState,
                    navController = navController
                )
            }
        }

        val videoList = get_Video()
        videoList.forEachIndexed() { index, video ->
            composable("Video_$index"){
                video.VideoPage(
                    scrollState = scrollState,
                    navController = navController,
                    videoUrl = video.videoUrl
                )
            }
        }

        val modulList = get_Modul()
       modulList.forEachIndexed() { index, modul ->
            composable("Modul_$index"){
                modul.boardmateri(
                    scrollState = scrollState,
                    navController = navController
                )
            }
        }
    }
}