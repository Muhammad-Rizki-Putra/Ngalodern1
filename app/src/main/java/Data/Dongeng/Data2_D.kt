package Data.Dongeng

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Dongeng
import androidx.compose.runtime.Composable

@Composable
fun Data2_D(){

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

    //    Dongeng 2
    Array_arab += "أَنْدَارْ ، أَنْدَارْ"
    Array_arab += "عَنْ الطَّعَامِ"
    Array_arab += "لِلْبَحْثِ"
    Array_arab += "لِلْمُهَاجِرِينَ"
    Array_arab += "مَقْصِدًا"
    Array_arab += "صَارَ"
    Array_arab += "الْمَكَانَ"
    Array_arab += "هَذَا"
    Array_arab += "أَنَّ"
    Array_arab += "الِاسْمَ"
    Array_arab += "هَذَا"
    Array_arab += "يَعْنِي"
    Array_arab += "وَ"
    Array_arab += "بَاتْجَانْدَارَانْ"
    Array_arab += "إلَى"
    Array_arab += "الْمَكَانِ"
    Array_arab += "هَذَا"
    Array_arab += "اسْمُ"
    Array_arab += "تَحَوَّلَ"
    Array_arab += "عَلَى مَرِّ الزَّمَانِ"
    Array_arab += "وَأَخِيرًا"
    Array_arab += "الْعَيْشِ"
    Array_arab += "لُقْمَةِ"
    Array_arab += "أَجْلِ"
    Array_arab += "مِنْ"
    Array_arab += "مِنْطَقَةٍ"
    Array_arab += "خَارِجِ"
    Array_arab += "مِنْ"
    Array_arab += "يَأْتُونَ"
    Array_arab += "الَّذِينَ"
    Array_arab += "لِلنَّاسِ"
    Array_arab += "مَقْصِدًا"
    Array_arab += "الْمَكَانُ"
    Array_arab += "هَذَا"
    Array_arab += "أَصْبَحَ"
    Array_arab += "خِصْبٍ"
    Array_arab += "وَ"
    Array_arab += "آمْنٍ"
    Array_arab += "إِلَى وَضْعِ"
    Array_arab += "بُوجُونْجْ كَالَالَارْ"
    Array_arab += "بَحْرِ"
    Array_arab += "تَحَوُّلِ"
    Array_arab += "بَعْدَ"
    Array_arab += "آمِنًا"
    Array_arab += "الْمَكَانُ"
    Array_arab += "هَذَا"
    Array_arab += "يُصْبِحَ"
    Array_arab += "حَتَّى"
    Array_arab += "الْيَابَانِيِّ"
    Array_arab += "وَ"
    Array_arab += "الْهُولَنْدِيِّ"
    Array_arab += "الِاحْتِلَالِ"
    Array_arab += "عَصْرُ"
    Array_arab += "هُوَ"
    Array_arab += "وَ"
    Array_arab += "الِاحْتِلَالِ"
    Array_arab += "فَتْرَةَ"
    Array_arab += "الِاسْتِعْمَارِيَّةُ"
    Array_arab += "الْقُوَّةُ"
    Array_arab += "اسْتَخْدَمَتْهُ"
    Array_arab += "الَّذِي"
    Array_arab += "الْمَكَانُ"
    Array_arab += "أَنَّهُ"
    Array_arab += "بِمَعْنَى"
    Array_arab += "بُوجُونْجْ کالَالَارْ"
    Array_arab += "بَانْجَانْدَارَانْ"
    Array_arab += "بَحْرِ"
    Array_arab += "اسْمُ"
    Array_arab += "كَانَ"
    Array_arab += "الِبِدَايَةِ"
    Array_arab += "فِي"
    init_arabic()

    Array_indo += "Andar-andar"
    Array_indo += "Makanan"
    Array_indo += "Untuk mencari"
    Array_indo += "Bagi para pendatang"
    Array_indo += "Maksudnya"
    Array_indo += "Jadi"
    Array_indo += "Tempat"
    Array_indo += "Ini"
    Array_indo += "Bahwasanya"
    Array_indo += "Nama"
    Array_indo += "Ini"
    Array_indo += "Mempunyai arti"
    Array_indo += "dan"
    Array_indo += "Pangandaran"
    Array_indo += "Ke"
    Array_indo += "Tempat"
    Array_indo += "Ini"
    Array_indo += "Nama"
    Array_indo += "Berubah"
    Array_indo += "Lama kelamaan"
    Array_indo += "Akhirnya"
    Array_indo += "Hidup"
    Array_indo += "Untuk"
    Array_indo += "Alasan"
    Array_indo += "Dari"
    Array_indo += "Daerah"
    Array_indo += "Luar"
    Array_indo += "Dari"
    Array_indo += "(mereka) datang"
    Array_indo += "Yang"
    Array_indo += "Bagi banyak orang"
    Array_indo += "Tujuan"
    Array_indo += "Tempat"
    Array_indo += "Ini"
    Array_indo += "Menjadi"
    Array_indo += "Subur"
    Array_indo += "dan"
    Array_indo += "Aman"
    Array_indo += "Tempat"
    Array_indo += "Bojong Kalalar"
    Array_indo += "Laut"
    Array_indo += "Berubah"
    Array_indo += "Setelah"
    Array_indo += "Aman"
    Array_indo += "Tempat"
    Array_indo += "Ini"
    Array_indo += "Menjadi"
    Array_indo += "Sampai"
    Array_indo += "Jepang"
    Array_indo += "Dan"
    Array_indo += "Belanda"
    Array_indo += "Penjajahan"
    Array_indo += "Zaman"
    Array_indo += "Dia itu"
    Array_indo += "Dan"
    Array_indo += "Penjajahan"
    Array_indo += "Zaman"
    Array_indo += "Yang bersifat kolonial"
    Array_indo += "Kekuatan"
    Array_indo += "Yang mempergunakannya"
    Array_indo += "yang"
    Array_indo += "Tempat"
    Array_indo += "Bahwasannya ia"
    Array_indo += "Yang artinya"
    Array_indo += "Bojong Kalalar"
    Array_indo += "Pangandaran"
    Array_indo += "Laut"
    Array_indo += "Nama"
    Array_indo += "Ada"
    Array_indo += "Mulanya"
    Array_indo += "Pada"

    for (i in 0..12){
        Array_logat += Quadruple(11,i,2,"P2")
        iterasi++
    }

    for (i in 13..15){
        Array_logat += Quadruple(11,i,3,"O")
        iterasi++
    }

    Array_Duplicate += Pair(11, iterasi - 1)

    for (i in 0..10){
        Array_logat += Quadruple(12,i,1,"S2")
        iterasi++
    }

    for (i in 0..20){
        Array_logat += Quadruple(13,i,1,"S2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(14,i,4,"K")
        iterasi++
    }

    for (i in 0..13){
        Array_logat += Quadruple(15,i,4,"K")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(17,i,1,"S1")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(18,i,2,"P1")
        iterasi++
    }

    for (i in 0..13){
        Array_logat += Quadruple(19,i,2,"P1")
        iterasi++
    }

    for (i in 0..15){
        Array_logat += Quadruple(20,i,2,"P1")
        iterasi++
    }

    for (i in 0..12){
        Array_logat += Quadruple(32,i,4,"K")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(33,i,4,"K")
        iterasi++
    }

    for (i in 0..2){
        Array_logat += Quadruple(34,i,4,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(35,i,4,"K")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(52,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(53,i,1,"S2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(54,i,1,"S2")
        iterasi++
    }

    for (i in 0..10 ){
        Array_logat += Quadruple(55,i,1,"S2")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(56,i,4,"K")
        iterasi++
    }

    for (i in 0..18){
        Array_logat += Quadruple(57,i,4,"K")
        iterasi++
    }

    Array_logat_B += Pair(2,"N1")

    ArtiFull = "Pada mulanya, Pangandaran bernama Bojong Kalalar, yang artinya tempat yang hanya untuk dilewati musuh- musuh ketika zaman penjajah, yaitu ketika zaman Belanda dan Jepang, sampai tempat tersebut menjadi aman.\n" +
            "\n" +
            "Setelah maju, aman, serta subur, Bojong Kalalar berubah menjadi tempat mencari makanan sehingga banyak orang datang dari luar daerah. Akhirnya, lama kelamaan tempat itu berubah nama menjadi Pangan-daran, yang mempunyai arti tempat mencari makanan bagi para pendatang (andar-andar).\n" +
            "\n"

    var uniqueFirstElements2 = Array_logat.map { it.first }.toSet()
    var resultArray2 = uniqueFirstElements2.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val dongeng2: HalamanBelajar = HalamanBelajar("بانجانداران", "2. Pangandaran", resultArray2 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Dongeng.add(dongeng2)
}