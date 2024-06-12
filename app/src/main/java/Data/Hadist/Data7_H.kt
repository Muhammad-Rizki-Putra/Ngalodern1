package Data.Hadist

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Hadist
import androidx.compose.runtime.Composable

@Composable
fun Data7(){

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
    Hadist.add(hadist7)
}