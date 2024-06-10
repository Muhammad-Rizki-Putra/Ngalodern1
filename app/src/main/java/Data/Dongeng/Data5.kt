package Data.Hadist

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Dongeng
import androidx.compose.runtime.Composable

@Composable
fun Data5_D(){

    var Array_arab = arrayOf<String>()
    var Array_indo = arrayOf<String>()
    var Array_logat = arrayOf<Quadruple<Int, Int, Int, String>>()
    var ArtiFull: String = ""
    var Penjelasan: String = ""
    var Array_logat_B = arrayOf<Pair<Int, String>>()
    var Array_Duplicate = arrayOf<Pair<Int, Int>>()
    var iterasi: Int = 0

    fun init_arabic(){
        for (i in Array_arab.indices) {
            Array_arab[i] = Array_arab[i] + " "
        }
    }

    //    Dongeng 5
    Array_arab += "السَّاقِطِ"
    Array_arab += "اللَّيْمُونِ"
    Array_arab += "هَذَا"
    Array_arab += "الْتِقَاطِ"
    Array_arab += "مِنْ"
    Array_arab += "أَتَمَكَّنُ"
    Array_arab += "سَوْفَ"
    Array_arab += "رُبَّمَا"
    Array_arab += "عَلى قَيْدِ الحَيَاةِ"
    Array_arab += "زِلْتُ"
    Array_arab += "لَوْ"
    Array_arab += "الْقَبْرِ"
    Array_arab += "دَاخِلُ"
    Array_arab += "هُوَ"
    Array_arab += "وَ"
    Array_arab += "كَابَايَانْ"
    Array_arab += "فَقَالَ"
    Array_arab += "قَبْرِهِ"
    Array_arab += "فَوْقَ"
    Array_arab += "اللَّيْمُونِ"
    Array_arab += "ثِمَارُ"
    Array_arab += "سَقَطَتْ"
    Array_arab += "الدَّفْنِ"
    Array_arab += "بَعْدَ"
    Array_arab += "وَ"
    Array_arab += "فِيهَا"
    Array_arab += "نَفْسِهِ"
    Array_arab += "دَفْنِ"
    Array_arab += "وَ"
    Array_arab += "الْأَرْضِ"
    Array_arab += "بِحَفْرِ"
    Array_arab += "سِي كَابَايَانْ"
    Array_arab += "فَقَامَ"
    Array_arab += "اللَّيْمُونِ"
    Array_arab += "شَجَرَةِ"
    Array_arab += "تَحْتَ"
    Array_arab += "هُنَا"
    Array_arab += "أَنْ أَنْتَحِرَ"
    Array_arab += "أُرِيدُ"
    Array_arab += "كَابَايَانْ"
    Array_arab += "قَالَ"
    Array_arab += "النَّاضِجَةِ"
    Array_arab += "وَ"
    Array_arab += "الْمُثْمِرَةِ"
    Array_arab += "اللَّيْمُونِ"
    Array_arab += "شَجَرَةَ"
    Array_arab += "لَقِيَ"
    Array_arab += "بِالْمُصَادَقَةِ"
    Array_arab += "وَ"
    Array_arab += "الِانْتِحَارَ"
    Array_arab += "يَعْتَزِمُ"
    Array_arab += "سِي كَابَايَانْ"
    Array_arab += "كَانَ"
    Array_arab += "حَتَّى"
    Array_arab += "لِكَسَلَانِهِ"
    Array_arab += "الزَّوْجَةِ"
    Array_arab += "مِنْ"
    Array_arab += "الْوَبْخُ"
    Array_arab += "تَكَرَّرَ"
    Array_arab += "يَوْمٍ"
    Array_arab += "كُلَّ"
    Array_arab += "زَوْجَتُهُ"
    Array_arab += "حَسَمَتْ"
    Array_arab += "هَكَذَا"
    Array_arab += "الْأَكْلَ"
    Array_arab += "مِنِّى"
    Array_arab += "لَا تَطْلُبْ"
    Array_arab += "الْعَمَلِ"
    Array_arab += "فِي"
    Array_arab += "لَا تَرْغَبُ"
    Array_arab += "كُنْتَ"
    Array_arab += "إِذَا"
    Array_arab += "زَوْجَتُهُ"
    Array_arab += "وَبَخَتْهُ"
    Array_arab += "يَوْمٍ"
    Array_arab += "كُلُّ"
    Array_arab += "وَلِذَلِكَ"
    Array_arab += "الْعَمَلَ"
    Array_arab += "لَا يُرِيدُ"
    Array_arab += "كَسْلَانًا"
    Array_arab += "رَجُلًا"
    Array_arab += "سِي كَابَايَانْ"
    Array_arab += "كَانَ"
    init_arabic()

    Array_indo += "Yang jatuh"
    Array_indo += "limus"
    Array_indo += "ini"
    Array_indo += "memungut"
    Array_indo += "dari"
    Array_indo += "Saya bisa"
    Array_indo += "akan"
    Array_indo += "mungkin"
    Array_indo += "Masih hidup"
    Array_indo += "Aku tetap"
    Array_indo += "andaikata"
    Array_indo += "kubur"
    Array_indo += "Di dalam"
    Array_indo += "Dia itu"
    Array_indo += "dan"
    Array_indo += "kabayan"
    Array_indo += "Maka berkata"
    Array_indo += "Kuburannya"
    Array_indo += "Di atas"
    Array_indo += "Limus"
    Array_indo += "Buah"
    Array_indo += "Jatuhlah"
    Array_indo += "Mengubur diri"
    Array_indo += "Setelah"
    Array_indo += "dan"
    Array_indo += "Pada (tanah)nya"
    Array_indo += "dirinya"
    Array_indo += "mengubur"
    Array_indo += "dan"
    Array_indo += "tanah"
    Array_indo += "menggali"
    Array_indo += "Si kabayan"
    Array_indo += "Maka mulai"
    Array_indo += "Limus"
    Array_indo += "Pohon"
    Array_indo += "Di bawah"
    Array_indo += "Di sini"
    Array_indo += "Bunuh diri"
    Array_indo += "Aku ingin"
    Array_indo += "kabayan"
    Array_indo += "berkata"
    Array_indo += "Cukup masak"
    Array_indo += "dan"
    Array_indo += "Yang lebat"
    Array_indo += "Limus"
    Array_indo += "Pohon"
    Array_indo += "Ada (bertemu)"
    Array_indo += "kebetulan"
    Array_indo += "dan"
    Array_indo += "Bunuh diri"
    Array_indo += "bermaksud"
    Array_indo += "Si kabayan"
    Array_indo += "keadaan"
    Array_indo += "sehingga"
    Array_indo += "Karena kemalasannya"
    Array_indo += "istrinya"
    Array_indo += "dari"
    Array_indo += "teguran"
    Array_indo += "Terulang"
    Array_indo += "Hari"
    Array_indo += "Setiap"
    Array_indo += "Istrinya"
    Array_indo += "Memutuskan (tegas)"
    Array_indo += "demikian"
    Array_indo += "Makan"
    Array_indo += "Dariku"
    Array_indo += "Jangan meminta"
    Array_indo += "Bekerja"
    Array_indo += "dalam"
    Array_indo += "Tidak mau"
    Array_indo += "Keadaanmu"
    Array_indo += "Jika"
    Array_indo += "Istrinya"
    Array_indo += "Memarahinya"
    Array_indo += "Hari"
    Array_indo += "Setiap"
    Array_indo += "Karenanya"
    Array_indo += "Bekerja"
    Array_indo += "(ia) tidak mau"
    Array_indo += "Yang malas"
    Array_indo += "Seorang laki-laki"
    Array_indo += "Si Kabayan"
    Array_indo += "Adalah"

    ArtiFull = "SI KABAYAN orang malas, tak mau bekerja. Karenanya, tiap hari ia dimarahi istrinya.\n" +
            "“Jangan ingin makan kalau kamu tidak mau bekerja!” Tegas istrinya.\n" +
            "Karena terus dimarahi, si Kabayan bermaksud bunuh diri. Kebetulan ada pohon limus (sejenis buah mangga) yang sedang berbuah lebat dan cukup masak.\n" +
            "“Ah, bunuh dirinya di sini saja,” ujarnya.\n" +
            "Si Kabayan kemudian menggali tanah dan mengubur diri. Tak lama kemudian jatuhlah buah limau mengenai badannya.\n" +
            "Wah, andaikata saya masih hidup, mungkin saya bisa memungut buah-buah limus ini.\n"

    var uniqueFirstElements5 = Array_logat.map { it.first }.toSet()
    var resultArray5 = uniqueFirstElements5.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val dongeng5: HalamanBelajar = HalamanBelajar("سي كابايان تُرِيدُ اللّيْمُوْنَ", "5. Sikabayan Ingin Buah Limau", resultArray5 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Dongeng.add(dongeng5)
}