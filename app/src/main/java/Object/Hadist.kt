package Object

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ngalodern.R
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.max
import com.example.ngalodern.ui.theme.ui.theme.dmsansFontFamily
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
class Hadist {
    var judul: String = ""
    var subjudul: String = ""
    var arti: String = ""
    var arab: String = ""
    var arr_arab = arrayOf<String>()
    var arr_indo = arrayOf<String>()
    var arr_lokasi = arrayOf<Triple<Int, Int, Int>>()
    var logat: Logat = Logat()

    constructor(judul: String, subjudul: String, arti: String, arab: String) {
        this.judul = judul
        this.subjudul = subjudul
        this.arti = arti
        this.arab = arab
        this.arr_arab = this.arab.split(" ").toTypedArray()
    }

    constructor(judul: String, subjudul: String, arti: String, arr_indo: Array<String>, arr_arab: Array<String>, lokasilogat: Array<Triple<Int, Int, Int>>) {
        this.judul = judul
        this.subjudul = subjudul
        this.arti = arti
        this.arr_arab = arr_arab
        this.arr_indo = arr_indo
        this.arr_lokasi = lokasilogat
    }

    constructor() {
        this.judul = ""
        this.subjudul = ""
        this.arti = ""
        this.arab = ""
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
                        1 -> Color.Red
                        2 -> Color.Blue
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
                bottomStart = 50.dp,
                bottomEnd = 50.dp
            )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier,
                        text = judul,
                        fontSize = 32.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        modifier = Modifier,
                        text = subjudul,
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }

                Image(
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .width(150.dp)
                        .height(46.dp)
                        .align(Alignment.CenterStart)
                        .padding(start = 10.dp)
                        .clickable { navController.navigate("Belajar") },
                    painter = painterResource(id = R.drawable.next_reverse),
                    contentDescription = "nextlogo"
                )
            }
        }
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Preview
    @Composable
    fun board(scrollState: ScrollState, navController: NavController) {
        val (showDialog, setShowDialog) = remember { mutableStateOf(false) }
        val (dialogTitle, setDialogTitle) = remember { mutableStateOf("") }
        val (dialogArti, setArti) = remember { mutableStateOf("") }
        val (dialogPembahasan, setPembahasan) = remember { mutableStateOf("") }
        val (showLogat, setShowLogat) = remember { mutableStateOf(false) }
        var (lastindex, setLastIndex) = remember { mutableStateOf(-1) }
        var (lastchar, setlastchar) = remember { mutableStateOf(-1) }

        Scaffold(
            topBar = {
                topbar(navController = navController)
            }
            
        ) { innerPadding ->
            val SheetState = rememberModalBottomSheetState()
            var isSheetOpen by rememberSaveable {
                mutableStateOf(false)
            }
            val scaffoldState = rememberBottomSheetScaffoldState()
            val scope = rememberCoroutineScope()

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                    .padding(innerPadding)
                    .padding(top = 30.dp, start = 30.dp, end = 30.dp, bottom = 60.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Button(
                    onClick = {
                        setShowLogat(!showLogat)
                    }
                ) {
                    Text(text = if (showLogat) "hide logat" else "show logat")
                }

                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                    FlowRow(
                        modifier = Modifier
                            .wrapContentWidth()
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        arr_arab.forEachIndexed { index, item ->
                            val logatInfo = arr_lokasi.filter { it.first == index }
                            if (index < arr_lokasi.size && arr_lokasi[index].first != lastindex) {
                                lastindex = arr_lokasi[index].first
                            }


                            Box(
                                modifier = Modifier
                                    .padding(bottom = 20.dp, end = 5.dp)
                                    .clickable {
                                        setDialogTitle("$item")
                                        setArti(arr_indo[index])
                                        setPembahasan("")
                                        setShowDialog(true)
                                    }
                            ) {
                                Text(
                                    text =
                                    if (showLogat) {
                                        if (logatInfo.isNotEmpty()) {
                                            Coloredchar(item, logatInfo.map { it.second }, logatInfo.map { it.third })
                                        } else {
                                            AnnotatedString(item)
                                        }
                                    } else {
                                        AnnotatedString(item)
                                    },
                                    fontSize = 36.sp,
                                    fontWeight = FontWeight.Bold,
                                    style = TextStyle(textDecoration = TextDecoration.Underline),
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = 1
                                )
                                if (lastindex == index && showLogat) {
                                    logat.tombol(Simbol = "S1")
                                }
                            }
                        }
                    }
                }


            }

            if (showDialog) {
                Penjelasan(
                    title = dialogTitle,
                    arti_indonesia = dialogArti,
                    pembahasan = dialogPembahasan,
                    onDismiss = { setShowDialog(false) }
                )
            }

            BottomSheetScaffold(
                scaffoldState = scaffoldState,
                sheetContent = {
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .heightIn(min = 200.dp, max = 625.dp)
                            .fillMaxHeight(),
                        painter = painterResource(id = R.drawable.he_has_been_boiled_alhamdulillah),
                        contentDescription = null

                    )
                },


                ) {

            }
        }
    }
}
