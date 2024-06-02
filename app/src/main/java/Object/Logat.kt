package Object

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import Object.Penjelasan
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.offset

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

    constructor() {

    }

    fun init_fr_simbol(){
        this.penjelasan =
            when (this.simbol) {
                "Vl" -> "Verba lampau dalam gramatika bahasa Arab disebut fi’il madhi adalah kata kerja yang menunjukkan pekerjaan yang telah dilakukan di masa lampau."
                "Vnl" -> "Verba non-lampau dalam gramatika bahasa Arab disebut fi’il mudhari adalah kata kerja yang menunjukkan pekerjaan yang sedang dilakukan atau akan dilakukan."
                "N1" -> "Nomina tunggal dalam bahasa Arab disebut isim mufrad adalah kata benda yang menunjukkan jumlahnya hanya satu. Secara umum jika tidak kemasukan hal-hal menyebabkan kasusnya berubah, atau dia dalam keadaan marfu maka ditandai dengan harakat dhammah."
                "N2" -> "Nomina dual dalam bahasa Arab disebut isim mutsanna adalah kata benda yang menunjukkan jumlahnya dua. Biasanya ditandai dengan alif nun di akhir apabila keadaan marfu/ kasus (i'robnya) rofa, ditandai dengan ya’ dan nun jika keadaannya manshub (kasusnya nasab) atau majrur (kasusnya jar)."
                "N+" -> "Nomina plural dalam bahasa Arab disebut isim jamak adalah kata benda yang menunjukkan jumlahnya hanya satu. Ada jamak mudzakkar salim, jamak muannats salim, dan jamak taksir."
                "Pp" -> "Partikel preposisi dalam bahasa Arab adalah huruf-huruf jar, yaitu huruf yang bisa membuat nomina (isim) setelahnya memiliki kasus (ber-i’rab) jar. Umumnya i’rab jar ditandai dengan harakat kasrah di untuk nomina tunggal, dan mengikuti ciri majrur nomina dual atau jamak jika dia bermuda dual atau jamak."
                "Pt" -> "Partikel temporal atau dhorfu zaman adalah partikel yang menunjukkan waktu."
                "Pl" -> "Partikel lokatif atau dzorfu makan adalah partikel yang menunjukkan tempat."
                "Ko" -> "Konjungsi atau kata penghubung dalam bahasa Arab disebut huruf ‘athaf."
                "S1" -> "Subjek mubtada dalam bahasa Arab, subjek yang berada di awal kalimat, keadaannya marfu’ (memiliki kasus rafa’)."
                "S2" -> "Subjek fa’il adalah subjek pelaku yang terletak setelah verba aktif, memiliki kasus rafa’."
                "S3" -> "Subjek naibul fa’il adalah subjek pengganti pelaku (asalnya objek) yang terletak setelah verba pasif."
                "P1" -> "Predikat khabar adalah predikat yang menjelaskan subjek mubtada, biasanya terletak setelah subjek mubtada, memiliki kasus rafa’."
                "P2" -> "Predikat fi’il adalah predikat verba (kata kerja) berhubungan dengan kala."
                "P3" -> "Fi’il pasif dalam bahasa arab dikenal dengan fi’il majhul, yaitu fi'il/kata kerja yang pelakunya (الفاعِل) tidak diketahui atau tidak disebutkan."
                "O" -> "Objek adalah sesuatu yang dikenai tindakan oleh subjek. Objek terdapat dalam kalimat aktif, itu pun hanya aktif yang transitif."
                "K" -> "Keterangan adalah unsur kalimat yang memberikan informasi lebih lanjut tentang sesuatu yang dinyatakan dalam kalimat."
                "Fp" -> "Frasa Preposisi adalah frasa yang didahului oleh partikel jar atau partikel lokatif."
                "Fi" -> "Frasa Idhafy adalah frasa yang terdiri dari dua nomina atau lebih bersifat nonpredikatif."
                "Fn" -> "Frasa Na'ty disebut juga frasa sifat-maushuf. Frasa ini berinduk satu yang induknya adjektiva."
                else -> "Simbol tidak dikenal."
        }
    }


    @Preview
    @Composable
    fun tombol(Simbol: String){
        this.simbol = Simbol
        init_fr_simbol()
        val (showDialog, setShowDialog) = remember { mutableStateOf(false) }
        val (dialogTitle, setDialogTitle) = remember { mutableStateOf("") }
        val (dialogArti, setArti) = remember { mutableStateOf("") }
        val (dialogPembahasan, setPembahasan) = remember { mutableStateOf("") }
        Box(
            modifier = Modifier
                .offset(y = (-20).dp)
                .clip(RoundedCornerShape(50))
                .background(
                    when (warna) {
                        1 -> Color.Red
                        2 -> Color.Blue
                        3 -> Color(android.graphics.Color.parseColor("#964B00"))
                        4 -> Color(android.graphics.Color.parseColor("#800080"))
                        else -> Color.Black
                    }
                )
                .padding(2.dp)
                .clickable(onClick = {
                    setDialogTitle(simbol)
                    setArti("")
                    setPembahasan(penjelasan)
                    setShowDialog(true)
                }
                )
        ) {
            Text(
                text = Simbol,
                fontSize = 8.sp,
                color = Color.White,
                modifier = Modifier.padding(4.dp)
            )
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