package Data.Modul

import Object.Quadruple
import Object.HalamanMateri
import Object.Modul
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import com.example.ngalodern.R

@Composable
fun Data3_M(){

    var Array_arab = arrayOf<String>()
    var Array_indo = arrayOf<String>()
    var Array_logat = arrayOf<Quadruple<Int, Int, Int, String>>()
    var ArtiFull: String = ""
//    var Penjelasan: String = ""
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
//    Penjelasan = "\n1. Pengertian\n" +
//            "\n" + "Kata dalam bahasa Arab disebut sebagai الكلمة ‘al-kalimah’, yaitu suatu lafadz yang mempunyai makna tertentu. Secara istilah, al-kalimatu adakah kata yang mufrod (berdiri sendiri), artinya dia berdiri sendiri dan memiliki makna sendiri. \n" +
//            "Kata merupakan satuan bahasa yang paling kecil, karena gabungan dari kata dapat membentuk satuan yang lebih besar, yaitu frasa, klausa, dan kalimat. Apa itu frasa, klausa, dan kalimat? Akan dibahas di modul lain, ya! \n" +
//
//            "\n2. Pembagian Kata dalam Bahasa Arab \n" +
//            "Pembagian kelas kata dalam tradisi bahasa Arab sebenarnya sama dengan pembagian kelas kata secara umum, loh! Ada nomina (kata benda), verba (kata kerja), dan partikel. Istilah-istilah tersebut dikemukakan oleh aliran bahasa strukturalisme. Kalau dalam bahasa Indonesia, dikemukakan oleh Moeliono dan Ramlan, pembagian kelas kaa itu terdiri dari Nominal Verbal, dan Partikel. Sama saja bukan? Begitu pun dengan bahasa Arab. \n" +
//
//            "\na. Isim/Kata benda \n" +
//            "Isim adalah kata yang menunjukan makna tertentu yang tidak terikat oleh waktu. Berikut ini yang termasuk ke dalam isim dalam kaidah bahasa Arab: \n" +
//            "Manusia, Tumbuhan, dan Hewan. \n" +
//            "Contoh : Zaid, Kurma, Unta, dll. \n" +
//            "Benda Mati. \n" +
//            "Contoh: bangku, meja, lemari dll. \n" +
//            "Nama Suatu Tempat, Daerah atau Wilayah \n" +
//            "Contoh: Bandung, Jakarta, Gunung, Pantai dll. \n" +
//            "Nama Waktu / Masa \n" +
//            "Contoh: Pagi, Siang, Sore, dll. \n" +
//            "Kata Sifat \n" +
//            "Contoh: Cantik, Tampan, Kecil, Besar, Panjang, Pendek, dll. \n" +
//            "Bagaimana cara menentukan apakah suatu kata isim atau bukan? Selain melihat maknanya, secara umum, isim bisa dilihat dari ciri-cirinya: \n" +
//            "\n" +
//            "\n" +
//            "باِلخَفْضِ = kasrah\u2028\n" +
//            "Jadi, kalau kita menjumpai lafadz dalam bahasa arab yang huruf akhirnya dikasrah, itu sudah pasti isim. Kenapa? Karena tidak akan ada fi’il yang mendapatkan harakat kasrah. Sedangkan harf, harakat akhirnya tidak akan berubah.\n" +
//            "Contohnya:\n" +
//            "– بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\u2028بَيْتُ المُدِيرِ\n" +
//            "– المُدِيرِ (kalimat المُدِيرِ adalah isim karena dikasrah)\n" +
//            "التَّنْوِينِ= tanwin\n" +
//            "Tanwin itu adalah ً (fathatain), ٍ (kasrahtain), dan ٌ (dhomatain)\n" +
//            "Jadi kalau kita menjumpai sebuah lafadz yang huruf akhirnya bertanwin, maka itu kata benda. Bukan fi’il, juga bukan huruf.\n" +
//            "Contoh:\n" +
//            "– زَيْدٌ atau زَيْدً atau زَيْدٍ.\n" +
//            "Kenapa isim? Karena lafadz ini diakhiri dengan tanwin.\n" +
//            "دُخُولِ الألف واللام = Dimasuki huruf alif dan lam\n" +
//            "Jadi kalau kita menjumpai lafadz yang awalnya alif lam, maka itu isim.\n" +
//            "Contoh:\n" +
//            "– كِتَابٌ diberikan ال menjadi الكِتَابُ\n" +
//            "Catatan: tidak akan bertemu antara alif lam dengan tanwin dalam satu lafadz. Kalau misalnya kita berbicara الكِتَابٌ, maka ini salah.\n" +
//            "الخَفْضِ = huruf jar\n" +
//            "Huruf jar adalah partikel-partikel yang menyebabkan kata selanjutnya harus ber’irab jar, atau secar umum, harakatnya harus menjadi kasrah. Tapi, sebenarnya, selain kasrah masih ada ciri-ciri lain dari i’rab jar yang harus dipelajari lebih lanjut dalam pembahasan tentang i’rab jar.\n" +
//            "من ، إلى ، عَنَ ، عَلَى ، في ، رُبّ ، الباء ، الكاف ، اللام\n" +
//            "Contoh: جَاءَ زَيْدٌ مِنَ المسجدِ\n" +
//            "Kalimat المسجدِ adalah isim. Cirinya:\n" +
//            "– ada ال,\n" +
//            "– kasrah,\n" +
//            "– kemasukan huruf jar (من).\n" +
//            "Penjelasan: زَيدٌ فِي البيةِ\n" +
//            "Kalimat البيةِ adalah isim. Cirinya ada ال, kemasukan huruf kasrah dan kemasukan jar. Kalau ال dibuang, maka kalimatnya menjadi زَيدٌ فِي بيةٍ.\n" +
//            "Kalau tidak ada ال, pasti akhirannya adalah ٍ  (tanwin). Kalau ada ال, pasti ِ (i).\n" +
//            "قَسَم = qasam\n" +
//            "Huruf قَسَم ada tiga. Yaitu وَ ,بِ ,تَ.Ini disebut huruf qasam karena huruf tersebut adalah alat untuk bersumpah.\n" +
//            "Contoh: وَالْعَصْرِ.\n" +
//            "Kenapa الْعَصْرُ berubah menjadi kasrah? Karena وَ disini adalah وَ  qasam. Sering kita mendengar وَاللهِ, karena وَ  di sini adalah وَ qasam. Jadi kalau kita bersumpah, kata diakhiri dengan kasrah. Di al-Qur’an banyak dengan وَ.\n" +
//            "b. Fi’il/ Kata kerja\n" +
//            "\tFi’il secara bahasa, فِعْلٌ artinya pekerjaan. Fi’il ialah kata yang menunjukan makna mengandung kala (zaman). Kala dibagi menjadi 3, yaitu madhi (lampau/telah berlalu), hal (sedang terjadi), dan mustaqbal (akan terjadi). Pembagian fi’il juga terbagi menjadi tiga, sebagai berikut:\n \n" +
//            "i. Fi’il madhi \n" +
//            "Fi’il madhi adalah fi’il yang menunjukkan pada kejadian yang terjadinya sebelum waktu pembicaraan. \n" +
//            "Contoh fi’il madhi sebagai berikut: \n" +
//            "\n" +
//            "حَضَرَ artinya telah hadir.\n" +
//            "نَامَ artinya telah tidur.\n" +
//            "قَامَ artinya telah berdiri.\n" +
//            "جَلَسَ artinya telah duduk.\n" +
//            "قَرَأَ artinya telah membaca.\n" +
//            "اَكْرَمَ artiya telah memuliakan. \n" +
//            "ii. Fi’il mudhari \n" +
//            "Fi’il mudhari’ adalah fi’il yang menunjukkan peristiwa yang sedang terjadi atau akan terjadi setelah percakapan. Fi’il mudhari pasti diawali dengan salah satu dari 4 huruf mudhara’ah yang terkumpul dalam lafadz anaitu (اَنَيْتُ). \n" +
//            "Contohnya: \n" +
//            "\n" +
//            "يَحْضُرُ artinya dia sedang atau akan hadir. \n" +
//            "\n" +
//            "يَنَامُ artinya dia sedang atau akan tidur. \n" +
//            "\n" +
//            "أَقُوْمُ artinya aku sedang atau akan berdiri. \n" +
//            "\n" +
//            "نَجْلِسُ artinya kami sedang atau akan duduk. \n" +
//            "\n" +
//            "تَقْرَأُ artinya kamu sedang atau akan membaca. \n" +
//            "\n" +
//            "يُكْرِمُ artinya dia sedang atau akan memuliakan. \n" +
//            "iii. Fi’il Amar \n" +
//            "Fi’il amar/kata kerja imperatif (perintah) adalah fi’il yang menunjukkan peristiwa yang mana hasilnya dituntut setelah waktu berbicara. \n" +
//            "Contohnya: \n" +
//            "\n" +
//            "قُمْ artinya berdirilah. \n" +
//            "\n" +
//            "اجْلِسْ artinya duduklah. \n" +
//            "\n" +
//            "ادْخُلْ artinya masuklah. \n" +
//            "c. Harf/ Partikel \n" +
//            "Partikel adalah kata yang tidak akan bisa berubah. Dia hanya memiliki makna gramatikal. Artinya ketika dia berdiri sendiri, maknanya tidak bisa dipahami. Contoh partikel diantaranya, kata depan (partikel preposisi), konjungsi (penghubung), dll. Teman-teman akan lebih memahami tentang partikel ketika dia bergabung dengan kata lain dan membentuk frasa. Salah satu contoh partikel dalam bahasa Arab adalah harf jar yang sudah dibahas dalam ciri-ciri isim. Harf jar ini adalah apa yang kita sebut sebagai partikel preposisi.\n"

    var Penjelasan: @Composable () -> Unit = {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            // Teks penjelasan
            Text(
                text = """
Frasa adalah satuan bahasa yang lebih besar dari kata, karena frasa bisa terdiri dari dua kata atau lebih, tapi sifatnya non-predikatif. Maksudnya apa? Predikat adalah yang menjelaskan apa yang dilakukan subjek, bagaimana keadaan subjek, atau apa yang subjek rasakan, dan lainnya. Intinya predikat tugasnya menjelaskan subjek. Subjek itu apa? Subjek adalah yang menjadi pokok bahasan dalam kalimat yang dijelaskan oleh predikat.

Contoh:
Saya makan nasi.
  S        P       O
  
Saya sebagai subjek, pokok yang dibahas dalam kalimat. Makan sebagai predikat, yaitu menjelaskan apa yang dilakukan subjek. Sedangkan nasi sebagai objek yang dimakan. Kalimat pada contoh tersebut tidak mengandung frasa, karena frasa terdiri dari dua kata atau lebih yang tidak memiliki predikat.
Catatan penting lainnya, kedudukan frasa dalam mengisi fungsi kalimat sama dengan kata. Frasa hanya bisa mengisi satu fungsi kalimat. Baik sebagai subjek, predikat, objek, maupun keterangan. 

Contoh Frasa:
Saya sudah makan nasi.
   S            P              O

Kalimat di atas mengandung frasa, yaitu “sudah makan”. Kata ‘sudah’ dan ‘makan’ adalah satu kesatuan yang mengisi satu fungsi kalimat yaitu sebagai predikat. Tapi jika diurai, kata ‘sudah’ tidak bisa disebut sebagai subjek dan ‘makan’ sebagai predikat, melainkan tetap sebagai satu kesatuan. Itulah yang dimaksud non-predikatif dan hanya bisa mengisi satu fungsi kalimat.
	
Frasa dalam bahasa Arab ada sangat banyak. Berikut ini adalah jenis-jenis frasa dalam bahasa Arab yang paling sering muncul:

1. Frasa Preposisional (Pp) 
Frasa Preposisional atau Frasa Preposisi dalam bahasa Arab disebut jar majrur. Jar majrur adalah frasa yang diawali partikel preposisi atau huruf jar. Huruf jar ini bertugas membuat kata benda (nomina) setelahnya beri’rab jar, secara umum ditandai dengan harakat kasrah. Huruf jar ini hanya bisa bergabung dengan nomina, ya. Tidak mungkin ada verba yang bergandengan dengan huruf jar. 
Partikel preposisi terdiri dari:
1. مِنْ (dari)
2. إِلَى (ke)
3. عَنْ (dari/tentang)
4. عَلَى (atas)
5. فِي (di dalam)
6. رُبَّ (banyak/sedikit)
7. بِـ (dengan)
8. كَـ (seperti)
9. لِـ (milik/untuk)
10. huruf qosam (Sumpah) (وَ) / (تَ) / (بِ)

Contoh:
نَكْتُبُ فِى الْكِتَابِ (Kami menulis di dalam buku)
Apa yang digaris bawahi pada kalimat di atas adalah frasa preposisi. الْكِتَابِ asalnya adalah الْكِتَابُ. Karena dia dimasuki فِى di depan nya sebagai partikel preposisi, maka harakat akhir الْكِتَابُ harus berubah menjadi kasrah. Jadilah فِى الْكِتَابِ.

2. Frasa Idhafy (Fi)
Frasa Idhafy adalah gabungan dua kata atau lebih–bisasnya hanya dua kata– yang ditandai dengan kata pertamanya tidak dilengkapi alif lam tapi juga tidak dilengkapi tanwin, sedangkan kata keduanya dilengkapi alif lam, dengan catatan wajib jar, atau secara umum ditandai dengan harakat kasrah. Kata pertama dalam frasa idhafy disebut ‘mudhaf’, sedangkan kata keduanya disebut ‘mudhaf ilaih’.
Contoh:
 كِتَابُ المُدَرِّسِ (Buku guru)	
Kata pertama dari frasa idhafy di atas adalah كِتَابُ. Dia tidak menerima alif lam, tapi juga tidak menerima tanwin. Padahal, kata nomina itu wajib tanwin jika tidak ada alif lam, wajib ada alif lam jika tidak ada tanwin. Namun karena nomina كِتَابُ akan menjadi kata pertama (mudhaf) dalam frasa idhafy, maka tidak boleh ada kedua hal tersebut di dalamnya. Kemudian kata keduanya (mudhaf ilaih) المُدَرِّسِ, terdapat alif lam di dalamnya, dan harakat akhirnya menjadi kasrah. 
Tidak semua mudhaf ilaih harus alif lam, ya. Yang jelas ia akan menjadi jar, atau berharakat kasrah. Contohnya frasa كِتَابُ زَيْدٍ (Buku zaid).

3. Frasa Na’ty
Frasa na’ty dalam bahasaArab bisa disebut sifat-mausuf atau na’at-man’ut, yaitu frasa yang mengandung sifat. Bisanya ditandai dengan arti ‘yang’. Misalnya “wanita yang cantik” atau “buku yang baru”.
Ciri dari frasa na’ty adalah antara kata pertama dan kedua harus sama dari segi ada alif lamnya atau tidak, feminin (muannats) atau maskulin (mudzakar), dan i’rab nya, atau harakat akhirnya. 
Contoh:
 (Murid yang rajin) التِلْمِيْدُ المُجْتَهِدُ	
Kata pertamanya disebut mausuf/man’ut. Kata pertama dalam frasa di atas adalah التِلْمِيْدُ ‘murid’. Kata keduanya disebut sifat, dalam frasa di atas adalah المُجْتَهِدُ ‘rajin’. Keduanya sama-sama memiliki alif lam dan harakat akhirnya sama. Keduanya juga bukan muannats, salah satu tandanya adalah tidak ada huruf ة di akhir katanya.

    """.trimIndent(),
                textAlign = TextAlign.Justify,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }


    val modul3 = HalamanMateri("Frasa", "dalam Bahasa Arab", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Modul.add(modul3)
}