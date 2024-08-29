package Data.Soal.Tingkat_2.Stage_2

import Object.HalamanSoal
import Object.Soal_22
import androidx.compose.runtime.Composable

@Composable
fun Soal_2209() {

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

    // Tingkat 2 Level 2 Soal 9

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
    arr_soal += "فَوْقَ" // Yang ini (12 - 13)
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

    for (i in 0 .. 5) {
        arr_lokasi += Triple(12, i, 1)
        iterasi++
    }
    for (i in 0 .. 7) {
        arr_lokasi += Triple(13, i, 1)
        iterasi++
    }

    pertanyaan = "Kata yang diberikan tanda di atas merupakan kategori ..."

    opsi_1 = "K"
    opsi_2 = "O"
    opsi_3 = "Fp"
    opsi_4 = "Pp"

    opsi_benar = "K"

    rute_berikutnya = "Soal2_2_9"
    soal_ke = "9/10"

    val soal_2209 : HalamanSoal = HalamanSoal("Soal 2 - 9", 1, arr_soal.reversedArray(), arr_lokasi, pertanyaan, opsi_1, opsi_2, opsi_3, opsi_4, opsi_benar, rute_berikutnya, soal_ke)
    Soal_22.add(soal_2209)
}