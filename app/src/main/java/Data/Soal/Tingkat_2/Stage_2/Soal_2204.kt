package Data.Soal.Tingkat_2.Stage_2

import Object.HalamanSoal
import Object.Soal_22
import androidx.compose.runtime.Composable

@Composable
fun Soal_2203() {

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

    // Tingkat 2 Level 2 Soal 3

    arr_soal += "Nomina (isim) yang menunjukkan jumlah satu disebut isim mufrad."

    opsi_1 = "Benar"
    opsi_2 = "Salah"

    opsi_benar = "Benar"

    rute_berikutnya = "Soal2_2_3"
    soal_ke = "3/10"

    val soal_2203 : HalamanSoal = HalamanSoal("Soal 1 - 3", 4, arr_soal, arr_lokasi, pertanyaan, opsi_1, opsi_2, opsi_3, opsi_4, opsi_benar, rute_berikutnya, soal_ke)
    Soal_22.add(soal_2203)
}