package Data.Dongeng

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Dongeng
import androidx.compose.runtime.Composable

@Composable
fun Data4_D(){

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

//    Dongeng 4
    Array_arab += "شَانْدَرَا مَاوَاتْ."
    Array_arab += "الْقَطُّ"
    Array_arab += "يُرَافِقُهَا"
    Array_arab += "الْقَمَرِ"
    Array_arab += "إِلَى"
    Array_arab += "نِينِي أُنْتِيهْ"
    Array_arab += "ذَهَبَتْ"
    Array_arab += "وَأَخِيرَا"
    Array_arab += "رَغْبَتِهَا"
    Array_arab += "رَفْضِ"
    Array_arab += "عَلَى"
    Array_arab += "أَكِى بَالَانْجَانْتِرَانْجْ"
    Array_arab += "الزَّوْجُ"
    Array_arab += "لَنْ يُقَدِّرَ"
    Array_arab += "الْقَمَرِ"
    Array_arab += "فِي"
    Array_arab += "الْقُمَاشَ"
    Array_arab += "تَنْسِجُ"
    Array_arab += "سَوْفَ"
    Array_arab += "أَنَّهُ"
    Array_arab += "أَيْضًا"
    Array_arab += "وَقَالَتْ"
    Array_arab += "أَكِى بَالَانْجَانْتِرَانْجْ"
    Array_arab += "زَوْجِهَا"
    Array_arab += "إِلَى"
    Array_arab += "رَغْبَتَهَا"
    Array_arab += "نِينِي أُنْتِيه"
    Array_arab += "أَبْدَتْ"
    Array_arab += "يهِينُهُ"
    Array_arab += "مَنْ"
    Array_arab += "هُنَاكَ"
    Array_arab += "لَنْ يَكُونَ"
    Array_arab += "وَ"
    Array_arab += "سَاكِنٌ"
    Array_arab += "وَ"
    Array_arab += "مُطْمَئِنٌّ"
    Array_arab += "الْقَمَرِ"
    Array_arab += "فِي"
    Array_arab += "الْعَيْشَ"
    Array_arab += "أَنَّ"
    Array_arab += "تَتَخَيَّلُ"
    Array_arab += "وَكَانَتْ"
    Array_arab += "الْمُنِيرِ"
    Array_arab += "الْقَمَرِ"
    Array_arab += "إِلَى"
    Array_arab += "تَنْظُرُ"
    Array_arab += "نِينِي أَنْتِيهْ"
    Array_arab += "كَانَتْ"
    Array_arab += "الْبَدْرِ"
    Array_arab += "لَيْلَةِ"
    Array_arab += "فِي"
    Array_arab += "وَ"
    Array_arab += "بِوَضْعِهَا"
    Array_arab += "يَهْتَمُّ"
    Array_arab += "مَنْ"
    Array_arab += "هُنَاكَ"
    Array_arab += "لَمْ يَكُنْ"
    Array_arab += "الْجِيرَانُ"
    Array_arab += "مِنْهَا"
    Array_arab += "انْعَزَلَ"
    Array_arab += "حَتَّى"
    Array_arab += "الْبَأْسِ"
    Array_arab += "وَ"
    Array_arab += "فِي غَايَةِ الْفَقْرِ"
    Array_arab += "نِينِي أَنْتِيهْ"
    Array_arab += "حَيَاةُ"
    Array_arab += "كَانَتْ"
    Array_arab += "بِشَانْدِرَا مَاوَاتْ"
    Array_arab += "تَسْمِيَتُهَا"
    Array_arab += "تَمَّ"
    Array_arab += "وَاَلَّتِي"
    Array_arab += "الْمُلَوَّنَةِ"
    Array_arab += "قِطَطِ"
    Array_arab += "ثَلَاثَةَ"
    Array_arab += "يُرَاعَانِ"
    Array_arab += "الزَّوْجَانِ"
    Array_arab += "فَقَامَ"
    Array_arab += "طِفْلٌ"
    Array_arab += "لَدَيْهِمَا"
    Array_arab += "لَيْسَ"
    Array_arab += "أَيْضًا"
    Array_arab += "وَلَكِنْ"
    Array_arab += "أَكِي بَالَانْجَانْتِرَانْجْ"
    Array_arab += "مَعَ"
    Array_arab += "نِينِي"
    Array_arab += "تَزَوَّجَتْ"
    Array_arab += "طَوِيلٍ"
    Array_arab += "زَمَنٍ"
    Array_arab += "مُنْذُ"
    Array_arab += "نِينِي أَّنتيهْ"
    Array_arab += "بِاسْمِ"
    Array_arab += "تُعْرَفُ"
    Array_arab += "امْرَأَةٌ"
    Array_arab += "الْقَدِيمَةِ"
    Array_arab += "الْعُصُورِ"
    Array_arab += "فِي"
    Array_arab += "كَانَتْ"
    init_arabic()

    Array_indo += "Chandra Mawat."
    Array_indo += "Pemotongan"
    Array_indo += "Ditemaninya (oleh Candramawat)"
    Array_indo += "Bulan"
    Array_indo += "Ke"
    Array_indo += "Nini Anteh"
    Array_indo += "Telah pergi"
    Array_indo += "Akhirnya"
    Array_indo += "Keinginannya"
    Array_indo += "Penolakan"
    Array_indo += "Atas"
    Array_indo += "Aki Balangantrang"
    Array_indo += "Suami"
    Array_indo += "Tidak bisa"
    Array_indo += "Bulan"
    Array_indo += "Di"
    Array_indo += "Kain"
    Array_indo += "Menenun"
    Array_indo += "Akan"
    Array_indo += "Bahwasannya"
    Array_indo += "Juga"
    Array_indo += "Dan (ia) berkata"
    Array_indo += "Aki Balangantrang"
    Array_indo += "Suaminya"
    Array_indo += "Kepada"
    Array_indo += "Keinginannya"
    Array_indo += "Nini anteh"
    Array_indo += "Menyampaikan"
    Array_indo += "Menghinanya"
    Array_indo += "Seorang pun"
    Array_indo += "Di sana"
    Array_indo += "Tidaklah keadaan"
    Array_indo += "dan"
    Array_indo += "tentram"
    Array_indo += "dan"
    Array_indo += "tenang"
    Array_indo += "bulan"
    Array_indo += "di"
    Array_indo += "hidup"
    Array_indo += "bahwasannya"
    Array_indo += "(ia) membayangkan"
    Array_indo += "Dan adalah"
    Array_indo += "Yang terang"
    Array_indo += "bulan"
    Array_indo += "ke"
    Array_indo += "memandang"
    Array_indo += "Nini anteh"
    Array_indo += "adalah"
    Array_indo += "Bulan purnama"
    Array_indo += "Suatu malam"
    Array_indo += "Pada"
    Array_indo += "Dan"
    Array_indo += "Terhadap nasibnya"
    Array_indo += "Yang memperhatikan"
    Array_indo += "Seorang pun"
    Array_indo += "Di sana"
    Array_indo += "Tidaklah keadaannya"
    Array_indo += "Para tetangganya"
    Array_indo += "darinnya"
    Array_indo += "menjauhi"
    Array_indo += "sehingga"
    Array_indo += "menderita"
    Array_indo += "Dan"
    Array_indo += "Sangat miskin"
    Array_indo += "Nini anteh"
    Array_indo += "hidup"
    Array_indo += "keadaan"
    Array_indo += "Candramawat"
    Array_indo += "Nama panggilannya"
    Array_indo += "Telah diberi"
    Array_indo += "yang"
    Array_indo += "warna"
    Array_indo += "kucing"
    Array_indo += "tiga"
    Array_indo += "Mereka berdua memelihara"
    Array_indo += "Suami-istri itu"
    Array_indo += "Maka mulailah"
    Array_indo += "anak"
    Array_indo += "Keduanya memiliki"
    Array_indo += "tidak"
    Array_indo += "juga"
    Array_indo += "Akan tetapi"
    Array_indo += "Aki Balangantrang"
    Array_indo += "dengan"
    Array_indo += "nini"
    Array_indo += "menikah"
    Array_indo += "Yang lama"
    Array_indo += "waktu"
    Array_indo += "sejak"
    Array_indo += "Nini Anteh"
    Array_indo += "Dengan nama"
    Array_indo += "Yang dikenal"
    Array_indo += "Seorang perempuan"
    Array_indo += "dahulu"
    Array_indo += "zaman"
    Array_indo += "pada"
    Array_indo += "Tersebutlah"


    for (i in 0..11){
        Array_logat += Quadruple(11,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(12,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..11){
        Array_logat += Quadruple(18,i,2 ,"P1")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(19,i,1 ,"S1")
        iterasi++
    }

    for (i in 2..11){
        Array_logat += Quadruple(20,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..12){
        Array_logat += Quadruple(21,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(22,i,2 ,"P2")
        iterasi++
    }

    for (i in 7..10){
        Array_logat += Quadruple(22,i,1 ,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(22, iterasi - 1)

    for (i in 0..5){
        Array_logat += Quadruple(27,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..13){
        Array_logat += Quadruple(28,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(37,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..11){
        Array_logat += Quadruple(39,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..15){
        Array_logat += Quadruple(40,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..11){
        Array_logat += Quadruple(41,i,3 ,"O")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(46,i,4 ,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(47,i,4 ,"K")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(52,i,4 ,"K")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(53,i,4 ,"K")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(54,i,4 ,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(69,i,2 ,"P2")
        iterasi++
    }



    for (i in 2..6){
        Array_logat += Quadruple(75,i,2 ,"P2")
        iterasi++
    }

    for (i in 7..9){
        Array_logat += Quadruple(75,i,1 ,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(75, iterasi - 1)

    for (i in 5..14){
        Array_logat += Quadruple(83,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(84,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(90,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..16){
        Array_logat += Quadruple(91,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(94,i,2 ,"P2")
        iterasi++
    }

    for (i in 9..12){
        Array_logat += Quadruple(94,i,3 ,"O")
        iterasi++
    }

    Array_Duplicate += Pair(94, iterasi - 1)

    for (i in 0..8){
        Array_logat += Quadruple(95,i,1 ,"S2")
        iterasi++
    }

    Array_logat_B += Pair(2,"N1")

    ArtiFull = "Tersebutlah pada zaman dahulu hidup seorang perempuan yang dikenal sebagai Nini Anteh. la menikah dengan Aki Balangantrang, sudah lama tidak memiliki anak. Karena sangat merindukan seorang anak, ia memelihara seekor kucing berbulu tiga warna, yang biasa dipanggil Candramawat.\n" +
            "\n" +
            "Kehidupan Nini anteh sangat miskin, Hidupnya sangat menderita. Para tetangganya menjauhinya. Ia tidak diperhatikan sama sekali malah selalu dihina. Tiada seorang pun yang iba terhadap nasibnya.\n" +
            "\n" +
            "Pada suatu malam, Nini Anteh memandang bulan yang menerangi bumi. Dalam benaknya ia membayangkan betapa tentramnya hidup di bulan. Sepertinya tak akan ada seorang pun yang menghina dan mencela kehidupannya lagi. Nini Anteh akhirnya menyampaikan hasratnya itu kepada Aki Balangantrang, suaminya. Ia juga mengatakan bahwa di bulan la akan menenun kain. Aki Balangantrang tidak bisa menolak keingan istrinya. Akhirnya Nini anteh pergi ke bulan ditemani   Candramawat\n" +
            "\n"

    var uniqueFirstElements4 = Array_logat.map { it.first }.toSet()
    var resultArray4 = uniqueFirstElements4.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val dongeng4: HalamanBelajar = HalamanBelajar("نيني أنتيه", "4. Nini Anteh", resultArray4 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Dongeng.add(dongeng4)
}