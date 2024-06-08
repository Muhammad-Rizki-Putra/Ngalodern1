package Object

import androidx.compose.runtime.Composable

var sizehd: Int = 0
var sizedg: Int = 0

var Dongeng: List<HalamanBelajar> = listOf()
var Hadist: List<HalamanBelajar> = listOf()



@Composable
fun Data(){
    //    Untuk penempatan kata pada data :
    //    text arab di simpan dalam bentuk String of array seperti contoh dibawah
    //    text indonesia juga sama di simpan dalam bentuk String of array seperti contoh dibawah
    //    untuk lokasi logat dapat di simpan dalam bentuk array of tripple
    //    Keterangan warna:
    //          1 = red
    //          2 = blue
    //          3 = brown
    //          4 = purple

    var Array_arab = arrayOf<String>()
    var Array_indo = arrayOf<String>()
    var Array_logat = arrayOf<Quadruple<Int, Int, Int, String>>()
    var ArtiFull: String = ""
    var Penjelasan: String = ""
    var Array_logat_B = arrayOf<Pair<Int, String>>()
    var Array_Duplicate = arrayOf<Pair<Int, Int>>()
    var iterasi: Int = 0

    fun clearArrays() {
        Array_arab = arrayOf<String>()
        Array_indo = arrayOf<String>()
        Array_logat = arrayOf<Quadruple<Int, Int, Int, String>>()
        ArtiFull = ""
        Penjelasan = ""
        Array_logat_B = arrayOf<Pair<Int, String>>()
        Array_Duplicate = arrayOf<Pair<Int, Int>>()
        iterasi = 0
    }


    fun init_arabic(){
        for (i in Array_arab.indices) {
            Array_arab[i] = Array_arab[i] + " "
        }
    }

//    untuk penggunaan array pakai saja yang diatas supaya tidak perlu menulis ulang (nambah memori)

//    hadits
//    hadist 1
    Array_arab += "إليْه"
    Array_arab += "هَاجَرَ"
    Array_arab += "ما"
    Array_arab += "إلى"
    Array_arab += "فهِجْرَ تُهُ"
    Array_arab += "يَنْكِحُهَا"
    Array_arab += "امرأةٍ"
    Array_arab += "أو"
    Array_arab += "يُصِيْبُهَا" //40
    Array_arab += "لِدُنْيَا"
    Array_arab += "هِجْرَتُهُ"
    Array_arab += "كَانَتْ"
    Array_arab += "مَنْ"// 36
    Array_arab += "و"
    Array_arab += "رَسُوْلِهِ"
    Array_arab += "و"
    Array_arab += "اللهِ"
    Array_arab += "إلى"
    Array_arab += "فَهِجْرَتُهُ"
    Array_arab += "رَسُولِهِ"
    Array_arab += "و"
    Array_arab += "اللهِ"
    Array_arab += "إلى"
    Array_arab += "هِجْرَ تُهُ"
    Array_arab += "كَانَتْ"
    Array_arab += "فَمَنْ"
    Array_arab += "نَوَى"
    Array_arab += "ما"
    Array_arab += "امريءٍ"
    Array_arab += "لِكُلِّ"
    Array_arab += "إِنَّما"
    Array_arab += "و"
    Array_arab += "بِالنِّيَّاتِ"
    Array_arab += "الأعمَالُ"
    Array_arab += "إنَّمَا"
    Array_arab += "سَلَّمَ"
    Array_arab += "و" //12
    Array_arab += "عليه"
    Array_arab += "الله"
    Array_arab += "صلّى"
    Array_arab += "رَسُوْلَ اللهِ"
    Array_arab += "سَمِعْتُ"
    Array_arab += "قَالَ"
    Array_arab += "عَنْهُ"
    Array_arab += "اللهُ"
    Array_arab += "رَضِيَ"
    Array_arab += "أَبِيْ حَفْصٍ عُمَرَ بْنِ الْخَطَّابِ"
    Array_arab += "أَمِيْرِالْمُؤْمِنِيْنَ"
    Array_arab += "عن"
    init_arabic()

    Array_indo += "Kepadanya"
    Array_indo += "Ia hijrah"

    Array_indo += "Apa"
    Array_indo += "Kepada"
    Array_indo += "Maka hijrahnya"
    Array_indo += "Yang dinikahinya"
    Array_indo += "Perempuam"
    Array_indo += "Atau"
    Array_indo += "Mencarinya"

    Array_indo += "Bagi dunia"
    Array_indo += "Hijrahnya"
    Array_indo += "Keadaan"
    Array_indo += "Barang siapa"
    Array_indo += "Dan"
    Array_indo += "Rasulnya"
    Array_indo += "Dan"

    Array_indo += "Allah"
    Array_indo += "Kepada"
    Array_indo += "Maka hijrahnya"
    Array_indo += "Rasul-Nya"
    Array_indo += "Dan"
    Array_indo += "Allah"
    Array_indo += "Kepada"

    Array_indo += "Hijrahnya"
    Array_indo += "Keadaan"
    Array_indo += "Maka barang siapa"
    Array_indo += "Ia niatkan"
    Array_indo += "Apa-apa"
    Array_indo += "Orang"
    Array_indo += "Bagi setiap"

    Array_indo += "Hanya saja"
    Array_indo += "Dan"
    Array_indo += "(Tergantung)dengan niat"
    Array_indo += "Amal-amal itu"
    Array_indo += "Hanya saja"
    Array_indo += "Salam"
    Array_indo += "Dan"
    Array_indo += "Pada nabi muhammad"
    Array_indo += "Allah (limpahkan)"

    Array_indo += "Semoga shalawat"
    Array_indo += "Rasulullah"
    Array_indo += "Aku mendengar"
    Array_indo += "Ia berkata"
    Array_indo += "Padanya"
    Array_indo += "Allah"
    Array_indo += "Semoga meridhoi"
    Array_indo += "Abi Hafs Umar bin Khatthab"
    Array_indo += "Pemimpin bagi orang-orang beriman"
    Array_indo += "Dari"

//    Array_logat += Triple(3,1,1)
    for (i in 0..5){
        Array_logat += Quadruple(3,i,2,"P2")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(4,i,1, "S2")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(6,i,2, "P2")
        iterasi++
    }

    for (i in 0..13){
        Array_logat += Quadruple(8,i,3, "O")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(9,i,3, "O")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(10,i,3, "O")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(11,i,3, "O")
        iterasi++
    }

    for (i in 0..1){
        Array_logat += Quadruple(12,i,3, "O")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(13,i,3, "O")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(15,i,1, "S1")
        iterasi++
    }

    for (i in 0..12){
        Array_logat += Quadruple(16,i,2, "P1")
        iterasi++
    }

    //contoh doang duplikat ada di arr 11
//    for (i in 7..12){
//        Array_logat += Quadruple(16,i,1, "S2")
//        iterasi++
//    }
//    Array_Duplicate += Pair(16,iterasi - 1)

    for (i in 2..5){
        Array_logat += Quadruple(23,i,1, "S1")
    }

    for (i in 0..3){
        Array_logat += Quadruple(36,i,1, "S1")
    }

    for (i in 0..11){
        Array_logat += Quadruple(40,i,2, "P2")
    }

    for (i in 0..11){
        Array_logat += Quadruple(43,i,2, "P2")
    }

    for (i in 0..6){
        Array_logat += Quadruple(47,i,2, "P2")
    }

    val uniqueFirstElements = Array_logat.map { it.first }.toSet()
    val resultArray = uniqueFirstElements.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    Array_logat_B += Pair(0,"Pp")
    Array_logat_B += Pair(1,"N1")
    Array_logat_B += Pair(2,"N1")
    Array_logat_B += Pair(3,"Vl")
    Array_logat_B += Pair(4,"Pp")
    Array_logat_B += Pair(6,"Vl")
    Array_logat_B += Pair(8,"N1")
    Array_logat_B += Pair(15,"N")
    Array_logat_B += Pair(16,"Pp")
    Array_logat_B += Pair(17,"Ko")
    Array_logat_B += Pair(26,"Pp")
    Array_logat_B += Pair(28,"Ko")
    Array_logat_B += Pair(30,"Ko")
    Array_logat_B += Pair(33,"Pp")
    Array_logat_B += Pair(35,"Ko")
    Array_logat_B += Pair(39,"Pp")
    Array_logat_B += Pair(40,"Vnl")
    Array_logat_B += Pair(41,"Ko")
    Array_logat_B += Pair(42,"N1")
    Array_logat_B += Pair(43,"Vnl")
    Array_logat_B += Pair(45,"Pp")
    Array_logat_B += Pair(47,"Vl")
    Array_logat_B += Pair(48,"Pp")

    ArtiFull = "Dari Amirul Mukminin, Abu Hafsh ‘Umar bin Al-Khattab radhiyallahu ‘anhu, ia berkata bahwa ia mendengar Rasulullah shallallahu ‘alaihi wa sallam bersabda: “Sesungguhnya setiap amalan tergantung pada niatnya. Setiap orang akan mendapatkan apa yang ia niatkan. Siapa yang hijrahnya karena Allah dan Rasul-Nya, maka hijrahnya untuk Allah dan Rasul-Nya. Siapa yang hijrahnya karena mencari dunia atau karena wanita yang dinikahinya, maka hijrahnya kepada yang ia tuju.”"
    Penjelasan = "\nPenjelasan hadist\n" +
            "\n" + "Niat artinya bermaksud atau berkehendak. Sebagian ulama bersepakat bahwa niat itu letaknya di hati. Jika seseorang berniat dalam hatinya tanpa dilafazhkan, maka niatnya dianggap sah. \n" +
            "Suatu amalan ada dikarenakan ada niatnya. Jika seseorang melakukan pekerjaan tanpa niat, maka seperti orang yang tertidur atau gila. \n" +
            "Setiap orang memperoleh pahala sesuai dengan apa yang ia niatkan. \n" +
            "Hijrah itu artinya berpindah atau meninggalkan tempat, dapat diartikan pula berpindah dari maksiat menuju ketaatan. \n" +
            "Dalam beramal perlu niat yang ikhlas.\n"

    val hadist1: HalamanBelajar = HalamanBelajar("Hadist Arbain No. 1", "Setiap Amalan Tergantung Pada Niat", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    // hadist 2





    Hadist += listOf(hadist1)

//    Dongeng
//    Contoh buat dongeng:


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
    Array_arab += "تِشَانْتَائِجْ بَارَاتْج"
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
    Array_arab += "تُشِيرُ"
    Array_arab += "جَبَلِ"
    Array_arab += "فِي"
    Array_arab += "وَادِي"
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

    val dongeng1: HalamanBelajar = HalamanBelajar("تالاجا مانجونج", "1. Talagamanggung", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()
//    Dongeng 2

//    Dongeng 3

//    Dongeng 4

//    Dongeng 5

    Dongeng += listOf(dongeng1)

//    taroh sini buat List dongengnya
    Dongeng += listOf()

    sizehd = Hadist.size
    sizedg = Dongeng.size
}


fun get_sizehd(): Int{
    return sizehd
}

fun get_sizedg(): Int{
    return sizedg
}

fun get_Hadist(): List<HalamanBelajar>{
    return Hadist
}

fun get_Dongeng(): List<HalamanBelajar>{
    return Dongeng
}

