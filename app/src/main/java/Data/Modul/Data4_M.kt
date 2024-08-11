package Data.Modul

import Object.Quadruple
import Object.HalamanMateri
import Object.Modul
import androidx.compose.runtime.Composable

@Composable
fun Data4_M(){

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
    Penjelasan = "\n KATEGORI KATA\n" +
            "\n" + "1. Verba lampau (Vl)  \n" +
            "Verba lampau dalam gramatika bahasa Arab disebut fi’il madhi adalah kata kerja yang menunjukkan pekerjaan yang telah dilakukan di masa lampau. \n" +

            "\n" + "2. Verba non-lampau (Vnl)  \n" +
            "Verba non-lampau dalam gramatika bahasa Arab disebut fi’il mudhari adalah kata kerja yang menunjukkan pekerjaan yang sedang dilakukan atau akan dilakukan. \n" +

            "\n" + "3. Nomina tunggal (N1)  \n" +
            "Nomina tunggal dalam bahasa Arab disebut isim mufrad adalah kata benda yang menunjukkan jumlahnya hanya satu. Secara umum jika tidak kemasukan hal-hal menyebabkan kasusnya berubah, atau dia dalam keadaan marfu maka ditandai dengan harakat dhammah. \n" +

            "\n" + "4. Nomina dual (N2)  \n" +
            "Nomina dual dalam bahasa Arab disebut isim mutsanna adalah kata benda yang menunjukkan jumlahnya dua. Biasanya ditandai dengan alif nun di akhir apabila keadaan marfu/ kasus (i'robnya) rofa, ditandai dengan ya’ dan nun jika keadaannya manshub (kasusnya nasab) atau majrur (kasusnya jar) \n" +

            "\n" + "5. Nomina plural (N+)  \n" +
            "Nomina plural dalam bahasa Arab disebut isim jamak adalah kata benda yang menunjukkan jumlahnya hanya satu. Ada jamak mudzakkar salim, jamak muannats salim, dan jamak taksir. \n" +

            "\n" + "6. Partikel preposisi (Pp)  \n" +
            "Partikel preposisi dalam bahasa Arab adalah huruf-huruf jar, yaitu huruf yang bisa membuat nomina (isim) setelahnya memiliki kasus (ber-i’rab) jar. Umumnya i’rab jar ditandai dengan harakat kasrah di untuk nomina tunggal, dan mengikuti ciri majrur nomina dual atau jamak jika dia bermuda dual atau jamak. Huruf-hurufnya adalah:\n" +
            "1. مِنْ (dari)\n" +
            "2. إِلَى (ke)\n" +
            "3. عَنْ (dari/tentang)\n" +
            "4. عَلَى (atas)\n" +
            "5. فِي (di dalam)\n" +
            "6. رُبَّ (banyak/sedikit)\n" +
            "7. بِـ (dengan)\n" +
            "8. كَـ (seperti)\n" +
            "9. لِـ (milik/untuk)\n" +
            "10. huruf qosam (Sumpah) (وَ) / (تَ) / (بِ)\n \n" +

            "\n" + "7. Partikel temporal (Pt)  \n" +
            "Partikel temporal atau dhorfu zaman adalah partikel yang menunjukkan waktu, seperti :\n" +
            "اَلْيَوْمَ (Pada hari ini) \n" +
            "عَتَمَةً (Waktu sore / isya) \n" +
            " اللَّيْلَةَ (Pada malam ini) \n" +
            " صَبَاحًا (Pada waktu subuh) \n" +
            " غُدْوَةً (Pada pagi hari) \n" +
            " مَسَاءً (Pada waktu sore) \n" +
            " بُكْرَةً (Waktu pagi) \n" +
            " اَبَدًا (Selamanya) \n" +
            " سَحَرًا (Waktu sahur)\n" +
            " اَمَدًا (Selamanya) \n" +
            " غَدًا (Besok)\n" +
            " حِيْنًا (ketika).\n \n" +

            "\n" + "8. Partikel lokatif (Pl)  \n" +
            "Partikel lokatif atau dzorfu makan adalah partikel yang menunjukkan tempat, seperti: \n" +
            "اَمَامَ (Di depan)\n" +
            " مَعَ (Beserta)\n" +
            " خَلْفَ (Di belakang)\n" +
            " اِزَاءَ (Di muka)\n" +
            " قُدَّامَ (Di depan)\n" +
            " حِذَاءَ (Di dekat)\n" +
            " وَرَآءَ (Di belakang)\n" +
            " تِلْقَاءَ (Di hadapan)\n" +
            " فَوْقَ (Di atas)\n" +
            " هُنَا (Di sini)\n" +
            " تَحْتَ (Di bawah)\n" +
            " ثَمَّ (Di sana)\n" +
            " عِنْدَ (Di bersahabat).\n \n" +

            "\n" + "9. Konjungsi (Ko)  \n" +
            "Konjungsi atau kata penghubung dalam bahasa Arab disebut huruf ‘athaf, contohnya seperti:\n" +
            "1. وَ (dan)\n" +
            "2. فَ (lalu)\n" +
            "3. ثُمَّ (kemudian)\n" +
            "4. أَوْ (atau)\n" +
            "5. أَمْ (atau)\n" +
            "6. إِمَّا (atau)\n" +
            "7. بَلْ (tetapi)\n" +
            "8. لَا (bukan)\n" +
            "9. لَكِنْ (tetapi)\n" +
            "10. حَتَّى (sehingga)\n \n" +

            "\n" + " FUNGSI KATA \n" +
            "\n" + "1. Subjek mubtada (S1)  \n" +
            "Subjek yang berada di awal kalimat, keadaannya marfu’ (memiliki kasus rafa’). Bagi nomina tunggal tanda rafa'nya dhammah, Nomina dual tanda rafa'nya alif-nun, Nomina plural; Jamak mudzakkar salim ditandai dengan Waw-nun, Jamak Muannats Salim ditandai dengan dhammah, dan jamak taksir ditandai dengan dhammah. Biasanya, subjek mubtada’ ini bermakna khusus ditandai dengan alif-lam di awalnya. \n" +

            "\n" + "2. Subjek fa’il (S2)  \n" +
            "Subjek pelaku yang terletak setelah verba aktif, memiliki kasus rafa’. Jika fa'il nya mufrod, maka rafa’ dengan dhammah. Jika mustanna rafa’ dengan alif-nun. Jika jamak; mudzakkar salim dengan wau-nun, muannats salim dengan dhammah.  \n" +

            "\n" + "3. Subjek naibul fa’il (S3)  \n" +
            "Subjek pengganti pelaku (asalnya objek) yang terletak setelah verba pasif.  \n" +

            "\n" + "4. Predikat khabar (P1)  \n" +
            "Predikat yang menjelaskan subjek mubtada, biasanya terletak setelah subjek mubtada, memiliki kasus rafa’. \n" +

            "\n" + "5. Predikat fi’il (P2)  \n" +
            "Predikat verba (kata kerja) berhubungan dengan kala, dalam bahasa Arab terbagi menjadi 3; Verba lampau, verba non-lampau, dan verba imperatif \n" +

            "\n" + "6. Fi’il pasif (P3)  \n" +
            "Fi’il pasif dalam bahasa arab dikenal dengan fi’il majhul, yaitu fi'il/kata kerja yang pelakunya (الفاعِل) tidak diketahui atau tidak disebutkan. Untuk itu, dalam Fi’il pasif dikenal istilah Naibul Fa’il ( نَائِبُ الْفَاعِل ) atau pengganti Fa’il (Pelaku). \n" +
            "Rumusnya:\n" +
            "-Untuk fi'il madhi (tsulatsi/ruba'iy) huruf pertama di-dhammah-kan + 1 huruf sebelum huruf terakhir di-kasrah-kan.\n" +
            "-Untuk fi'il mudhari: Huruf pertama di-dhammah-kan + 1 huruf sebelum huruf terakhir di-fathah-kan.\n \n" +

            "\n" + "7. Objek (O)  \n" +
            "Sesuatu yang dikenai tindakan oleh subjek. Objek terdapat dalam kalimat aktif, itu pun hanya aktif yang transitif, sedangkan aktif intransitif tidak memerlukan objek. \n" +

            "\n" + "8. Keterangan (K)  \n" +
            "Unsur kalimat yang memberikan informasi lebih lanjut tentang sesuatu yang dinyatakan dalam kalimat, misalnya memberi informasi tentang tempat, waktu, cara, sebab, tujuan, dan lain-lain. \n" +

            "\n" + "Frasa Preposisi (Fp)  \n" +
            "Frasa yang didahului oleh partikel jar atau partikel lokatif \n" +

            "\n" + "Frasa Idhafy (Fi)  \n" +
            "Frasa yang terdiri dari dua nomina atau lebih bersifat nonpredikatif. Nomina pertama sebagai induknya, nomina kedua sebagai atributnya. Hubungan kedua nomina tersebut memiliki arti kepemilikan, bermakna lokatif, bermakna temporal, bermakna substantif, dan bermakna penyerupaan.  \n" +

            "\n" + "Frasa Na'ty (Fn)  \n" +
            "Frasa ini disebut juga frasa sifat-maushuf. Frasa ini berinduk satu yang induknya adjektiva. Ciri kata dalam frasanya ال+ال atau tanwin+tanwin. \n"




    val modul4 = HalamanMateri("Simbol Ngalodern", "", resultArray ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Modul.add(modul4)
}