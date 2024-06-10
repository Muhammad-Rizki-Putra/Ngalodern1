package Data.Hadist

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Hadist
import androidx.compose.runtime.Composable

@Composable
fun Data9(){

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
    Hadist.add(hadist9)
}