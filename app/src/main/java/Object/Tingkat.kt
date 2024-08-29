package Object

import Page.navbar
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ngalodern.R
import com.example.ngalodern.ui.theme.ui.theme.dmsansFontFamily

@Composable
fun topbarTingkat (judul: String, navController: NavController) {
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
                    text = judul,
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

@Preview
@Composable
fun box_soal(judul: String = "None", route: String, navController: NavController) {
    Box(
        modifier = Modifier
            .clickable {
                navController.navigate(route)
            }
            .clip(RoundedCornerShape(10.dp))
            .width(133.dp) // Adjust the width to fit 2 boxes in the Row
            .height(163.dp) // Adjust height as needed
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(163.dp) // Adjust height as needed
                .padding(0.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.soal_unlocked_button), // Replace with your shield icon
                    contentDescription = "Soal",
                    modifier = Modifier
                        .fillMaxSize()
                )
                Text(
                    text = judul,
                    color = Color(android.graphics.Color.parseColor("#217c86")),
                    fontWeight = FontWeight.Bold,
                    fontSize = 80.sp
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun Tingkat_1(scrollState: ScrollState, navController: NavController) {
    Scaffold(
        bottomBar = {
            navbar(navController = navController)
        },
        topBar = {
            topbarTingkat("Tingkat 1", navController)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
                FlowRow(
                    modifier = Modifier.wrapContentWidth(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Box( modifier = Modifier
                        .clickable { navController.navigate("Soal1_1_0") }
                        .width(133.dp).height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_1_unlocked_button),
                        contentDescription = "Soal 1",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .clickable { navController.navigate("Soal1_2_0") }
                        .width(133.dp).height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_2_unlocked_button),
                        contentDescription = "Soal 2",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .clickable { navController.navigate("Soal1_3_0") }
                        .width(133.dp).height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_3_unlocked_button),
                        contentDescription = "Soal 3",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp).height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_4_locked_button),
                        contentDescription = "Soal 4",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp).height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_5_locked_button),
                        contentDescription = "Soal 5",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp).height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_6_locked_button),
                        contentDescription = "Soal 6",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp).height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_7_locked_button),
                        contentDescription = "Soal 7",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp).height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_8_locked_button),
                        contentDescription = "Soal 8",
                        modifier = Modifier.fillMaxSize()
                    ) }
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun Tingkat_2(scrollState: ScrollState, navController: NavController) {
    Scaffold(
        bottomBar = {
            navbar(navController = navController)
        },
        topBar = {
            topbarTingkat("Tingkat 2", navController = navController)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
                FlowRow(
                    modifier = Modifier
                        .wrapContentWidth(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Box( modifier = Modifier
                        .clickable { navController.navigate("Soal2_1_0") }
                        .width(133.dp)
                        .height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_1_unlocked_button),
                        contentDescription = "Soal 1",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .clickable { navController.navigate("Soal2_2_0") }
                        .width(133.dp)
                        .height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_2_unlocked_button),
                        contentDescription = "Soal 2",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp)
                        .height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_3_locked_button),
                        contentDescription = "Soal 3",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp)
                        .height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_4_locked_button),
                        contentDescription = "Soal 4",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp)
                        .height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_5_locked_button),
                        contentDescription = "Soal 5",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp)
                        .height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_6_locked_button),
                        contentDescription = "Soal 6",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp)
                        .height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_7_locked_button),
                        contentDescription = "Soal 7",
                        modifier = Modifier.fillMaxSize()
                    ) }
                    Box( modifier = Modifier
                        .width(133.dp)
                        .height(163.dp)
                    ) { Image(
                        painter = painterResource(id = R.drawable.stage_8_locked_button),
                        contentDescription = "Soal 8",
                        modifier = Modifier.fillMaxSize()
                    ) }
                }
            }
        }
    }
}