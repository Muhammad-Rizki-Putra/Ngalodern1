package Object

import Data.Hadist.Data5
import androidx.compose.runtime.Composable

var sizehd: Int = 0
var sizedg: Int = 0

var Hadist: MutableList<HalamanBelajar> = mutableListOf()
var Dongeng: MutableList<HalamanBelajar> = mutableListOf()

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

    fun init_arabic(){
        for (i in Array_arab.indices) {
            Array_arab[i] = Array_arab[i] + " "
        }
    }

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

    for (i in 0..5){
        Array_logat += Quadruple(5,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(6,i,2, "P2")
        iterasi++
    }

    for (i in 6..7){
        Array_logat += Quadruple(6,i,1, "S2")
        iterasi++
    }
    Array_Duplicate += Pair(6, iterasi - 1)

    for (i in 0..13){
        Array_logat += Quadruple(7,i,3, "O")
        iterasi++
    }

    for (i in 0..3){
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

    for (i in 0..1){
        Array_logat += Quadruple(11,i,3, "O")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(12,i,3, "O")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(13,i,2, "P2")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(14,i,2, "P3")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(15,i,1, "S3")
        iterasi++
    }

    ArtiFull = "Dari Abu ‘Abdurrahman ‘Abdullah bin ‘Umar bin Al-Khattab radhiyallahu ‘anhuma, ia mengatakan bahwa ia mendengar Rasulullah shallallahu ‘alaihi wa sallam bersabda: “Islam dibangun di atas lima perkara: bersaksi bahwa tidak ada yang berhak disembah melainkan Allah dan Muhammad adalah utusan Allah; menunaikan shalat; menunaikan zakat; menunaikan haji (ke Baitullah); dan berpuasa Ramadhan.” \n"
    Penjelasan = "Penjelasan hadist\n" +
            "Islam diibaratkan seperti sebuah bangunan yang memiliki lima tiang pokok; 1). Syahadat 2). Shalat 3). Zakat 4). Shaum 5). Ibadah Haji \n" +
            "Seseorang disebut sebagai Islam ketika ia mengimani rukun islam. \n" +
            "Menegakkan shalat maksudnya adalah mengerjakan dengan memenuhi syarat dan rukunnya sesuai sunnah nabi. \n" +
            "Menunaikan zakat maksudnya mengeluarkan dan memberi kepada yang berhak menerima. \n" +
            "Shalat dan shaum merupakan amalan badaniyyah (anggota badan). Perbedaannya, shalat adalah amalan yang sifatnya mengerjakan sedangkan shaum adalah amalan anggota badan yang sifatnya menahan diri.\n" +
            "Zakat merupakan amalan maliyah (harta). \n" +
            "Ibadah haji merupakan amalan badaniyah dan maliyah bagi yang mampu\n"

    var uniqueFirstElements3 = Array_logat.map { it.first }.toSet()
    var resultArray3 = uniqueFirstElements3.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    Array_logat_B += Pair(0,"Pp")
    Array_logat_B += Pair(1,"N1")
    Array_logat_B += Pair(5,"V1")
    Array_logat_B += Pair(6,"V1")
    Array_logat_B += Pair(13,"Vnl")
    Array_logat_B += Pair(14,"V1")
    Array_logat_B += Pair(16,"Pp")
    Array_logat_B += Pair(18,"K")
    Array_logat_B += Pair(24,"Ko")
    Array_logat_B += Pair(28,"Ko")
    Array_logat_B += Pair(40,"Ko")

    val hadist3 = HalamanBelajar("Hadist Arbain No. 3","(Rukun Islam) Hana", resultArray3 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    //hadist 4
    Array_arab += "مسلم"
    Array_arab += "و"
    Array_arab += "البخاري"
    Array_arab += "رَوَاهُ"
    Array_arab += "فَيَدْخَلُهَا"
    Array_arab += "فَ"
    Array_arab += "الجَنَّةِ"
    Array_arab += "أَهْلِ"
    Array_arab += "بِعَمَلِ" // 106
    Array_arab += "فَيَعْمَلُ"
    Array_arab += "الكِتَابُ"
    Array_arab += "عليْهِ"
    Array_arab += "فَيَسْبِقُ"// 102
    Array_arab += "ذِراعٌ"
    Array_arab += "إلّا"
    Array_arab += "بَيْنَهَا"
    Array_arab += "وَ"
    Array_arab += "بَيْنَهُ"
    Array_arab += "يَكُونُ"
    Array_arab += "مَا"
    Array_arab += "حَتَّى"
    Array_arab += "النَّارِ" // 93
    Array_arab += "أَهْلِ"
    Array_arab += "بِعَمَلِ"  //91
    Array_arab += "لَيَعْمَلُ"
    Array_arab += "أَحَدَكُمْ"
    Array_arab += "إنَّ"
    Array_arab += "وَ"
    Array_arab += "فَيَدْخَلُهَا"
    Array_arab += "النَّارِ"
    Array_arab += "أَهْلِ"
    Array_arab += "بِعمَلِ" // 83
    Array_arab += "فَيَعْمَلُ"
    Array_arab += "الكِتَابُ"
    Array_arab += "عليهِ"
    Array_arab += "فَيَسْبِقُ" // 79
    Array_arab += "ذِراعٌ"
    Array_arab += "إلّا"
    Array_arab += "بَيْنَهَا"
    Array_arab += "وَ"
    Array_arab += "بَيْنَهُ"
    Array_arab += "يَكُونُ"
    Array_arab += "ما"
    Array_arab += "حَتَّى" // 71
    Array_arab += "الجَنَّةِ"
    Array_arab += "أَهْلِ"
    Array_arab += "بِعَمَلِ" // 68
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
    Array_arab += "أَوْ" // 56
    Array_arab += "شَقِيٌّ"
    Array_arab += "وَ"
    Array_arab += "عَمَلِهِ"
    Array_arab += "وَ"
    Array_arab += "أَجَلِهِ"
    Array_arab += "وَ"
    Array_arab += "رِزْقِهِ"
    Array_arab += "بِكَتْبِ" // 48
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
    Array_arab += "ذَلِكَ" // 36
    Array_arab += "مِثْلَ" //35
    Array_arab += "مُضْغَةً"
    Array_arab += "يَكُونُ"
    Array_arab += "ثُمَّ"
    Array_arab += "ذَلِكَ" // 31
    Array_arab += "مِثْلَ" // 30
    Array_arab += "عَلَقَةً"
    Array_arab += "يَكُونُ"
    Array_arab += "ثُمَّ"
    Array_arab += "نُطْفَةً" // 26
    Array_arab += "يَوْمًا"
    Array_arab += "أرْبَعِيْنَ"
    Array_arab += "أُمِّهِ"
    Array_arab += "بَطْنِ"
    Array_arab += "فِي"
    Array_arab += "خَلْقُهُ" // 20
    Array_arab += "يُجْمَعُ" // 19
    Array_arab += "أَحَدَكُمْ"
    Array_arab += "إنَّ"
    Array_arab += "المَصْدُوْقُ" // 16
    Array_arab += "الصَّادِقُ" // 15
    Array_arab += "هو" // 14
    Array_arab += "و"
    Array_arab += "سلم"
    Array_arab += "و"
    Array_arab += "عليه"
    Array_arab += "الله"
    Array_arab += "صلى"
    Array_arab += "رَسُولُ الله"
    Array_arab += "حدَّثَنَا"
    Array_arab += "قَالَ" // 5
    Array_arab += "عَنْهُ"
    Array_arab += "الله" // 3
    Array_arab += "رَضِيَ" // 2
    Array_arab += "أَبِي عَبْدِ الرَّحْمَنِ  عَبْدِ اللهِ بنِ مَسْعُوْدٍ" // 1
    Array_arab += "عَن" // 0
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

    Array_logat_B += Pair(0,"Pp")
    Array_logat_B += Pair(1,"N1")
    Array_logat_B += Pair(2,"Vl")
    Array_logat_B += Pair(4,"Pp")
    Array_logat_B += Pair(6,"Vl")
    Array_logat_B += Pair(27,"Ko")
    Array_logat_B += Pair(32,"Ko")
    Array_logat_B += Pair(38,"Vnl")
    Array_logat_B += Pair(39,"Pp")
    Array_logat_B += Pair(40,"N1")
    Array_logat_B += Pair(42,"Pp")
    Array_logat_B += Pair(45,"Vnl")
    Array_logat_B += Pair(46,"Pp")
    Array_logat_B += Pair(48,"Pp")
    Array_logat_B += Pair(50,"Ko")
    Array_logat_B += Pair(56,"Ko")
    Array_logat_B += Pair(68,"Pp")
    Array_logat_B += Pair(71,"Ko")
    Array_logat_B += Pair(79,"Ko")
    Array_logat_B += Pair(83,"Pp")
    Array_logat_B += Pair(91,"Pp")
    Array_logat_B += Pair(104,"N1")
    Array_logat_B += Pair(106,"Pp")

    for (i in 0..6){
        Array_logat += Quadruple(2,i,2,"P2")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(3,i,1,"S2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(5,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(6,i,2,"P2")
        iterasi++
    }
    
    for (i in 6..9){
        Array_logat += Quadruple(6,i,3,"O")
        iterasi++
    }
    
    Array_Duplicate += Pair(6,iterasi - 1)

    for (i in 0..12){
        Array_logat += Quadruple(7,i,1,"S2")
        iterasi++
    }
    
    for (i in 0..2){
        Array_logat += Quadruple(14,i,1,"S2")
        iterasi++
    }

    for (i in 0..2){
        Array_logat += Quadruple(14,i,1,"S1")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(15,i,2,"P1")
        iterasi++
    }
    
    for (i in 0..12){
        Array_logat += Quadruple(16,i,2,"P1")
        iterasi++
    }
    
    for (i in 0..8){
        Array_logat += Quadruple(19,i,2,"P3")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(20,i,1,"S3")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(21,i,3,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(22,i,3,"K")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(23,i,3,"K")
        iterasi++
    }

    for (i in 0..11){
        Array_logat += Quadruple(24,i,3,"K")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(25,i,3,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(26,i,3,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(35,i,3,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(36,i,3,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(38,i,2,"P3")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(40,i,1,"S3")
        iterasi++
    }

    for (i in 1..10){
        Array_logat += Quadruple(41,i,2,"P2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(43,i,3,"O")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(45,i,2,"P3")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(46,i,3,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(47,i,3,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(48,i,3,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(49,i,3,"K")
        iterasi++
    }

    for (i in 0..2){
        Array_logat += Quadruple(50,i,3,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(51,i,3,"K")
        iterasi++
    }

    for (i in 0..2){
        Array_logat += Quadruple(52,i,3,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(53,i,3,"K")
        iterasi++
    }

    for (i in 0..2){
        Array_logat += Quadruple(54,i,2,"P1")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(55,i,2,"P1")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(56,i,2,"P1")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(57,i,2,"P1")
        iterasi++
    }

    for (i in 1..10){
        Array_logat += Quadruple(67,i,2,"P1")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(68,i,3,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(69,i,3,"K")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(70,i,3,"K")
        iterasi++
    }

    for (i in 1..10){
        Array_logat += Quadruple(79,i,2,"P2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(81,i,1,"S2")
        iterasi++
    }

    for (i in 1..10){
        Array_logat += Quadruple(82,i,2,"P2")
        iterasi++
    }

    for (i in 0..7){
        Array_logat += Quadruple(83,i,3,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(84,i,3,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(85,i,3,"K")
        iterasi++
    }

    for (i in 1..9){
        Array_logat += Quadruple(86,i,2,"P2")
        iterasi++
    }

    for (i in 10..13){
        Array_logat += Quadruple(86,i,3,"K")
        iterasi++
    }

    Array_Duplicate += Pair(86,iterasi - 1)

    for (i in 1..10){
        Array_logat += Quadruple(90,i,2,"P2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(91,i,3,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(92,i,3,"K")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(93,i,3,"K")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(102,i,2,"P2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(104,i,1,"S2")
        iterasi++
    }

    for (i in 1..10){
        Array_logat += Quadruple(105,i,2,"P2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(106,i,3,"K")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(107,i,3,"K")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(108,i,3,"K")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(110,i,2,"P2")
        iterasi++
    }

    for (i in 10..13){
        Array_logat += Quadruple(110,i,3,"O")
        iterasi++
    }

    Array_Duplicate += Pair(110,iterasi - 1)

    var uniqueFirstElements4 = Array_logat.map { it.first }.toSet()
    var resultArray4 = uniqueFirstElements4.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    ArtiFull = "Dari Abu Abdurrahman Abdullah bin Mas’ud radhiyallahu ‘anhu beliau berkata, Rasulullah shallallahu ’alaihi wa sallam menyampaikan kepada kami dan beliau adalah orang yang benar dan dibenarkan, “Sesungguhnya setiap kalian dikumpulkan penciptaannya di perut ibunya sebagai setetes mani (nuthfah) selama empat puluh hari, kemudian berubah menjadi setetes darah (‘alaqah) selama empat puluh hari, kemudian menjadi segumpal daging (mudhgah) selama empat puluh hari. Kemudian diutus kepadanya seorang malaikat lalu ditiupkan padanya ruh dan diperintahkan untuk ditetapkan empat perkara, yaitu rezekinya, ajalnya, amalnya dan kecelakaan atau kebahagiaannya. Demi Allah yang tidak ada sesembahan yang berhak disembah selain-Nya. Sesungguhnya di antara kalian ada yang melakukan perbuatan ahli surga hingga jarak antara dirinya dan surga tinggal sehasta. Akan tetapi telah ditetapkan baginya ketentuan, dia melakukan perbuatan ahli neraka maka masuklah dia ke dalam neraka. Sesungguhnya di antara kalian ada yang melakukan perbuatan ahli neraka hingga jarak antara dirinya dan neraka tinggal sehasta. Akan tetapi telah ditetapkan baginya ketentuan, dia melakukan perbuatan ahli surga  maka masuklah dia ke dalam surga.”"

    Penjelasan = "Penjelasan hadist: \n" +
            "Hadist ini membuktikan kebenaran apa yang disampaikan Rasulullah SAW. sesuai dengan apa ilmu pengetahuan saat ini, dimana pembentukan manusia dalam rahim mulai dari nuthfah (setetes mani), ‘alaqah (segumpal darah), mudhgah (segumpal daging) masing-masing selama 40 hari dan ditiupkan ruh pada usia 120 hari. Dan Allah mengurus manusia dalam rahim melalui malaikat.\n" +
            "Rezeki, ajal, amal, bahagia atau sengsara dari setiap manusia sudah diketahui, dicatat, dikehendaki dan ditetapkan oleh Allah. Maka sebenarnya tidak ada yang perlu kita khawatirkan terkait sesuatu yang telah Allah tentukan.\n" +
            "Manusia tidak mengetahui takdir yang ditetapkan untuknya. Sehingga manusia tetap harus ada usaha dan amal, tidak boleh ia hanya sekedar pasrah pada takdir.\n" +
            "Bahagia atau sengsara tergantung dari amalan akhir seseorang itu seperti apa.\n"

    val hadist4 = HalamanBelajar("Hadist Arbain No. 4","Proses Penciptaan Manusia dan Iman Kepada Takdir" , resultArray4 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)

    //hadist 6
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

    Array_logat_B += Pair(0,"Pp")
    Array_logat_B += Pair(1,"N1")
    Array_logat_B += Pair(5,"Pp")
    Array_logat_B += Pair(7,"V1")
    Array_logat_B += Pair(10,"Vnl")

    var uniqueFirstElements6 = Array_logat.map { it.first }.toSet()
    var resultArray6 = uniqueFirstElements6.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val hadist6 = HalamanBelajar("Hadist Arbain No. 6","(Halal, Haram & Syubhat) Faiha" , resultArray6 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    //hadist 7
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

    for (i in 0..45){
        Array_logat += Quadruple(1,i,1,"S1")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(2,i,2,"P2")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(3,i,1,"S1")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(8,i,2,"P2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(9,i,1,"S1")
        iterasi++
    }

    for (i in 0..12){
        Array_logat += Quadruple(10,i,2,"P1")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(11,i,2,"P2")
        iterasi++
    }

    for (i in 4..7){
        Array_logat += Quadruple(11,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(11,iterasi - 1)

    for (i in 0..5){
        Array_logat += Quadruple(13,i,2,"P2")
        iterasi++
    }

    ArtiFull = "Dari Abu Ruqayyah Tamim bin Aus Ad radhiyallahu ‘anhu, dia berkata: “Sesungguhnya Rasulullah shallallahu ‘alaihi wa sallam bersabda: ”Agama itu nasihat.” Kami bertanya: ”Untuk siapa?” Beliau shallallahu ‘alaihi wa sallam menjawab: ”Untuk Allah, untuk kitab-Nya, untuk Rasul-Nya, untuk pemimpin kaum muslimin dan seluruh kaum muslimin.”\n" +
            "Diriwayatkan oleh Muslim (no 55) \n"

    Penjelasan = "Penjelasan hadist\n" +
            "\n" +
            "1. Nasihat untuk mengesakan Allah Subhanahu wa Ta’ala. Baik dengan tauhid rububiyyah, uluhiyyah, dan asma’ wa shifat. Kemudian melakukan ketaatan kepadaNya, ikhlas dalam menjalankan ibadah kepadaNya, mencintai karena Allah Subhanahu wa Ta’ala, membenci karena Allah Subhanahu wa Ta’ala, berjihad melawan orang-orang kafir, dan berdakwah.\n" +
            "\n" +
            "2. Nasihat untuk kitab-kitab Allah Subhanahu wa Ta’ala. Di antaranya adalah mengimani bahwasanya kitab-kitab tersebut adalah wahyu dari Allah Subhanahu wa Ta’ala yang diturunkan kepada para nabi dan rasul untuk dijadikan sebagai petunjuk dan pedoman dalam kehidupan hamba-hambaNya. \n" +
            "\n" +
            "3. Nasihat untuk rasul-rasulNya. Maknanya yaitu beriman kepada para rasul Allah Subhanahu wa Ta’ala, secara khusus yaitu beriman kepada Nabi Muhammad Shallallahu ‘Alaihi wa Sallam bahwasanya beliau adalah rasul akhir zaman yang diutus untuk semua umat manusia yang hidup sampai akhir zaman. Akan tetapi kita tidak meyakini para rasul sebagai tuhan, keluarga tuhan, anak tuhan, atau yang lainnya. \n" +
            "\n" +
            "4. Nasihat untuk para pemimpin umat Islam. Di antara bentuk nasihat kepada para pemimpin adalah mendukung mereka di atas kebenaran, mentaati mereka dalam kebaikan, wajib menasehati mereka dengan lemah lembut dan secara tertutup (empat mata), mendoakan mereka dengan kebaikan, serta tidak mengkudeta/ memberontak kepada mereka selama mereka adalah muslim.\n" +
            "\n" +
            "5. Nasihat untuk orang awam dalam kalangan umat Islam. Di antaranya adalah memberikan mereka petunjuk kepada maslahat mereka, menegur mereka saat mereka berbuat salah dalam keadaan menyendiri (tidak di depan umum), membantu dalam urusan dunia mereka dalam kebaikan, mengajari mereka dalam urusan dunia dan agama mereka, menutupi aib mereka, peduli pada kebutuhan mereka yang fakir miskin, membela mereka, dan tidak berbuat curang kepada mereka.\n"

    var uniqueFirstElements7 = Array_logat.map { it.first }.toSet()
    var resultArray7 = uniqueFirstElements7.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    Array_logat_B += Pair(0,"Pp")
    Array_logat_B += Pair(1,"N1")
    Array_logat_B += Pair(2,"Vl")
    Array_logat_B += Pair(4,"Pp")
    Array_logat_B += Pair(6,"N1")
    Array_logat_B += Pair(7,"Pp")
    Array_logat_B += Pair(7,"K")
    Array_logat_B += Pair(8,"Vl")
    Array_logat_B += Pair(9,"N1")
    Array_logat_B += Pair(10,"N1")
    Array_logat_B += Pair(11,"Vl")
    Array_logat_B += Pair(12,"Pp")
    Array_logat_B += Pair(13,"Vl")
    Array_logat_B += Pair(14,"Pp")
    Array_logat_B += Pair(15,"Ko")
    Array_logat_B += Pair(15,"Pp")
    Array_logat_B += Pair(17,"Ko")
    Array_logat_B += Pair(17,"Pp")
    Array_logat_B += Pair(19,"Ko")
    Array_logat_B += Pair(19,"Pp")
    Array_logat_B += Pair(21,"N+")
    Array_logat_B += Pair(22,"Ko")
    Array_logat_B += Pair(22,"N+")

    val hadist7 = HalamanBelajar("Hadist Arbain No. 7","Agama Ini adalah Nasehat" , resultArray7 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    //hadist 8
    Array_arab += "مُسْلِمٌ"
    Array_arab += "وَ"
    Array_arab += "اْلبُخَارِي"
    Array_arab += "رَوَاهُ"
    Array_arab += "تَعَالَى"
    Array_arab += "اللهِ"
    Array_arab += "عَلَى"
    Array_arab += "حِسَابُهُمْ" // 39
    Array_arab += "وَ"
    Array_arab += "الإِسْلاَمِ"
    Array_arab += "بِحَقِّ"
    Array_arab += "إِلاَّ"
    Array_arab += "أَمْوَالَهُمْ"
    Array_arab += "وَ"
    Array_arab += "دِمَاءَهُمْ" // 32
    Array_arab += "مِنِّيْ"
    Array_arab += "عَصَمُوْا" // 30
    Array_arab += "ذَلِكَ"
    Array_arab += "فَعَلُوْا" // 28
    Array_arab += "فَإِذَا"
    Array_arab += "الزَّكَاةَ" // 26
    Array_arab += "يُؤْتُوْا" // 25
    Array_arab += "وَ"
    Array_arab += "الصَّلاةَ" // 23
    Array_arab += "يُقِيْمُوْا" // 22
    Array_arab += "وَ"
    Array_arab += "رَسُوْلُ اللهِ"
    Array_arab += "مُحَمَّداً"
    Array_arab += "أَنَّ"
    Array_arab += "وَ"
    Array_arab += "لاَ إِلَهَ إِلاَّ اللهُ"
    Array_arab += "أَنْ"
    Array_arab += "يَشْهَدُوْا" //14
    Array_arab += "حَتَّى"
    Array_arab += "النَّاسَ" // 12
    Array_arab += "أُقَاتِلَ"
    Array_arab += "أَنْ"
    Array_arab += "أُمِرْتُ"
    Array_arab += "قَالَ" // 8
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

    for (i in 0..6){
        Array_logat += Quadruple(2,i,2,"P2")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(3,i,1,"S2")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(8,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(9,i,2,"P2")
        iterasi++
    }

    for (i in 6..7){
        Array_logat += Quadruple(9,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(9,iterasi - 1)

    for (i in 0..7){
        Array_logat += Quadruple(12,i,3,"O")
        iterasi++
    }

    for (i in 0..1){
        Array_logat += Quadruple(14,i,1,"S2")
        iterasi++
    }

    for (i in 2..7){
        Array_logat += Quadruple(14,i,2,"P2")
        iterasi++
    }
    Array_Duplicate += Pair(14,iterasi - 1)

    for (i in 8..11){
        Array_logat += Quadruple(14,i,1,"S2")
        iterasi++
    }

    for (i in 0..1){
        Array_logat += Quadruple(22,i,1,"S2")
        iterasi++
    }

    for (i in 2..7){
        Array_logat += Quadruple(22,i,2,"P2")
        iterasi++
    }

    Array_Duplicate += Pair(22,iterasi - 1)

    for (i in 7..11){
        Array_logat += Quadruple(22,i,1,"S2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(23,i,3,"O")
        iterasi++
    }

    for (i in 0..1){
        Array_logat += Quadruple(25,i,1,"S2")
        iterasi++
    }

    for (i in 2..5){
        Array_logat += Quadruple(25,i,2,"P2")
        iterasi++
    }

    Array_Duplicate += Pair(25,iterasi - 1)

    for (i in 6..9){
        Array_logat += Quadruple(25,i,1,"S2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(26,i,3,"O")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(28,i,2,"P2")
        iterasi++
    }

    for (i in 6..9){
        Array_logat += Quadruple(28,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(28,iterasi - 1)

    for (i in 0..5){
        Array_logat += Quadruple(30,i,2,"P2")
        iterasi++
    }

    for (i in 6..9){
        Array_logat += Quadruple(30,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(30,iterasi - 1)

    for (i in 0..11){
        Array_logat += Quadruple(32,i,3,"O")
        iterasi++
    }

    for (i in 0..11){
        Array_logat += Quadruple(39,i,1,"S1")
        iterasi++
    }

    Array_logat_B += Pair(0,"Pp")
    Array_logat_B += Pair(2,"Vl")
    Array_logat_B += Pair(4,"Pp")
    Array_logat_B += Pair(7,"Pp")
    Array_logat_B += Pair(7,"K")
    Array_logat_B += Pair(8,"Vl")
    Array_logat_B += Pair(9,"Vl")
    Array_logat_B += Pair(11,"Vnl")
    Array_logat_B += Pair(12,"N+")
    Array_logat_B += Pair(13,"Ko")
    Array_logat_B += Pair(14,"Vnl")
    Array_logat_B += Pair(16,"Ko")
    Array_logat_B += Pair(17,"Ko")
    Array_logat_B += Pair(21,"Ko")
    Array_logat_B += Pair(22,"Vnl")
    Array_logat_B += Pair(24,"Ko")
    Array_logat_B += Pair(25,"Vnl")
    Array_logat_B += Pair(27,"Ko")
    Array_logat_B += Pair(28,"Vl")
    Array_logat_B += Pair(30,"Vl")
    Array_logat_B += Pair(32,"N+")
    Array_logat_B += Pair(33,"Ko")
    Array_logat_B += Pair(34,"N+")
    Array_logat_B += Pair(36,"Pp")
    Array_logat_B += Pair(38,"Ko")
    Array_logat_B += Pair(40,"Pp")

    var uniqueFirstElements8 = Array_logat.map { it.first }.toSet()
    var resultArray8 = uniqueFirstElements8.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val hadist8 = HalamanBelajar("Hadist Arbain No. 8","Terjaganya Darah dan Harta Seorang Muslim" , resultArray8 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    //hadist 9
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
    Array_arab += ("أَهْلَكَ") // 23
    Array_arab += ("فَإِنَّمَا")
    Array_arab += ("اسْتَطَعْتُمْ") // 21
    Array_arab += ("مَا")
    Array_arab += ("مِنْهُ")
    Array_arab += ("فأْتُوْا") // 18
    Array_arab += ("بِهِ")
    Array_arab += ("أَمَرْتُكُمْ") // 16
    Array_arab += ("مَا")
    Array_arab += ("وَ")
    Array_arab += ("فَاجْتَنِبُوْهُ") //13
    Array_arab += ("عَنْهُ")
    Array_arab += ("نَهَيْتُكُمْ") //12
    Array_arab += ("مَا")
    Array_arab += ("يَقُوْلُ") // 10
    Array_arab += ("صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ")
    Array_arab += ("رَسُوْلَ اللهِ") // 8
    Array_arab += ("سَمِعْتُ") // 7
    Array_arab += ("قَالَ") // 6
    Array_arab += ("عَنْهُ")
    Array_arab += ("اللهُ") // 4
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

    Array_logat_B += Pair(0,"Pp")
    Array_logat_B += Pair(1,"N1")
    Array_logat_B += Pair(1,"N1")
    Array_logat_B += Pair(2,"Vl")
    Array_logat_B += Pair(4,"Pp")
    Array_logat_B += Pair(5,"Vl")
    Array_logat_B += Pair(6,"Vl")
    Array_logat_B += Pair(8,"Pp")
    Array_logat_B += Pair(8,"K")
    Array_logat_B += Pair(9,"Vnl")
    Array_logat_B += Pair(11,"Vl")
    Array_logat_B += Pair(12,"Pp")
    Array_logat_B += Pair(13,"Ko")
    Array_logat_B += Pair(14,"Ko")
    Array_logat_B += Pair(16,"Vl")
    Array_logat_B += Pair(18,"Ko")
    Array_logat_B += Pair(19,"Pp")
    Array_logat_B += Pair(20,"Ko")
    Array_logat_B += Pair(21,"N+")
    Array_logat_B += Pair(21,"K")
    Array_logat_B += Pair(21,"Vl")
    Array_logat_B += Pair(22,"Ko")
    Array_logat_B += Pair(23,"Vl")
    Array_logat_B += Pair(24,"Ko")
    Array_logat_B += Pair(25,"Pp")
    Array_logat_B += Pair(26,"Pt")
    Array_logat_B += Pair(28,"N+")
    Array_logat_B += Pair(29,"N+")
    Array_logat_B += Pair(29,"Ko")
    Array_logat_B += Pair(31,"Pp")
    Array_logat_B += Pair(32,"N+")

    for (i in 0..47){
        Array_logat += Quadruple(1,i,1,"S1")
        iterasi++
    }

    for (i in 0..6){
        Array_logat += Quadruple(2,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(3,i,1,"S2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(5,i,2,"P2")
        iterasi++
    }

    for (i in 0..3){
        Array_logat += Quadruple(6,i,2,"P2")
        iterasi++
    }

    for (i in 4..8){
        Array_logat += Quadruple(6,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(6,iterasi - 1)

    for (i in 0..14){
        Array_logat += Quadruple(7,i,3,"O")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(9,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(11,i,2,"P2")
        iterasi++
    }

    for (i in 6..7){
        Array_logat += Quadruple(11,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(11,iterasi - 1)

    for (i in 8..12){
        Array_logat += Quadruple(11,i,3,"O")
        iterasi++
    }

    for (i in 12..14){
        Array_logat += Quadruple(13,i,3,"O")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(16,i,2,"P2")
        iterasi++
    }

    for (i in 6..7){
        Array_logat += Quadruple(16,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(16,iterasi - 1)

    for (i in 8..12){
        Array_logat += Quadruple(16,i,3,"O")
        iterasi++
    }


    for (i in 0..8){
        Array_logat += Quadruple(18,i,2,"P2")
        iterasi++
    }

    for (i in 0..8){
        Array_logat += Quadruple(21,i,2,"P2")
        iterasi++
    }

    for (i in 9..13){
        Array_logat += Quadruple(21,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(21,iterasi - 1)

    for (i in 0..8){
        Array_logat += Quadruple(23,i,2,"P2")
        iterasi++
    }

    var uniqueFirstElements9 = Array_logat.map { it.first }.toSet()
    var resultArray9 = uniqueFirstElements9.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val hadist9 = HalamanBelajar("Hadist Arbain No. 9","Kerjakanlah Perintah yang Kamu Mampu" , resultArray9 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    //hadist 10
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
    Array_arab += "أَمَرَ" // 19
    Array_arab += "اللهَ"
    Array_arab += "إِنَّ"
    Array_arab += "وَ"
    Array_arab += "طَيِّباً"
    Array_arab += "إِلاَّ" //14
    Array_arab += "يَقْبَلُ" // 13
    Array_arab += "لاَ" // 12
    Array_arab += "طَيِّبٌ" // 11
    Array_arab += "اللهَ"
    Array_arab += "إِنَّ"
    Array_arab += "صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ"
    Array_arab += "رَسُوْلُ اللهِ" // 7
    Array_arab += "قَالَ" // 6
    Array_arab += "قَالَ" // 5
    Array_arab += "عَنْهُ" // 4
    Array_arab += "اللهُ"
    Array_arab += "رَضِيَ"
    Array_arab += "أَبِي هُرَيْرَةَ" // 1
    Array_arab += "عَنْ" // 0
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

    var uniqueFirstElements10 = Array_logat.map { it.first }.toSet()
    var resultArray10 = uniqueFirstElements10.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val hadist10 = HalamanBelajar("Hadist Arbain No. 10","Allah Maha Baik dan Hanya Menerima yang Baik" , resultArray10 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()
    Hadist += listOf(hadist1, hadist2, hadist3, hadist4, hadist6, hadist7, hadist8, hadist9, hadist10)
    Data5()
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

    ArtiFull = "Pada mulanya, Pangandaran bernama Bojong Kalalar, yang artinya tempat yang hanya untuk dilewati musuh- musuh ketika zaman penjajah, yaitu ketika zaman Belanda dan Jepang, sampai tempat tersebut menjadi aman.\n" +
            "\n" +
            "Setelah maju, aman, serta subur, Bojong Kalalar berubah menjadi tempat mencari makanan sehingga banyak orang datang dari luar daerah. Akhirnya, lama kelamaan tempat itu berubah nama menjadi Pangan-daran, yang mempunyai arti tempat mencari makanan bagi para pendatang (andar-andar).\n" +
            "\n"

    val dongeng2: HalamanBelajar = HalamanBelajar("بانجانداران", "2. Pangandaran", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

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
    Array_arab += "ثَرْوَاتَهَا"
    Array_arab += "وَ"
    Array_arab += "نيني أَنْدِيتْ"
    Array_arab += "مَنْزِلَ"
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
    Array_arab += "خَوْفًا"
    Array_arab += "حُقُولِ الْأُرْزِّ"
    Array_arab += "وَسَطِ"
    Array_arab += "فِي"
    Array_arab += "مَنْزِلًا"
    Array_arab += "بَنَتْ"
    Array_arab += "وَ"
    Array_arab += "الْآخَرِينَ"
    Array_arab += "عَنْ"
    Array_arab += "نَفْسَهَا"
    Array_arab += "عَزَلَتْ"
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

    val dongeng3: HalamanBelajar = HalamanBelajar("", "3. Situ Bagendit", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

//    Dongeng 4
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

    ArtiFull = "Tersebutlah pada zaman dahulu hidup seorang perempuan yang dikenal sebagai Nini Anteh. la menikah dengan Aki Balangantrang, sudah lama tidak memiliki anak. Karena sangat merindukan seorang anak, ia memelihara seekor kucing berbulu tiga warna, yang biasa dipanggil Candramawat.\n" +
            "\n" +
            "Kehidupan Nini anteh sangat miskin, Hidupnya sangat menderita. Para tetangganya menjauhinya. Ia tidak diperhatikan sama sekali malah selalu dihina. Tiada seorang pun yang iba terhadap nasibnya.\n" +
            "\n" +
            "Pada suatu malam, Nini Anteh memandang bulan yang menerangi bumi. Dalam benaknya ia membayangkan betapa tentramnya hidup di bulan. Sepertinya tak akan ada seorang pun yang menghina dan mencela kehidupannya lagi. Nini Anteh akhirnya menyampaikan hasratnya itu kepada Aki Balangantrang, suaminya. Ia juga mengatakan bahwa di bulan la akan menenun kain. Aki Balangantrang tidak bisa menolak keingan istrinya. Akhirnya Nini anteh pergi ke bulan ditemani   Candramawat\n" +
            "\n"

    val dongeng4: HalamanBelajar = HalamanBelajar("نيني أنتيه", "4. Nini Anteh", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

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

    val dongeng5: HalamanBelajar = HalamanBelajar("سي كابايان تُرِيدُ اللّيْمُوْنَ", "5. Sikabayan Ingin Buah Limau", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    clearArrays()

    Dongeng += listOf(dongeng1, dongeng2, dongeng3, dongeng4, dongeng5)

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