package com.example.ngalodern.Page

import Object.Dongeng
import Object.Hadist
import Object.sizedg
import Object.sizehd
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
import Page.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.draw.shadow
import androidx.navigation.NavController
import com.example.ngalodern.ui.theme.ui.theme.leaguespartanFontFamily


@Preview
@Composable
fun box_belajar(judul: String = "None"){
    Box(
        modifier = Modifier
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
            .height(162.dp)
            .width(205.dp)
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
                    .height(94.dp)
                    .width(193.dp)
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
fun box_materi(waktu: String = "00.00",durasi: String = "00.00", judul: String = "Ragam Subjek"){
    Box(
        modifier = Modifier
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
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#A9C0CF")))
            .height(68.dp)
        ,

    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,

        ){
           Box(){
               Row{
                   Image(
                       modifier = Modifier
                           .height(60.dp)
                           .width(60.dp),
                       painter = painterResource(id = R.drawable.buku_1),
                       contentDescription = "Logo buku"
                   )
                   Column {
                       Text(
                           text = judul,
                           fontWeight = FontWeight.Bold,
                           fontSize = 16.sp,
                           color = Color.White
                       )

                       Text(
                           text = waktu + " / " + durasi,
                           fontSize = 12.sp,
                           color = Color.White
                       )
                   }
               }

           }

            Image(
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
                    .clickable {

                    },
                painter = painterResource(id = R.drawable.tombol_play_1),
                contentDescription = "Logo buku",
            )
        }
    }
}

@Preview
@Composable
fun box_belajar_2(judul: String = "None", route: String, navController: NavController){
    Box(
        modifier = Modifier
            .padding(end = 15.dp , bottom = 10.dp)
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
fun togglebelajar(indikator: Boolean = true, navController: NavController){
    if (indikator == false){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(top = 10.dp)
        ) {
            Column {
                LazyRow(
                ) {
                    items(sizedg){
                        box_belajar_2(
                            judul = Dongeng[it].judul,
                            route = "Dongeng_$it",
                            navController = navController
                        )
                    }
                }

            }
        }
    }
    else {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(top = 10.dp)
        ) {
            Column {
                LazyRow(
                ) {
                    items(sizehd){
                        box_belajar_2(
                            judul = Hadist[it].judul,
                            route = "Hadist_$it",
                            navController = navController
                        )
                    }
                }

            }
        }
    }
}

@Preview
@Composable
fun topbar(){
    Row( //Ngalodern & logo
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
            .padding(start = 30.dp, end = 30.dp, top = 30.dp, bottom = 10.dp)
            ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Ngalodern",
            fontSize = 32.sp,
            fontFamily = leaguespartanFontFamily,
            fontWeight = FontWeight.Bold
        )
        Image(
            modifier = Modifier
                .width(60.dp)
                .height(60.dp),
            painter = painterResource(id = R.drawable.logo_ngalodern1_2_1),
            contentDescription = "Profile Image"
        )
    }
}

@Preview
@Composable
fun Dashboard(scrollState: ScrollState, navController: NavController) {
    var indikator by remember { mutableStateOf(false) }
    Scaffold(
        bottomBar = {
            navbar(navController)
        },
        topBar = {
            topbar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .fillMaxWidth()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(start = 30.dp, end = 30.dp, top = 0.dp, bottom = 10.dp)
        ) {
            Box( //Banner
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()

            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    painter = painterResource(id = R.drawable.home_introduction),
                    contentDescription = "home_introduction"
                )
            }

            Box( //Terakhir dilihat
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Column {
                    Text(
                        modifier = Modifier.padding(bottom = 10.dp),
                        text = "Materi yang terakhir dilihat",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )

                    box_materi("00.00", "04.34")
                }
            }

            Box( //Materi
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                Column {
                    Text(
                        modifier = Modifier.padding(bottom = 10.dp),
                        text = "Materi",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )

                    Box(modifier = Modifier.padding(bottom = 13.dp)) {
                        box_materi("00.00", "04.34")
                    }

                    Box(modifier = Modifier.padding(bottom = 13.dp)) {
                        box_materi("00.00", "04.34", "Kata Arab-Sunda")
                    }
                }
            }

            Box( //Belajar
                modifier = Modifier
                    .padding(top = 10.dp)
            ){
                Column {
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ){
                        Text(
                            text = "Belajar",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold)

                        Text(
                            text = "Lihat semua",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color =  Color(android.graphics.Color.parseColor("#457B9D")),
                            modifier = Modifier
                                .clickable { navController.navigate("Belajar") }
                        )
                    }


                    Row ( // button buat select hadits / dongeng
                        modifier = Modifier
                            .padding(top = 10.dp)
                    ){
                        Box(){
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
                                    .height(29.dp)
                                    .width(109.dp),
                                onClick = {
                                    indikator = false
                                },
                                shape = if(!indikator) RoundedCornerShape(50)
                                else RoundedCornerShape(100),
                                border = BorderStroke(1.dp, Color(android.graphics.Color.parseColor("#487c9c")))
                            ) {
                                Text(
                                    text = "Dongeng",
                                    fontSize = 12.sp,
                                    color = if (!indikator) Color.White
                                            else Color(android.graphics.Color.parseColor("#487c9c")),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                        Box(
                            modifier = Modifier
                                .padding(start = 10.dp)
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
                                        if (indikator) Color(android.graphics.Color.parseColor("#487c9c"))
                                        else Color.Transparent
                                    )
                                    .height(29.dp)
                                    .width(109.dp),
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
                    }
                    togglebelajar(indikator,navController)
                }
            }
        }
    }
}