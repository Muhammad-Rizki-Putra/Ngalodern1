package Data.Dongeng

import Object.Quadruple
import Object.HalamanBelajar
import Object.Dongeng
import androidx.compose.runtime.Composable

@Composable
fun Data1_D(){

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

    //    Dongeng 1
    Array_arab += "فِيهِ"
    Array_arab += "دَفْنُهَا"
    Array_arab += "تَمَّ"
    Array_arab += "وَ"
    Array_arab += "تَالَاجَا"
    Array_arab += "فِي"
    Array_arab += "الْمُتَوَفَّى"
    Array_arab += "بَالُونَا"
    Array_arab += "الْأَمِيرَةَ"
    Array_arab += "سَمَّيَاهَا"
    Array_arab += "طِفْلَةً"
    Array_arab += "وَهَبَا"
    Array_arab += "وَ"
    Array_arab += "فَتَزَوَّجَا"
    Array_arab += "مَرَضِهَا"
    Array_arab += "إِزَالَةِ"
    Array_arab += "وَ"
    Array_arab += "الْأَمِيرَةِ"
    Array_arab += "عِلَاجِ"
    Array_arab += "فِي"
    Array_arab += "يُقَدَّرُ"
    Array_arab += "عَالِمٍ"
    Array_arab += "رَجُلٍ"
    Array_arab += "بِحُضُورِ"
    Array_arab += "الْقَدْرُ"
    Array_arab += "تَمَّ"
    Array_arab += "لَهَا"
    Array_arab += "زَوْجًا"
    Array_arab += "تَتَّخِذُهَا"
    Array_arab += "فَسَوْفَ"
    Array_arab += "رَجُلًا"
    Array_arab += "الشَّخْصُ"
    Array_arab += "كَانَ"
    Array_arab += "إِذَا"
    Array_arab += "أَمَّا"
    Array_arab += "أُمًّا"
    Array_arab += "فَسَتَتَّخِذُهَا"
    Array_arab += "الْعُمْرِ"
    Array_arab += "مِنْ"
    Array_arab += "تَبْلُغُ"
    Array_arab += "سَيِّدَةٌ"
    Array_arab += "كَانَ"
    Array_arab += "فَإِذَا"
    Array_arab += "مَرَضَهَا"
    Array_arab += "أَنْ يُزِيلَ"
    Array_arab += "عَلَى"
    Array_arab += "قَادِرٍ"
    Array_arab += "شَخْصٍ"
    Array_arab += "أَيَّ"
    Array_arab += "وَجَدْتَ"
    Array_arab += "إِذَا"
    Array_arab += "أَنَّهُ"
    Array_arab += "سِيمْبِرْكَنِتْشَانَا"
    Array_arab += "فَاقْسَمْتْ"
    Array_arab += "مُزْمِنًا"
    Array_arab += "مَرَضًا"
    Array_arab += "عَانَى"
    Array_arab += "حَتَّى"
    Array_arab += "بِالِانْقَامِ"
    Array_arab += "الْغَضَبُ"
    Array_arab += "لَمْ يَذْهَبْ"
    Array_arab += "وَ"
    Array_arab += "الشَّدِيدِ"
    Array_arab += "بِالْغَضَبِ"
    Array_arab += "تَشْعُرُ"
    Array_arab += "سِيمِيرْ كِنْتْشَانَا"
    Array_arab += "كَانَتْ"
    Array_arab += "ذَلِكَ"
    Array_arab += "وَبِجَانِبِ"
    Array_arab += "دَبُّوسٍ"
    Array_arab += "بِاسْتِخْدَامِ"
    Array_arab += "رَقَبَتِهِ"
    Array_arab += "فِي"
    Array_arab += "طَعَنَتْهُ"
    Array_arab += "حَيْثُ"
    Array_arab += "يَنَامُ"
    Array_arab += "حِينَ"
    Array_arab += "سِيمِيرْكَنْتْشَانَا"
    Array_arab += "فَقَتَلَتْهُ"
    Array_arab += "الزَّوْجِ"
    Array_arab += "مِنْ"
    Array_arab += "بِالِانْتِقَامِ"
    Array_arab += "الْأَمِيرَةُ"
    Array_arab += "تَشْعُرَ"
    Array_arab += "حَتَّى"
    Array_arab += "زَوْجِهَا"
    Array_arab += "خُدْعَةَ"
    Array_arab += "أَدْرَكَتْ"
    Array_arab += "قَدْ"
    Array_arab += "سِيمِيرْكَنْتِشَانَا"
    Array_arab += "الْأَمِيرَةُ"
    Array_arab += "كَانَتْ"
    Array_arab += "أَيْضًا"
    Array_arab += "بِسَبَبِهَا"
    Array_arab += "مَاتَ"
    Array_arab += "حَتَّى"
    Array_arab += "الشَّدِيدَةَ"
    Array_arab += "الصَّدْمَةَ"
    Array_arab += "تِشَانْتَانْجْ بَارَانْج"
    Array_arab += "أَصَابَتْ"
    Array_arab += "الْمَلِكِ"
    Array_arab += "قَتْلِ"
    Array_arab += "بَعْدَ"
    Array_arab += "أَنَّهُ"
    Array_arab += "إِلَّا"
    Array_arab += "تِشَانْتَانْجْ بَارَانْج"
    Array_arab += "يَدِ"
    Array_arab += "عَلَى"
    Array_arab += "الْمَلِكِ"
    Array_arab += "قَتْلُ"
    Array_arab += "تَمَّ"
    Array_arab += "وَأَخِيرًا"
    Array_arab += "الْمَلِكِ"
    Array_arab += "لِقَتْلِ"
    Array_arab += "تِشَانْتَائِجْ بَارَاتْج" // 80
    Array_arab += "مِنْ"
    Array_arab += "النَّائِبُ"
    Array_arab += "فَطَلَبَ"
    Array_arab += "لِزَوْجَتِهِ"
    Array_arab += "أَبٌ"
    Array_arab += "هُوَ"
    Array_arab += "الَّذِى"
    Array_arab += "الْمَلْكِ"
    Array_arab += "قَتْلُ"
    Array_arab += "إِلَّا"
    Array_arab += "لَيْسَ"
    Array_arab += "الْغَرَضِ"
    Array_arab += "هَذَا"
    Array_arab += "إِلَى"
    Array_arab += "لِلْوُصُولِ"
    Array_arab += "الْوَحِيدُ"
    Array_arab += "وَ الطَّرِيقُ"
    Array_arab += "شَرْعِيٍّ"
    Array_arab += "غَيْرِ"
    Array_arab += "بِطَرِيقٍ"
    Array_arab += "مَلْكًا"
    Array_arab += "أَنْ يَكُونَ"
    Array_arab += "يُرِيدُ"
    Array_arab += "حَيْثُ"
    Array_arab += "حَاسِدًا"
    Array_arab += "خَادِعًا"
    Array_arab += "قَلْبًا"
    Array_arab += "لِلنَّائِبِ"
    Array_arab += "أَنَّ"
    Array_arab += "وَرَوَى"
    Array_arab += "الْفُرْسَانِ"
    Array_arab += "وَ"
    Array_arab += "أَصْحَابِ الْقُوَّةِ"
    Array_arab += "مِنْ"
    Array_arab += "الضُّيُوفِ"
    Array_arab += "مِنْ"
    Array_arab += "كَبِيرٌ"
    Array_arab += "عَدَدٌ"
    Array_arab += "الْعُرُوشِ"
    Array_arab += "حَفْلَةِ"
    Array_arab += "فِي"
    Array_arab += "حَضَرَ"
    Array_arab += "حَيْثُ"
    Array_arab += "بَالِينْبَاتِجْ جُونُونْجْ"
    Array_arab += "الْمَلِكِ"
    Array_arab += "نَائِبِ"
    Array_arab += "مَعَ"
    Array_arab += "تَزْوِيجُهَا"
    Array_arab += "تَمَّ"
    Array_arab += "الَّتِي"
    Array_arab += "الْبِنْتُ الصُّغْرَى"
    Array_arab += "إِلَّا"
    Array_arab += "قَصْرِ الْمَمْلَكَةِ"
    Array_arab += "فِي"
    Array_arab += "لَيْسَ"
    Array_arab += "بِيتُونْجْ جَبْلِ"
    Array_arab += "فِي"
    Array_arab += "قِمَّةِ"
    Array_arab += "لِلتَّحَنُّثِ"
    Array_arab += "رَادْینْ بَانْجِلُورَاهْ"
    Array_arab += "ذَهَبَ"
    Array_arab += "بِاخْتِصَارِ شَدِیدٍ"
    Array_arab += "سِيمِيرْ كَنْتْشَانَا"
    Array_arab += "اسْمُهُ"
    Array_arab += " وَالِابْنُ الْأَصْغَرُ"
    Array_arab += "رَادِينْ بِالْمَخْلُورَاهِ"
    Array_arab += "اسْمُهُ"
    Array_arab += "الِابْنُ الْأَكْبَرُ"
    Array_arab += "ابْنَانِ"
    Array_arab += "لِلْمَلِكِ"
    Array_arab += "كَانَ"
    Array_arab += "تَالَانْجْ مَانْجُونْج"
    Array_arab += "اسْمُهَا"
    Array_arab += "مَمْلَكَةً"
    Array_arab += "مَايْ"
    Array_arab += "تُشِيرُ" // 4
    Array_arab += "جَبَلِ"
    Array_arab += "فِي وَادِي"
    Array_arab += "مِنْ الْعُصُورِ الْقَدِيمَةِ"
    Array_arab += "فِي عَصْرٍ"
    init_arabic()

    Array_indo += "Padanya"
    Array_indo += "Makamnya"
    Array_indo += "Telah selesai"
    Array_indo += "dan"
    Array_indo += "Talaga"
    Array_indo += "di"
    Array_indo += "yang telah meninggal"
    Array_indo += "Baluna"
    Array_indo += "Putri"
    Array_indo += "Yang bernama"
    Array_indo += "Seorang anak"
    Array_indo += "(mereka berdua) dikaruniai"
    Array_indo += "dan"
    Array_indo += "Maka (mereka berdua) menikah"
    Array_indo += "Penyakitnya"
    Array_indo += "menyembuhkan"
    Array_indo += "dan"
    Array_indo += "Ratu (Simbarkancana)"
    Array_indo += "mengobati"
    Array_indo += "dalam"
    Array_indo += "(ia) mampu"
    Array_indo += "Yang mengetahui"
    Array_indo += "Seorang laki-laki"
    Array_indo += "Dengan kedatangan"
    Array_indo += "Mampu"
    Array_indo += "Selesai (singkat cerita)"
    Array_indo += "Baginya"
    Array_indo += "Suami"
    Array_indo += "Dijadikannya"
    Array_indo += "Maka akan"
    Array_indo += "Laki-laki"
    Array_indo += "Seorang"
    Array_indo += "Adalah"
    Array_indo += "Jika"
    Array_indo += "Adapun"
    Array_indo += "Ibu"
    Array_indo += "Ia akan dijadikannya"
    Array_indo += "Umur"
    Array_indo += "Dari"
    Array_indo += "(ia) sampai"
    Array_indo += "Wanita"
    Array_indo += "Adalah"
    Array_indo += "Jika"
    Array_indo += "Penyakitnya"
    Array_indo += "Menyembuhkan"
    Array_indo += "Atas"
    Array_indo += "Yang mampu"
    Array_indo += "Seseorang"
    Array_indo += "yaitu"
    Array_indo += "(kau) dapat"
    Array_indo += "Barangsiapa"
    Array_indo += "Bahwasanya"
    Array_indo += "Simbarkancana"
    Array_indo += "Maka bersumpah"
    Array_indo += "Yang kronis"
    Array_indo += "Penyakit"
    Array_indo += "(ia) menderita"
    Array_indo += "Sehingga"
    Array_indo += "Dengan balas dendam"
    Array_indo += "Sakit hati"
    Array_indo += "tidak berlalu"
    Array_indo += "dan"
    Array_indo += "sangat"
    Array_indo += "sakit hati"
    Array_indo += "(ia) merasa"
    Array_indo += "Simbarkancana"
    Array_indo += "Adalah"
    Array_indo += "itu"
    Array_indo += "Di samping"
    Array_indo += "Konde"
    Array_indo += "Dengan menggunakan"
    Array_indo += "Lehernya"
    Array_indo += "pada"
    Array_indo += "(ia) menusukkannya"
    Array_indo += "dimana"
    Array_indo += "(ia) tidur"
    Array_indo += "Ketika"
    Array_indo += "Simbarkencana"
    Array_indo += "Maka (ia) membunuh (nya)"
    Array_indo += "Suaminya"
    Array_indo += "Kepada"
    Array_indo += "Dendam"
    Array_indo += "Ratu (istrinya)"
    Array_indo += "Merasa"
    Array_indo += "Sehingga"
    Array_indo += "Suaminya"
    Array_indo += "Keculasan"
    Array_indo += "(ia) mengetahui"
    Array_indo += "Sungguh"
    Array_indo += "Simbarkencana"
    Array_indo += "Ratu (istrinya)"
    Array_indo += "Adalah"
    Array_indo += "Juga"
    Array_indo += "Penyebabnya"
    Array_indo += "(ia) mati"
    Array_indo += "Sehingga"
    Array_indo += "Keras"
    Array_indo += "Pukulan"
    Array_indo += "Centangbarang"
    Array_indo += "(ia) terkena"
    Array_indo += "Raja"
    Array_indo += "Membunug"
    Array_indo += "setelah"
    Array_indo += "Bahwasannya (ia)"
    Array_indo += "tetapi"
    Array_indo += "Centangbarang"
    Array_indo += "tangan"
    Array_indo += "atas"
    Array_indo += "raja"
    Array_indo += "membunuh"
    Array_indo += "selesai"
    Array_indo += "Akhirnya"
    Array_indo += "Raja"
    Array_indo += "Untuk membunuh"
    Array_indo += "Centangbarang"
    Array_indo += "Kepada"
    Array_indo += "Pengganti itu (Patih Palembanggunung)"
    Array_indo += "Maka (ia) menyuruh"
    Array_indo += "Isterinya"
    Array_indo += "Ayah"
    Array_indo += "Dia itu"
    Array_indo += "yang"
    Array_indo += "raja"
    Array_indo += "membunuh"
    Array_indo += "kecuali"
    Array_indo += "tidaklah"
    Array_indo += "tercapai"
    Array_indo += "ini"
    Array_indo += "agar"
    Array_indo += "agar" // todo fix translate
    Array_indo += "Salah satu"
    Array_indo += "cara"
    Array_indo += "Sesuai hukum"
    Array_indo += "tidak"
    Array_indo += "Dengan cara"
    Array_indo += "Seorang raja"
    Array_indo += "menjadi"
    Array_indo += "(dia) ingin"
    Array_indo += "dimana"
    Array_indo += "Dengki"
    Array_indo += "Culas"
    Array_indo += "berhati"
    Array_indo += "Pengganti itu (Patih Palembanggunung)"
    Array_indo += "bahwasannya"
    Array_indo += "Diceritakan"
    Array_indo += "Para ksatria"
    Array_indo += "dan"
    Array_indo += "Tamu agung"
    Array_indo += "dari"
    Array_indo += "Para tamu"
    Array_indo += "dari"
    Array_indo += "(yang) besar (banyak)"
    Array_indo += "jumlah"
    Array_indo += "Perkawinan"
    Array_indo += "Upacara"
    Array_indo += "pada"
    Array_indo += "Telah datang"
    Array_indo += " "
    Array_indo += "Palembanggunung."
    Array_indo += "Raja"
    Array_indo += "Pengganti"
    Array_indo += "bersama"
    Array_indo += "Menikah (dengannya)"
    Array_indo += "Sudah"
    Array_indo += "Yang"
    Array_indo += "Putri bungsu"
    Array_indo += "Kecuali"
    Array_indo += "Keraton"
    Array_indo += "Di"
    Array_indo += "Tidaklah"
    Array_indo += "Bitung"
    Array_indo += "Gunung"
    Array_indo += "Di puncak"
    Array_indo += "Untuk bertapa"
    Array_indo += "Raden Panglurah"
    Array_indo += "Telah pergi"
    Array_indo += "Singkat cerita"
    Array_indo += "Simbarkancana"
    Array_indo += "Namanya"
    Array_indo += "Dan putra bungsu"
    Array_indo += "Raden Panglurah"
    Array_indo += "Namanya"
    Array_indo += "Putra sulung"
    Array_indo += "Dua orang putra"
    Array_indo += "Raja itu (Memiliki)"
    Array_indo += "Adalah"
    Array_indo += "Talagamanggung"
    Array_indo += "Namanya"
    Array_indo += "Kerajaan"
    Array_indo += "Ciremai"
    Array_indo += "Ada (memberi isyarat)"
    Array_indo += "Gunung"
    Array_indo += "Di lembah"
    Array_indo += "Zaman dahulu"
    Array_indo += "Pada zaman"

    for (i in 0..10){
        Array_logat += Quadruple(0,i,4,"K")
        iterasi++
    }

    for (i in 0..28){
        Array_logat += Quadruple(1,i,4,"K")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(4,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(5,i,1,"S2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(6,i,3,"O")
        iterasi++
    }

    for (i in 0..20){
        Array_logat += Quadruple(12,i,1,"S1")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(13,i,2,"P1")
        iterasi++
    }

    for (i in 0..26){
        Array_logat += Quadruple(14,i,2,"P1")
        iterasi++
    }

    for (i in 2..23){
        Array_logat += Quadruple(15,i,1,"S1")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(16,i,2,"P1")
        iterasi++
    }

    for (i in 0..21){
        Array_logat += Quadruple(17,i,2,"P1")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(20,i,2,"P2")
        iterasi++
    }

    for (i in 0..24){
        Array_logat += Quadruple(21,i,1,"S2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(31,i,2,"P2")
        iterasi++
    }

    for (i in 0..12){
        Array_logat += Quadruple(32,i,1,"S2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(38,i,2,"P2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(42,i,1,"S2")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(43,i,1,"S2")
        iterasi++
    }

    for (i in 1..7){
        Array_logat += Quadruple(50,i,2,"P2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(60,i,4,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(61,i,4,"K")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(62,i,4,"K")
        iterasi++
    }

    for (i in 1..13){
        Array_logat += Quadruple(63,i,1,"S1")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(64,i,1,"S1")
        iterasi++
    }

    for (i in 0..11){
        Array_logat += Quadruple(65,i,2,"P1")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(74,i,2,"P2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(75,i,1,"S2")
        iterasi++
    }

    for (i in 1..8){
        Array_logat += Quadruple(77,i,2,"P2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(78,i,1,"S2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(81,i,3,"O")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(81,i,3,"O")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(82,i,3,"O")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(82,i,3,"O")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(84,i,2,"P2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(85,i,1,"S2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(86,i,1,"S2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(95,i,2,"P2")
        iterasi++
    }

    for (i in 0..26){
        Array_logat += Quadruple(96,i,1,"S2")
        iterasi++
    }

    for (i in 0..11){
        Array_logat += Quadruple(97,i,3,"O")
        iterasi++
    }

    for (i in 0..12){
        Array_logat += Quadruple(98,i,3,"O")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(107,i,2,"P2")
        iterasi++
    }

    for (i in 8..10){
        Array_logat += Quadruple(107,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(107, iterasi - 1)

    for (i in 0..8){
        Array_logat += Quadruple(111,i,2,"P2")
        iterasi++
    }

    for (i in 0..12){
        Array_logat += Quadruple(112,i,1,"S2")
        iterasi++
    }

    for (i in 1..8){
        Array_logat += Quadruple(116,i,2,"P2")
        iterasi++
    }

    for (i in 9..12){
        Array_logat += Quadruple(116,i,3,"O")
        iterasi++
    }

    Array_Duplicate += Pair(116, iterasi - 1)

    for (i in 0..20){
        Array_logat += Quadruple(117,i,1,"S2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(121,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(121,i,2,"P2")
        iterasi++
    }

    for (i in 6..7){
        Array_logat += Quadruple(121,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(121, iterasi - 1)

    for (i in 8..10){
        Array_logat += Quadruple(121,i,3,"O")
        iterasi++
    }

    Array_Duplicate += Pair(121, iterasi - 1)

    for (i in 8..10){
        Array_logat += Quadruple(121,i,3,"O")
        iterasi++
    }

    Array_logat_B += Pair(2,"N1")

    for (i in 0..6){
        Array_logat += Quadruple(138,i,2,"P2")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(139,i,3,"O")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(140,i,3,"O")
        iterasi++
    }

    for (i in 0..11){
        Array_logat += Quadruple(141,i,2,"P2")
        iterasi++
    }

    for (i in 0..21){
        Array_logat += Quadruple(142,i,1,"S2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(145,i,2,"P2")
        iterasi++
    }

    for (i in 6..8){
        Array_logat += Quadruple(145,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(145, iterasi - 1)

    for (i in 3..7){
        Array_logat += Quadruple(158,i,2,"P2")
        iterasi++
    }

    for (i in 9..16){
        Array_logat += Quadruple(158,i,3,"O")
        iterasi++
    }

    Array_Duplicate += Pair(158, iterasi - 1)

    for (i in 0..8){
        Array_logat += Quadruple(166,i,2,"P2")
        iterasi++
    }

    for (i in 9..12){
        Array_logat += Quadruple(166,i,3,"O")
        iterasi++
    }

    Array_Duplicate += Pair(166, iterasi - 1)

    for (i in 0..7){
        Array_logat += Quadruple(167,i,3,"O")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(169,i,2,"P2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(170,i,1,"S2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(181,i,2,"P2")
        iterasi++
    }

    for (i in 11..12){
        Array_logat += Quadruple(181,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(181, iterasi - 1)

    for (i in 0..5){
        Array_logat += Quadruple(183,i,2,"P2")
        iterasi++
    }

    for (i in 6..7){
        Array_logat += Quadruple(183,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(183, iterasi - 1)

    for (i in 0..8){
        Array_logat += Quadruple(184,i,3,"O")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(185,i,2,"P2")
        iterasi++
    }

    for (i in 9..11){
        Array_logat += Quadruple(185,i,3,"O")
        iterasi++
    }

    Array_Duplicate += Pair(185, iterasi - 1)

    for (i in 0..12){
        Array_logat += Quadruple(186,i,1,"S2")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(189,i,4,"K")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(190,i,4,"K")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(192,i,2,"P2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(193,i,1,"S2")
        iterasi++
    }

    ArtiFull = "Pada zaman dahulu di lembah Gunung Ciremai ada sebuah negara bernama Kerajaan Talagamanggung. Rajanya mempunyai dua orang putra. Yang sulung bernama Raden Panglurah dan yang bungsu bernama Simbarkancana.\n" +
            "\n" +
            "Singkat cerita Raden Panglurah pergi bertapa di Gunung Bitung (lima km dari Cikijing sebelah selatan). Yang ada di Keraton hanya Putri bungsu yang sudah menikah dengan Patih Palembanggunung. Upacara perkawinannya sangat meriah. Banyak tamu agung dan para ksatria yang datang.\n" +
            "\n" +
            "Diceritakan Patih Palembanggunung berhati culas. Dia ingin menjadi raja. Salah satu jalan supaya dia bisa jadi raja, yaitu dia harus bisa membunuh mertuanya (raja). Singkat cerita Patih Palembanggunung menyuruh Centangbarang untuk membunuh raja. Akhirnya, sang raja meninggal dibunuh oleh Centangbarang, tetapi akibatnya setelah raja meninggal Centangbarang kaget, yang pada akhirnya Centangbarang pun mati juga.\n" +
            "\n" +
            "Keculasan Patih Palembanggunung diketahui oleh istrinya, Putri Simbarkencana. Simbarkencana merasa dendam. Dan Patih Palembanggung dibunuh oleh Simbarkencana pada saat tidur dengan menggunakan konde yang ditusukkan ke leher Patih Palembanggunung.\n" +
            "\n" +
            "Simbarkancana sangat sakit hati, sampai akhirnya dia jatuh sakit. Saat itulah Simbarkancana bersumpah; barang siapa yang bisa menyembuhkannya dari penyakit, jika wanita tua akan dijadikan ibu, jika laki-laki akan dijadikan suami. Singkat cerita, Simbarkancana diobati oleh seorang Pandita dan sembuh. Mereka pun menikah dan dikaruniai seorang anak yang Bernama Putri Paluna, yang makamnya di Talaga.\n" +
            "\n"

    var uniqueFirstElements = Array_logat.map { it.first }.toSet()
    var resultArray = uniqueFirstElements.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val dongeng1: HalamanBelajar = HalamanBelajar("تالاجا مانجونج", "1. Talagamanggung", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Dongeng.add(dongeng1)
}