package Data.Hadist

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Hadist
import androidx.compose.runtime.Composable

@Composable
fun Data10(){

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
    Hadist.add(hadist10)
}