package Data.Soal.Tingkat_1.Stage_2

import Object.HalamanSoal
import Object.Soal_12
import androidx.compose.runtime.Composable

@Composable
fun Soal_1205() {

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

    // Tingkat 1 Level 2 Soal 5

    arr_soal += "رَوَاهُ البُخَارِيُّ وَمُسْلِمٌ"
    arr_soal += "رَمَضَانَ ”"
    arr_soal += "وَصَوْمِ"
    arr_soal += "الْبَيْتِ"
    arr_soal += "وَحَجِّ"
    arr_soal += "الزَّكَاةِ"
    arr_soal += "وَإِيْتَاءِ"
    arr_soal += "الصَّلاَةِ"
    arr_soal += "وَإِقَامِ"
    arr_soal += "اللهِ"
    arr_soal += "رَسُوْلُ"
    arr_soal += "مُحَمَّداً"
    arr_soal += "وَأَنَّ"
    arr_soal += "اللهُ"
    arr_soal += "إِلاَّ"
    arr_soal += "لاَ إِلَهَ"
    arr_soal += "أَنْ"
    arr_soal += "شَهَادَةِ"
    arr_soal += "خَمْسٍ :"
    arr_soal += "عَلَى"
    arr_soal += "اْلإِسْلاَمُ"
    arr_soal += "بُنِيَ"
    arr_soal += "يَقُوْلُ :"
    arr_soal += "وَسَلَّمَ"
    arr_soal += "عَلَيْهِ"
    arr_soal += "اللهُ"
    arr_soal += "صَلَّى"
    arr_soal += "اللهِ"
    arr_soal += "رَسُوْلَ" // Yang ini (15 - 20)
    arr_soal += "سَمِعْتُ"
    arr_soal += "قَالَ :"
    arr_soal += "عَنْهُمَا"
    arr_soal += "اللهُ"
    arr_soal += "رَضِيَ"
    arr_soal += "الْخَطَّابِ"
    arr_soal += "بْنِ"
    arr_soal += "عُمَرَ"
    arr_soal += "بْنِ"
    arr_soal += "اللهِ"
    arr_soal += "عَبْدِ"
    arr_soal += "الرَّحْمَنِ"
    arr_soal += "عَبْدِ"
    arr_soal += "أَبِي"
    arr_soal += "عَنْ"

    for (i in 0 .. 8) {
        arr_lokasi += Triple(15, i, 1)
        iterasi++
    }

    for (i in 0 .. 5) {
        arr_lokasi += Triple(16, i, 1)
        iterasi++
    }

    for (i in 0 .. 6) {
        arr_lokasi += Triple(17, i, 1)
        iterasi++
    }

    for (i in 0 .. 5) {
        arr_lokasi += Triple(18, i, 1)
        iterasi++
    }

    for (i in 0 .. 8) {
        arr_lokasi += Triple(19, i, 1)
        iterasi++
    }

    for (i in 0 .. 9) {
        arr_lokasi += Triple(20, i, 1)
        iterasi++
    }

    var uniqueFirstElements = arr_lokasi.map { it.first }.toSet()
    var resultArray = uniqueFirstElements.map { uniqueElement ->
        val index = arr_lokasi.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    pertanyaan = "Kata yang diberikan tanda di atas merupakan fungsi ..."

    opsi_1 = "S2"
    opsi_2 = "P2"
    opsi_3 = "O"
    opsi_4 = "K"

    opsi_benar = "O"

    rute_berikutnya = "FinalSkor"
    soal_ke = "5/5"

    val soal_1205 : HalamanSoal = HalamanSoal("Soal 2 - 4", 2, arr_soal.reversedArray(), arr_lokasi, pertanyaan, opsi_1, opsi_2, opsi_3, opsi_4, opsi_benar, rute_berikutnya, soal_ke)
    Soal_12.add(soal_1205)
}