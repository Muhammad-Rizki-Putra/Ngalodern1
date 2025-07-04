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
fun Data5_M(){

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
//    Penjelasan = "\n Langkah-langkah Belajar dengan Metode Ngalodern \n" +
//            "\n" + "1. Pahami Maknanya  \n" +
//            "Sebelum membaca teks bahasa Arab, kita wajib memahami makna yang akan kita ungkapkan. Contoh: \n" +
//
//            "\n" + "2. Tentukan Kategori Kata  \n" +
//            "Setelah memahami maknanya, kita tentukan kategori/kelas kata yang ada pada kalimat tersebut ditandai dengan simbol ngalogat  modern. Contoh: \n" +
//
//            "\n" + "3. Tentukan Fungsi Kata  \n" +
//            "Tentukanlah fungsi kata dalam kalimat tersebut \n" +
//
//            "\n" + "4. Hasil Ngalodern  \n" +
//            "Setelah mentukan kategori dan fungsi kata, kita dapat membaca dan memahami teks bahasa Arab dengan benar sesuai dengan gramatika bahasa Arab.  \n" +
//
//            "\n" + "  \n" +
//
//            "\n" + "أول الواجب على المعرب أن يفهم ما يعربه  \n" +
//            "\"Tugas pertama seorang penutur bahasa adalah memahami apa yang dia ungkapkan. \n"


    var Penjelasan: @Composable () -> Unit = {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            // Teks penjelasan
            Text(
                text = "\nLangkah-langkah Belajar dengan Metode Ngalodern \n" +
                        "\n" + "1. Pahami Maknanya  \n" +
                        "Sebelum membaca teks bahasa Arab, kita wajib memahami makna yang akan kita ungkapkan. Contoh: \n"
                ,
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Menambahkan gambar di antara teks
            Image(
                painter = painterResource(id = R.drawable.langkah1), // Sesuaikan ID gambar
                contentDescription = "langkah ngalodern",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Lanjutkan dengan penjelasan teks
            Text(
                text = "\n" + "2. Tentukan Kategori Kata  \n" +
                        "Setelah memahami maknanya, kita tentukan kategori/kelas kata yang ada pada kalimat tersebut ditandai dengan simbol ngalogat  modern. Contoh: \n" ,
                style = MaterialTheme.typography.bodyMedium
            )

            // Menambahkan gambar di antara teks
            Image(
                painter = painterResource(id = R.drawable.langkah2), // Sesuaikan ID gambar
                contentDescription = "langkah ngalodern",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Lanjutkan dengan penjelasan teks
            Text(
                text =  "\n" + "3. Tentukan Fungsi Kata  \n" +
                        "Tentukanlah fungsi kata dalam kalimat tersebut \n"  ,
                style = MaterialTheme.typography.bodyMedium
            )

            Image(
                painter = painterResource(id = R.drawable.langkah3), // Sesuaikan ID gambar
                contentDescription = "langkah ngalodern",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Lanjutkan dengan penjelasan teks
            Text(
                text =  "\n" + "4. Hasil Ngalodern  \n" +
            "Setelah mentukan kategori dan fungsi kata, kita dapat membaca dan memahami teks bahasa Arab dengan benar sesuai dengan gramatika bahasa Arab.  \n",
                style = MaterialTheme.typography.bodyMedium
            )

            Image(
                painter = painterResource(id = R.drawable.langkah4), // Sesuaikan ID gambar
                contentDescription = "langkah ngalodern",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(25.dp))

            // Lanjutkan dengan penjelasan teks
            Text(
                text =  "\n" + "أول الواجب على المعرب أن يفهم ما يعربه  \n" +
          "Tugas pertama seorang penutur bahasa adalah memahami apa yang dia ungkapkan. \n"  ,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium
            )


        }
    }

    // Panggil PenjelasanWithImage dalam konteks Composable
//    PenjelasanWithImage()

    val modul5 = HalamanMateri(
        "Belajar Ngalodern",
        "",
        resultArray,
        Array_indo.reversedArray(),
        Array_arab.reversedArray(),
        Array_logat,
        ArtiFull,
        Array_logat_B,
        Array_Duplicate,
        Penjelasan,
        // Tetap harus ada Penjelasan sebagai placeholder
    )
    Modul.add(modul5)
}