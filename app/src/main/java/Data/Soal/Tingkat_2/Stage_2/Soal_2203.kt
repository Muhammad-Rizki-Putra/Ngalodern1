package Data.Soal.Tingkat_2.Stage_2

import Object.HalamanSoal
import Object.Soal_22
import androidx.compose.runtime.Composable

@Composable
fun Soal_2202() {

    var arr_soal = arrayOf<String>()
    var arr_lokasi = arrayOf<Triple<Int, Int, Int>>()
    var pertanyaan : String = ""
    var opsi_1 : String = ""
    var opsi_2 : String = ""
    var opsi_3 : String = ""
    var opsi_4 : String = ""
    var opsi_benar : String = ""
    var rute_berikutnya : String = ""
    var soal_ke : String = ""
    var iterasi: Int = 0

    // Tingkat 2 Level 2 Soal 2

    arr_soal += "Kata yang menunjukkan arti pada dirinya sendiri dan tidak berhubungan dengan waktu disebut dengan verba (fi'il)."

    opsi_1 = "Benar"
    opsi_2 = "Salah"

    opsi_benar = "Salah"

    rute_berikutnya = "Soal2_2_2"
    soal_ke = "2/10"

    val soal_2202 : HalamanSoal = HalamanSoal("Soal 1 - 2", 4, arr_soal, arr_lokasi, pertanyaan, opsi_1, opsi_2, opsi_3, opsi_4, opsi_benar, rute_berikutnya, soal_ke)
    Soal_22.add(soal_2202)
}