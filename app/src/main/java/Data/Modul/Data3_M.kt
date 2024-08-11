package Data.Modul

import Object.Quadruple
import Object.HalamanMateri
import Object.Modul
import androidx.compose.runtime.Composable

@Composable
fun Data3_M(){

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
//    for (i in 0..5){
//        Array_logat += Quadruple(3,i,2,"P2")
//        iterasi++
//    }
//
//    for (i in 0..4){
//        Array_logat += Quadruple(4,i,1, "S2")
//        iterasi++
//    }
//
//    for (i in 0..4){
//        Array_logat += Quadruple(6,i,2, "P2")
//        iterasi++
//    }
//
//    for (i in 0..13){
//        Array_logat += Quadruple(8,i,3, "O")
//        iterasi++
//    }
//
//    for (i in 0..4){
//        Array_logat += Quadruple(9,i,3, "O")
//        iterasi++
//    }
//
//    for (i in 0..4){
//        Array_logat += Quadruple(10,i,3, "O")
//        iterasi++
//    }
//
//    for (i in 0..4){
//        Array_logat += Quadruple(11,i,3, "O")
//        iterasi++
//    }
//
//    for (i in 0..1){
//        Array_logat += Quadruple(12,i,3, "O")
//        iterasi++
//    }
//
//    for (i in 0..6){
//        Array_logat += Quadruple(13,i,3, "O")
//        iterasi++
//    }
//
//    for (i in 0..8){
//        Array_logat += Quadruple(15,i,1, "S1")
//        iterasi++
//    }
//
//    for (i in 0..12){
//        Array_logat += Quadruple(16,i,2, "P1")
//        iterasi++
//    }

    //contoh doang duplikat ada di arr 11
//    for (i in 7..12){
//        Array_logat += Quadruple(16,i,1, "S2")
//        iterasi++
//    }
//    Array_Duplicate += Pair(16,iterasi - 1)



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

    ArtiFull = ""
    Penjelasan = "\n" + "Frasa adalah satuan bahasa yang lebih besar dari kata, karena frasa bisa terdiri dari dua kata atau lebih, tapi sifatnya non-predikatif. Maksudnya apa? Predikat adalah yang menjelaskan apa yang dilakukan subjek, bagaimana keadaan subjek, atau apa yang subjek rasakan, dan lainnya. Intinya predikat tugasnya menjelaskan subjek. Subjek itu apa? Subjek adalah yang menjadi pokok bahasan dalam kalimat yang dijelaskan oleh predikat. \n" +
            "Contoh: \n" +
            "Saya makan nasi. \n" +
            "Saya sebagai subjek, pokok yang dibahas dalam kalimat. Makan sebagai predikat, yaitu menjelaskan apa yang dilakukan subjek. Sedangkan nasi sebagai objek yang dimakan. Kalimat pada contoh tersebut tidak mengandung frasa, karena frasa terdiri dari dua kata atau lebih yang tidak memiliki predikat. \n" +
            "Catatan penting lainnya, kedudukan frasa dalam mengisi fungsi kalimat sama dengan kata. Frasa hanya bisa mengisi satu fungsi kalimat. Baik sebagai subjek, predikat, objek, maupun keterangan. \n" +
            "Contoh Frasa: \n" +
            "Saya sudah makan nasi. \n" +
            "Kalimat di atas mengandung frasa, yaitu “sudah makan”. Kata ‘sudah’ dan ‘makan’ adalah satu kesatuan yang mengisi satu fungsi kalimat yaitu sebagai predikat. Tapi jika diurai, kata ‘sudah’ tidak bisa disebut sebagai subjek dan ‘makan’ sebagai predikat, melainkan tetap sebagai satu kesatuan. Itulah yang dimaksud non-predikatif dan hanya bisa mengisi satu fungsi kalimat.\n" +
            "Frasa dalam bahasa Arab ada sangat banyak. Berikut ini adalah jenis-jenis frasa dalam bahasa Arab yang paling sering muncul:\n" +
            "1. Frasa Preposisional (Pp) \n" +
            "Frasa Preposisional atau Frasa Preposisi dalam bahasa Arab disebut jar majrur. Jar majrur adalah frasa yang diawali partikel preposisi atau huruf jar. Huruf jar ini bertugas membuat kata benda (nomina) setelahnya beri’rab jar, secara umum ditandai dengan harakat kasrah. Huruf jar ini hanya bisa bergabung dengan nomina, ya. Tidak mungkin ada verba yang bergandengan dengan huruf jar. \n" +
            "Partikel preposisi terdiri dari:\n" +
            "مِنْ (dari)\n" +
            "إِلَى (ke)\n" +
            "عَنْ (dari/tentang)\n" +
            "عَلَى (atas)\n" +
            "فِي (di dalam)\n" +
            "رُبَّ (banyak/sedikit)\n" +
            "بِـ (dengan)\n" +
            " كَـ (seperti)\n" +
            "لِـ (milik/untuk)\n" +
            "huruf qosam (Sumpah) (وَ) / (تَ) / (بِ)\n" +
            "Contoh:\n" +
            "نَكْتُبُ فِى الْكِتَابِ \n" +
            "(Kami menulis di dalam buku)\n" +
            "Apa yang digaris bawahi pada kalimat di atas adalah frasa preposisi. الْكِتَابِ asalnya adalah الْكِتَابُ. Karena dia dimasuki فِى di depan nya sebagai partikel preposisi, maka harakat akhir الْكِتَابُ harus berubah menjadi kasrah. Jadilah فِى الْكِتَابِ.\n" +
            "2. Frasa Idhafy (Fi)\n" +
            "Frasa Idhafy adalah gabungan dua kata atau lebih–bisasnya hanya dua kata– yang ditandai dengan kata pertamanya tidak dilengkapi alif lam tapi juga tidak dilengkapi tanwin, sedangkan kata keduanya dilengkapi alif lam, dengan catatan wajib jar, atau secara umum ditandai dengan harakat kasrah. Kata pertama dalam frasa idhafy disebut ‘mudhaf’, sedangkan kata keduanya disebut ‘mudhaf ilaih’.\n" +
            "Contoh:\n" +
            " كِتَابُ المُدَرِّسِ\n" +
            "(Buku guru)\n" +
            "Kata pertama dari frasa idhafy di atas adalah كِتَابُ. Dia tidak menerima alif lam, tapi juga tidak menerima tanwin. Padahal, kata nomina itu wajib tanwin jika tidak ada alif lam, wajib ada alif lam jika tidak ada tanwin. Namun karena nomina كِتَابُ akan menjadi kata pertama (mudhaf) dalam frasa idhafy, maka tidak boleh ada kedua hal tersebut di dalamnya. Kemudian kata keduanya (mudhaf ilaih) المُدَرِّسِ, terdapat alif lam di dalamnya, dan harakat akhirnya menjadi kasrah. \n" +
            "Tidak semua mudhaf ilaih harus alif lam, ya. Yang jelas ia akan menjadi jar, atau berharakat kasrah. Contohnya frasa كِتَابُ زَيْدٍ (Buku zaid).\n" +
            "3. Frasa Na’ty\n" +
            "Frasa na’ty dalam bahasaArab bisa disebut sifat-mausuf atau na’at-man’ut, yaitu frasa yang mengandung sifat. Bisanya ditandai dengan arti ‘yang’. Misalnya “wanita yang cantik” atau “buku yang baru”.\n" +
            "Ciri dari frasa na’ty adalah antara kata pertama dan kedua harus sama dari segi ada alif lamnya atau tidak, feminin (muannats) atau maskulin (mudzakar), dan i’rab nya, atau harakat akhirnya. \n" +
            "Contoh:\n" +
            "التِلْمِيْدُ المُجْتَهِدُ\n" +
            "(Murid yang rajin)\n" +
            "Kata pertamanya disebut mausuf/man’ut. Kata pertama dalam frasa di atas adalah التِلْمِيْدُ ‘murid’. Kata keduanya disebut sifat, dalam frasa di atas adalah المُجْتَهِدُ ‘rajin’. Keduanya sama-sama memiliki alif lam dan harakat akhirnya sama. Keduanya juga bukan muannats, salah satu tandanya adalah tidak ada huruf ة di akhir katanya. \n"



    val modul3 = HalamanMateri("Frasa", "dalam Bahasa Arab", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Modul.add(modul3)
}