package Data.Soal.Tingkat_1.Stage_1

import Object.HalamanSoal
import Object.Soal_11
import androidx.compose.runtime.Composable

@Composable
fun Soal_1104() {

    var judul : String = ""
    var jenis_soal : Int = 0
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

    fun init_arabic(){
        for (i in arr_soal.indices) {
            arr_soal[i] = arr_soal[i] + " "
        }
    }

    // Tingkat 1 Level 1 Soal 4

    arr_soal += "رَوَاهُ البُخَارِيُّ وَمُسْلِمٌ."
    arr_soal += "تَعَالىَ"
    arr_soal += "اللهِ"
    arr_soal += "عَلَى"
    arr_soal += "وَحِسَابُهُمْ"
    arr_soal += "الإِسْلاَمِ"
    arr_soal += "بِحَقِّ"
    arr_soal += "إِلاَّ"
    arr_soal += "وَأَمْوَالَـهُمْ"
    arr_soal += "دِمَاءَهُمْ"
    arr_soal += "مِنِّي"
    arr_soal += "عَصَمُوا"
    arr_soal += "ذَلِكَ"
    arr_soal += "فَعَلُوا"
    arr_soal += "فَإِذَا"
    arr_soal += "الزَّكاَةَ،"
    arr_soal += "وَيُؤْتُوا"
    arr_soal += "الصَّلاَةَ"
    arr_soal += "وَيُقِيْمُوا"
    arr_soal += "اللهِ،"
    arr_soal += "رَسُوْلُ"
    arr_soal += "مُحَمَّداً"
    arr_soal += "وَأَنَّ"
    arr_soal += "اللهُ"
    arr_soal += "إِلاَّ"
    arr_soal += "إِلَهَ"
    arr_soal += "لاَ"
    arr_soal += "أَنْ"
    arr_soal += "يَشْهَدُوا"
    arr_soal += "حَتَّى"
    arr_soal += "النَّاسَ"
    arr_soal += "أُقَاتِلَ"
    arr_soal += "أَنْ"
    arr_soal += "أُمِرْتُ" // Yang ini (14)
    arr_soal += "قَالَ :"
    arr_soal += "وَسَلَّمَ"
    arr_soal += "عَلَيْهِ"
    arr_soal += "اللهُ"
    arr_soal += "صَلَّى"
    arr_soal += "اللهِ"
    arr_soal += "رَسُوْلَ"
    arr_soal += "أَنَّ"
    arr_soal += "عَنْهُمَا"
    arr_soal += "اللهُ"
    arr_soal += "رَضِيَ"
    arr_soal += "عُمَرَ"
    arr_soal += "ابْنِ"
    arr_soal += "عَنْ"

    for (i in 6 .. 7) {
        arr_lokasi += Triple(14, i, 1)
        iterasi++
    }

    var uniqueFirstElements = arr_lokasi.map { it.first }.toSet()
    var resultArray = uniqueFirstElements.map { uniqueElement ->
        val index = arr_lokasi.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    pertanyaan = "Kata yang diberikan tanda di atas merupakan fungsi ..."

    opsi_1 = "S1"
    opsi_2 = "S2"
    opsi_3 = "P1"
    opsi_4 = "P2"

    opsi_benar = "S2"

    rute_berikutnya = "Soal1_1_4"
    soal_ke = "4/10"

    val soal_1104 : HalamanSoal = HalamanSoal("Soal 1 - 4", 1, arr_soal.reversedArray(), arr_lokasi, pertanyaan, opsi_1, opsi_2, opsi_3, opsi_4, opsi_benar, rute_berikutnya, soal_ke)
    Soal_11.add(soal_1104)
}