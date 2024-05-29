package Object
import Object.*

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ngalodern.R
import Page.*
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration

class Dongeng {
    var judul: String =""
    var subjudul: String=""
    var arti: String=""
    var arab : String = ""
    var arr_arab = arrayOf<String>()

    constructor(judul: String, subjudul: String, arti: String, arab: String){
        this.judul = judul
        this.subjudul = subjudul
        this.arti = arti
        this.arab = arab
        this.arr_arab = this.arab.split(" ").toTypedArray()
    }

    // alt constructor
    constructor(){
        this.judul = ""
        this.subjudul = ""
        this.arti = ""
        this.arab = ""
    }

    constructor(judul: String, subjudul: String, arti: String, arr_arab: Array<String>){
        this.judul = judul
        this.subjudul = subjudul
        this.arti = arti
        this.arr_arab = arr_arab
    }

    // setter
    fun setjudul(judul: String){
        this.judul = judul
    }
    fun setsubjudul(subjudul: String){
        this.subjudul = subjudul
    }
    fun setarti(arti: String){
        this.arti = arti
    }
    fun setarab(arab: String){
        this.arab = arab
    }

    // getter
    fun getjudul(): String{
        return this.judul
    }

    fun getsubjudul(): String{
        return this.subjudul
    }

    fun getarti(): String{
        return this.arti
    }

    fun getarab(): String{
        return this.arab
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
                Column (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        modifier = Modifier
                            ,
                        text = judul,
                        fontSize = 32.sp,
                        color = androidx.compose.ui.graphics.Color.White,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        modifier = Modifier
                            ,
                        text = subjudul,
                        fontSize = 16.sp,
                        color = androidx.compose.ui.graphics.Color.White,
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
                        .clickable { navController.navigate("Belajar") }
                        ,
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

        Scaffold(
            topBar = {
                topbar(navController = navController)
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                    .padding(innerPadding)
                    .padding(top = 30.dp, start = 30.dp, end = 30.dp, bottom = 0.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                FlowRow(
                    modifier = Modifier
                        .wrapContentWidth()
                        .fillMaxSize(),
                    Arrangement.Center
                ) {
                    arr_arab.forEach { item ->
                        Box(
                            modifier = Modifier
                                .padding(bottom = 20.dp, end = 5.dp)
                                .clickable {
                                    setDialogTitle("$item")
                                    setArti("Contoh arti untuk $item")
                                    setPembahasan("Contoh Pembahasan untuk $item")

                                    setShowDialog(true)
                                }
                        ) {
                            Text(
                                modifier = Modifier.padding(5.dp),
                                text = item,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                style = TextStyle(textDecoration = TextDecoration.Underline)
                            )
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
        }
    }
}
