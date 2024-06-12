package Data.Hadist

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Hadist
import androidx.compose.runtime.Composable

@Composable
fun Data3(){

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
    Hadist.add(hadist3)
}