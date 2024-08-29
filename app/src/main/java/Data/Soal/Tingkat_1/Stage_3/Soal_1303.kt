package Data.Soal.Tingkat_1.Stage_3

import Object.HalamanSoal
import Object.Soal_13
import androidx.compose.runtime.Composable

@Composable
fun Soal_1302() {

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

    // Tingkat 1 Level 3 Soal 2

    arr_soal += "رَدُّ"
    arr_soal += "فَهُوَ"
    arr_soal += "مِنْهُ"
    arr_soal += "لَيْسَ"
    arr_soal += "مَا"
    arr_soal += "هذا"
    arr_soal += "أَمْرِنَا"
    arr_soal += "فِي" // Yang ini (19 - 21)
    arr_soal += "أَحْدَثَ"
    arr_soal += "مَنْ"
    arr_soal += "و سلم :"
    arr_soal += "عليه"
    arr_soal += "الله"
    arr_soal += "صلى"
    arr_soal += "اللهِ"
    arr_soal += "رَسُولُ"
    arr_soal += "قَالَ"
    arr_soal += "قَالَتْ :"
    arr_soal += "عنها"
    arr_soal += "الله"
    arr_soal += "رضي"
    arr_soal += "عَائِشَةَ"
    arr_soal += "اللهِ"
    arr_soal += "عَبْدِ"
    arr_soal += "أُمِّ"
    arr_soal += "المُؤْمِنِيْنَ"
    arr_soal += "عَنْ أُمِّ"

    for (i in 0 .. 3) {
        arr_lokasi += Triple(19, i, 1)
        iterasi++
    }

    for (i in 0 .. 9) {
        arr_lokasi += Triple(20, i, 1)
        iterasi++
    }

    for (i in 0 .. 3) {
        arr_lokasi += Triple(21, i, 1)
        iterasi++
    }

    pertanyaan = "Kata yang diberikan tanda di atas merupakan fungsi ..."

    opsi_1 = "S2"
    opsi_2 = "P2"
    opsi_3 = "O"
    opsi_4 = "K"

    opsi_benar = "K"

    rute_berikutnya = "Soal1_3_2"
    soal_ke = "2/5"

    val soal_1302 : HalamanSoal = HalamanSoal("Soal 3 - 2", 2, arr_soal.reversedArray(), arr_lokasi, pertanyaan, opsi_1, opsi_2, opsi_3, opsi_4, opsi_benar, rute_berikutnya, soal_ke)
    Soal_13.add(soal_1302)
}