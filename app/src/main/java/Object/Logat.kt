package Object

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class Logat {
    var penjelasan: String = ""
    var simbol: String = ""
    var tipe: String = ""
    var warna: Int = 0

    constructor(Penjelasan: String, Simbol: String, Tipe: String, warna: Int) {
        this.penjelasan = Penjelasan
        this.simbol = Simbol
        this.tipe = Tipe
        this.warna = warna
    }

    @Composable
    fun tombol(){
        Box(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 100.dp,
                        bottomStart = 100.dp,
                        topEnd = 100.dp,
                        bottomEnd = 100.dp,
                    )
                )
                .background(
                    when (warna) {
                        1 -> Color.Red
                        2 -> Color.Blue
                        3 -> Color(android.graphics.Color.parseColor("#964B00"))
                        4 -> Color(android.graphics.Color.parseColor("#800080"))
                        else ->{
                            Color.Black
                        }
                    }
                )
        ){

        }
    }
}