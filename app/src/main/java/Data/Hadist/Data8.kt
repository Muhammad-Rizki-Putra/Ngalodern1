package Data.Hadist

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Hadist
import androidx.compose.runtime.Composable

@Composable
fun Data8(){

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

    //hadist 8
    Array_arab += "مُسْلِمٌ"
    Array_arab += "وَ"
    Array_arab += "اْلبُخَارِي"
    Array_arab += "رَوَاهُ"
    Array_arab += "تَعَالَى"
    Array_arab += "اللهِ"
    Array_arab += "عَلَى"
    Array_arab += "حِسَابُهُمْ" // 39
    Array_arab += "وَ"
    Array_arab += "الإِسْلاَمِ"
    Array_arab += "بِحَقِّ"
    Array_arab += "إِلاَّ"
    Array_arab += "أَمْوَالَهُمْ"
    Array_arab += "وَ"
    Array_arab += "دِمَاءَهُمْ" // 32
    Array_arab += "مِنِّيْ"
    Array_arab += "عَصَمُوْا" // 30
    Array_arab += "ذَلِكَ"
    Array_arab += "فَعَلُوْا" // 28
    Array_arab += "فَإِذَا"
    Array_arab += "الزَّكَاةَ" // 26
    Array_arab += "يُؤْتُوْا" // 25
    Array_arab += "وَ"
    Array_arab += "الصَّلاةَ" // 23
    Array_arab += "يُقِيْمُوْا" // 22
    Array_arab += "وَ"
    Array_arab += "رَسُوْلُ اللهِ"
    Array_arab += "مُحَمَّداً"
    Array_arab += "أَنَّ"
    Array_arab += "وَ"
    Array_arab += "لاَ إِلَهَ إِلاَّ اللهُ"
    Array_arab += "أَنْ"
    Array_arab += "يَشْهَدُوْا" //14
    Array_arab += "حَتَّى"
    Array_arab += "النَّاسَ" // 12
    Array_arab += "أُقَاتِلَ"
    Array_arab += "أَنْ"
    Array_arab += "أُمِرْتُ"
    Array_arab += "قَالَ" // 8
    Array_arab += "صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ"
    Array_arab += "رَسُوْلَ اللهِ"
    Array_arab += "أَنَّ"
    Array_arab += "عَنْهُمَا"
    Array_arab += "اللهُ"
    Array_arab += "رَضِيَ"
    Array_arab += "ابْنِ عُمَرَ"
    Array_arab += "عَنْ"
    init_arabic()

    Array_indo += "Muslim"
    Array_indo += "dan"
    Array_indo += "Oleh Bukhari"
    Array_indo += "Diriwayatkan"
    Array_indo += "Yang Maha Tinggi"
    Array_indo += "Allah"
    Array_indo += "di sisi"
    Array_indo += "perhitungan mereka"
    Array_indo += "dan"
    Array_indo += "Islam"
    Array_indo += "dengan hak"
    Array_indo += "kecuali"
    Array_indo += "harta mereka"
    Array_indo += "dan"
    Array_indo += "darah"
    Array_indo += "dariku"
    Array_indo += "mereka telah melindungi"
    Array_indo += "itu"
    Array_indo += "mereka telah melakukan"
    Array_indo += "Maka apabila"
    Array_indo += "zakat"
    Array_indo += "menunaikan"
    Array_indo += "dan"
    Array_indo += "shalat"
    Array_indo += "menegakkan"
    Array_indo += "dan"
    Array_indo += "utusan Allah"
    Array_indo += "Muhammad"
    Array_indo += "bahwa"
    Array_indo += "dan"
    Array_indo += "tidak ada sesembahan yang haq selain Allah"
    Array_indo += "bahwa"
    Array_indo += "mereka bersaksi"
    Array_indo += "hingga"
    Array_indo += "manusia"
    Array_indo += "memerangi"
    Array_indo += "bahwa"
    Array_indo += "Aku diperintahkan"
    Array_indo += "dia berkata"
    Array_indo += "semoga Allah melimpahkan solwat dan salam (pada Muhammad)"
    Array_indo += "Rasulullah"
    Array_indo += "Sesungguhnya"
    Array_indo += "Kepada keduanya"
    Array_indo += "Allah"
    Array_indo += "meridhai"
    Array_indo += "Ibnu ‘Umar"
    Array_indo += "Dari"
    ArtiFull = "“Dari Ibnu ‘Umar radhiyallahu ‘anhuma berkata: ‘Rasulullah shallallahu ‘alaihi wa sallam telah bersabda: ”Aku diperintahkan untuk memerangi manusia hingga mereka bersaksi bahwa tidak ada sesembahan yang haq selain Allah, dan Muhammad adalah utusan Allah, menegakkan shalat, menunaikan zakat. Maka apabila mereka telah melakukan itu semua, maka mereka telah melindungi darah dan harta mereka dariku, kecuali dengan hak Islam dan perhitungan mereka (hisab) di sisi Allah subhanahu wa ta’ala.” (HR. Al- Bukhari dan Muslim)"
    Penjelasan = "Penjelasan hadist\n" +
            "\n" +
            "1. Disyari’atkannya jihad dan memerangi orang-orang yang belum masuk Islam. Akan tetapi ada pengecualian dari hadits ini, yaitu mereka yang tidak mau masuk Islam, tetapi mereka mau membayar jizyah. Jizyah adalah uang atau semacam upeti yang diberikan kepada Nabi Muhammad Shallallahu ‘Alaihi wa Sallam agar mereka dibiarkan tinggal di negeri muslim dengan tetap mereka memeluk agama mereka. \n" +
            "\n" +
            "2. Untuk masuk Islam, cukup bagi kita mengucapkan kalimat لَا إِلٰهَ إِلَّا اللّٰهُ مُحَمَّدٌ رَسُولُ اللّٰهِ . Dan didasari dengan keyakinan kepada Allah Subhanahu wa Ta’ala dan Rasulullah Shallallahu ‘Alaihi wa Sallam.\n" +
            "\n" +
            "3. Jika kita telah melakukan dua hal ini (mengucapkan dua kalimat syahadat), maka kita dituntut untuk melengkapi dasar iman kita ini dengan menegakkan sholat dan menunaikan zakat.\n" +
            "\n" +
            "4. Saling terikatnya antara dua syahadat. Syahadat لَا إِلٰهَ إِلَّا اللّٰهُ  harus diiringi dengan syahadat  مُحَمَّدٌ رَسُولُ اللّٰهِ . Tidak boleh syahadat yang pertama saja atau yang kedua saja.\n" +
            "\n" +
            "5. Barangsiapa yang telah mengucapkan لَا إِلٰهَ إِلَّا اللّٰهُ مُحَمَّدٌ رَسُولُ اللّٰهِ, kemudian menegakkan sholat dan menunaikan zakat, maka berarti dia telah dianggap muslim, dianggap darah dan hartanya telah aman. Adapun urusan kebenaran imannya, diserahkan kepada Allah Subhanahu wa Ta’ala. Allah Subhanahu wa Ta’ala yang akan menghisab mereka di akhirat.\n" +
            "\n" +
            "6. Penetapan hisab di hari kiamat. Setiap muslim harus mengimani bahwa dunia tidak akan habis/ selesai begitu saja. Akan tetapi setelah kehidupan dunia ini ada perhitungan (hisab) terhadap apa yang telah kita usahakan/ kerjakan selama di dunia. \n" +
            "\n" +
            "7. Tingginya kedudukan sholat dan zakat. Keduanya adalah ibadah yang paling penting, syi’ar yang dalam Islam dipilih untuk mengiringi dua kalimat syahadat.\n" +
            "\n" +
            "8. Barangsiapa yang tidak menunaikan sholat/ zakat, maka pemerintah Islam boleh memaksa mereka untuk melakukan keduanya. Dan jika mereka tetap tidak mau melakukan keduanya, sementara mereka memiliki kekuatan, maka boleh bagi pemerintah Islam untuk memerangi mereka.\n" +
            "\n" +
            "9. Makna hak Islam. Jika seandainya ada seorang muslim yang telah mengucapkan dua kalimat syahadat, menegakkan sholat, dan menunaikan zakat, kemudian dia melakukan dosa yang dalam Islam hukumnya adalah dibunuh seperti ; berzina dalam keadaan sudah menikah, atau membunuh sesama muslim, atau murtad, maka perkara-perkara ini adalah hak Islam yang membolehkan kembali bagi pemerintah muslim untuk menumpahkan darah mereka.\n"

    for (i in 0..6){
        Array_logat += Quadruple(2,i,2,"P2")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(3,i,1,"S2")
        iterasi++
    }

    for (i in 0..4){
        Array_logat += Quadruple(8,i,2,"P2")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(9,i,2,"P2")
        iterasi++
    }

    for (i in 6..7){
        Array_logat += Quadruple(9,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(9,iterasi - 1)

    for (i in 0..7){
        Array_logat += Quadruple(12,i,3,"O")
        iterasi++
    }

    for (i in 0..1){
        Array_logat += Quadruple(14,i,1,"S2")
        iterasi++
    }

    for (i in 2..7){
        Array_logat += Quadruple(14,i,2,"P2")
        iterasi++
    }
    Array_Duplicate += Pair(14,iterasi - 1)

    for (i in 8..11){
        Array_logat += Quadruple(14,i,1,"S2")
        iterasi++
    }

    for (i in 0..1){
        Array_logat += Quadruple(22,i,1,"S2")
        iterasi++
    }

    for (i in 2..7){
        Array_logat += Quadruple(22,i,2,"P2")
        iterasi++
    }

    Array_Duplicate += Pair(22,iterasi - 1)

    for (i in 7..11){
        Array_logat += Quadruple(22,i,1,"S2")
        iterasi++
    }

    for (i in 0..9){
        Array_logat += Quadruple(23,i,3,"O")
        iterasi++
    }

    for (i in 0..1){
        Array_logat += Quadruple(25,i,1,"S2")
        iterasi++
    }

    for (i in 2..5){
        Array_logat += Quadruple(25,i,2,"P2")
        iterasi++
    }

    Array_Duplicate += Pair(25,iterasi - 1)

    for (i in 6..9){
        Array_logat += Quadruple(25,i,1,"S2")
        iterasi++
    }

    for (i in 0..10){
        Array_logat += Quadruple(26,i,3,"O")
        iterasi++
    }

    for (i in 0..5){
        Array_logat += Quadruple(28,i,2,"P2")
        iterasi++
    }

    for (i in 6..9){
        Array_logat += Quadruple(28,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(28,iterasi - 1)

    for (i in 0..5){
        Array_logat += Quadruple(30,i,2,"P2")
        iterasi++
    }

    for (i in 6..9){
        Array_logat += Quadruple(30,i,1,"S2")
        iterasi++
    }

    Array_Duplicate += Pair(30,iterasi - 1)

    for (i in 0..11){
        Array_logat += Quadruple(32,i,3,"O")
        iterasi++
    }

    for (i in 0..11){
        Array_logat += Quadruple(39,i,1,"S1")
        iterasi++
    }

    Array_logat_B += Pair(0,"Pp")
    Array_logat_B += Pair(2,"Vl")
    Array_logat_B += Pair(4,"Pp")
    Array_logat_B += Pair(7,"Pp")
    Array_logat_B += Pair(7,"K")
    Array_logat_B += Pair(8,"Vl")
    Array_logat_B += Pair(9,"Vl")
    Array_logat_B += Pair(11,"Vnl")
    Array_logat_B += Pair(12,"N+")
    Array_logat_B += Pair(13,"Ko")
    Array_logat_B += Pair(14,"Vnl")
    Array_logat_B += Pair(16,"Ko")
    Array_logat_B += Pair(17,"Ko")
    Array_logat_B += Pair(21,"Ko")
    Array_logat_B += Pair(22,"Vnl")
    Array_logat_B += Pair(24,"Ko")
    Array_logat_B += Pair(25,"Vnl")
    Array_logat_B += Pair(27,"Ko")
    Array_logat_B += Pair(28,"Vl")
    Array_logat_B += Pair(30,"Vl")
    Array_logat_B += Pair(32,"N+")
    Array_logat_B += Pair(33,"Ko")
    Array_logat_B += Pair(34,"N+")
    Array_logat_B += Pair(36,"Pp")
    Array_logat_B += Pair(38,"Ko")
    Array_logat_B += Pair(40,"Pp")

    var uniqueFirstElements8 = Array_logat.map { it.first }.toSet()
    var resultArray8 = uniqueFirstElements8.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val hadist8 = HalamanBelajar("Hadist Arbain No. 8","Terjaganya Darah dan Harta Seorang Muslim" , resultArray8 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Hadist.add(hadist8)
}