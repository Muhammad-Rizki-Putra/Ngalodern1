package Data

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Hadist
import androidx.compose.runtime.Composable
var Hadist: List<HalamanBelajar> = listOf()

@Composable
fun Data5(){

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

    //hadist 5
    Array_arab += "رَدٌّ"
    Array_arab += "فَهُوَ"
    Array_arab += "أَمْرُنَا"
    Array_arab += "عَلَيْهِ"
    Array_arab += "لَيْسَ"
    Array_arab += "عَمَلاً"
    Array_arab += "عَمِلَ"
    Array_arab += "مَنْ"
    Array_arab += "لمسلم"
    Array_arab += "رواية"
    Array_arab += "في"
    Array_arab += "و"
    Array_arab += "مسلم"
    Array_arab += "و"
    Array_arab += "البخاري"
    Array_arab += "رواه"
    Array_arab += "رَدٌّ"
    Array_arab += "فَهُوَ"
    Array_arab += "مِنْهُ"
    Array_arab += "لَيْسَ"
    Array_arab += "مَا"
    Array_arab += "هَذَا"
    Array_arab += "أَمْرِنَا"
    Array_arab += "فِي"
    Array_arab += "أَحْدَثَ"
    Array_arab += "مَنْ"
    Array_arab += "صلى الله عليه وسلم"
    Array_arab += "رَسُوْلُ الله"
    Array_arab += "قَالَ"
    Array_arab += "قَالَتْ"
    Array_arab += "عَنْهَا"
    Array_arab += "اللهُ"
    Array_arab += "رَضِيَ"
    Array_arab += "عَائِشَةَ"
    Array_arab += "أُمِّ عَبْدِ اللهِ"
    Array_arab += "أُمِّ الْمُؤْمِنِيْنَ"
    Array_arab += "عَنْ"
    init_arabic()

    Array_indo += "tetolak"
    Array_indo += "maka dia"
    Array_indo += "Perintah kami"
    Array_indo += "Atasnya (amalan)"
    Array_indo += "Yang tidak"
    Array_indo += "amalan"
    Array_indo += "mengerjakan"
    Array_indo += "Barangsiapa"
    Array_indo += "Muslim"
    Array_indo += "riwayat"
    Array_indo += "dalam"
    Array_indo += "dan"
    Array_indo += "Muslim"
    Array_indo += "dan"
    Array_indo += "Oleh Bukhari"
    Array_indo += "Diriwayatkan ia (hadist ini)"
    Array_indo += "tertolak"
    Array_indo += "maka"
    Array_indo += "darinya"
    Array_indo += "yang bukan"
    Array_indo += "yang tidak"
    Array_indo += "ini"
    Array_indo += "urusan kami (agama)"
    Array_indo += "dalam"
    Array_indo += "mengada-ada"
    Array_indo += "Barangsiapa"
    Array_indo += "semoga Allah melimpahkan solwat dan salam (pada Muhammad)"
    Array_indo += "Rasulullah"
    Array_indo += "Telah bersabda"
    Array_indo += "Dia (Aisyah) telah berkata"
    Array_indo += "kepadanya"
    Array_indo += "Allah"
    Array_indo += "meridhai"
    Array_indo += "Aisyah"
    Array_indo += "Ibu hamba Allah"
    Array_indo += "Ibu kaum mukmin"
    Array_indo += "Dari"

    for (i in 0..5){
        Array_logat += Quadruple(4,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(5,i,1,"S2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(7,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(8,i,2,"P2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(9,i,1,"S2")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(11,i,1,"S1")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(12,i,1,"P1")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(13,i,4,"K")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(14,i,4,"K")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(15,i,4,"K")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(16,i,3,"O")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(17,i,3,"O")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(18,i,3,"O")
        iterasi++
    }

    for (i in 1..6){
        Array_logat += Quadruple(19,i,1,"S1")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(20,i,2,"P1")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(29,i,1,"S1")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(30,i,2,"P1")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(31,i,3,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(32,i,2,"P2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(34,i,1,"S1")
        iterasi++
    }

    for (i in 1..6){
        Array_logat += Quadruple(35,i,1,"S1")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(36,i,2,"P1")
        iterasi++
    }
    ArtiFull = "Dari Ummul Mu’minin; Ummu Abdillah; ‘Aisyah Radhiyallahu ‘Anha dia berkata: Rasulullah Shallallahu ’Alaihi wa Sallam bersabda: “Siapa yang mengada-ada dalam urusan (agama) kami ini yang bukan bagian darinya, maka dia tertolak.” (Riwayat Bukhari dan Muslim), dalam riwayat Muslim disebutkan: “Siapa yang melakukan suatu amalan yang tidak ada contohnya dari kami, maka dia tertolak.”"
    Penjelasan = "Penjelasan hadist:\n" +
            "Larangan mengada-ada ibadah atau melakukan ibadah yang tidak ada dalilnya dari al-Quran dan Sunnah atau yang disebut denyan bid’ah\n" +
            "Islam merupakan agama dalail, dimana semua ibadah telah ditentukan hukum-hukumnya\n" +
            "Tidak ada satupun ketaatan kecuali telah Rasulullah contohkan atau perintahkan\n" +
            "Tidak ada satupun kemaksiatan kecuali Rasulullah telah memberikan peringatan\n" +
            "Syarat diterima ibadah ada 2, yaitu ikhlas—menjadikan Allah sebagai satu-satunya tujuan dalam ibadah, dan ittiba—mengikuti contoh yang telah Rasulullah jelaskan.\n"

    var uniqueFirstElements5 = Array_logat.map { it.first }.toSet()
    var resultArray5 = uniqueFirstElements5.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    Array_logat_B += Pair(0,"Pp")
    Array_logat_B += Pair(1,"N1")
    Array_logat_B += Pair(1,"N")
    Array_logat_B += Pair(2,"N1")
    Array_logat_B += Pair(4,"V1")
    Array_logat_B += Pair(6,"Pp")
    Array_logat_B += Pair(7,"V1")
    Array_logat_B += Pair(9,"N1")
    Array_logat_B += Pair(12,"V1")
    Array_logat_B += Pair(13,"Pp")
    Array_logat_B += Pair(14,"N1")
    Array_logat_B += Pair(17,"V1")
    Array_logat_B += Pair(18,"Pp")
    Array_logat_B += Pair(19,"Ko")
    Array_logat_B += Pair(30,"V1")
    Array_logat_B += Pair(31,"Nt")
    Array_logat_B += Pair(32,"V1")
    Array_logat_B += Pair(33,"Pp")


    val hadist5 = HalamanBelajar("Hadist Arbain No. 5","(Larangan Bid’ah) Faiha" , resultArray5 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Hadist.add(hadist5)
}