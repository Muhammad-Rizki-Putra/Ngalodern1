package Data.Modul

import Object.Quadruple
import Object.HalamanMateri
import Object.Modul
import androidx.compose.runtime.Composable

@Composable
fun Data2_M(){

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
    Penjelasan = "\n" + "Kalimat dalam bahasa Arab disebut jumlah mufidah, atau kalam. Artinya, kalimat adalah rangkaian kata yang sudah memiliki makna yang utuh. Kalimat dalam bahasa Arab terbagi menjadi dua, yaitu jumlah ismiyah dan jumlah fi’liyah. \n" +
            "\n1. Jumlah ismiyah\n" +
            "Jumlah ismiyah adalah kalimat yang diawali dengan اسم/isim (nomina). Fungsi yang bekerja dalam kalimat ini adalah mubtada sebagai subjeknya, dan khabar sebagai predikatnya. Jadi, dalam ngalogat modern, struktur jumlah ismiyah diisi oleh fungsi S1 (subjek mubtada) dan P1 (predikat khabar) \n" +
            "Contoh: \n" +
            "القلمُ جديدٌ \n" +
            "(Pulpen itu baru) \n" +
            "Subjek mubtada dalam kalimat di atas adalah القلمُ. Syarat dari mubtada yaitu: \n" +
            "\n" +
            "Harus ma’rifat (bermakna khusus) biasanya ditandai alif lam dan tidak ada tanwin\n" +
            "I’rab nya harus rofa, ditandai dengan harakat akhirnya dhammah. \n" +
            "Predikat khabar dalam kalimat di atas adalah جديدٌ. Syarat dari khabar adalah: \n" +
            "Wajib nakirah (bermakna umum) ditandai dengan munculnya tanwin \n" +
            "Hati-hati, ya. Jangan terbalik dengan frasa na’ty! Kalau frasa na’ty baik kata pertama maupun kedua, jika ada alif lam maka keduanya harus alif lam, jika tidak maka keduanya tidak ada alif lam. Yuk, bedakan frasa na’ty dan kalimat dengan struktur jumlah ismiyah! \n" +
            "Frasa na’ty: \n" +
            "المكتبةُ الكبيرةُ \n" +
            "(Perpustakaan yang besar) \n" +
            "Frasa di atas tidak menjelaskan apa-apa karena tidak mengandung predikat. \n" +
            "Jumlah ismiyah: \n" +
            "المكتبةُ كبيرةٌ \n" +
            "(Perpustakaan itu besar) \n" +
            "Jika kita gunakan metode ngalogat modern, maka analisis struktur kalimat di atas adalah sebagai berikut: \n" +
            " N1المكتبةُN1 S1كبيرةٌP1  \n" +
            "Warna merah menandakan bahwa dia adalah subjek dalam kalimat tersebut. Artinya kata tersebut menjadi inti yang dibahas dalam kalimat. N1 artinya kata tersebut merupakan nomina (kata benda) tunggal (menunjukan bahwa jumlahnya hanya satu), dan S1 artinya subjek mubtada. Mubtada dan khabar hanya muncul dalam jumlah ismiyyah. Maka jika ada S1 pasti jumlah ismiyyah, artinya predikatnya pasti berupa khabar (P1).  \n" +
            "Kalimat di atas merupakan kalimat dan bukan frasa karena dalam kalimat tersebut sudah mengandung predikat, yaitu yang ditandai dengan warna biru. Kata كبيرةٌ dalam kalimat di atas bukan menjadi sifat dari المكتب, melainkan dia menjelaskan keadaan dari المكتب, artinya fungsinya adalah sebagai predikat. \n" +
            "\n2. Jumlah Fi’liyah\n" +
            "Jumlah Fi’liyah adalah kalimat yang diawali dengan فعل fi’il (kata kerja), kalimat ini terdiri dari fi’il sebagai predikat dan فاعل fa’il sebagai subyek serta مفعل به maf’ul bih (objek penderita) dan fi’il ini bisa menggunakan Fi’il Madhi فعل ماضي (kata kerja lampau) atau bisa juga dengan fi’il mudhori فعل مضرع (kata kerja non-lampau). \n" +
            "Subyek (fa’il) dalam jumlah fi’liyah ini bisa terlihat biasanya ditandai dengan nama orang atau suatu benda, bisa juga tak terlihat biasanya jumlah fi’liyah seperti ini terletak pada tengah paragraf karena dhomirnya sudah dijelaskan di awal paragraf. Jumlah fi’liyah adalah struktur kalimat yang predikatnya terletak di awal.  \n" +
            "Contoh: \n" +
            " جَلَسَ اَحْمَدُ \n" +
            "(Ahmad telah duduk) \n" +
            "Dari contoh di atas جلس menurut keterangan waktu ini menunjukkan masa lampau atau فعل ماضي (telah dilakukan) yang artinya telah duduk, dan jenisnya adalah fi’il lazim/verba intransitif (yang tidak memerlukan objek) tapi perlu adanya subjek dan kata Ahmad adalah subjek/yang mengerjakan perbuatan. Kedua kata ini sudah termasuk kalimat yang terdiri atas fi’il dan fa’il sehingga sudah jelas meskipun hanya dua kata. \n" +
            "Jika kita menerapkan metode ngalogat modern, maka analisisnya adalah sebagai berikut: \n" +
            "\n" +
            " VlجَلَسَN1   P2اَحْمَدُS2 \n" +
            "Vl artinya verba lampau, P2 artinya predikat fi’il. N1 menunjukkan bahwa kata tersebut adalah nomina tunggal, dan S2 adalah subjek fa’il.\n"



    val modul2 = HalamanMateri("Kalimat", "dalam Bahasa Arab", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Modul.add(modul2)
}