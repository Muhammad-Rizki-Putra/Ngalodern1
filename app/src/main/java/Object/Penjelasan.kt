@file:OptIn(ExperimentalMaterial3Api::class)

package Object

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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ngalodern.ui.theme.ui.theme.dmsansFontFamily


@Composable
fun Penjelasan(
    title: String,
    arti_indonesia: String,
    pembahasan: String,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss
    ) {
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
                .width(120.dp)
                .heightIn(min = 100.dp, max = 500.dp)
                .background(color = Color.White),
        ){
            Column (
                modifier = Modifier
                    .wrapContentHeight()
                    .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ){

                Box(modifier = Modifier.padding(top = 15.dp)){ // box title
                    Text(
                        text = title,
                        fontSize = 40.sp
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, bottom = 30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){ // box deskrispi
                    Text(
                        text = arti_indonesia,
                        fontFamily = dmsansFontFamily,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = pembahasan,
                        fontFamily = dmsansFontFamily,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }

                Box (){// box button
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            Color.Blue
                        ),
                        onClick = onDismiss) {
                        Text(text = "Dismiss")
                    }
                }
            }
        }
    }
}

@Composable
fun BenarSalah(
    ucapan: String,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss
    ) {
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
                .width(120.dp)
                .heightIn(min = 100.dp, max = 500.dp)
                .background(color = Color.White),
        ){
            Column (
                modifier = Modifier
                    .wrapContentHeight()
                    .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ){

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, bottom = 30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){ // Ucapan jawaban benar atau salah
                    Text(
                        text = ucapan,
                        fontFamily = dmsansFontFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }

                Box (){// Tombol untuk melanjutkan
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            Color(android.graphics.Color.parseColor("#457b9d"))
                        ),
                        onClick = onDismiss) {
                        Text(text = "Lanjutkan")
                    }
                }
            }
        }
    }
}


