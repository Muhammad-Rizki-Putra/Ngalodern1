package Page

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ngalodern.ui.theme.ui.theme.dmsansFontFamily

@Composable
@Preview
fun topbarMat(navController: NavController) {
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
        ) {
            Text(
                modifier = Modifier
                    .align(Alignment.Center),
                text = "Materi",
                fontSize = 32.sp,
                color = Color.White,
                fontFamily = dmsansFontFamily,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview
@Composable
fun Materi(scrollState: ScrollState, navController: NavController){
    Scaffold(
        topBar = {
            topbarMat(navController)
        },
        bottomBar = {
            navbar(navController = navController)
        }
    ){ innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(20.dp)
                .padding(innerPadding)
                .verticalScroll(scrollState),
        ) {
            Box(modifier = Modifier.padding(bottom = 13.dp)) {
                com.example.ngalodern.Page.box_materi("00.00", "04.34")
            }

            Box(modifier = Modifier.padding(bottom = 13.dp)) {
                com.example.ngalodern.Page.box_materi("00.00", "04.34", "Kata Arab-Sunda")
            }

        }
    }
}