package Data.Hadist

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Hadist
import androidx.compose.runtime.Composable

@Composable
fun Data6(){

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
    Hadist.add(hadist6)
}