package Data.Soal.Tingkat_2.Stage_1

import Object.HalamanSoal
import Object.Soal_13
import Object.Soal_21
import androidx.compose.runtime.Composable

@Composable
fun Soal_2104() {

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

    // Tingkat 2 Level 1 Soal 4

    arr_soal += "A.     و, من, إلى, ربّ"

    arr_soal += "B.     عن, رمى, أبى, مال"

    arr_soal += "C.     خان, في, ت, ك"

    arr_soal += "D.     ل, س, سأل, من"

    for (i in 0 .. 2) {
        arr_lokasi += Triple(0, i, 1)
        iterasi++
    }
    for (i in 0 .. 2) {
        arr_lokasi += Triple(1, i, 1)
        iterasi++
    }
    for (i in 0 .. 2) {
        arr_lokasi += Triple(2, i, 1)
        iterasi++
    }
    for (i in 0 .. 2) {
        arr_lokasi += Triple(3, i, 1)
        iterasi++
    }

    pertanyaan = "Manakah di antara pilihan di atas yang termasuk harf ..."

    opsi_1 = "A"
    opsi_2 = "B"
    opsi_3 = "C"
    opsi_4 = "D"

    opsi_benar = "A"

    rute_berikutnya = "Soal2_1_4"
    soal_ke = "4/10"

    val soal_2104 : HalamanSoal = HalamanSoal("Soal 1 - 4", 3, arr_soal, arr_lokasi, pertanyaan, opsi_1, opsi_2, opsi_3, opsi_4, opsi_benar, rute_berikutnya, soal_ke)
    Soal_21.add(soal_2104)
}