package Page

import Object.Hadist
import Object.get_sizehd
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ngalodern.R
import com.example.ngalodern.ui.theme.ui.theme.dmsansFontFamily

@Composable
@Preview
fun topbarLat(navController: NavController) {
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
                text = "Latihan",
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
fun tomboltingkat(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ){
        LazyVerticalGrid(
            modifier = Modifier,
            columns = GridCells.Fixed(1),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(get_sizehd()){
                box_tingkat(
                    judul = Hadist[it].judul,
                    route = "Hadist_$it",
                    navController = navController
                )
            }
        }
    }
}

@Preview
@Composable
fun box_tingkat(judul: String = "None", route: String, navController: NavController) {
    Box(
        modifier = Modifier
            .clickable {
                navController.navigate(route)
            }
            .shadow(
                elevation = 15.dp,
                shape = RoundedCornerShape(10.dp),
                clip = false
            )
            .clip(RoundedCornerShape(10.dp))
            .background(color = Color(android.graphics.Color.parseColor("#A9C0CF")))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(179.dp) // Adjust height as needed
                .padding(0.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .weight(1.2f) // First column with weight 1
                    .fillMaxHeight()
                    .background(color = Color(android.graphics.Color.parseColor("#a9c0cf")))
                    .clip(RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.shield_logo), // Replace with your shield icon
                    contentDescription = "Shield Icon",
                    modifier = Modifier.size(100.dp)
                )
                Text(
                    text = "1",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 60.sp,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
            }

            Box(
                modifier = Modifier
                    .weight(2f) // Second column with weight 2
                    .fillMaxHeight()
                    .background(color = Color(android.graphics.Color.parseColor("#457b9d")))
                    .padding(start = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = judul,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 40.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.next_logo),
                        contentDescription = "Next Logo",
                        modifier = Modifier
                            .size(50.dp)
                            .padding(end = 10.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun Latihan(scrollState: ScrollState, navController: NavController){
    Scaffold(
        topBar = {
            topbarLat(navController)
        },
        bottomBar = {
            navbar(navController = navController)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(top = 20.dp, start = 30.dp, end = 30.dp, bottom = 20.dp)
                .padding(innerPadding)
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Box( modifier = Modifier
                .clickable { navController.navigate("Tingkat_0") }
                .height(179.dp).width(309.dp)
            ) { Image(
                painter = painterResource(id = R.drawable.tingkat_1_unlocked_button),
                contentDescription = "Tingkat 1",
                modifier = Modifier.fillMaxSize()
            ) }
            Box( modifier = Modifier
                .clickable { navController.navigate("Tingkat_1") }
                .height(179.dp).width(309.dp)
            ) { Image(
                painter = painterResource(id = R.drawable.tingkat_2_unlocked_button),
                contentDescription = "Tingkat 2",
                modifier = Modifier.fillMaxSize()
            ) }
            Box( modifier = Modifier
                .height(179.dp).width(309.dp)
            ) { Image(
                painter = painterResource(id = R.drawable.tingkat_3_locked_button),
                contentDescription = "Tingkat 3",
                modifier = Modifier.fillMaxSize()
            ) }
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceAround,
//            ){
//                    box_tingkat("Tingkat 1","Tingkat 1",navController)
//            }
        }
    }
}