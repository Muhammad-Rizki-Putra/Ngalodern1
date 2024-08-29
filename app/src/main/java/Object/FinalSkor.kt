package Object

import Page.navbar
import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ngalodern.R
import com.example.ngalodern.ui.theme.ui.theme.dmsansFontFamily

@Composable
fun topbarSkor (navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(87.dp)
            .shadow(
                elevation = 35.dp,
                shape = RoundedCornerShape(
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                ),
                clip = false
            ),
        color = Color(android.graphics.Color.parseColor("#457b9d")),
        shape = RoundedCornerShape(
            bottomStart = 30.dp,
            bottomEnd = 30.dp
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp)
        ) {
            Column( //
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    modifier = Modifier,
                    text = "Skor Akhir",
                    fontSize = 28.sp,
                    color = Color.White,
                    fontFamily = dmsansFontFamily,
                    fontWeight = FontWeight.Bold
                )
            }
            Image( // Tombol kembali
                modifier = Modifier
                    .clip(RoundedCornerShape(100.dp))
                    .width(32.dp)
                    .height(32.dp)
                    .align(Alignment.CenterStart)
                    .clickable {
                        navController.navigate("Latihan")
                        Skor.skor.value = 0  // Reset the score to 0
                    },
                painter = painterResource(id = R.drawable.next_reverse),
                contentDescription = "nextlogo"
            )
        }
    }
}

@Composable
fun Tombol(navController: NavController, buttonText: String, route: String) {
    Button(
        onClick = {
            navController.navigate(route)
            Handler(Looper.getMainLooper()).postDelayed({
                    Skor.skor.value = 0
            }, 1000L) },
        modifier = Modifier
            .width(120.dp)
            .height(40.dp)
            .clip(RoundedCornerShape(16.dp))
            ,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(android.graphics.Color.parseColor("#457b9d"))
        )
    ) {
        Text(
            text = buttonText,
            fontSize = 16.sp,
            fontFamily = dmsansFontFamily,
            fontWeight = FontWeight.Bold,
            color = Color.White
        ) 
    }
}

@Composable
fun FinalSkor(scrollState: ScrollState, navController: NavController) {
    Scaffold (
        topBar = { topbarSkor(navController) },
        bottomBar = { navbar(navController) }
    ) {
        innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(top = 0.dp, start = 30.dp, end = 30.dp, bottom = 0.dp)
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(30.dp))
                    .border(
                        border = BorderStroke(4.dp, Color(android.graphics.Color.parseColor("#457b9d"))),
                        shape = RoundedCornerShape(30.dp) // Match the shape to the corner radius
                    )
                    .fillMaxWidth()
                    .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
                    .padding(20.dp, 30.dp, 20.dp, 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(1.dp)
                ) {
                    Text (
                        text = "Skor kamu adalah ... ",
                        fontSize = 18.sp,
                        fontFamily = dmsansFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "${Skor.skor.value}",
                        fontSize = 68.sp,
                        fontFamily = dmsansFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "/100",
                        fontSize = 18.sp,
                        fontFamily = dmsansFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                }
                Column {
                    Tombol(navController = navController, buttonText = "Kembali", route = "Latihan")
                }
            }
        }
    }
}
