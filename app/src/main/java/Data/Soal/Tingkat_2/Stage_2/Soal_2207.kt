package Data.Soal.Tingkat_2.Stage_2

import Object.HalamanSoal
import Object.Soal_22
import androidx.compose.runtime.Composable

@Composable
fun Soal_2206() {

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

    // Tingkat 2 Level 2 Soal 6

    arr_soal += "السَّاقِطِ\"."
    arr_soal += "اللَّيْمُونِ"
    arr_soal += "هَذَا"
    arr_soal += "الْتِقَاطِ"
    arr_soal += "مِنْ"
    arr_soal += "أَتَمَكَّنُ"
    arr_soal += "سَوْفَ"
    arr_soal += "رُبَّمَا"
    arr_soal += "الْحَيَاةِ"
    arr_soal += "قَيْدِ"
    arr_soal += "عَلَى"
    arr_soal += "\"لَوْ زِلْتَ"
    arr_soal += "الْقَبْرِ :"
    arr_soal += "دَاخِلُ"
    arr_soal += "وَهُوَ"
    arr_soal += "كَابَايَانِ"
    arr_soal += "فَقَالَ"
    arr_soal += "قَبْرِهِ."
    arr_soal += "فَوْقَ"
    arr_soal += "اللَّيْمُونِ"
    arr_soal += "ثِمَارُ"
    arr_soal += "سَقَطَتْ"
    arr_soal += "الدَّفْنِ"
    arr_soal += "وَبَعْدَ"
    arr_soal += "فِيهَا."
    arr_soal += "نَفْسِهِ"
    arr_soal += "وَدَفْن"
    arr_soal += "الْأَرْضِ"
    arr_soal += "بِحَفْرِ"
    arr_soal += "كَابَايَانْ"
    arr_soal += "فَقَامَ سِي"

    for (i in 8 .. 10) {
        arr_lokasi += Triple(0, i, 1)
        iterasi++
    }
    for (i in 0 .. 10) {
        arr_lokasi += Triple(1, i, 1)
        iterasi++
    }

    pertanyaan = "Kata yang diberikan tanda di atas merupakan fungsi ..."

    opsi_1 = "P1"
    opsi_2 = "P2"
    opsi_3 = "S1"
    opsi_4 = "S2"

    opsi_benar = "S2"

    rute_berikutnya = "Soal2_2_6"
    soal_ke = "6/10"

    val soal_2206 : HalamanSoal = HalamanSoal("Soal 1 - 6", 1, arr_soal.reversedArray(), arr_lokasi, pertanyaan, opsi_1, opsi_2, opsi_3, opsi_4, opsi_benar, rute_berikutnya, soal_ke)
    Soal_22.add(soal_2206)
}