package Page


import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.foundation.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun tombolhadits(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ){
    LazyColumn {
        items(10){
            Box(
                modifier = Modifier
                    .padding(top = 30.dp)
            ){
                box_materi(
                    waktu = "",
                    durasi = "",
                    judul = "Hadits $it"
                )
            }
        }
    }
    }
}

@Preview
@Composable
fun tomboldongeng(){
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ){
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(5){
                box_belajar(
                    judul = "Dongeng $it"
                )
            }
        }
    }
}

@Composable
@Preview
fun topbar() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(87.dp)
            .shadow(
                elevation = 35.dp,
                shape = RoundedCornerShape(
                    bottomStart = 50.dp,
                    bottomEnd = 50.dp
                ),
                clip = false
            ),
        color = Color(android.graphics.Color.parseColor("#457b9d")),
        shape = RoundedCornerShape(
            bottomStart = 50.dp,
            bottomEnd = 50.dp
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 8.dp)
        ) {
            Text(
                modifier = Modifier
                    .align(Alignment.Center),
                text = "Belajar",
                fontSize = 35.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Image(
                modifier = Modifier
                    .width(150.dp)
                    .height(46.dp)
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp),
                painter = painterResource(id = R.drawable.next_reverse),
                contentDescription = "nextlogo"
            )
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
            .width(299.dp)
            .background(color = Color(android.graphics.Color.parseColor("#A9C0CF")))
            .height(53.dp)
        ,

        ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            ){
            Text(
                text = judul,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

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


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun Belajar(scrollState: ScrollState){
    Scaffold(
        topBar = {
            topbar()
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(30.dp)
                .padding(top = 75.dp)
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
            if(indikator == true){
                Box(
                    modifier = Modifier
                        .padding(top = 35.dp)
                        .padding(start = 18.dp)
                ) {
                    tombolhadits()
                }
            }
            else{
                Box(
                    modifier = Modifier
                        .padding(top = 65.dp)
                        .padding(start = 18.dp)
                ) {
                    tomboldongeng()
                }
            }
        }
    }


}