package com.example.ngalodern.Page

import android.icu.text.ListFormatter.Width
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ngalodern.R
import androidx.compose.ui.text.style.TextOverflow

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import androidx.compose.runtime.*

@Preview
@Composable
fun box_belajar(judul: String = "None"){
    Box(
        modifier = Modifier
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
fun togglebelajar(indikator: Boolean = true){
    if (indikator == true){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(top = 10.dp)
        ) {
            Column {


                LazyRow(
                ) {
                    items(3) {
                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                        ){
                            box_belajar("Judul $it Hadits")
                        }
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
                    items(3) {
                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                        ){
                            box_belajar("Judul $it Dongeng")
                        }
                    }
                }

            }
        }
    }
}

@Preview
@Composable
fun navbar(){
    Box (
        modifier = Modifier
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
                        .height(75.dp)
                        .width(75.dp)
                        .clickable {

                        },
                    painter = painterResource(id = R.drawable.beranda_focus),
                    contentDescription = "Logo Beranda"
                )
                Image(
                    modifier = Modifier
                        .height(75.dp)
                        .width(75.dp)
                        .clickable {

                        },
                    painter = painterResource(id = R.drawable.latihan_unfocus),
                    contentDescription = "Logo Latihan"
                )
                Image(
                    modifier = Modifier
                        .height(75.dp)
                        .width(75.dp)
                        .clickable {

                        },
                    painter = painterResource(id = R.drawable.profil_unfocus),
                    contentDescription = "Logo Profil"
                )
            }
        }
    }
}

@Preview
@Composable
fun Dashboard(scrollState: ScrollState) {
    var indikator by remember { mutableStateOf(false) }
    Scaffold(
        bottomBar = {
            navbar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .fillMaxWidth()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(30.dp)
        ) {

            Row( //Ngalodern & logo
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Ngalodern",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Image(
                    modifier = Modifier
                        .size(60.dp)
                        .fillMaxWidth(),
                    painter = painterResource(id = R.drawable.logo_ngalodern1_2_1),
                    contentDescription = "Profile Image"
                )
            }

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
                    .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
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
                    .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
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
                            color =  Color(android.graphics.Color.parseColor("#457B9D"))
                        )
                    }


                    Row (
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
                                    .background(color = Color(android.graphics.Color.parseColor("#457B9D")))
                                    .height(29.dp)
                                    .width(109.dp),
                                onClick = {
                                    indikator = false
                                }
                            ) {
                                Text(
                                    text = "Dongeng",
                                    fontSize = 12.sp
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
                                    .background(color = Color(android.graphics.Color.parseColor("#457B9D")))
                                    .height(29.dp)
                                    .width(109.dp),
                                onClick = { indikator = true }
                            ) {
                                Text(
                                    text = "Hadits",
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                    togglebelajar(indikator)
                }
            }
        }
    }
}
