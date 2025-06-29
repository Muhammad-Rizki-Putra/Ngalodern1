package Data.Dongeng

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Dongeng
import androidx.compose.runtime.Composable

@Composable
fun Data3_D(){

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

//    Dongeng 3
    Array_arab += "إِلَى عَلَقَةٍ"
    Array_arab += "تَحَوَّلَتْ"
    Array_arab += "إِنَّهَا"
    Array_arab += "يَقُولُونَ"
    Array_arab += "أُنَاسٌ"
    Array_arab += "هُنَاكَ"
    Array_arab += "وَلَكِنْ"
    Array_arab += "نيني أَنْدِيتْ"
    Array_arab += "مَصِيرُ"
    Array_arab += "كَيْفَ"
    Array_arab += "يَعْرِفُ"
    Array_arab += "لَا أَحَدَ"
    Array_arab += "بُحَيْرَةً"
    Array_arab += "الْمَكَانُ"
    Array_arab += "هَذَا"
    Array_arab += "وَيُصْبِحُ"
    Array_arab += "ثَرْوَاتَهَا" //
    Array_arab += "وَ"
    Array_arab += "نيني أَنْدِيتْ"
    Array_arab += "مَنْزِلَ" //
    Array_arab += "الْمِيَاهُ"
    Array_arab += "أَغْرَقَتْ"
    Array_arab += "وَأَخِيرًا"
    Array_arab += "الْعَصَا"
    Array_arab += "هَذِهِ"
    Array_arab += "أَثَرَ"
    Array_arab += "الْأَرْضِ"
    Array_arab += "مِنْ"
    Array_arab += "الْغَزِيرُ"
    Array_arab += "الْمَاءُ"
    Array_arab += "تَبِعَ"
    Array_arab += "وَلَكِنْ"
    Array_arab += "مَرَّةً أُخْرَى"
    Array_arab += "سَحَبَهَا"
    Array_arab += "ثُمَّ"
    Array_arab += "نيني إِنْدِيتْ"
    Array_arab += "مَنْزِلِ"
    Array_arab += "سَاحَةِ"
    Array_arab += "فِي"
    Array_arab += "عَصَاهُ"
    Array_arab += "بِتَثْبِيتِ"
    Array_arab += "الْعَجُوزُ"
    Array_arab += "قَامَ"
    Array_arab += "مُغَادَرَتِهِ"
    Array_arab += "قَبْلَ"
    Array_arab += "وَبِلَحْظَةٍ"
    Array_arab += "الْكَلِمَاتِ"
    Array_arab += "هَذِهِ"
    Array_arab += "هُنَاكَ"
    Array_arab += "كَانُوا"
    Array_arab += "الَّذِينَ"
    Array_arab += "النَّاسِ"
    Array_arab += "مِنْ"
    Array_arab += "جَمْعُ غَفِيرٍ"
    Array_arab += "سَمِعَ"
    Array_arab += "وَ"
    Array_arab += "جَزَاؤُهُ"
    Array_arab += "هُنَاكَ"
    Array_arab += "فَإِنَّ"
    Array_arab += "عَلَى حَدٍّ سَوَاءٍ"
    Array_arab += "شَرًّا"
    Array_arab += "أَوْ"
    Array_arab += "كَانَ"
    Array_arab += "خَيْرًا"
    Array_arab += "عَمَلٍ"
    Array_arab += "كُلُّ"
    Array_arab += "الْعَجُوزُ"
    Array_arab += "قَالَ"
    Array_arab += "الْأَرْمَلَةُ"
    Array_arab += "مُغَادَرَتِهِ"
    Array_arab += "وَقَبْلَ"
    Array_arab += "مُتْعِبًا"
    Array_arab += "حَزِينًا"
    Array_arab += "الْعَجُوزُ"
    Array_arab += "انصرفَ"
    Array_arab += "الْمُغَادَرَةَ"
    Array_arab += "مِنْهُ"
    Array_arab += "طَلَبَتْ"
    Array_arab += "وَ"
    Array_arab += "طَرَدَتْهُ"
    Array_arab += "وَأَخِيرًا"
    Array_arab += "بِكَلَامٍ وَاحِشٍ"
    Array_arab += "الْعَجُوزِ"
    Array_arab += "بِتَوْبِيخِ"
    Array_arab += "نِيْنِيِّ إِنْدِيتْ"
    Array_arab += "قَامَتْ"
    Array_arab += "الْمَاءِ"
    Array_arab += "هَذَا"
    Array_arab += "عَلَى"
    Array_arab += "بَدَلًا مِنْ الْحُصُولِ"
    Array_arab += "وَلَكِنْ"
    Array_arab += "الْعَطَشِ"
    Array_arab += "بِسَبَبِ"
    Array_arab += "لِلشُّرْبِ"
    Array_arab += "الْمَاءِ"
    Array_arab += "مِنْ"
    Array_arab += "كُوبًا"
    Array_arab += "مِنْهَا"
    Array_arab += "يَطْلُبُ"
    Array_arab += "نِيْنِيِّ إِنْدِيتْ"
    Array_arab += "بَيْتِ"
    Array_arab += "إِلَى"
    Array_arab += "عَجُوزٌ"
    Array_arab += "جَاءَ"
    Array_arab += "وَ فِي يَوْمٍ مِنَ الْأَيَّامِ"
    Array_arab += "مُمْتَلَكَاتِهَا"
    Array_arab += "الْآخَرُونَ"
    Array_arab += "مَنْ أَنْ يَأْكُلَ"
    Array_arab += "خَوْفًا" //
    Array_arab += "حُقُولِ الْأُرْزِّ"
    Array_arab += "وَسَطِ"
    Array_arab += "فِي" //
    Array_arab += "مَنْزِلًا"
    Array_arab += "بَنَتْ"
    Array_arab += "وَ"
    Array_arab += "الْآخَرِينَ"
    Array_arab += "عَنْ"
    Array_arab += "نَفْسَهَا"
    Array_arab += "عَزَلَتْ "
    Array_arab += "الْعَمْدِيِّ"
    Array_arab += "الطَّرِيقِ"
    Array_arab += "عَلَى"
    Array_arab += "وَ"
    Array_arab += "وَحْدَهَا"
    Array_arab += "تَعِيشُ"
    Array_arab += "هِيَ"
    Array_arab += "وَ"
    Array_arab += "جِدًّا"
    Array_arab += "بَخِيلَةً"
    Array_arab += "وَكَانَتْ"
    Array_arab += "نِني إِنْدِيتْ"
    Array_arab += "اسْمُهَا"
    Array_arab += "غَنِيَّةٌ"
    Array_arab += "أَرْمَلَةٌ"
    Array_arab += "هُنَاكَ"
    Array_arab += "كَانَ"
    Array_arab += "الزَّمَانِ"
    Array_arab += "مِنَ"
    Array_arab += "قَدِيمٍ"
    Array_arab += "فِي"
    init_arabic()

    for (i in 0..7 ){
        Array_logat += Quadruple(5,i,2,"P1")
        iterasi++
    }

    for (i in 0..10 ){
        Array_logat += Quadruple(6,i,1,"S1")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(7,i,1,"S1")
        iterasi++
    }

    for (i in 0..2){
        Array_logat += Quadruple(13,i,1,"S1")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(14,i,1,"S1")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(15,i,2,"P1")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(16,i,3 ,"O")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(21,i,2 ,"P2")
        iterasi++
    }

    for (i in 6..9){
        Array_logat += Quadruple(21,i,1 ,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(21,iterasi - 1)

    for (i in 0..9){
        Array_logat += Quadruple(22,i,3 ,"O")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(26,i,2 ,"P2")
        iterasi++
    }

    for (i in 4..6){
        Array_logat += Quadruple(26,i,1 ,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(26,iterasi - 1)

    for (i in 0..9){
        Array_logat += Quadruple(27,i,3 ,"O")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(27,i,4 ,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(29,i,4 ,"K")
        iterasi++
    }

    for (i in 0..18){
        Array_logat += Quadruple(30,i,4 ,"K")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(31,i,4 ,"K")
        iterasi++
    }

    for (i in 10..18){
        Array_logat += Quadruple(32,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..11){
        Array_logat += Quadruple(33,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..16){
        Array_logat += Quadruple(34,i,3 ,"O")
        iterasi++
    }

    for (i in 2..20){
        Array_logat += Quadruple(35,i,4 ,"K")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(36,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(37,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(41,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(43,i,3 ,"O")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(54,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..19){
        Array_logat += Quadruple(55,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(60,i,2 ,"P2")
        iterasi++
    }

    for (i in 6..7){
        Array_logat += Quadruple(60,i,1 ,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(60,iterasi - 1)

    for (i in 8..9){
        Array_logat += Quadruple(60,i,3 ,"O")
        iterasi++
    }

    Array_Duplicate += Pair(60,iterasi - 1)

    for (i in 0..5){
        Array_logat += Quadruple(62,i,2 ,"P2")
        iterasi++
    }

    for (i in 6..8){
        Array_logat += Quadruple(62,i,1 ,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(62,iterasi - 1)

    for (i in 0..14){
        Array_logat += Quadruple(64,i,3 ,"O")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(65,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(66,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(67,i,4 ,"K")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(68,i,4 ,"K")
        iterasi++
    }

    for (i in 0..13){
        Array_logat += Quadruple(70,i,2 ,"P1")
        iterasi++
    }

    for (i in 0..13){
        Array_logat += Quadruple(71,i,1 ,"S1")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(72,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(73,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(85,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..14){
        Array_logat += Quadruple(86,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(97,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(98,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(106,i,2 ,"P2")
        iterasi++
    }

    for (i in 7..9){
        Array_logat += Quadruple(106,i,3 ,"O")
        iterasi++
    }

    Array_Duplicate += Pair(106,iterasi - 1)

    for (i in 0..6){
        Array_logat += Quadruple(109,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(110,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(111,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(114,i,3 ,"O")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(118,i,2 ,"P2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(119,i,1 ,"S2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(120,i,3 ,"O")
        iterasi++
    }


    for (i in 0..14){
        Array_logat += Quadruple(121,i,3 ,"O")
        iterasi++
    }

    for (i in 0..2){
        Array_logat += Quadruple(122,i,3 ,"O")
        iterasi++
    }

    for (i in 0..12){
        Array_logat += Quadruple(123,i,3 ,"O")
        iterasi++
    }

    Array_logat_B += Pair(2,"N1")

    Array_indo += "Menjadi lintah"
    Array_indo += "Telah berubah"
    Array_indo += "Bahwasannya (Nyi endit)"
    Array_indo += "Mereka merkata"
    Array_indo += "Orang-orang"
    Array_indo += "Di sana"
    Array_indo += "tetapi"
    Array_indo += "Nyi endit"
    Array_indo += "nasib"
    Array_indo += "bagaimana"
    Array_indo += "mengetahui"
    Array_indo += "Tidak seorang pun"
    Array_indo += "Danau"
    Array_indo += "tempat"
    Array_indo += "ini"
    Array_indo += "menjadi"
    Array_indo += "kekayaannya"
    Array_indo += "dan"
    Array_indo += "Nyi endit"
    Array_indo += "Rumah"
    Array_indo += "Air"
    Array_indo += "menenggelamkan"
    Array_indo += "Akhirnya"
    Array_indo += "tongkat"
    Array_indo += "ini"
    Array_indo += "jejak"
    Array_indo += "tanah"
    Array_indo += "dari"
    Array_indo += "yang deras menggelegak"
    Array_indo += "Air"
    Array_indo += "mengikuti"
    Array_indo += "tetapi"
    Array_indo += "Sekali lagi"
    Array_indo += "Mencabutnya"
    Array_indo += "Kemudian"
    Array_indo += "Nyi endit"
    Array_indo += "rumah"
    Array_indo += "pekarangan"
    Array_indo += "di"
    Array_indo += "tongkatnya"
    Array_indo += "Dengan menancapkan"
    Array_indo += "Kakek tua itu"
    Array_indo += "melakukan"
    Array_indo += "kepergiaannya"
    Array_indo += "sebelum"
    Array_indo += "sesaat"
    Array_indo += "Kata-kata"
    Array_indo += "ini"
    Array_indo += "Di sana"
    Array_indo += "Mereka itu ada"
    Array_indo += "yang"
    Array_indo += "Orang-orang"
    Array_indo += "dari"
    Array_indo += "semua"
    Array_indo += "mendengar"
    Array_indo += "dan"
    Array_indo += "balasannya"
    Array_indo += "Di sana"
    Array_indo += "bahwasannya"
    Array_indo += "keduanya"
    Array_indo += "jahat"
    Array_indo += "atau"
    Array_indo += ""
    Array_indo += "baik"
    Array_indo += "Perbuatan"
    Array_indo += "setiap"
    Array_indo += "Kakek tua itu"
    Array_indo += "Telah berkata"
    Array_indo += "Seorang janda"
    Array_indo += "kepergiannya"
    Array_indo += "sebelum"
    Array_indo += "Dan lelah"
    Array_indo += "Sambil tertatih-tatih (sedih)"
    Array_indo += "Kakek tua itu"
    Array_indo += "pergi"
    Array_indo += "pergi"
    Array_indo += "darinya"
    Array_indo += "Ia meminta"
    Array_indo += "dan"
    Array_indo += "(kakek) diusirnya"
    Array_indo += "Akhirnya"
    Array_indo += "Dengan habis-habisan"
    Array_indo += "Nenek tua"
    Array_indo += "memarahi"
    Array_indo += "Nyi Endit"
    Array_indo += "Melakukan"
    Array_indo += "Air"
    Array_indo += "ini"
    Array_indo += "atas"
    Array_indo += "Bukan mendapatkannya"
    Array_indo += "Akan tetapi"
    Array_indo += "haus"
    Array_indo += "karena"
    Array_indo += "untuk minum"
    Array_indo += "Air"
    Array_indo += "dari"
    Array_indo += "segelas"
    Array_indo += "darinya"
    Array_indo += "Ia meminta"
    Array_indo += "Nyi endit"
    Array_indo += "rumah"
    Array_indo += "ke"
    Array_indo += "Seorang kakek tua"
    Array_indo += "Datanglah"
    Array_indo += "Pada suatu hari"
    Array_indo += "hartanya"
    Array_indo += "Oleh (orang) lain"
    Array_indo += "dimakan"
    Array_indo += "Karena takut"
    Array_indo += "persawahan"
    Array_indo += "tengah"
    Array_indo += "di"
    Array_indo += "Sebuah rumah"
    Array_indo += "Ia membangun"
    Array_indo += "dan"
    Array_indo += "Orang lain"
    Array_indo += "dari"
    Array_indo += "Dirinya"
    Array_indo += "Ia mengasingkan"
    Array_indo += "sengaja"
    Array_indo += "cara"
    Array_indo += "dengan"
    Array_indo += "dan"
    Array_indo += "menyendiri"
    Array_indo += "hidup"
    Array_indo += "Dia"
    Array_indo += "dan"
    Array_indo += "sangat"
    Array_indo += "kikir"
    Array_indo += "Dan dia itu"
    Array_indo += "Nyi endit"
    Array_indo += "namanya"
    Array_indo += "Yang kaya"
    Array_indo += "Seorang janda"
    Array_indo += "Di sana"
    Array_indo += "ada"
    Array_indo += "zaman"
    Array_indo += "dari"
    Array_indo += "dahulu"
    Array_indo += "Pada"

    ArtiFull = "Zaman dahulu ada seorang janda kaya bernama Nyi Endit. la sangat kikir. Nyi Endit hidup menyendiri. Ia sengaja mengasingkan diri dengan membangun rumah di tengah persawahan yang luas. Maksudnya tiada lain agar ia tak mudah bergaul karena takut hartanya dimakan orang lain.\n" +
            "\n" +
            "Pada suatu hari datanglah seorang kakek tua ke rumah Nyi Endit. Kakek tua itu bermaksud meminta segelas air minum karena haus, tetapi Nyi Endit justru memarahinya habis- habisan. Akhirnya ia diusir, disuruh pergi. Kakek tua pun pergi sambil tertatih-tatih dan lunglai. Sebelum pergi ia berkata seperti ini. Apa pun, baik kepada orang yang baik maupun kepada orang yang jahat, akan selalu ada balasannya.\n" +
            "\n" +
            "Kata-kata kakek tua itu disaksikan oleh semua orang yang berada di situ. la berkata sambil menancapkan tongkatnya di pekarangan rumah Nyi Endit. Lalu tongkat itu dicabut kembali, tetapi dari dalam tanah keluar air yang deras menggelegak. Akhirnya, air itu menenggelamkan rumah Nyi Endit hingga menjadi danau. Menengggelamkan seluruh kekayaan Nyi Endit.\n" +
            "\n" +
            "Tidak ada yang tahu bagaimana nasib Nyi Endit, tetapi ada orang yang mengatakan bahwa Nyi Endit itu telah berubah menjadi lintah.\n" +
            "\n"

    var uniqueFirstElements3 = Array_logat.map { it.first }.toSet()
    var resultArray3 = uniqueFirstElements3.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val dongeng3: HalamanBelajar = HalamanBelajar("سيتو باغينديت", "3. Situ Bagendit", resultArray3 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Dongeng.add(dongeng3)
}