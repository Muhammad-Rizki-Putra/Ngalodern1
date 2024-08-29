package Object

import Page.navbar
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ngalodern.R
import com.example.ngalodern.ui.theme.ui.theme.dmsansFontFamily

object Skor {
    var skor = mutableStateOf(0)
}
data class Triple<A, B, C>(
    val first: A, // indeks ke- dalam array
    val second: B, // iterasi karakter ke-
    val third: C // warna sesuai ColoredChar
)

@OptIn(ExperimentalMaterial3Api::class)
class HalamanSoal {
    var judul : String = ""
    var jenis_soal : Int = 0
    var arr_soal = arrayOf<String>()
    var arr_lokasi = arrayOf<kotlin.Triple<Int, Int, Int>>()
    var pertanyaan : String = ""
    var opsi_1 : String = ""
    var opsi_2 : String = ""
    var opsi_3 : String = ""
    var opsi_4 : String = ""
    var opsi_benar : String = ""
    var rute_berikutnya : String = ""
    var soal_ke : String = ""

    constructor(judul: String, jenis_soal: Int, arr_soal: Array<String>, arr_lokasi: Array<kotlin.Triple<Int, Int, Int>>, pertanyaan: String, opsi_1: String, opsi_2: String, opsi_3: String, opsi_4: String, opsi_benar: String, rute_berikutnya: String, soal_ke: String) {
        this.judul = judul
        this.jenis_soal = jenis_soal
        this.arr_soal = arr_soal
        this.arr_lokasi = arr_lokasi
        this.pertanyaan = pertanyaan
        this.opsi_1 = opsi_1
        this.opsi_2 = opsi_2
        this.opsi_3 = opsi_3
        this.opsi_4 = opsi_4
        this.opsi_benar = opsi_benar
        this.rute_berikutnya = rute_berikutnya
        this.soal_ke = soal_ke
    }

    // Buat ganti warna per kata
    fun Coloredchar(str: String, indexesToColor: List<Int>, colorIds: List<Int>): AnnotatedString {
        return buildAnnotatedString {
            str.forEachIndexed { index, char ->
                val color = if (index in indexesToColor) {
                    val colorId = colorIds[indexesToColor.indexOf(index)]
                    when (colorId) {
                        1 -> Color(android.graphics.Color.parseColor("#457b9d"))
                        else -> Color.Black
                    }
                } else {
                    Color.Black
                }
                withStyle(style = SpanStyle(color = color)) {
                    append(char)
                }
            }
        }
    }

