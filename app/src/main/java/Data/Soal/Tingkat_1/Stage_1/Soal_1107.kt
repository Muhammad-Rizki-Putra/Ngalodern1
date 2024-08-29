package Data.SoalLatihan

import Object.HalamanSoal
import Object.Soal
import androidx.compose.runtime.Composable

@Composable
fun Data1_1_7S() {

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

    // Tingkat 1 Level 1 Soal 7

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
    arr_soal += "وَأَنَّ" // Yang ini
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
    arr_soal += "أُمِرْتُ"
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

    for (i in 0 .. 2) {
        arr_lokasi += Triple(25, i, 1)
        iterasi++
    }

    var uniqueFirstElements = arr_lokasi.map { it.first }.toSet()
    var resultArray = uniqueFirstElements.map { uniqueElement ->
        val index = arr_lokasi.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    pertanyaan = "Kata yang diberikan tanda di atas merupakan fungsi ..."

    opsi_1 = "Ko"
    opsi_2 = "Pp"
    opsi_3 = "N2"
    opsi_4 = "Vl"

    opsi_benar = "Ko"

    rute_berikutnya = "Soal1_1_7"
    soal_ke = "7/10"

    val soal1_1_7 : HalamanSoal = HalamanSoal("Soal 1 - 7", 1, arr_soal.reversedArray(), arr_lokasi, pertanyaan, opsi_1, opsi_2, opsi_3, opsi_4, opsi_benar, rute_berikutnya, soal_ke)
    Soal.add(soal1_1_7)
}