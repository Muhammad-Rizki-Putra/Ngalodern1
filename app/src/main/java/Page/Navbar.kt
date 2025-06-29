package Page

import Object.Skor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.ngalodern.R

@Preview
@Composable
fun navbar(navController: NavController){
    val currentBackStackEntry = navController.currentBackStackEntryAsState().value
    val currentDestination = currentBackStackEntry?.destination?.route

    //focus / unfocus
    val berandaResourceId = if (currentDestination == "Dashboard") {
        R.drawable.beranda_focus
    } else {
        R.drawable.beranda_unfocus
    }

    val belajarResourceId = if (currentDestination == "Belajar") {
        R.drawable.belajar_focused
    } else {
        R.drawable.belajar_unfocused
    }

    val latihanResourceId = if (currentDestination == "Latihan") {
        R.drawable.latihan_focus
    } else {
        R.drawable.latihan_unfocus
    }

    val profilResourceId = if (currentDestination == "Profile") {
        R.drawable.profil_focus
    } else {
        R.drawable.profil_unfocus
    }

    Box (
        modifier = Modifier
            .shadow(
                elevation = 5.dp,
                clip = false
            )
            .fillMaxWidth()
            .height(68.dp)
            .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
    ){
        Box(){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .height(75.dp)
                        .width(75.dp)
                        .clickable {
                            navController.navigate("Dashboard")
                            Skor.skor.value = 0
                        },
                    painter = painterResource(id = berandaResourceId),
                    contentDescription = "Logo Beranda"
                )
                Image(
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .height(75.dp)
                        .width(75.dp)
                        .clickable {
                            navController.navigate("Belajar")
                            Skor.skor.value = 0
                        },
                    painter = painterResource(id = belajarResourceId),
                    contentDescription = "Logo Belajar"
                )
                Image(
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .height(75.dp)
                        .width(75.dp)
                        .clickable {
                            navController.navigate("Latihan")
                            Skor.skor.value = 0
                        },
                    painter = painterResource(id = latihanResourceId),
                    contentDescription = "Logo Latihan"
                )
//                Image(
//                    modifier = Modifier
//                        .clip(RoundedCornerShape(100.dp))
//                        .height(75.dp)
//                        .width(75.dp)
//                        .clickable {
//                            navController.navigate("Profile")
//                            Skor.skor.value = 0
//                        },
//                    painter = painterResource(id = profilResourceId),
//                    contentDescription = "Logo Profil"
//                )
            }
        }
    }
}