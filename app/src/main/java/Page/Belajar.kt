package Page


import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ngalodern.R
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.ui.draw.shadow
import Object.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import Object.get_sizehd
import com.example.ngalodern.ui.theme.ui.theme.dmsansFontFamily
import com.example.ngalodern.ui.theme.ui.theme.leaguespartanFontFamily

@Preview
@Composable
fun tombolhadist(navController: NavController){
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
                box_materi(
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
fun tomboldongeng(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ){
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(get_sizedg()){
                box_belajar(
                    judul = Dongeng[it].judul,
                    route = "Dongeng_$it",
                    navController = navController
                )
            }
        }
    }
}

@Composable
@Preview
fun topbar(navController: NavController) {
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
                text = "Belajar",
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
fun box_belajar(judul: String = "None", route: String, navController: NavController){
    Box(
        modifier = Modifier
            .clickable {
                navController.navigate(route)
            }
            .shadow(
                elevation = 15.dp,
                shape = RoundedCornerShape(
                    bottomStart = 10.dp,
                    bottomEnd = 10.dp
                ),
                clip = false
            )
            .clip(
                RoundedCornerShape(
                    topStart = 10.dp,
                    bottomStart = 10.dp,
                    topEnd = 10.dp,
                    bottomEnd = 10.dp,
                )
            )
            .height(138.dp)
            .width(160.dp)
            .background(color = Color(android.graphics.Color.parseColor("#A9C0CF")))

    ){
        Column {
            Box(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            topStart = 21.dp,
                            bottomStart = 21.dp,
                            topEnd = 21.dp,
                            bottomEnd = 21.dp,
                        )
                    )
                    .padding(5.dp)
                    .height(80.dp)
                    .width(150.dp)
                    .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
            ){

            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){
                Box (
                    modifier = Modifier
                        .padding(end = 10.dp)
                ){
                    Text(
                        text = judul,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                    )
                }

                Image(
                    modifier = Modifier
                        .width(31.dp)
                        .height(31.dp),
                    painter = painterResource(id = R.drawable.next_logo),
                    contentDescription = "nextlogo",

                    )
            }
        }
    }
}

@Preview
@Composable
fun box_materi(judul: String = "None", route: String, navController: NavController){
    Box(
        modifier = Modifier
            .clickable {
                navController.navigate(route)
            }
            .clip(
                RoundedCornerShape(
                    topStart = 15.dp,
                    bottomStart = 15.dp,
                    topEnd = 15.dp,
                    bottomEnd = 15.dp,
                )
            )
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#A9C0CF")))
            .height(60.dp)
        ,

        ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxHeight(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,

            ){
            Text(
                text = judul,
                fontFamily = leaguespartanFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White
            )

            Image(
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .clickable {
                        navController.navigate(route)
                    },
                painter = painterResource(id = R.drawable.next_logo),
                contentDescription = "Logo buku",
            )
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun Belajar(scrollState: ScrollState, navController: NavController){
    Scaffold(
        topBar = {
            topbar(navController)
        },
        bottomBar = {
            navbar(navController = navController)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(top = 30.dp, start = 30.dp, end = 30.dp, bottom = 0.dp)
                .padding(innerPadding)
                ,
            horizontalAlignment = Alignment.CenterHorizontally

        )
        {
            var indikator by remember { mutableStateOf(false) }
            Row(

                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
            ){
                Button(
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    ),
                    modifier = Modifier
                        .clip(
                            RoundedCornerShape(
                                topStart = 21.dp,
                                bottomStart = 21.dp,
                                topEnd = 21.dp,
                                bottomEnd = 21.dp,
                            )
                        )
                        .background(
                            if (!indikator) Color(android.graphics.Color.parseColor("#487c9c"))
                            else Color.Transparent
                        )
                        .height(32.dp)
                        .width(150.dp),

                    onClick = {
                        indikator = false
                    },
                    shape = if(!indikator) RoundedCornerShape(50)
                    else RoundedCornerShape(100),
                    border = BorderStroke(1.dp, Color(android.graphics.Color.parseColor("#487c9c")))
                ) {
                    Text(
                        modifier = Modifier


                        ,
                        text = "Dongeng",
                        fontSize = 12.sp,
                        color = if (!indikator) Color.White
                        else Color(android.graphics.Color.parseColor("#487c9c")),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }

                Button(
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    ),
                    modifier = Modifier
                        .clip(
                            RoundedCornerShape(
                                topStart = 21.dp,
                                bottomStart = 21.dp,
                                topEnd = 21.dp,
                                bottomEnd = 21.dp,
                            )
                        )
                        .background(
                            if (indikator) Color(android.graphics.Color.parseColor("#487c9c"))
                            else Color.Transparent
                        )
                        .height(32.dp)
                        .width(150.dp),
                    onClick = { indikator = true },
                    shape =
                    if(indikator) RoundedCornerShape(50)
                    else RoundedCornerShape(100),
                    border = BorderStroke(1.dp, Color(android.graphics.Color.parseColor("#487c9c")))
                ) {
                    Text(
                        text = "Hadits",
                        fontSize = 12.sp,
                        color = if (indikator) Color.White
                        else Color(android.graphics.Color.parseColor("#487c9c")),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            if(indikator == true){
                Box(
                    modifier = Modifier
                        .padding(top = 30.dp)

                ) {
                    tombolhadist(navController)
                }
            }
            else{
                Box(
                    modifier = Modifier
                        .padding(top = 30.dp)

                ) {
                    tomboldongeng(navController)
                }
            }
        }
    }


}