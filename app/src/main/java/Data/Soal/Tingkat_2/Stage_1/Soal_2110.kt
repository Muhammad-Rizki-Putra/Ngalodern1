package Data.Soal.Tingkat_2.Stage_1

import Object.HalamanSoal
import Object.Soal_13
import Object.Soal_21
import androidx.compose.runtime.Composable

@Composable
fun Soal_2110() {

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

    // Tingkat 2 Level 1 Soal 10

    arr_soal += "A.     كَانَ لِلملكِ ابنانِ. الإبنُ الأكبرِ اسمَهُ رادن بانجلوراه"

    arr_soal += "B.     كَانَ لِلْملكِ ابنانِ. الإِبْنُ الأكبَرُ اسْمُهُ رادن بانجلوراه"

    arr_soal += "C.     كَانَ لِلملكِ ابنانٌ. الإِبْنُ الأَكْبَرُ اسمُهُ رادن بانجلوراه"

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

    pertanyaan = " كان للملك ابنان. الإبن الأكبر اسمه رادن بانجلوراه ..."

    opsi_1 = "A"
    opsi_2 = "B"
    opsi_3 = "C"

    opsi_benar = "B"

    rute_berikutnya = "FinalSkor"
    soal_ke = "10/10"

    val soal_2110 : HalamanSoal = HalamanSoal("Soal 1 - 10", 3, arr_soal, arr_lokasi, pertanyaan, opsi_1, opsi_2, opsi_3, opsi_4, opsi_benar, rute_berikutnya, soal_ke)
    Soal_21.add(soal_2110)
}