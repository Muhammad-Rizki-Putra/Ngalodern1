package Data.Hadist

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Hadist
import androidx.compose.runtime.Composable

@Composable
fun Data4(){

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
    Hadist.add(hadist4)
}