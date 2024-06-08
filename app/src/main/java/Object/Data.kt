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
    //  1 = red
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

     var uniqueFirstElements = Array_logat.map { it.first }.toSet()
     var resultArray = uniqueFirstElements.map { uniqueElement ->
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
    uniqueFirstElements = emptySet()
    resultArray = emptyArray()

    // hadist 2

    Array_arab += "مسلم"
   Array_arab += "رواه"
   Array_arab += "دِيْنَكُمْ"

    Array_arab += "يُعَلِّمَكُمْ"
    Array_arab += "أَتَاكُمْ"
    Array_arab += "جِبْرِيلُ"
    Array_arab += "فَإِنَّهُ"
    Array_arab += "قَالَ"
    Array_arab += "أَعْلَمُ"
    Array_arab += "رَسُوْلُهُ"
    Array_arab += "وَ"
    Array_arab += "اللهُ"
    Array_arab += "قُلْتُ"

   Array_arab += "السَّائِلُ"
   Array_arab += "مَنْ"
   Array_arab += "أَتَدْرِي"
   Array_arab += "عُمَرُ"
   Array_arab += "يَا"
   Array_arab += "قَالَ"
   Array_arab += "ثُمَّ"
   Array_arab += "مَلِيًا"
   Array_arab += "فَلَبِثْتُ"
   Array_arab += "انْطَلَقَ"

    Array_arab += "ثُمَّ"
    Array_arab += "البُنْيَانِ"
    Array_arab += "فِي"
    Array_arab += "يَتَطَاوَلُوْنَ"
    Array_arab += "الشَّاءِ"
    Array_arab += "رِعَاءَ"
    Array_arab += "الحُفَاةَ العُرَاةَ العَالَةَ"
    Array_arab += "أَنْ تَرَى"
    Array_arab += "وَ"
    Array_arab += "رَبَّتَهَا"

   Array_arab += "الأَمَةُ"
   Array_arab += "أنْ تَلِدَ"
   Array_arab += "قَالَ"
   Array_arab += "أَمارَاتِهَا"
   Array_arab += "عَنْ"
   Array_arab += "فَأَخْبِرْنِي"
   Array_arab += "قَالَ"
   Array_arab += "السَّائِلِ"
   Array_arab += "مِنْ"
   Array_arab += "بِأَعْلَمَ"
    Array_arab += "المَسْؤُلُ"
    Array_arab += "مَا"
    Array_arab += "قَالَ"
    Array_arab += "السَّاعَةِ"
    Array_arab += "عَنْ"
    Array_arab += "فَأَخْبِرْنِي"
    Array_arab += "قَالَ"
    Array_arab += "يَرَاكَ"
    Array_arab += "فَإِنَّهُ"
    Array_arab += "تَرَاهُ"
    Array_arab += "تَكُنْ"
    Array_arab += "لَمْ"
    Array_arab += "فَإِنْ"
    Array_arab += "تَرَاهُ"
    Array_arab += "كَأَنَّكَ"
    Array_arab += "الله"
    Array_arab += "أَنْ تَعْبُدَ"
    Array_arab += "قَالَ"
    Array_arab += "الإِحْسَانِ"
    Array_arab += "عَنْ"
    Array_arab += "فَأَخْبِرْنِي"
    Array_arab += "قَالَ"
    Array_arab += "صَدَقْتَ"
    Array_arab += "قَالَ"
    Array_arab += "شَرِّهِ"
    Array_arab += "وَ"
    Array_arab += "خَيْرِهِ"
    Array_arab += "بِالقَدَرِ"
    Array_arab += "تُؤْمِنَ"
    Array_arab += "وَ"
    Array_arab += "الآخِرِ"
    Array_arab += "اليَوْمِ"
    Array_arab += "وَ"
    Array_arab += "رُسُلِهِ"
    Array_arab += "وَ"
    Array_arab += "كُتُبِهِ"
    Array_arab += "وَ"
    Array_arab += "مَلائِكَتِهِ"
    Array_arab += "وَ"
    Array_arab += "بِاللهِ"
    Array_arab += "أنْ تُؤْمِنَ"
    Array_arab += "قَالَ"
    Array_arab += "الإِيْمَانِ"
    Array_arab += "عَنْ"
    Array_arab += "فَأَخْبِرْنِي"
    Array_arab += "قَالَ"
    Array_arab += "يُصَدِّقُهُ"
    Array_arab += "وَ"
    Array_arab += "يَسْأَلُهُ"
    Array_arab += "لَهُ"
    Array_arab += "فَعَجِبْنَا"
    Array_arab += "صَدَقْتَ"
    Array_arab += "قَالَ"
    Array_arab += "سَبِيْلًا"
    Array_arab += "إِلَيْهِ"
    Array_arab += "إن اسْتَطَعْتَ"
    Array_arab += "البَيْتَ"
    Array_arab += "تَحُجَّ"
    Array_arab += "وَ"
    Array_arab += "رمَضَانَ"
    Array_arab += "    َصُوْمَ"
    Array_arab += "وَ"
    Array_arab += "الزَّكاةَ"
    Array_arab += "تُؤْتِيَ"
    Array_arab += "وَ"
    Array_arab += "الصّلَاةَ"
    Array_arab += "تُقِيْمَ"
    Array_arab += "وَ"
    Array_arab += "رَسُوْلُ اللهِ"
    Array_arab += "مُحَمّدًا"
    Array_arab += "أَنَّ"
    Array_arab += "وَ"
    Array_arab += "الله"
    Array_arab += "إِلَّا"
    Array_arab += "إلهَ"
    Array_arab += "لَا"
    Array_arab += "أنْ"
    Array_arab += "أنْ تَشْهَدَ"
    Array_arab += "الإسْلَامُ"
    Array_arab += "صلى الله عليه وسلم رَسُوْلُ اللهِ"
    Array_arab += "فَقَالَ"
    Array_arab += "الإِسْلَامِ"
    Array_arab += "عَنْ"
    Array_arab += "أَخْبِرْنِي"
    Array_arab += "مُحَمّدُ"
    Array_arab += "يَا"
    Array_arab += "قَالَ"
    Array_arab += "وَ"
    Array_arab += "فَخِذَيْهِ"
    Array_arab += "عَلَى"
    Array_arab += "كَفَّيْهِ"
    Array_arab += "وَضَعَ"
    Array_arab += "وَ"
    Array_arab += "رُكْبَتَيْهِ"
    Array_arab += "إِلَى"
    Array_arab += "رُكْبَتَيْهِ"
    Array_arab += "فَأَسْنَدَ"
    Array_arab += "صلى الله عليه و سلم"
    Array_arab += "النَّبِيّ"
    Array_arab += "إِلَى"
    Array_arab += "جَلَسَ"
    Array_arab += "حَتَّى"
    Array_arab += "أَحَدٌ"
    Array_arab += "مِنَّا"
    Array_arab += "يَعْرِفُهُ"
    Array_arab += "لَا"
    Array_arab += "وَ"
    Array_arab += "السَّفَرِ"
    Array_arab += "أَثَرِ"
    Array_arab += "عَلَيْهِ"
    Array_arab += "يُرَى"
    Array_arab += "لَا"
    Array_arab += "الشَّعْرِ"
    Array_arab += "سَوادِ"
    Array_arab += "شَدِيْدُ"
    Array_arab += "الثِيَابِ"
    Array_arab += "بَيَاضِ"
    Array_arab += "شَدِيْدُ"
    Array_arab += "رَجُلٌ"
    Array_arab += "عَلَيْنَا"
    Array_arab += "إِذْ طَلَعَ"
    Array_arab += "يَوْمٍ"
    Array_arab += "ذَاتَ"
    Array_arab += "صلى الله عليه و سلم"
    Array_arab += "رسولِ اللهِ"
    Array_arab += "عِنْدَ"
    Array_arab += "جُلُوْسٌ"
    Array_arab += "نَحْنُ"
    Array_arab += "بَيْنَمَا"
    Array_arab += "قَالَ"
    Array_arab += "أَيْضًا"
    Array_arab += "عنه"
    Array_arab += "الله"
    Array_arab += "رضِيَ"
    Array_arab += "عُمَرَ"
    Array_arab += "عَنْ"
    init_arabic()

    Array_indo += "Imam Muslim"
    Array_indo += "Mengeluarkannya (hadits ini)"
    Array_indo += "Agamamu"

    Array_indo += "(Untuk) mengajarkanmu"
    Array_indo += "Yang datang kepadamu"
    Array_indo += "Jibril"
    Array_indo += "Sesungguhnya (dia itu)"
    Array_indo += "Ia berkata"
    Array_indo += "Lebih tahu"
    Array_indo += "Rasul-Nya"
    Array_indo += "Dan"
    Array_indo += "Allah"
    Array_indo += "Aku menjawab"

    Array_indo += "Yang bertanya"
    Array_indo += "Siapa"
    Array_indo += "Tahukah engkau"
    Array_indo += "Umar"
    Array_indo += "Wahai"
    Array_indo += "(Nabi) berkata"
    Array_indo += "Kemudian"
    Array_indo += "Beberapa saat"
    Array_indo += " "
    Array_indo += "Ia pergi"

    Array_indo += "Kemudian"
    Array_indo += "Bangunan"
    Array_indo += "Dalam (mendirikan)"
    Array_indo += "Berlomba-lomba"
    Array_indo += "Kambing"
    Array_indo += "Pengembala"
    Array_indo += "Orang berbaju compang-camping"
    Array_indo += "Engkau melihat"
    Array_indo += "Dan"
    Array_indo += "Tuannya"

    Array_indo += "Seorang budak"
    Array_indo += "Melahirkan"
    Array_indo += "Ia bersabda"
    Array_indo += "Tanda-tanda nya"
    Array_indo += "Tentang"
    Array_indo += "Beritahukan kepadaku"
    Array_indo += "Ia berkata"
    Array_indo += "Yang bertanya"
    Array_indo += "Dari"
    Array_indo += "Lebih tau"

    Array_indo += "Ditanya"
    Array_indo += "Tidak"
    Array_indo += "Ia berkata"
    Array_indo += "Hari kiamat"
    Array_indo += "Tentang"
    Array_indo += "Beritahukan kepadaku"
    Array_indo += "Ia berkata"
    Array_indo += "Ia melihatmu"
    Array_indo += "Sesungguhnya"
    Array_indo += "Melihatnya"

    Array_indo += "Keadaan mu"
    Array_indo += "Tidak"
    Array_indo += "Maka jika"
    Array_indo += "Melihat-Nya"
    Array_indo += "Seakan-akan engkau"
    Array_indo += "(Kepada) Allah"
    Array_indo += "Engkau beribadah"
    Array_indo += "Ia berkata"
    Array_indo += "Ihsan"
    Array_indo += "Tentang"

    Array_indo += "Beritahukan kepadaku"
    Array_indo += "Ia berkata"
    Array_indo += "Engkau benar"
    Array_indo += "Ia berkata"
    Array_indo += "Yang buruk"
    Array_indo += "Dan"
    Array_indo += "Yang baik"
    Array_indo += "Kepada takdir"
    Array_indo += "Engkau beriman"
    Array_indo += "Dan"

    Array_indo += "Akhir"
    Array_indo += "Hari"
    Array_indo += "Dan"
    Array_indo += "Rasul-rasul-Nya"
    Array_indo += "Dan"
    Array_indo += "Kitab-kitab-Nya"
    Array_indo += "Dan"
    Array_indo += "Malaikat-malaikat-Nya"
    Array_indo += "Dan"
    Array_indo += "Kepada Allah"

    Array_indo += "Engkau beriman"
    Array_indo += "Ia bersabda"
    Array_indo += "Iman"
    Array_indo += "Tentang"
    Array_indo += "Beritahukan kepadaku"
    Array_indo += "Ia berkata"
    Array_indo += "Ia yang membenarkan nya"
    Array_indo += "Dan"
    Array_indo += "Ia yang bertanya"
    Array_indo += "Padanya"

    Array_indo += "Kamipun menjadi heran"
    Array_indo += "Engkau benar"
    Array_indo += "Ia berkata"
    Array_indo += "jalan"
    Array_indo += "Padanya"
    Array_indo += "Jika engkau mampu"
    Array_indo += "Ke baitullah"
    Array_indo += "Engkau berhaji"
    Array_indo += "Dan"
    Array_indo += "Ramadhan"

    Array_indo += "Engkau puasa"
    Array_indo += "Dan"
    Array_indo += "Zakat"
    Array_indo += "Engkau menunaikan"
    Array_indo += "Dan"
    Array_indo += "Shalat"
    Array_indo += "Engkau mendirikan"
    Array_indo += "Dan"
    Array_indo += "Utusan Allah"
    Array_indo += "Muhammad itu"

    Array_indo += "Bahwasanya"
    Array_indo += "Dan"
    Array_indo += "Allah"
    Array_indo += "Kecuali"
    Array_indo += "Ilah"
    Array_indo += "Tidak ada"
    Array_indo += "Bahwasanya"
    Array_indo += "Engkau bersaksi"
    Array_indo += "Islam itu"

    Array_indo += " "
    Array_indo += "Rasulullah"
    Array_indo += "Maka bersabda"
    Array_indo += "Islam"
    Array_indo += "Tentang"
    Array_indo += "Beritahukan kepadaku"
    Array_indo += "Muhammad"
    Array_indo += "Wahai"
    Array_indo += "Ia berkata"

    Array_indo += "dan"
    Array_indo += "Pahanya"
    Array_indo += "Di atas"
    Array_indo += "Kedua  telapak tangannya"
    Array_indo += "Ia meletakkan"
    Array_indo += "Dan"
    Array_indo += "Kedua lutut nabi"
    Array_indo += "Ke"
    Array_indo += "Kedua lututnya"
    Array_indo += "Lalu menempelkan"

    Array_indo += " "
    Array_indo += "Nabi"
    Array_indo += "Di (hadapan)"
    Array_indo += "Ia Duduk"
    Array_indo += "Kemudian"
    Array_indo += "Seorangpun"
    Array_indo += "Diantara kami"
    Array_indo += "Mengenalnya"
    Array_indo += "Tidak"
    Array_indo += "Dan"

    Array_indo += "Perjalanan"
    Array_indo += "Bekas"
    Array_indo += "Padanya"
    Array_indo += "Terlihat"
    Array_indo += "Tidak"
    Array_indo += "Rambut"
    Array_indo += "Hitam"
    Array_indo += "Sangat"
    Array_indo += "Baju"
    Array_indo += "Putih"

    Array_indo += "Sangat"
    Array_indo += "Seorang laki-laki"
    Array_indo += "Kepada kami"
    Array_indo += "Tiba-tiba datanglah"
    Array_indo += "Hari"
    Array_indo += "Pada suatu"
    Array_indo += " "
    Array_indo += "Rasulullah"
    Array_indo += "Bersama"

    Array_indo += "Sedang duduk"
    Array_indo += "Kami"
    Array_indo += "Ketika"
    Array_indo += "Ia berkata "
    Array_indo += "Juga"
    Array_indo += "Padanya"
    Array_indo += "Allah"
    Array_indo += "Semoga meridhoi"
    Array_indo += "Umar"
    Array_indo += "Dari"

    ArtiFull = "Dari ‘Umar ra. juga berkata: “Ketika kami sedang duduk bersama Rasulullah saw. pada suatu hari, tiba-tiba datanglah kepada kami seorang laki-laki yang mengenakan baju yang sangat putih dan berambut sangat hitam, tidak ditampakkan padanya kelelahan bekas perjalanan jauh dan tidak ada seorangpun di antara kami mengenalnya. Kemudian laki-laki itu duduk di hadapan Nabi saw. lalu menempelkan kedua lututnya pada lututnya Nabi saw. serta meletakkan tangannya di atas paha Nabi saw. laki-laki itu berkata: “Ya Muhammad! Beritahukan kepadaku tentang Islam!” Maka Rasulullah saw. bersabda: “Islam adalah engkau bersaksi bahwa sesungguhnya tidak ada Illah yang berhak disembah kecuali Allah, dan sesungguhnya Nabi Muhammad saw. adalah utusan Allah, engkau mendirikan shalat, engkau menunaikan zakat, engkau berpuasa di bulan Ramadhan, dan berhaji ke Baitullah jika engkau mampu.” Kemudian laki-laki itu berkata: “Engkau benar”. Kamipun menjadi heran kepada laki-laki itu, ia yang bertanya ia pula yang membenarkannya. Kemudian laki-laki itu berkata lagi: “Beritahukan kepadaku tentang iman!” Lalu Nabi saw. menjawab: “Engkau beriman kepada Allah, malaikat-malaikat-Nya, kitab-kitab-Nya, rasul-rasul-Nya, dan hari akhir dan engkau beriman pada takdir yang baik maupun yang buruk.” Kemudian laki-laki itu berkata: “Engkau benar”. Dan dia berkata lagi: “Beritahukan kepadaku tentang ihsan!”. Nabi saw bersabda: “Ihsan adalah engkau beribadah kepada Allah seakan-akan engkau melihatnya, dan jika engkau tidak melihatnya maka sesungguhnya Dia melihatmu.” Laki-laki itu berkata lagi: “Beritahukan kepadaku tentang hari kiamat!”. Nabi menjawab: “Yang ditanya tidak lebih tahu dari yang bertanya”. Laki-laki itu berkata: “Beritahukan kepadaku tentang tanda-tandanya!”, Nabi Saw menjawab: “Jika seorang budak melakirkan tuannya dan jika engkau melihat orang yang tidak beralas kaki, tidak berpakaian, miskin dan penggembala kambing, mereka saling bermegah-megahan meningggikan bangunan.” Kemudian laki-laki itu pergi. Beberapa saat setelah kepergiannya Nabi saw. bertanya kepadaku: “Wahai ‘Umar, tahukah engkau siapa yang bertanya tadi?” Aku menjawab: “Allah dan Rasul-Nya lebih mengetahui.” Nabi berkata: “Dia adalah Malaikat Jibril yang datang untuk mengajarkan kepadamu tentang agamamu.”"
    Penjelasan = "Penjelasan hadist\n" +
            "Allah menurunkan wahyu kepada Nabi Muhammad Saw. dapat diturunkan melalui mimpi, dibisikkan ke dalam hati, atau seperti hadits di atas yaitu malaikat Jibril datang secara langsung dalam wujud seorang laki-laki. \n" +
            "Secara bahasa, kata “Ihsan”, berasal dari Bahasa Arab yaitu أَحْسَنَ- يحسِنُ- إحسانًا  yang berarti berbuat baik. Berbeda maknanya dengan bentuk dasar, kata أَحْسَنَ merupakan bentuk turunan (Tsulatsi Mazid) dari kata حسُن- يحسُن  yang berarti baik.\n" +
            "Ihsan berarti berbuat baik, yaitu berbuat baik dalam menunaikan kewajiban kita kepada Allah dengan melakukan ibadah secara ikhlas dan mengikuti tuntunan Rasulullah saw.\n" +
            "Menurut hadits kedua dalam kitab arba’in an-nawawi, Nabi saw. bersabda: “Ihsan itu adalah engkau beribadah kepada Allah seakan-akan engkau melihatnya, dan jika engkau tidak melihatnya maka sesungguhnya Allah melihatmu.”\n" +
            "Menurut Syaikh As-Sa’di, ihsan itu terbagi dua, yaitu ihsan dalam ibadah dan ihsan dalam menunaikan hak sesama makhluk (mu’amalah).\n" +
            "a.   \tIhsan dalam ibadah maknanya beribadah kepada Allah seolah-olah Allah melihatnya atau ia merasa diawasi oleh Allah. Contohnya lebih meningkatkan kualitas shalat.\n" +
            "b.  \tIhsan dalam menunaikan hak sesama makhluk adalah menunaikan hak mereka, contohnya dengan kedudukan dan harta. Ihsan dengan kedudukan, yaitu dengan mempermudah orang lain dalam urusan pemerintah. Ihsan dengan harta yaitu dengan membayar zakat dan shadaqah.\n" +
            "Menurut Syaikh Ibnu ‘Utsaimin, derajat ihsan ada dua, yaitu derajat thalab dan derajat harb. Derajat thalab adalah derajat yang paling tinggi dibandingkan derajat harb, karena derajat thalab bermakna bahwa manusia menyembah Allah seolah-olah dia melihatnya dalam melaksanakan ibadah yang bersifat permohonan dan rasa cinta. Sedangkan derajat harb adalah menyembah Allah tetapi tidak bisa bersikap seakan-akan Allah melihatnya. \n" +
            "As-sa'ah berarti hari kebangkitan di mana manusia menghadap Allah \n" +
            "Ilmu tentang hari kiamat hanyalah milik Allah, tidak ada seorangpun yang mengetahui begitu pula dengan nabi muhammad. \n" +
            "Kiamat akan terjadi setelah melewati tanda-tandanya, diantaranya yang telah disebutkan dalam hadits; Jika seorang budak melakirkan tuannya dan jika engkau melihat orang yang tidak beralas kaki, tidak berpakaian, miskin dan penggembala kambing, mereka saling bermegah-megahan meningggikan bangunan. \n" +
            "\n"
    val hadist2 = HalamanBelajar("Hadist Arbain No. 2","(Iman, Islam, dan Ihsan) Hana" , resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

//    Hadist 3
    Array_arab += "مسلم"
    Array_arab += "و"
    Array_arab += "البخاري"
    Array_arab += "رواه"
    Array_arab += "رمَضَانَ"
    Array_arab += "صَوْمِ"
    Array_arab += "وَ"
    Array_arab += "البَيْتِ"
    Array_arab += "حَجِّ"
    Array_arab += "وَ"
    Array_arab += "الزَّكاةِ"
    Array_arab += "إِيْتَاءِ"
    Array_arab += "وَ"
    Array_arab += "الصّلَاةِ"
    Array_arab += "إِقَامِ"
    Array_arab += "وَ"
    Array_arab += "رَسُوْلُ الله"
    Array_arab += "مُحَمّدًا"
    Array_arab += "أنّ"
    Array_arab += "وَ"
    Array_arab += "الله"
    Array_arab += "إلّا"
    Array_arab += "إِلهَ"
    Array_arab += "لا"
    Array_arab += "أن"
    Array_arab += "شَهادَةِ"
    Array_arab += "خَمْسٍ"
    Array_arab += "عَلَى"
    Array_arab += "الإِسْلَامُ"
    Array_arab += "بُنِيَ"
    Array_arab += "يَقُوْلُ"
    Array_arab += "سلم"
    Array_arab += "و"
    Array_arab += "عليه"
    Array_arab += "الله"
    Array_arab += "صلى"
    Array_arab += "رَسُوْلَ الله"
    Array_arab += "سَمِعْتُ"
    Array_arab += "قَالَ"
    Array_arab += "عَنْهُمَا"
    Array_arab += "الله"
    Array_arab += "رَضِيَ"
    Array_arab += "أَبِي عَبْدِ الرَّحْمَنِ عَبْدِ اللهِ بْنِ عُمَرَ بْنِ الْخَطَّابِ"
    Array_arab += "عَن"

    Array_indo += "Imam Muslim"
    Array_indo += "Dan"
    Array_indo += "Imam al-Bukhari"
    Array_indo += "meriwayatkannya (hadits ini)"
    Array_indo += "Bulan ramadhan"
    Array_indo += "Shaum"
    Array_indo += "Dan"
    Array_indo += "(Ke) baitullah"
    Array_indo += "(Menunaikan) haji"
    Array_indo += "Dan"
    Array_indo += "Zakat"
    Array_indo += "Menunaikan"
    Array_indo += "Dan"
    Array_indo += "Shalat"
    Array_indo += "Mendirikan"
    Array_indo += "Dan"
    Array_indo += "Utusan Allah"
    Array_indo += "Muhammad"
    Array_indo += "Sesungguhnya"
    Array_indo += "Dan"
    Array_indo += "Allah"
    Array_indo += "Kecuali"
    Array_indo += "Tuhan"
    Array_indo += "Tidak ada"
    Array_indo += "Bahwasannya"
    Array_indo += "Bersaksi"
    Array_indo += "Lima"
    Array_indo += "Atas"
    Array_indo += "Islam itu"
    Array_indo += "Dibangun"
    Array_indo += "Ia berkata"
    Array_indo += "Salam"
    Array_indo += "Dan"
    Array_indo += "Kepadanya"
    Array_indo += "Allah (limpahkan)"
    Array_indo += "(Semoga) shalawat"
    Array_indo += "Rasulullah"
    Array_indo += "Aku mendengar"
    Array_indo += "Ia berkata"
    Array_indo += "Kepada keduanya"
    Array_indo += "Allah"
    Array_indo += "Semoga meridhoi"
    Array_indo += "Abi ‘Abdirrahman Abdullah bin Umar bin Khattab"
    Array_indo += "Dari"

    ArtiFull = "Dari Abu ‘Abdurrahman ‘Abdullah bin ‘Umar bin Al-Khattab radhiyallahu ‘anhuma, ia mengatakan bahwa ia mendengar Rasulullah shallallahu ‘alaihi wa sallam bersabda: “Islam dibangun di atas lima perkara: bersaksi bahwa tidak ada yang berhak disembah melainkan Allah dan Muhammad adalah utusan Allah; menunaikan shalat; menunaikan zakat; menunaikan haji (ke Baitullah); dan berpuasa Ramadhan.” \n"
    Penjelasan = "Penjelasan hadist\n" +
            "Islam diibaratkan seperti sebuah bangunan yang memiliki lima tiang pokok; 1). Syahadat 2). Shalat 3). Zakat 4). Shaum 5). Ibadah Haji \n" +
            "Seseorang disebut sebagai Islam ketika ia mengimani rukun islam. \n" +
            "Menegakkan shalat maksudnya adalah mengerjakan dengan memenuhi syarat dan rukunnya sesuai sunnah nabi. \n" +
            "Menunaikan zakat maksudnya mengeluarkan dan memberi kepada yang berhak menerima. \n" +
            "Shalat dan shaum merupakan amalan badaniyyah (anggota badan). Perbedaannya, shalat adalah amalan yang sifatnya mengerjakan sedangkan shaum adalah amalan anggota badan yang sifatnya menahan diri.\n" +
            "Zakat merupakan amalan maliyah (harta). \n" +
            "Ibadah haji merupakan amalan badaniyah dan maliyah bagi yang mampu\n"

    val hadist3 = HalamanBelajar("Hadist Arbain No. 3","(Rukun Islam) Hana", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    Array_arab += "مسلم"
    Array_arab += "و"
    Array_arab += "البخاري"
    Array_arab += "رَوَاهُ"
    Array_arab += "فَيَدْخَلُهَا"
    Array_arab += "فَ"
    Array_arab += "الجَنَّةِ"
    Array_arab += "أَهْلِ"
    Array_arab += "بِعَمَلِ"
    Array_arab += "فَيَعْمَلُ"
    Array_arab += "الكِتَابُ"
    Array_arab += "عليْهِ"
    Array_arab += "فَيَسْبِقُ"
    Array_arab += "ذِراعٌ"
    Array_arab += "إلّا"
    Array_arab += "بَيْنَهَا"
    Array_arab += "وَ"
    Array_arab += "بَيْنَهُ"
    Array_arab += "يَكُونُ"
    Array_arab += "مَا"
    Array_arab += "حَتَّى"
    Array_arab += "النَّارِ"
    Array_arab += "أَهْلِ"
    Array_arab += "بِعَمَلِ"
    Array_arab += "لَيَعْمَلُ"
    Array_arab += "أَحَدَكُمْ"
    Array_arab += "إنَّ"
    Array_arab += "وَ"
    Array_arab += "فَيَدْخَلُهَا"
    Array_arab += "النَّارِ"
    Array_arab += "أَهْلِ"
    Array_arab += "بِعمَلِ"
    Array_arab += "فَيَعْمَلُ"
    Array_arab += "الكِتَابُ"
    Array_arab += "عليهِ"
    Array_arab += "فَيَسْبِقُ"
    Array_arab += "ذِراعٌ"
    Array_arab += "إلّا"
    Array_arab += "بَيْنَهَا"
    Array_arab += "وَ"
    Array_arab += "بَيْنَهُ"
    Array_arab += "يَكُونُ"
    Array_arab += "ما"
    Array_arab += "حَتَّى"
    Array_arab += "الجَنَّةِ"
    Array_arab += "أَهْلِ"
    Array_arab += "بِعَمَلِ"
    Array_arab += "لَيَعْمَلُ"
    Array_arab += "أَحَدَكُمْ"
    Array_arab += "إنَّ"
    Array_arab += "غَيْرُهُ"
    Array_arab += "إِلهَ"
    Array_arab += "لَا"
    Array_arab += "الذي"
    Array_arab += "الله"
    Array_arab += "وَ"
    Array_arab += "فَ"
    Array_arab += "سَعِيدٌ"
    Array_arab += "أَوْ"
    Array_arab += "شَقِيٌّ"
    Array_arab += "وَ"
    Array_arab += "عَمَلِهِ"
    Array_arab += "وَ"
    Array_arab += "أَجَلِهِ"
    Array_arab += "وَ"
    Array_arab += "رِزْقِهِ"
    Array_arab += "بِكَتْبِ"
    Array_arab += "كَلِماتٍ"
    Array_arab += "بِأرْبَعِ"
    Array_arab += "يُؤْمَرُ"
    Array_arab += "وَ"
    Array_arab += "الرُّوْحَ"
    Array_arab += "فِيهِ"
    Array_arab += "فَيَنْفُخُ"
    Array_arab += "المَلَكُ"
    Array_arab += "إلَيْهِ"
    Array_arab += "يُرْسَلُ"
    Array_arab += "ثُمَّ"
    Array_arab += "ذَلِكَ"
    Array_arab += "مِثْلَ"
    Array_arab += "مُضْغَةً"
    Array_arab += "يَكُونُ"
    Array_arab += "ثُمَّ"
    Array_arab += "ذَلِكَ"
    Array_arab += "مِثْلَ"
    Array_arab += "عَلَقَةً"
    Array_arab += "يَكُونُ"
    Array_arab += "ثُمَّ"
    Array_arab += "نُطْفَةً"
    Array_arab += "يَوْمًا"
    Array_arab += "أرْبَعِيْنَ"
    Array_arab += "أُمِّهِ"
    Array_arab += "بَطْنِ"
    Array_arab += "فِي"
    Array_arab += "خَلْقُهُ"
    Array_arab += "يُجْمَعُ"
    Array_arab += "أَحَدَكُمْ"
    Array_arab += "إنَّ"
    Array_arab += "المَصْدُوْقُ"
    Array_arab += "الصَّادِقُ"
    Array_arab += "هو"
    Array_arab += "و"
    Array_arab += "سلم"
    Array_arab += "و"
    Array_arab += "عليه"
    Array_arab += "الله"
    Array_arab += "صلى"
    Array_arab += "رَسُولُ الله"
    Array_arab += "حدَّثَنَا"
    Array_arab += "قَالَ"
    Array_arab += "عَنْهُ"
    Array_arab += "الله"
    Array_arab += "رَضِيَ"
    Array_arab += "أَبِي عَبْدِ الرَّحْمَنِ  عَبْدِ اللهِ بنِ مَسْعُوْدٍ"
    Array_arab += "عَن"
    init_arabic()

    Array_indo += "Imam Muslim"
    Array_indo += "Dan"
    Array_indo += "Imam al-Bukhari"
    Array_indo += "mmeriwayatkannya (hadits ini)"
    Array_indo += "Maka ia masuk padanya"
    Array_indo += "Maka"
    Array_indo += "Surga"
    Array_indo += "Ahli"
    Array_indo += "Suatu amalan"
    Array_indo += "Maka ia melakukan"
    Array_indo += "Ketetapan"
    Array_indo += "Atasnya"
    Array_indo += "Kemudian ia didahului"
    Array_indo += "Sehasta"
    Array_indo += "Kecuali"
    Array_indo += "Di antara (neraka)"
    Array_indo += "Dan"
    Array_indo += "Antaranya (orang)"
    Array_indo += "Keadaan"
    Array_indo += " "
    Array_indo += "Sehingga"
    Array_indo += "Neraka"
    Array_indo += "Ahli"
    Array_indo += "Suatu amalan"
    Array_indo += "Ia melakukan"
    Array_indo += "Setiap diri kalian"
    Array_indo += "Sesungguhnya"
    Array_indo += "Dan"
    Array_indo += "Maka ia masuk padanya"
    Array_indo += "Neraka"
    Array_indo += "Ahli"
    Array_indo += "Suatu amalan"
    Array_indo += "Maka ia melakukan"
    Array_indo += "Ketetapan"
    Array_indo += "Atasnya"
    Array_indo += "Kemudian ia didahului"
    Array_indo += "Sehasta"
    Array_indo += "Kecuali"
    Array_indo += "Di antaranya (surga itu)"
    Array_indo += "Dan"
    Array_indo += "Antaranya (orang itu)"
    Array_indo += "Keadaan"
    Array_indo += " "
    Array_indo += "Sehingga"
    Array_indo += "Surga"
    Array_indo += "Ahli"
    Array_indo += "Amalan"
    Array_indo += "Ia melakukan"
    Array_indo += "Setiap diri kalian"
    Array_indo += "Sesungguhnya"
    Array_indo += "Selain-Nya"
    Array_indo += "Ilah"
    Array_indo += "Tidak ada"
    Array_indo += "Yang"
    Array_indo += "Allah"
    Array_indo += "Demi"
    Array_indo += "Maka"
    Array_indo += "Kebahagiaan"
    Array_indo += "Atau"
    Array_indo += "Kecelakaan"
    Array_indo += "Dan"
    Array_indo += "Amalnya"
    Array_indo += "Dan"
    Array_indo += "Ajalnya"
    Array_indo += "Dan"
    Array_indo += "Rizkinya"
    Array_indo += "Untuk menetapkan"
    Array_indo += "Perkara"
    Array_indo += "Dengan empat"
    Array_indo += "Diperintahkan"
    Array_indo += "Dan"
    Array_indo += "Ruh"
    Array_indo += "Padanya"
    Array_indo += "Lalu Ia meniupkan"
    Array_indo += "Seorang malaikat"
    Array_indo += "Kepadanya"
    Array_indo += "Diutus"
    Array_indo += "Kemudian"
    Array_indo += "Demikian"
    Array_indo += "Seperti"
    Array_indo += "Segumpal daging"
    Array_indo += "Menjadi"
    Array_indo += "Kemudian"
    Array_indo += "Demikian"
    Array_indo += "Seperti"
    Array_indo += "Setetes darah"
    Array_indo += "Menjadi"
    Array_indo += "Kemudian"
    Array_indo += "(Sebagai) setetes mani"
    Array_indo += "Hari"
    Array_indo += "Empat puluh"
    Array_indo += "Ibunya"
    Array_indo += "Perut"
    Array_indo += "Di"
    Array_indo += "Penciptaan nya"
    Array_indo += "Dikumpulkan"
    Array_indo += "Setiap diri  kalian"
    Array_indo += "Sesungguhnya"
    Array_indo += "Yang dibenarkan"
    Array_indo += "Orang yang benar"
    Array_indo += "Beliau adalah"
    Array_indo += "Dan"
    Array_indo += "Salam"
    Array_indo += "Dan"
    Array_indo += "Kepadanya"
    Array_indo += "Alllah (limpahkan)"
    Array_indo += "(Semoga) shalawat"
    Array_indo += "Rasulullah"
    Array_indo += "telah menyampaikan kepada kami"
    Array_indo += "Ia berkata"
    Array_indo += "Kepadanya"
    Array_indo += "Allah"
    Array_indo += "(Semoga) meridhoi"
    Array_indo += "Abu abdurrahman Abdullah bin Mas'ud"
    Array_indo += "Dari"

    val hadist4 = HalamanBelajar("Hadist Arbain No. 4","(Proses Penciptaan Manusia dan Iman Kepada Takdir) Hana" , resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

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

    ArtiFull = "Dari Ummul Mu’minin; Ummu Abdillah; ‘Aisyah Radhiyallahu ‘Anha dia berkata: Rasulullah Shallallahu ’Alaihi wa Sallam bersabda: “Siapa yang mengada-ada dalam urusan (agama) kami ini yang bukan bagian darinya, maka dia tertolak.” (Riwayat Bukhari dan Muslim), dalam riwayat Muslim disebutkan: “Siapa yang melakukan suatu amalan yang tidak ada contohnya dari kami, maka dia tertolak.”"
    Penjelasan = "Penjelasan hadist:\n" +
            "Larangan mengada-ada ibadah atau melakukan ibadah yang tidak ada dalilnya dari al-Quran dan Sunnah atau yang disebut denyan bid’ah\n" +
            "Islam merupakan agama dalail, dimana semua ibadah telah ditentukan hukum-hukumnya\n" +
            "Tidak ada satupun ketaatan kecuali telah Rasulullah contohkan atau perintahkan\n" +
            "Tidak ada satupun kemaksiatan kecuali Rasulullah telah memberikan peringatan\n" +
            "Syarat diterima ibadah ada 2, yaitu ikhlas—menjadikan Allah sebagai satu-satunya tujuan dalam ibadah, dan ittiba—mengikuti contoh yang telah Rasulullah jelaskan.\n"

    val hadist5 = HalamanBelajar("Hadist Arbain No. 5","(Larangan Bid’ah) Faiha" , resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

   Array_arab +=  "مُسْلِمٌ"
   Array_arab +=  "وَ"
   Array_arab +=  "البُخَارِي"
   Array_arab +=  "رَوَاهُ"
   Array_arab +=  "القَلْبُ"
   Array_arab +=  "هِيَ"
   Array_arab +=  "وَ"
   Array_arab +=  "أَلَا"
   Array_arab +=  "كُلُّهُ"
   Array_arab +=  "الجَسَدُ"
   Array_arab +=  "فَسَدَ"
   Array_arab +=  "فَسَدَتْ"
   Array_arab +=  "إِذَا"
   Array_arab +=  "وَ"
   Array_arab +=  "كُلُّهُ"
   Array_arab +=  "الجَسَدُ"
   Array_arab +=  "صَلُحَ"
   Array_arab +=  "صَلُحَتْ"
   Array_arab +=  "إِذَا"
   Array_arab +=  "مُضْغَةً"
   Array_arab +=  "الجَسَدِ"
   Array_arab +=  "فِي"
   Array_arab +=  "إِنَّ"
   Array_arab +=  "وَ"
   Array_arab +=  "أَلَا"
   Array_arab +=  "مَحَارِمُهُ"
   Array_arab +=  "اللهِ"
   Array_arab +=  "حِمَى"
   Array_arab +=  "إِنَّ"
   Array_arab +=  "وَ"
   Array_arab +=  "أَلاَ"
   Array_arab +=  "حِمًى"
   Array_arab +=  "مَلِكٍ"
   Array_arab +=  "لِكُلِّ"
   Array_arab +=  "إِنَّ"
   Array_arab +=  "وَ"
   Array_arab +=  "أَلاَ"
   Array_arab +=  "فيه"
   Array_arab +=  "أَنْ يرتع"
   Array_arab +=  "يُوْشِكُ"
   Array_arab +=  "الحِمَى"
   Array_arab +=  "حَوْلَ"
   Array_arab +=  "يَرْعَى"
   Array_arab +=  "كَالرَّاعِي"
   Array_arab +=  "الحَرَامِ"
   Array_arab +=  "فِي"
   Array_arab +=  "وَقَعَ"
   Array_arab +=  "الشُّبُهَاتِ"
   Array_arab +=  "فِي"
   Array_arab +=  "وَقَعَ"
   Array_arab +=  "مَنْ"
   Array_arab +=  "وَ"
   Array_arab +=  "عِرْضِهِ"
   Array_arab +=  "وَ"
   Array_arab +=  "لِدِيْنِهِ"
   Array_arab +=  "اسْتَبْرَأَ"
   Array_arab +=  "فَقَدِ"
   Array_arab +=  "الشُّبُهَاتِ"
   Array_arab +=  "اتَّقَى"
   Array_arab +=  "فَمَنِ"
   Array_arab +=  "النَّاسِ"
   Array_arab +=  "مِنَ"
   Array_arab +=  "كَثِيْرٌ"
   Array_arab +=  "يَعْلَمُهُنَّ"
   Array_arab +=  "لاَ"
   Array_arab +=  "مُشْتَبِهَاتٌ"
   Array_arab +=  "أُمُوْرٌ"
   Array_arab +=  "بَيْنَهُمَا"
   Array_arab +=  "وَ"
   Array_arab +=  "بَيِّنٌ"
   Array_arab +=  "الَحرَامَ"
   Array_arab +=  "إِنَّ"
   Array_arab +=  "وَ"
   Array_arab +=  "بَيِّنٌ"
   Array_arab +=  "الحَلاَلَ"
   Array_arab +=  "إِنَّ"
   Array_arab +=  "يَقُوْلُ"
   Array_arab +=  "صَلَّى اللهُ عَلَيْهِ وَآلِهِ وَسَلَّمَ"
   Array_arab +=  "رَسُوْلَ اللهِ"
   Array_arab +=  "سَمِعْتُ"
   Array_arab +=  "قَالَ"
   Array_arab +=  "عَنْهُمَا"
   Array_arab +=  "اللهُ"
   Array_arab +=  "رَضِيَ"
   Array_arab +=  "النُّعْمَان بْنِ بَشِيْرٍ"
   Array_arab +=  "أَبِي عَبْدِ اللهِ"
   Array_arab +=  "عَنْ"
    init_arabic()

    Array_indo += "Muslim"
    Array_indo += "dan"
    Array_indo += "Oleh Bukhari"
    Array_indo += "Diriwayatkan ia (haidst ini)"
    Array_indo += "hati"
    Array_indo += "Dia adalah"
    Array_indo += "dan"

    Array_indo += "Ketahuilah"
    Array_indo += "seluruhnya"
    Array_indo += "jasad"
    Array_indo += "maka telah rusak"
    Array_indo += "telah rusak"
    Array_indo += "jika"
    Array_indo += "dan"
    Array_indo += "seluruhnya"
    Array_indo += "jasad"
    Array_indo += "maka telah baik"

    Array_indo += "telah baik"
    Array_indo += "jika"
    Array_indo += "Ada segumpal daging"
    Array_indo += "jasad"
    Array_indo += "Di dalam"
    Array_indo += "sesungguhnya"
    Array_indo += "dan"
    Array_indo += "Ketahuilah"
    Array_indo += "Adalah yang diharamkan-Nya"
    Array_indo += "Allah"

    Array_indo += "Tanah larangan"
    Array_indo += "sesungguhnya"
    Array_indo += "dan"
    Array_indo += "Ketahuilah"
    Array_indo += "Tanah larangan"
    Array_indo += "raja"
    Array_indo += "Memiliki setiap (raja)"
    Array_indo += "sesungguhnya"
    Array_indo += "dan"
    Array_indo += "Ketahuilah"

    Array_indo += "Ke dalamnya"
    Array_indo += "Untuk memasuki"
    Array_indo += "Dilarang"
    Array_indo += "Tanah laranhan"
    Array_indo += "Di sekitar"
    Array_indo += "Mengembala"
    Array_indo += "Seperti pengembala"
    Array_indo += "yang haram"
    Array_indo += "kedalam"
    Array_indo += "taka dia tlah terjatuh"

    Array_indo += "perkara syubhat"
    Array_indo += "kedalam"
    Array_indo += "telah terjatuh"
    Array_indo += "barangsiapa"
    Array_indo += "dan"
    Array_indo += "Kehormatannya"
    Array_indo += "dan"
    Array_indo += "agamanya"
    Array_indo += "Membersihkan"
    Array_indo += "maka telah"

    Array_indo += "Perkara syubhat"
    Array_indo += "Menjauhi"
    Array_indo += "Maka barangsiapa"
    Array_indo += "manusia"
    Array_indo += "dari"
    Array_indo += "banyak"
    Array_indo += "mengetahui"
    Array_indo += "tidak"
    Array_indo += "Yang syubhat (samar-samar)"
    Array_indo += "Ada perkara"

    Array_indo += "Diantara keduanya"
    Array_indo += "dan"
    Array_indo += "jelas"
    Array_indo += "Yang haram"
    Array_indo += "sesungguhnya"
    Array_indo += "dan"
    Array_indo += "jelas"
    Array_indo += "Yang halal"
    Array_indo += "sesungguhnya"
    Array_indo += "berkata"

    Array_indo += "semoga Allah melimpahkan solawat dan salam (pada Muhammad)"
    Array_indo += "Rasulallah"
    Array_indo += "Aku mendengar"
    Array_indo += "Ia telah berkata"
    Array_indo += "keduanya"
    Array_indo += "Allah"
    Array_indo += "meridhari"
    Array_indo += "Nuaiman bin Basyir"
    Array_indo += "Ayahnya Abdullah"
    Array_indo += "Dari"

    ArtiFull = "Dari An-Nu’man bin Basyir Radhiyallahu ‘Anhuma, beliau mengatakan, “Saya mendengar Rasulullah Shallallahu ‘Alaihi wa Sallam bersabda, ‘Sungguh yang halal itu jelas, yang haram pun jelas. Dan diantara keduanya ada perkara yang syubhat –perkara yang rancu– yang tidak diketahui oleh kebanyakan orang. Maka barangsiapa yang menghindari syubhat, maka berarti dia telah membebaskan agama dan kehormatannya. Dan barangsiapa yang terjatuh ke dalam perkara-perkara syubhat, maka dia jatuh dalam perkara yang diharamkan oleh Allah Subhanahu wa Ta’ala. Seperti seorang gembala menggembalakan di sekitar tanah larangan. Hampir saja dia masuk dalam tanah larangan itu. Dan sungguh setiap Raja itu memiliki tanah larangan. Dan tanah larangan Allah Subhanahu wa Ta’ala adalah perkara-perkara yang diharamkanNya. Dan sungguh dalam jasad ini ada sekerat daging yang jika dia baik maka seluruh anggota tubuh akan baik dan jika dia rusak maka seluruh anggota tubuh akan rusak dan itu adalah hati.'” (HR. Al-Bukhari dan Muslim)"
    Penjelasan = "Penjelasan hadist\n" +
            "Tema utama hadits ini adalah tentang 3 hukum dalam islam, yaitu halal, haram, dan sesuatu yang samar di antara keduanya, yaitu syubhat\n" +
            "Kebanyakan manusia tidak mengetahui kejelasan hal-hal yang bersifat syubhat ini, hanya para ulama yang memahaminya. Maka sepatutnya kita mengikuti mereka. Tetapi apabila belum mengetahui pandangan ulama akan hukum sesuatu dan kita ragu apakah halal atau haram, maka langkah terbaiknya adalah meninggalkannya.\n" +
            "Jika kita meragukan sesuatu, maka tinggalkan dan utamakan yang jelas kehalalannya kecuali dalam keadaan darurat.\n" +
            "Kalau kita meragukan sesuatu dan malah melakukannya, ketika ternyata dia haram maka kita berdosa, tapi sebaliknya jika kita meninggalkannya kita akan mendapatkan pahala.\n" +
            "Permasalahan syubhat diumpamakan seperti penggembala kambing yang menggembalakan kambing di samping tanah larangan. maka dikhawatirkan kambingnya akan masuk ke tanah larangan. Orang yang mendekatkan diri dengan perkara syubhat akan mudah terjatuh dalam perkara haram.\n" +
            "Hati memiliki peranan penting dalam diri seseorang karena seseorang bertindak sesuai hatinya. Jadi hal pertana yang harus kita benahi adalah masalah hati.\n"

    val hadist6 = HalamanBelajar("Hadist Arbain No. 6","(Halal, Haram & Syubhat) Faiha" , resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    Array_arab += "مُسْلِمٌ"
    Array_arab += "رَوَاهُ"
    Array_arab += "عَامَّتِهِمْ"
    Array_arab += "وَ"
    Array_arab += "المُسْلِمِيْنَ"
    Array_arab += "لأَئِمَّةِ"
    Array_arab += "وَ"
    Array_arab += "لِرَسُوْلِهِ"
    Array_arab += "وَ"
    Array_arab += "لِكِتَابِهِ"
    Array_arab += "وَ"
    Array_arab += "للهِ"
    Array_arab += "قَالَ"
    Array_arab += "لِمَنْ"
    Array_arab += "قُلْنَا"
    Array_arab += "النَّصِيْحَةُ"
    Array_arab += "الدِّيْنُ"
    Array_arab += "قَالَ"
    Array_arab += "صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ"
    Array_arab += "النَّبِيَّ"
    Array_arab += "أَنَّ"
    Array_arab += "عَنْهُ"
    Array_arab += "اللهُ"
    Array_arab += "رَضِيَ"
    Array_arab += "أَبِيْ رُقَيَّةَ تَمِيْم بْنِ أَوْسٍ الدَّارِيِّ"
    Array_arab += "عَنْ"
    init_arabic()



    Array_indo += "Oleh Muslim"
    Array_indo += "Diriwayatkan"
    Array_indo += "seluruh kaum muslimin"
    Array_indo += "dan"
    Array_indo += "kaum muslimin"
    Array_indo += "untuk pemimpin"

    Array_indo += "dan"
    Array_indo += "untuk Rasul-Nya"
    Array_indo += "dan"
    Array_indo += "untuk kitab-Nya"
    Array_indo += "dan"
    Array_indo += "Untuk Allah"
    Array_indo += "dia berkata"
    Array_indo += "Untuk siapa"
    Array_indo += "Kami bertanya"
    Array_indo += "nasihat"

    Array_indo += "Agama itu"
    Array_indo += "dia berkata"
    Array_indo += "semoga Allah melimpahkan solwat dan salam (pada Muhammad)"
    Array_indo += "Rasulullah"
    Array_indo += "Sesungguhnya"
    Array_indo += "Kepadanya"
    Array_indo += "Allah"
    Array_indo += "meridhai"
    Array_indo += "Abu Ruqayyah Tamim bin Aus Ad"
    Array_indo += "Dari"


    val hadist7 = HalamanBelajar("Hadist Arbain No. 7","Agama Ini adalah Nasehat) Rai" , resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    Array_arab += "مُسْلِمٌ"
    Array_arab += "وَ"
    Array_arab += "اْلبُخَارِي"
    Array_arab += "رَوَاهُ"
    Array_arab += "تَعَالَى"
    Array_arab += "اللهِ"
    Array_arab += "عَلَى"
    Array_arab += "حِسَابُهُمْ"
    Array_arab += "وَ"
    Array_arab += "الإِسْلاَمِ"
    Array_arab += "بِحَقِّ"
    Array_arab += "إِلاَّ"
    Array_arab += "أَمْوَالَهُمْ"
    Array_arab += "وَ"
    Array_arab += "دِمَاءَهُمْ"
    Array_arab += "مِنِّيْ"
    Array_arab += "عَصَمُوْا"
    Array_arab += "ذَلِكَ"
    Array_arab += "فَعَلُوْا"
    Array_arab += "فَإِذَا"
    Array_arab += "الزَّكَاةَ"
    Array_arab += "يُؤْتُوْا"
    Array_arab += "وَ"
    Array_arab += "الصَّلاةَ"
    Array_arab += "يُقِيْمُوْا"
    Array_arab += "وَ"
    Array_arab += "رَسُوْلُ اللهِ"
    Array_arab += "مُحَمَّداً"
    Array_arab += "أَنَّ"
    Array_arab += "وَ"
    Array_arab += "لاَ إِلَهَ إِلاَّ اللهُ"
    Array_arab += "أَنْ"
    Array_arab += "يَشْهَدُوْا"
    Array_arab += "حَتَّى"
    Array_arab += "النَّاسَ"
    Array_arab += "أُقَاتِلَ"
    Array_arab += "أَنْ"
    Array_arab += "أُمِرْتُ"
    Array_arab += "قَالَ"
    Array_arab += "صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ"
    Array_arab += "رَسُوْلَ اللهِ"
    Array_arab += "أَنَّ"
    Array_arab += "عَنْهُمَا"
    Array_arab += "اللهُ"
    Array_arab += "رَضِيَ"
    Array_arab += "ابْنِ عُمَرَ"
    Array_arab += "عَنْ"
    init_arabic()

    Array_indo += "Muslim"
    Array_indo += "dan"
    Array_indo += "Oleh Bukhari"
    Array_indo += "Diriwayatkan"
    Array_indo += "Yang Maha Tinggi"
    Array_indo += "Allah"
    Array_indo += "di sisi"
    Array_indo += "perhitungan mereka"
    Array_indo += "dan"
    Array_indo += "Islam"
    Array_indo += "dengan hak"
    Array_indo += "kecuali"
    Array_indo += "harta mereka"
    Array_indo += "dan"
    Array_indo += "darah"
    Array_indo += "dariku"
    Array_indo += "mereka telah melindungi"
    Array_indo += "itu"
    Array_indo += "mereka telah melakukan"
    Array_indo += "Maka apabila"
    Array_indo += "zakat"
    Array_indo += "menunaikan"
    Array_indo += "dan"
    Array_indo += "shalat"
    Array_indo += "menegakkan"
    Array_indo += "dan"
    Array_indo += "utusan Allah"
    Array_indo += "Muhammad"
    Array_indo += "bahwa"
    Array_indo += "dan"
    Array_indo += "tidak ada sesembahan yang haq selain Allah"
    Array_indo += "bahwa"
    Array_indo += "mereka bersaksi"
    Array_indo += "hingga"
    Array_indo += "manusia"
    Array_indo += "memerangi"
    Array_indo += "bahwa"
    Array_indo += "Aku diperintahkan"
    Array_indo += "dia berkata"
    Array_indo += "semoga Allah melimpahkan solwat dan salam (pada Muhammad)"
    Array_indo += "Rasulullah"
    Array_indo += "Sesungguhnya"
    Array_indo += "Kepada keduanya"
    Array_indo += "Allah"
    Array_indo += "meridhai"
    Array_indo += "Ibnu ‘Umar"
    Array_indo += "Dari"
    ArtiFull = "“Dari Ibnu ‘Umar radhiyallahu ‘anhuma berkata: ‘Rasulullah shallallahu ‘alaihi wa sallam telah bersabda: ”Aku diperintahkan untuk memerangi manusia hingga mereka bersaksi bahwa tidak ada sesembahan yang haq selain Allah, dan Muhammad adalah utusan Allah, menegakkan shalat, menunaikan zakat. Maka apabila mereka telah melakukan itu semua, maka mereka telah melindungi darah dan harta mereka dariku, kecuali dengan hak Islam dan perhitungan mereka (hisab) di sisi Allah subhanahu wa ta’ala.” (HR. Al- Bukhari dan Muslim)"
    Penjelasan = "Penjelasan hadist\n" +
            "\n" +
            "1. Disyari’atkannya jihad dan memerangi orang-orang yang belum masuk Islam. Akan tetapi ada pengecualian dari hadits ini, yaitu mereka yang tidak mau masuk Islam, tetapi mereka mau membayar jizyah. Jizyah adalah uang atau semacam upeti yang diberikan kepada Nabi Muhammad Shallallahu ‘Alaihi wa Sallam agar mereka dibiarkan tinggal di negeri muslim dengan tetap mereka memeluk agama mereka. \n" +
            "\n" +
            "2. Untuk masuk Islam, cukup bagi kita mengucapkan kalimat لَا إِلٰهَ إِلَّا اللّٰهُ مُحَمَّدٌ رَسُولُ اللّٰهِ . Dan didasari dengan keyakinan kepada Allah Subhanahu wa Ta’ala dan Rasulullah Shallallahu ‘Alaihi wa Sallam.\n" +
            "\n" +
            "3. Jika kita telah melakukan dua hal ini (mengucapkan dua kalimat syahadat), maka kita dituntut untuk melengkapi dasar iman kita ini dengan menegakkan sholat dan menunaikan zakat.\n" +
            "\n" +
            "4. Saling terikatnya antara dua syahadat. Syahadat لَا إِلٰهَ إِلَّا اللّٰهُ  harus diiringi dengan syahadat  مُحَمَّدٌ رَسُولُ اللّٰهِ . Tidak boleh syahadat yang pertama saja atau yang kedua saja.\n" +
            "\n" +
            "5. Barangsiapa yang telah mengucapkan لَا إِلٰهَ إِلَّا اللّٰهُ مُحَمَّدٌ رَسُولُ اللّٰهِ, kemudian menegakkan sholat dan menunaikan zakat, maka berarti dia telah dianggap muslim, dianggap darah dan hartanya telah aman. Adapun urusan kebenaran imannya, diserahkan kepada Allah Subhanahu wa Ta’ala. Allah Subhanahu wa Ta’ala yang akan menghisab mereka di akhirat.\n" +
            "\n" +
            "6. Penetapan hisab di hari kiamat. Setiap muslim harus mengimani bahwa dunia tidak akan habis/ selesai begitu saja. Akan tetapi setelah kehidupan dunia ini ada perhitungan (hisab) terhadap apa yang telah kita usahakan/ kerjakan selama di dunia. \n" +
            "\n" +
            "7. Tingginya kedudukan sholat dan zakat. Keduanya adalah ibadah yang paling penting, syi’ar yang dalam Islam dipilih untuk mengiringi dua kalimat syahadat.\n" +
            "\n" +
            "8. Barangsiapa yang tidak menunaikan sholat/ zakat, maka pemerintah Islam boleh memaksa mereka untuk melakukan keduanya. Dan jika mereka tetap tidak mau melakukan keduanya, sementara mereka memiliki kekuatan, maka boleh bagi pemerintah Islam untuk memerangi mereka.\n" +
            "\n" +
            "9. Makna hak Islam. Jika seandainya ada seorang muslim yang telah mengucapkan dua kalimat syahadat, menegakkan sholat, dan menunaikan zakat, kemudian dia melakukan dosa yang dalam Islam hukumnya adalah dibunuh seperti ; berzina dalam keadaan sudah menikah, atau membunuh sesama muslim, atau murtad, maka perkara-perkara ini adalah hak Islam yang membolehkan kembali bagi pemerintah muslim untuk menumpahkan darah mereka.\n"
    val hadist8 = HalamanBelajar("Hadist Arbain No. 8","Terjaganya Darah dan Harta Seorang Muslim" , resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    Array_arab += ("مُسْلِمٌ")
    Array_arab += ("وَ")
    Array_arab += ("اْلبُخَارِي")
    Array_arab += ("رَوَاهُ")
    Array_arab += ("أَنْبِيَائِهِمْ")
    Array_arab += ("عَلَى")
    Array_arab += ("اخْتِلاَفُهُمْ")
    Array_arab += ("وَ")
    Array_arab += ("مَسَائِلِهِمْ")
    Array_arab += ("كَثْرَةُ")
    Array_arab += ("قَبْلِكُمْ")
    Array_arab += ("مِنْ")
    Array_arab += ("الَّذِيْنَ")
    Array_arab += ("أَهْلَكَ")
    Array_arab += ("فَإِنَّمَا")
    Array_arab += ("اسْتَطَعْتُمْ")
    Array_arab += ("مَا")
    Array_arab += ("مِنْهُ")
    Array_arab += ("فأْتُوْا")
    Array_arab += ("بِهِ")
    Array_arab += ("أَمَرْتُكُمْ")
    Array_arab += ("مَا")
    Array_arab += ("وَ")
    Array_arab += ("فَاجْتَنِبُوْهُ")
    Array_arab += ("عَنْهُ")
    Array_arab += ("نَهَيْتُكُمْ")
    Array_arab += ("مَا")
    Array_arab += ("يَقُوْلُ")
    Array_arab += ("صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ")
    Array_arab += ("رَسُوْلَ اللهِ")
    Array_arab += ("سَمِعْتُ")
    Array_arab += ("قَالَ")
    Array_arab += ("عَنْهُ")
    Array_arab += ("اللهُ")
    Array_arab += ("رَضِيَ")
    Array_arab += ("أَبِي هُرَيْرَةَ عَبْدِ الرَّحْمَنِ بْنِ صَخْرٍ")
    Array_arab += ("عَنْ")
    init_arabic()

    Array_indo += "Muslim"
    Array_indo += "dan"
    Array_indo += "Oleh Bukhari"
    Array_indo += "Diriwayatkan"
    Array_indo += "para nabi mereka"
    Array_indo += "terhadap"
    Array_indo += "penyelisihan"
    Array_indo += "dan"
    Array_indo += "pertanyaan"
    Array_indo += "banyaknya"
    Array_indo += "sebelum kalian"
    Array_indo += "dari"
    Array_indo += "yang"
    Array_indo += "telah membinasakan"
    Array_indo += "karena sesungguhnya"
    Array_indo += "semampu kalian"
    Array_indo += "Apa"
    Array_indo += "darinya"
    Array_indo += "maka kerjakanlah"
    Array_indo += "kepada kalian"
    Array_indo += "yang aku perintahkan"
    Array_indo += "apa"
    Array_indo += "dan"
    Array_indo += "maka jauhilah"
    Array_indo += "darinya"
    Array_indo += "yang aku larang kalian"
    Array_indo += "Apa"
    Array_indo += "berkata"
    Array_indo += "semoga Allah melimpahkan solwat dan salam (pada Muhammad)"
    Array_indo += "Rasulullah"
    Array_indo += "Aku mendengar"
    Array_indo += "dia berkata"
    Array_indo += "Kepadanya"
    Array_indo += "Allah"
    Array_indo += "meridhai"
    Array_indo += "Abu Hurairah Abdurrahman bin Shakhr"
    Array_indo += "Dari"
    ArtiFull = "Dari Abu Hurairah Abdurrahman bin Shakhr radhiyallahu ‘anhu, dia berkata: Aku mendengar Rasulullah shallallahu ‘alaihi wa sallam bersabda: ”Apa saja yang aku larang kalian darinya maka jauhilah, dan apa saja yang aku perintahkan kepada kalian maka kerjakanlah semampu kalian, karena sesungguhnya yang telah membinasakan orang-orang yang sebelum kalian adalah banyaknya pertanyaan  dan penyelisihan  terhadap para nabi mereka.”\n" +
            "Diriwayatkan oleh al Bukhari dan Muslim\n"
    Penjelasan = "Penjelasan hadist\n" +
            "\n" +
            "1. Wajibnya meninggalkan setiap apa yang diharamkan oleh Rasulullah Shallallahu ‘Alaihi wasallam. Seperti syirik, bid’ah, serta berbagai maksiat yang diharamkan oleh Allah Subhanahu wa Ta’ala. \n" +
            "\n" +
            "2. Kewajiban untuk melakukan setiap apa yang diperintahkan oleh Allah Subhanahu wa Ta’ala semampu kita. Jika mampu menjalankan sepenuhnya, maka jalankan sepenuhnya. Jika hanya mampu menjalankan sebagian, maka jalankan sebagiannya. Dan jika tidak mampu menjalankannya, maka tidak berdosa di hadapan Allah Subhanahu wa Ta’ala karena kita benar-benar tidak mampu.\n" +
            "\n" +
            "3. Perbedaan antara larangan dan kewajiban adalah larangan itu bisa dihindari secara mutlak hanya dengan diam saja. Sementara perintah itu membutuhkan usaha, dan tidak semua orang mampu melakukan usaha itu.\n" +
            "\n" +
            "4. Larangan itu lebih berat dari pada perintah. Karena larangan itu dilarang secara mutlak, sedangkan perintah itu diperintahkan namun diikat dengan semampu kita. \n" +
            "\n" +
            "5. Peringatan untuk jangan sampai jatuh ke dalam kesalahan yang pernah dilakukan oleh orang-orang ahlul kitab sebelum kita. Yaitu banyak bertanya terhadap hal-hal yang tidak perlu, dengan pertanyaan-pertanyaan yang tercela yang bisa membuat beban ibadah umat Islam bertambah, atau pun bisa membuat umat Islam justru malah loyo dalam menjalankan perintah-perintah Allah Subhanahu wa Ta’ala dan Rasulullah Shallallahu ‘Alaihi wa Sallam.\n"

    val hadist9 = HalamanBelajar("Hadist Arbain No. 9","Kerjakanlah Perintah yang Kamu Mampu" , resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    Array_arab += "مُسْلِمٌ"
    Array_arab += "رَوَاهُ"
    Array_arab += "لَهُ"
    Array_arab += "يُسْتَجَابُ"
    Array_arab += "فَأَنَّى"
    Array_arab += "بِالحَرَامِ"
    Array_arab += "غُذِيَ"
    Array_arab += "وَ"
    Array_arab += "حَرَامٌ"
    Array_arab += "مَلْبَسُهُ"
    Array_arab += "وَ"
    Array_arab += "حرام"
    Array_arab += "مشربه"
    Array_arab += "و"
    Array_arab += "حَرَامٌ"
    Array_arab += "مَطْعَمُهُ"
    Array_arab += "وَ"
    Array_arab += "يَا رَبِّ"
    Array_arab += "يَا رَبِّ"
    Array_arab += "السَّمَاءِ"
    Array_arab += "إِلَى"
    Array_arab += "يَدَيْهِ"
    Array_arab += "يَمُدُّ"
    Array_arab += "أَغْبَرَ"
    Array_arab += "أَشْعَثَ"
    Array_arab += "السَّفَرَ"
    Array_arab += "يُطِيْلُ"
    Array_arab += "الرَّجُلَ"
    Array_arab += "ذَكَرَ"
    Array_arab += "ثُمَّ"
    Array_arab += "رَزَقْنَاكُمْ"
    Array_arab += "مَا"
    Array_arab += "طَيِّبَاتِ"
    Array_arab += "مِنْ"
    Array_arab += "كُلُوا"
    Array_arab += "آمَنُوا"
    Array_arab += "الذِّيْنَ"
    Array_arab += "يَا أَيُّهَا"
    Array_arab += "تَعَالَى"
    Array_arab += "قَالَ"
    Array_arab += "وَ"
    Array_arab += "صَالِحًا"
    Array_arab += "اعْمَلُوا"
    Array_arab += "وَ"
    Array_arab += "الطَّيِّبَاتِ"
    Array_arab += "مِنَ"
    Array_arab += "كُلُوْا"
    Array_arab += "الرُّسُلُ"
    Array_arab += "يَا أَيُّهَا"
    Array_arab += "فَقَالَ"
    Array_arab += "المُرْسَلِيْنَ"
    Array_arab += "بِهِ"
    Array_arab += "أَمَرَ"
    Array_arab += "بِمَا"
    Array_arab += "المُؤْمِنِيْنَ"
    Array_arab += "أَمَرَ"
    Array_arab += "اللهَ"
    Array_arab += "إِنَّ"
    Array_arab += "وَ"
    Array_arab += "طَيِّباً"
    Array_arab += "إِلاَّ"
    Array_arab += "يَقْبَلُ"
    Array_arab += "لاَ"
    Array_arab += "طَيِّبٌ"
    Array_arab += "اللهَ"
    Array_arab += "إِنَّ"
    Array_arab += "صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ"
    Array_arab += "رَسُوْلُ اللهِ"
    Array_arab += "قَالَ"
    Array_arab += "قَالَ"
    Array_arab += "عَنْهُ"
    Array_arab += "اللهُ"
    Array_arab += "رَضِيَ"
    Array_arab += "أَبِي هُرَيْرَةَ"
    Array_arab += "عَنْ"
    init_arabic()

    Array_indo += "Oleh Muslim"
    Array_indo += "Diriwayatkan ia (haidst ini)"
    Array_indo += "baginya"
    Array_indo += "dikabulkan"
    Array_indo += "maka"
    Array_indo += "Dengan yang haram"
    Array_indo += "Makanan tambahannya"
    Array_indo += "dan"
    Array_indo += "haram"
    Array_indo += "pakaiannya"
    Array_indo += "dan"
    Array_indo += "haram"
    Array_indo += "minumannya"
    Array_indo += "dan"
    Array_indo += "haram"
    Array_indo += "makanannya"
    Array_indo += "dan"
    Array_indo += "Wahai Tuhanku"
    Array_indo += "Wahai Tuhanku"
    Array_indo += "langit"
    Array_indo += "ke"
    Array_indo += "Kedua tangannya"
    Array_indo += "dia menengadahkan"
    Array_indo += "dia berdebu"
    Array_indo += "dia kusut masai"
    Array_indo += "perjalanan"
    Array_indo += "memanjangkan"
    Array_indo += "Ada seorang lelaki"
    Array_indo += "(Rsul) menyebut"
    Array_indo += "kemudian"
    Array_indo += "Telah kami rezekikan untuk kalian"
    Array_indo += "Apa yang"
    Array_indo += "Yang baik-baik"
    Array_indo += "dari"
    Array_indo += "makanlah"
    Array_indo += "Yang beriman"
    Array_indo += "Oran-orang"
    Array_indo += "Wahai"
    Array_indo += "Yang Maha Tinggi"
    Array_indo += "Telah berfirman"
    Array_indo += "dan"
    Array_indo += "Amalan solih"
    Array_indo += "beramallah"
    Array_indo += "Dan"
    Array_indo += "Yang baik-baik"
    Array_indo += "dari"
    Array_indo += "makanlah"
    Array_indo += "Para Rasul"
    Array_indo += "Wahai"
    Array_indo += "Maka telah berfirman"
    Array_indo += "Para Rasul"
    Array_indo += "padanya"
    Array_indo += "Telah memerintahkan"
    Array_indo += "Dengan apa yang"
    Array_indo += "Orang-orang mukmin"
    Array_indo += "Telah memerintahkan"
    Array_indo += "sesungguhnya"
    Array_indo += "sesungguhnuya"
    Array_indo += "dan"
    Array_indo += "Yang baik"
    Array_indo += "kecuali"
    Array_indo += "menerima"
    Array_indo += "Tidak"
    Array_indo += "Maha baik"
    Array_indo += "Allah"
    Array_indo += "Sesungguhnya"
    Array_indo += "semoga Allah melimpahkan solwat dan salam (pada Muhammad)"
    Array_indo += "Rasulullah"
    Array_indo += "Telah bersabda"
    Array_indo += "Dia telah berkata"
    Array_indo += "kepadanya"
    Array_indo += "Allah"
    Array_indo += "meridhai"
    Array_indo += "Abu Hurairah"
    Array_indo += "Dari"
    ArtiFull = "Dari Abu Hurairah Radiyallahu ‘anhu berkata: Rasulullah shallallahu ‘alaihi wasallam bersabda: “Allah Subhanahu wa Ta’ala Maha Baik dan tidak menerima kecuali yang baik-baik saja. Dan sungguh Allah Subhanahu wa Ta’ala telah memerintahkan kepada orang-orang yang beriman sebagaimana dia telah  memerintahkan kepada para Rasul. Maka Allah berfirman: “Wahai para Rasul makanlah dari yang baik-baik dan beramallah yang shalih”. Sementara kepada orang-orang yang beriman Allah berfirman: “Wahai orang-orang yang beriman makanlah dari kebaikan apa yang telah Kami berikan kepada kalian sebagai rezeki.” Kemudian Nabi Muhammad Shalallahu ‘Alaihi wa Sallam menyebutkan ada seorang pria yang melakukan perjalanan jauh, pakaiannya kusut masai dan berdebu. Dia mengangkat tangannya ke langit mengatakan, ‘Wahai Tuhanku, Wahai Tuhanku.’ Sementara makanannya haram, minumannya haram, makanan tambahannya juga haram. Maka bagaimana orang tersebut bisa dikabulkan doanya.” (HR. Muslim)"
    Penjelasan = "Penjelasan hadist\n" +
            "Diantara sebab terkabulnya doa  adalah melakukan ketaatan kepada Allah dan meninggalkan segala larangannya.\n" +
            "Allah memerintahkan para Rasul untuk makan dari yang baik-baik dan berbuat soleh, begitupun kepada orang-orang beriman untuk makan dari yang baik-baik yang telah Allah rezekikan\n" +
            "Rasulullah menceritakan kisah seorang musafir yang panjang perjalanannya hingga keadaannya kurang baik, dia berdoa kepada Allah sedangkan apa-apa yang dia gunakan dan makan berasal dari yang haram, maka doanya tidak diijabah.\n" +
            "Syarat dikabulkannya doa adalah kita bersih dari hal-hal haram.\n" +
            "Jika doa kita tidak kunjung dikabulkan, maka kita harus intropeksi diri barangkali ada hal-hal haram yang masih kita gunakan.\n"

    val hadist10 = HalamanBelajar("Hadist Arbain No. 10","Allah Maha Baik dan Hanya Menerima yang Baik" , resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()
    Hadist += listOf(hadist1, hadist2, hadist3, hadist4, hadist5, hadist6, hadist7, hadist8, hadist9, hadist10)

//    Dongeng
//    Contoh buat dongeng:


//    Dongeng 1

//    Dongeng 2

//    Dongeng 3

//    Dongeng 4

//    Dongeng 5


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

