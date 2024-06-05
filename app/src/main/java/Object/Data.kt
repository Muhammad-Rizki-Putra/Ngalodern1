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
        // Option 1: Clear elements by setting to empty strings
        for (i in Array_arab.indices) {
            Array_arab[i] = ""
        }
        for (i in Array_indo.indices) {
            Array_arab[i] = ""
        }
    }

    fun init_arabic(){
        for (i in Array_arab.indices) {
            Array_arab[i] = Array_arab[i] + " "
        }
    }

//    fun detect_dups(): IntArray{
//        val firstElementMap = mutableMapOf<Int, MutableSet<Int>>()
//
//        Array_logat.forEach { quad ->
//            if (firstElementMap.containsKey(quad.a)) {
//                firstElementMap[quad.a]?.add(quad.c)
//            } else {
//                firstElementMap[quad.a] = mutableSetOf(quad.c)
//            }
//        }
//
//        val duplicates = firstElementMap.filter { it.value.size > 1 }.keys
//        return duplicates.toIntArray()
//    }

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

    for (i in 0..6){
        Array_logat += Quadruple(16,i,2, "P1")
        iterasi++
    }

    //contoh doang duplikat ada di arr 11
    for (i in 7..12){
        Array_logat += Quadruple(16,i,1, "S2")
        iterasi++
    }
    Array_Duplicate += Pair(16,iterasi - 1)

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
    Array_logat_B += Pair(2,"P2")
    Array_logat_B += Pair(2,"S2")



    ArtiFull = "Dari Amirul Mukminin, Abu Hafsh ‘Umar bin Al-Khattab radhiyallahu ‘anhu, ia berkata bahwa ia mendengar Rasulullah shallallahu ‘alaihi wa sallam bersabda: “Sesungguhnya setiap amalan tergantung pada niatnya. Setiap orang akan mendapatkan apa yang ia niatkan. Siapa yang hijrahnya karena Allah dan Rasul-Nya, maka hijrahnya untuk Allah dan Rasul-Nya. Siapa yang hijrahnya karena mencari dunia atau karena wanita yang dinikahinya, maka hijrahnya kepada yang ia tuju.”"
    Penjelasan = "\nPenjelasan hadist\n" +
            "\n" + "Niat artinya bermaksud atau berkehendak. Sebagian ulama bersepakat bahwa niat itu letaknya di hati. Jika seseorang berniat dalam hatinya tanpa dilafazhkan, maka niatnya dianggap sah. \n" +
            "Suatu amalan ada dikarenakan ada niatnya. Jika seseorang melakukan pekerjaan tanpa niat, maka seperti orang yang tertidur atau gila. \n" +
            "Setiap orang memperoleh pahala sesuai dengan apa yang ia niatkan. \n" +
            "Hijrah itu artinya berpindah atau meninggalkan tempat, dapat diartikan pula berpindah dari maksiat menuju ketaatan. \n" +
            "Dalam beramal perlu niat yang ikhlas.\n"

    val hadist1: HalamanBelajar = HalamanBelajar("Hadist Arbain No. 1", "Setiap Amalan Tergantung Pada Niat", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
//    val dongeng1: HalamanBelajar = HalamanBelajar("Judul 1", "Sub judul 1", "isi 1" ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull)
    Hadist += listOf(hadist1)
    sizehd = Hadist.size
//    Dongeng += listOf(dongeng1)
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

