package Data.Dongeng

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

    for (i in 0..9){
        Array_logat += Quadruple(4,i,2,"P")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(5,i,3,"O")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(7,i,4,"K")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(8,i,4,"K")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(9,i,2,"P2")
        iterasi++
    }
    for (i in 7..8){
        Array_logat += Quadruple(9,i,1,"S2")
        iterasi++
    }
    for (i in 8..10){
        Array_logat += Quadruple(9,i,3,"O")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(10,i,1,"S2")
        iterasi++
    }
    for (i in 0..3){
        Array_logat += Quadruple(14,i,4,"K")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(15,i,4,"K")
        iterasi++
    }
    for (i in 0..11){
        Array_logat += Quadruple(16,i,2,"P2")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(17,i,4,"K")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(18,i,3,"O")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(20,i,2,"P2")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(21,i,1,"S2")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(22,i,4,"K")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(23,i,4,"K")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(24,i,2,"P2")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(25,i,1,"S2")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(26,i,4,"K")
        iterasi++
    }
    for (i in 0..11){
        Array_logat += Quadruple(27,i,4,"K")
        iterasi++
    }
    for (i in 0..13){
        Array_logat += Quadruple(28,i,4,"K")
        iterasi++
    }
    for (i in 0..13){
        Array_logat += Quadruple(33,i,3,"O")
        iterasi++
    }
    for (i in 0..16){
        Array_logat += Quadruple(35,i,4,"K")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(36,i,2,"P2")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(37,i,3,"O")
        iterasi++
    }
    for (i in 0..12){
        Array_logat += Quadruple(38,i,3,"O")
        iterasi++
    }
    for (i in 0..13){
        Array_logat += Quadruple(39,i,3,"O")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(40,i,3,"O")
        iterasi++
    }
    for (i in 0..12){
        Array_logat += Quadruple(41,i,3,"O")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(42,i,2,"P2")
        iterasi++
    }
    for (i in 0..11){
        Array_logat += Quadruple(43,i,1,"S2")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(44,i,1,"S2")
        iterasi++
    }
    for (i in 3..7){
        Array_logat += Quadruple(44,i,2,"P2")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(45,i,1,"S2")
        iterasi++
    }
    for (i in 3..14){
        Array_logat += Quadruple(45,i,2,"P2")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(47,i,4,"K")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(48,i,4,"K")
        iterasi++
    }
    for (i in 0..12){
        Array_logat += Quadruple(49,i,4,"K")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(50,i,2,"P2")
        iterasi++
    }
    for (i in 0..15){
        Array_logat += Quadruple(51,i,1,"S2")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(52,i,3,"O")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(53,i,3,"O")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(54,i,3,"O")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(55,i,3,"O")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(56,i,3,"O")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(59,i,4,"K")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(60,i,4,"K")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(61,i,2,"P2")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(62,i,1,"S2")
        iterasi++
    }
    for (i in 0..12){
        Array_logat += Quadruple(63,i,1,"S2")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(64,i,4,"K")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(65,i,4,"K")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(66,i,2,"P2")
        iterasi++
    }
    for (i in 0..11){
        Array_logat += Quadruple(67,i,1,"S2")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(69,i,1,"S1")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(70,i,2,"P1")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(71,i,2,"P1")
        iterasi++
    }
    for (i in 0..3){
        Array_logat += Quadruple(73,i,2,"P2")
        iterasi++
    }
    for (i in 4..6){
        Array_logat += Quadruple(73,i,1,"S2")
        iterasi++
    }
    for (i in 0..20){
        Array_logat += Quadruple(74,i,4,"K")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(77,i,1,"S2")
        iterasi++
    }
    for (i in 3..11){
        Array_logat += Quadruple(77,i,2,"P2")
        iterasi++
    }

    Array_logat_B += Pair(0,"V1")
    Array_logat_B += Pair(1,"N")
    Array_logat_B += Pair(2,"Fn")
    Array_logat_B += Pair(4,"Pn")
    Array_logat_B += Pair(4,"Vnl")
    Array_logat_B += Pair(5,"N")
    Array_logat_B += Pair(7,"Ft")
    Array_logat_B += Pair(9,"V1")
    Array_logat_B += Pair(10,"Fi")
    Array_logat_B += Pair(13,"Vnl")
    Array_logat_B += Pair(14,"Fp")
    Array_logat_B += Pair(16,"Vnl")
    Array_logat_B += Pair(17,"Pp")
    Array_logat_B += Pair(18,"N")
    Array_logat_B += Pair(20,"V1")
    Array_logat_B += Pair(21,"Fi")
    Array_logat_B += Pair(22,"Ft")
    Array_logat_B += Pair(24,"V1")
    Array_logat_B += Pair(25,"N")
    Array_logat_B += Pair(26,"Fp")
    Array_logat_B += Pair(28,"Fpi")
    Array_logat_B += Pair(29,"Ko")
    Array_logat_B += Pair(31,"N")
    Array_logat_B += Pair(32,"Vnl")
    Array_logat_B += Pair(33,"N")
    Array_logat_B += Pair(35,"Fp")
    Array_logat_B += Pair(36,"V1")
    Array_logat_B += Pair(37,"Fi")
    Array_logat_B += Pair(40,"Ko")
    Array_logat_B += Pair(42,"V1")
    Array_logat_B += Pair(43,"N")
    Array_logat_B += Pair(44,"Vnl")
    Array_logat_B += Pair(45,"Vnl")
    Array_logat_B += Pair(47,"F1")
    Array_logat_B += Pair(48,"Fi")
    Array_logat_B += Pair(51,"N")
    Array_logat_B += Pair(52,"Fp")
    Array_logat_B += Pair(54,"Ko")
    Array_logat_B += Pair(55,"Fi")
    Array_logat_B += Pair(59,"Ft")
    Array_logat_B += Pair(61,"V1")
    Array_logat_B += Pair(62,"Fi")
    Array_logat_B += Pair(64,"F1")
    Array_logat_B += Pair(66,"V1")
    Array_logat_B += Pair(67,"N")
    Array_logat_B += Pair(70,"Fi")
    Array_logat_B += Pair(73,"V1")
    Array_logat_B += Pair(74,"Fp")
    Array_logat_B += Pair(77,"Vnl")
    Array_logat_B += Pair(78,"Fp")
    Array_logat_B += Pair(81,"Fn")

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