    @Composable
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
                    .padding(start = 20.dp, end = 20.dp)
            ) {
                Column( // Untuk Judul
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
                            Skor.skor.value = 0
                        },
                    painter = painterResource(id = R.drawable.next_reverse),
                    contentDescription = "nextlogo"
                )
            }
        }
    }

    @Composable
    fun box_opsi(opsi_x: String, opsi_benar: String, setShowDialogBenar: (Boolean) -> Unit, setShowDialogSalah: (Boolean) -> Unit, skor: Int) {
        Box (modifier = Modifier
            .clip(RoundedCornerShape(15.dp))
            .height(60.dp)
            .width(60.dp)
            .background(color = Color(android.graphics.Color.parseColor("#BFBFBF")))
            .clickable {
                if (opsi_x == opsi_benar) {
                    setShowDialogBenar(true)
                    Skor.skor.value += skor
                } else {
                    setShowDialogSalah(true)
                }
            },
            contentAlignment = Alignment.Center
        ) { Text( text = opsi_x, fontWeight = FontWeight.Bold, fontSize = 18.sp, fontFamily = dmsansFontFamily) }
    }

    @Composable
    fun box_benarsalah(opsi_x: String, opsi_benar: String, setShowDialogBenar: (Boolean) -> Unit, setShowDialogSalah: (Boolean) -> Unit, skor: Int) {
        Box (modifier = Modifier
            .clip(RoundedCornerShape(15.dp))
            .height(60.dp)
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#BFBFBF")))
            .clickable {
                if (opsi_x == opsi_benar) {
                    setShowDialogBenar(true)
                    Skor.skor.value += skor
                } else {
                    setShowDialogSalah(true)
                }
            },
            contentAlignment = Alignment.Center
        ) { Text( text = opsi_x, fontWeight = FontWeight.Bold, fontSize = 18.sp, fontFamily = dmsansFontFamily) }
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun jenisPertama(setShowDialogBenar: (Boolean) -> Unit, setShowDialogSalah: (Boolean) -> Unit) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            Box (
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .height(45.dp)
                    .width(70.dp)
                    .background(color = Color(android.graphics.Color.parseColor("#C1A479"))),
                contentAlignment = Alignment.Center
            ) {
                Text (
                    text = soal_ke,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    fontFamily = dmsansFontFamily,
                    color = Color.White
                )
            }
        }
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            FlowRow(
                modifier = Modifier
                    .wrapContentWidth()
            ) {
                arr_soal.forEachIndexed { index, item ->
                    val soalInfo = arr_lokasi.filter { it.first == index}
                    Box(
                        modifier = Modifier
                            .padding(bottom = 12.dp, end = 5.dp)
                    ) {
                        Text(
                            text = if (soalInfo.isNotEmpty()) { Coloredchar(item, soalInfo.map { it.second }, soalInfo.map { it.third }) }
                            else { AnnotatedString(item) },
                            fontFamily = dmsansFontFamily,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
        Column ( // Box putih
            modifier = Modifier
                .clip(RoundedCornerShape(30.dp))
                .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {

            Text ( // Pertanyaan di dalam box putih
                text = pertanyaan,
                fontFamily = dmsansFontFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )

            Box ( // Garis pembatas pertanyaan dan opsi jawaban
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(color = Color(android.graphics.Color.parseColor("#000000")))
            ) {}

            Row ( // Opsi jawaban disusun dalam bentuk Row (Baris)
                modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                box_opsi(opsi_1, opsi_benar, setShowDialogBenar, setShowDialogSalah, 10)
                box_opsi(opsi_2, opsi_benar, setShowDialogBenar, setShowDialogSalah, 10)
                box_opsi(opsi_3, opsi_benar, setShowDialogBenar, setShowDialogSalah, 10)
                box_opsi(opsi_4, opsi_benar, setShowDialogBenar, setShowDialogSalah, 10)
            }
        }
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun jenisKedua(setShowDialogBenar: (Boolean) -> Unit, setShowDialogSalah: (Boolean) -> Unit) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            Box (
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .height(45.dp)
                    .width(70.dp)
                    .background(color = Color(android.graphics.Color.parseColor("#C1A479"))),
                contentAlignment = Alignment.Center
            ) {
                Text (
                    text = soal_ke,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    fontFamily = dmsansFontFamily,
                    color = Color.White
                )
            }
        }
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            FlowRow(
                modifier = Modifier
                    .wrapContentWidth()
            ) {
                arr_soal.forEachIndexed { index, item ->
                    val soalInfo = arr_lokasi.filter { it.first == index}
                    Box(
                        modifier = Modifier
                            .padding(bottom = 12.dp, end = 5.dp)
                    ) {
                        Text(
                            text = if (soalInfo.isNotEmpty()) { Coloredchar(item, soalInfo.map { it.second }, soalInfo.map { it.third }) }
                            else { AnnotatedString(item) },
                            fontFamily = dmsansFontFamily,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
        Column ( // Box putih
            modifier = Modifier
                .clip(RoundedCornerShape(30.dp))
                .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {

            Text ( // Pertanyaan di dalam box putih
                text = pertanyaan,
                fontFamily = dmsansFontFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )

            Box ( // Garis pembatas pertanyaan dan opsi jawaban
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(color = Color(android.graphics.Color.parseColor("#000000")))
            ) {}

            Row ( // Opsi jawaban disusun dalam bentuk Row (Baris)
                modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                box_opsi(opsi_1, opsi_benar, setShowDialogBenar, setShowDialogSalah, 20)
                box_opsi(opsi_2, opsi_benar, setShowDialogBenar, setShowDialogSalah, 20)
                box_opsi(opsi_3, opsi_benar, setShowDialogBenar, setShowDialogSalah, 20)
                box_opsi(opsi_4, opsi_benar, setShowDialogBenar, setShowDialogSalah, 20)
            }
        }
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun jenisKetiga(setShowDialogBenar: (Boolean) -> Unit, setShowDialogSalah: (Boolean) -> Unit) {
        Column (
            modifier = Modifier.fillMaxWidth(),
        ) {
            Box (
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .height(45.dp)
                    .width(70.dp)
                    .background(color = Color(android.graphics.Color.parseColor("#C1A479"))),
                contentAlignment = Alignment.Center
            ) {
                Text (
                    text = soal_ke,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    fontFamily = dmsansFontFamily,
                    color = Color.White
                )
            }
        }
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
            FlowRow(
                modifier = Modifier
                    .wrapContentWidth()
            ) {
                arr_soal.forEachIndexed { index, item ->
                    val soalInfo = arr_lokasi.filter { it.first == index}
                    Box(
                        modifier = Modifier
                            .padding(bottom = 12.dp)
                    ) {
                        Text(
                            text = if (soalInfo.isNotEmpty()) { Coloredchar(item, soalInfo.map { it.second }, soalInfo.map { it.third }) }
                            else { AnnotatedString(item) },
                            fontFamily = dmsansFontFamily,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
        Column ( // Box putih
            modifier = Modifier
                .clip(RoundedCornerShape(30.dp))
                .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {

            Text ( // Pertanyaan di dalam box putih
                text = pertanyaan,
                fontFamily = dmsansFontFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )

            Box ( // Garis pembatas pertanyaan dan opsi jawaban
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(color = Color(android.graphics.Color.parseColor("#000000")))
            ) {}

            Row ( // Opsi jawaban disusun dalam bentuk Row (Baris)
                modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterHorizontally),
            ) {
                box_opsi(opsi_1, opsi_benar, setShowDialogBenar, setShowDialogSalah, 10)
                box_opsi(opsi_2, opsi_benar, setShowDialogBenar, setShowDialogSalah, 10)
                box_opsi(opsi_3, opsi_benar, setShowDialogBenar, setShowDialogSalah, 10)
                if(opsi_4.isNotEmpty()) { box_opsi(opsi_4, opsi_benar, setShowDialogBenar, setShowDialogSalah, 10) }
            }
        }
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun jenisKeempat(setShowDialogBenar: (Boolean) -> Unit, setShowDialogSalah: (Boolean) -> Unit) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            Box (
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .height(45.dp)
                    .width(70.dp)
                    .background(color = Color(android.graphics.Color.parseColor("#C1A479"))),
                contentAlignment = Alignment.Center
            ) {
                Text (
                    text = soal_ke,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    fontFamily = dmsansFontFamily,
                    color = Color.White
                )
            }
        }
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
            FlowRow(
                modifier = Modifier
                    .wrapContentWidth()
            ) {
                arr_soal.forEachIndexed { index, item ->
                    val soalInfo = arr_lokasi.filter { it.first == index}
                    Box(
                        modifier = Modifier
                            .padding(bottom = 12.dp)
                    ) {
                        Text(
                            text = if (soalInfo.isNotEmpty()) { Coloredchar(item, soalInfo.map { it.second }, soalInfo.map { it.third }) }
                            else { AnnotatedString(item) },
                            fontFamily = dmsansFontFamily,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
        Column ( // Box putih
            modifier = Modifier
                .clip(RoundedCornerShape(30.dp))
                .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {

            Column ( // Opsi jawaban disusun dalam bentuk Column
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                box_benarsalah(opsi_1, opsi_benar, setShowDialogBenar, setShowDialogSalah, 10)
                box_benarsalah(opsi_2, opsi_benar, setShowDialogBenar, setShowDialogSalah, 10)
            }
        }
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Preview
    @Composable
    fun board(scrollState: ScrollState, navController: NavController) {

        val (showDialogBenar, setShowDialogBenar) = remember { mutableStateOf(false) }
        val (showDialogSalah, setShowDialogSalah) = remember { mutableStateOf(false) }

        Scaffold(
            topBar = { topbar(navController = navController) },
            bottomBar = { navbar(navController = navController) }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                    .padding(innerPadding)
                    .padding(top = 20.dp, start = 30.dp, end = 30.dp, bottom = 20.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                if (jenis_soal == 1) { jenisPertama(setShowDialogBenar, setShowDialogSalah) }
                else if (jenis_soal == 2) { jenisKedua(setShowDialogBenar, setShowDialogSalah) }
                else if (jenis_soal == 3) { jenisKetiga(setShowDialogBenar, setShowDialogSalah) }
                else { jenisKeempat(setShowDialogBenar, setShowDialogSalah) }
            }

            val benar : String = "Ya, jawaban kamu benar!"
            val salah : String = "Jawaban kamu masih kurang tepat!"
            if (showDialogBenar) {
                BenarSalah(
                    ucapan = benar,
                    onDismiss = {
                        setShowDialogBenar(false)
                        navController.navigate(rute_berikutnya)
                    }
                )
            }
            if (showDialogSalah) {
                BenarSalah(
                    ucapan = salah,
                    onDismiss = {
                        setShowDialogSalah(false)
                        navController.navigate(rute_berikutnya)
                    }
                )
            }
        }
    }
}