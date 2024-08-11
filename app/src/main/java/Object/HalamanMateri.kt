@file:Suppress("PreviewMustBeTopLevelFunction", "PreviewMustBeTopLevelFunction")

package Object


import Page.VideoPlayer
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
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
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.example.ngalodern.Page.box_materi
import com.example.ngalodern.R
import com.example.ngalodern.ui.theme.ui.theme.dmsansFontFamily


@OptIn(ExperimentalMaterial3Api::class)
class HalamanMateri {
    var videoUrl: String = ""
    var judul: String = ""
    var subjudul: String = ""
    var arti: String = ""
    var arab: String = ""
    var arr_arab = arrayOf<String>()
    var arr_indo = arrayOf<String>()
    var arr_lokasi = arrayOf<Quadruple<Int, Int, Int, String>>()
    var logat: Logat = Logat()
    var PenjelasanModul: String = ""
    var ArtiFull: String = ""
    var arr_lokasi_U = arrayOf<Pair<Int, Int>>()
    var arr_lokasi_B = arrayOf<Pair<Int, String>>()
    var arr_duplicate = arrayOf<Pair<Int, Int>>()

    constructor(judul: String, subjudul: String, arr_lokasi_U: Array<Pair<Int, Int>>, arr_indo: Array<String>, arr_arab: Array<String>, lokasilogat: Array<Quadruple<Int, Int, Int, String>>,ArtiFull: String  , arr_lokasi_B: Array<Pair<Int, String>> , arr_duplicate: Array<Pair<Int, Int>> ,  PenjelasanModul: String) {
        this.judul = judul
        this.subjudul = subjudul
        this.arr_arab = arr_arab
        this.arr_indo = arr_indo
        this.arr_lokasi = lokasilogat
        this.PenjelasanModul = PenjelasanModul
        this.ArtiFull = ArtiFull
        this.arr_lokasi_U = arr_lokasi_U
        this.arr_lokasi_B = arr_lokasi_B
        this.arr_duplicate = arr_duplicate
    }

    constructor(judul: String, subjudul: String, arr_lokasi_U: Array<Pair<Int, Int>>, arr_arab: Array<String>, lokasilogat: Array<Quadruple<Int, Int, Int, String>>,ArtiFull: String, arr_lokasi_B: Array<Pair<Int, String>>, arr_duplicate: Array<Pair<Int, Int>>) {
        this.judul = judul
        this.subjudul = subjudul
        this.arr_arab = arr_arab
        this.arr_lokasi = lokasilogat
        this.ArtiFull = ArtiFull
        this.arr_lokasi_U = arr_lokasi_U
        this.arr_lokasi_B = arr_lokasi_B
        this.arr_duplicate = arr_duplicate
    }

    constructor(judul: String, subjudul: String, videoUrl: String){
        this.judul = judul
        this.subjudul = subjudul
        this.videoUrl = videoUrl
    }

    fun setjudul(judul: String) {
        this.judul = judul
    }

    fun setsubjudul(subjudul: String) {
        this.subjudul = subjudul
    }

    fun setarti(arti: String) {
        this.arti = arti
    }

    fun setarab(arab: String) {
        this.arab = arab
    }

    fun getjudul(): String {
        return this.judul
    }

    fun getsubjudul(): String {
        return this.subjudul
    }

    fun getarti(): String {
        return this.arti
    }

    fun getarab(): String {
        return this.arab
    }

    fun Coloredchar(str: String, indexesToColor: List<Int>, colorIds: List<Int>): AnnotatedString {
        return buildAnnotatedString {
            str.forEachIndexed { index, char ->
                val color = if (index in indexesToColor) {
                    val colorId = colorIds[indexesToColor.indexOf(index)]
                    when (colorId) {
                        1 -> Color(android.graphics.Color.parseColor("#FF0000"))
                        2 -> Color(android.graphics.Color.parseColor("#479DDC"))
                        3 -> Color(android.graphics.Color.parseColor("#964B00"))
                        4 -> Color(android.graphics.Color.parseColor("#800080"))
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
                Column(
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

                    Text(
                        modifier = Modifier,
                        text = subjudul,
                        fontSize = 12.sp,
                        color = Color.White,
                        fontFamily = dmsansFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                }

                Image(
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .width(32.dp)
                        .height(32.dp)
                        .align(Alignment.CenterStart)

                        .clickable { navController.navigate("Materi") },
                    painter = painterResource(id = R.drawable.next_reverse),
                    contentDescription = "nextlogo"
                )
            }
        }
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun boardmateri(scrollState: ScrollState, navController: NavController) {
        val (showDialog, setShowDialog) = remember { mutableStateOf(false) }
        val (dialogTitle, setDialogTitle) = remember { mutableStateOf("") }
        val (dialogArti, setArti) = remember { mutableStateOf("") }
        val (dialogPembahasan, setPembahasan) = remember { mutableStateOf("") }
        val (showLogat, setShowLogat) = remember { mutableStateOf(false) }

        Scaffold(
            topBar = {
                topbar(navController = navController)
            }
        ) { innerPadding ->
            val scaffoldState = rememberBottomSheetScaffoldState()
            var checked by remember { mutableStateOf(false) }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                    .padding(innerPadding)
                    .padding(top = 10.dp, start = 30.dp, end = 30.dp, bottom = 60.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.End
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .clip(
                                RoundedCornerShape(
                                    topStart = 20.dp,
                                    bottomStart = 20.dp,
                                    topEnd = 20.dp,
                                    bottomEnd = 20.dp,
                                )
                            )
                            .fillMaxWidth()
                            .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))

                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(5.dp)
//                                .background(
//                                    color = Color(
//                                        android.graphics.Color.parseColor(
//                                            "#457b9d"
//                                        )
//                                    )
//                                )
                        ) {
                        }
                        Text(
                            modifier = Modifier
                                .padding(start = 15.dp, end = 15.dp, top = 10.dp, bottom = 15.dp),
                            text = PenjelasanModul,
                            fontFamily = dmsansFontFamily,
                            fontWeight = FontWeight.Bold,
                            color = Color(
                                android.graphics.Color.parseColor(
                                    "#457b9d"
                                )
                            )
                        )
                    }

                }
        }
    }
}

    @Composable
    fun VideoPage(scrollState: ScrollState, navController: NavController, videoUrl: String) {
        Scaffold(
            topBar = {
                topbar(navController = navController)
            }
        ) { innerPadding ->
            val scaffoldState = rememberBottomSheetScaffoldState()
            var checked by remember { mutableStateOf(false) }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                    .padding(innerPadding)
                    .padding(top = 10.dp, start = 30.dp, end = 30.dp, bottom = 60.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.End
            ) {
                Box(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            topStart = 20.dp,
                            bottomStart = 20.dp,
                            topEnd = 20.dp,
                            bottomEnd = 20.dp,
                        )
                    )
                    .fillMaxWidth()
                    .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))

            ) {
                    VideoPlayer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        videoUrl = videoUrl
                    )
                }
                // Other videos or content
                // ...
            }
        }
    }
}
