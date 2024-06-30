package Data.Hadist

import Object.Quadruple
import Object.HalamanBelajar
import Object.Data
import Object.Hadist
import androidx.compose.runtime.Composable

@Composable
fun Data2(){

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

    // hadist 2

    Array_arab += "مسلم"
    Array_arab += "رواه"
    Array_arab += "دِيْنَكُمْ"
    Array_arab += "يُعَلِّمَكُمْ"
    Array_arab += "أَتَاكُمْ"
    Array_arab += "جِبْرِيلُ"
    Array_arab += "فَإِنَّهُ"
    Array_arab += "قَالَ"
    Array_arab += "أَعْلَمُ"
    Array_arab += "رَسُوْلُهُ"
    Array_arab += "وَ"
    Array_arab += "اللهُ"
    Array_arab += "قُلْتُ"
    Array_arab += "السَّائِلُ"
    Array_arab += "مَنْ"
    Array_arab += "أَتَدْرِي"
    Array_arab += "عُمَرُ"
    Array_arab += "يَا"
    Array_arab += "قَالَ"
    Array_arab += "ثُمَّ"
    Array_arab += "مَلِيًا"
    Array_arab += "فَلَبِثْتُ"
    Array_arab += "انْطَلَقَ"
    Array_arab += "ثُمَّ"
    Array_arab += "البُنْيَانِ"
    Array_arab += "فِي"
    Array_arab += "يَتَطَاوَلُوْنَ"
    Array_arab += "الشَّاءِ"
    Array_arab += "رِعَاءَ"
    Array_arab += "الحُفَاةَ العُرَاةَ العَالَةَ"
    Array_arab += "أَنْ تَرَى"
    Array_arab += "وَ"
    Array_arab += "رَبَّتَهَا"
    Array_arab += "الأَمَةُ"
    Array_arab += "أنْ تَلِدَ"
    Array_arab += "قَالَ"
    Array_arab += "أَمارَاتِهَا"
    Array_arab += "عَنْ"
    Array_arab += "فَأَخْبِرْنِي"
    Array_arab += "قَالَ"
    Array_arab += "السَّائِلِ"
    Array_arab += "مِنْ"
    Array_arab += "بِأَعْلَمَ"
    Array_arab += "المَسْؤُلُ"
    Array_arab += "مَا"
    Array_arab += "قَالَ"
    Array_arab += "السَّاعَةِ"
    Array_arab += "عَنْ"
    Array_arab += "فَأَخْبِرْنِي"
    Array_arab += "قَالَ"
    Array_arab += "يَرَاكَ"
    Array_arab += "فَإِنَّهُ"
    Array_arab += "تَرَاهُ"
    Array_arab += "تَكُنْ"
    Array_arab += "لَمْ"
    Array_arab += "فَإِنْ"
    Array_arab += "تَرَاهُ"
    Array_arab += "كَأَنَّكَ"
    Array_arab += "الله"
    Array_arab += "أَنْ تَعْبُدَ"
    Array_arab += "قَالَ"
    Array_arab += "الإِحْسَانِ"
    Array_arab += "عَنْ"
    Array_arab += "فَأَخْبِرْنِي"
    Array_arab += "قَالَ"
    Array_arab += "صَدَقْتَ"
    Array_arab += "قَالَ"
    Array_arab += "شَرِّهِ"
    Array_arab += "وَ"
    Array_arab += "خَيْرِهِ"
    Array_arab += "بِالقَدَرِ"
    Array_arab += "تُؤْمِنَ"
    Array_arab += "وَ"
    Array_arab += "الآخِرِ"
    Array_arab += "اليَوْمِ"
    Array_arab += "وَ"
    Array_arab += "رُسُلِهِ"
    Array_arab += "وَ"
    Array_arab += "كُتُبِهِ"
    Array_arab += "وَ"
    Array_arab += "مَلائِكَتِهِ"
    Array_arab += "وَ"
    Array_arab += "بِاللهِ"
    Array_arab += "أنْ تُؤْمِنَ"
    Array_arab += "قَالَ"
    Array_arab += "الإِيْمَانِ"
    Array_arab += "عَنْ"
    Array_arab += "فَأَخْبِرْنِي"
    Array_arab += "قَالَ"
    Array_arab += "يُصَدِّقُهُ"
    Array_arab += "وَ"
    Array_arab += "يَسْأَلُهُ"
    Array_arab += "لَهُ"
    Array_arab += "فَعَجِبْنَا"
    Array_arab += "صَدَقْتَ"
    Array_arab += "قَالَ"
    Array_arab += "سَبِيْلًا"
    Array_arab += "إِلَيْهِ"
    Array_arab += "إن اسْتَطَعْتَ"
    Array_arab += "البَيْتَ"
    Array_arab += "تَحُجَّ"
    Array_arab += "وَ"
    Array_arab += "رمَضَانَ"
    Array_arab += "تَصُوْمََ"
    Array_arab += "وَ"
    Array_arab += "الزَّكاةَ"
    Array_arab += "تُؤْتِيَ"
    Array_arab += "وَ"
    Array_arab += "الصّلَاةَ"
    Array_arab += "تُقِيْمَ"
    Array_arab += "وَ"
    Array_arab += "رَسُوْلُ اللهِ"
    Array_arab += "مُحَمّدًا"
    Array_arab += "أَنَّ"
    Array_arab += "وَ"
    Array_arab += "الله"
    Array_arab += "إِلَّا"
    Array_arab += "إلهَ"
    Array_arab += "لَا"
    Array_arab += "أنْ"
    Array_arab += "أنْ تَشْهَدَ"
    Array_arab += "الإسْلَامُ"
    Array_arab += "صلى الله عليه وسلمِ"
    Array_arab += "رَسُوْلُ اللهِ"
    Array_arab += "فَقَالَ"
    Array_arab += "الإِسْلَامِ"
    Array_arab += "عَنْ"
    Array_arab += "أَخْبِرْنِي"
    Array_arab += "مُحَمّدُ"
    Array_arab += "يَا"
    Array_arab += "قَالَ"
    Array_arab += "وَ"
    Array_arab += "فَخِذَيْهِ"
    Array_arab += "عَلَى"
    Array_arab += "كَفَّيْهِ"
    Array_arab += "وَضَعَ"
    Array_arab += "وَ"
    Array_arab += "رُكْبَتَيْهِ"
    Array_arab += "إِلَى"
    Array_arab += "رُكْبَتَيْهِ"
    Array_arab += "فَأَسْنَدَ"
    Array_arab += "صلى الله عليه و سلم"
    Array_arab += "النَّبِيّ"
    Array_arab += "إِلَى"
    Array_arab += "جَلَسَ"
    Array_arab += "حَتَّى"
    Array_arab += "أَحَدٌ"
    Array_arab += "مِنَّا"
    Array_arab += "يَعْرِفُهُ"
    Array_arab += "لَا"
    Array_arab += "وَ"
    Array_arab += "السَّفَرِ"
    Array_arab += "أَثَرِ"
    Array_arab += "عَلَيْهِ"
    Array_arab += "يُرَى"
    Array_arab += "لَا"
    Array_arab += "الشَّعْرِ"
    Array_arab += "سَوادِ"
    Array_arab += "شَدِيْدُ"
    Array_arab += "الثِيَابِ"
    Array_arab += "بَيَاضِ"
    Array_arab += "شَدِيْدُ"
    Array_arab += "رَجُلٌ"
    Array_arab += "عَلَيْنَا"
    Array_arab += "إِذْ طَلَعَ"
    Array_arab += "يَوْمٍ"
    Array_arab += "ذَاتَ"
    Array_arab += "صلى الله عليه و سلم"
    Array_arab += "رسولِ اللهِ"
    Array_arab += "عِنْدَ"
    Array_arab += "جُلُوْسٌ"
    Array_arab += "نَحْنُ"
    Array_arab += "بَيْنَمَا"
    Array_arab += "قَالَ"
    Array_arab += "أَيْضًا"
    Array_arab += "عنه"
    Array_arab += "الله"
    Array_arab += "رضِيَ"
    Array_arab += "عُمَرَ"
    Array_arab += "عَنْ"
    init_arabic()

    Array_indo += "Imam Muslim"
    Array_indo += "Mengeluarkannya (hadits ini)"
    Array_indo += "Agamamu"

    Array_indo += "(Untuk) mengajarkanmu"
    Array_indo += "Yang datang kepadamu"
    Array_indo += "Jibril"
    Array_indo += "Sesungguhnya (dia itu)"
    Array_indo += "Ia berkata"
    Array_indo += "Lebih tahu"
    Array_indo += "Rasul-Nya"
    Array_indo += "Dan"
    Array_indo += "Allah"
    Array_indo += "Aku menjawab"

    Array_indo += "Yang bertanya"
    Array_indo += "Siapa"
    Array_indo += "Tahukah engkau"
    Array_indo += "Umar"
    Array_indo += "Wahai"
    Array_indo += "(Nabi) berkata"
    Array_indo += "Kemudian"
    Array_indo += "Beberapa saat"
    Array_indo += " "
    Array_indo += "Ia pergi"

    Array_indo += "Kemudian"
    Array_indo += "Bangunan"
    Array_indo += "Dalam (mendirikan)"
    Array_indo += "Berlomba-lomba"
    Array_indo += "Kambing"
    Array_indo += "Pengembala"
    Array_indo += "Orang berbaju compang-camping"
    Array_indo += "Engkau melihat"
    Array_indo += "Dan"
    Array_indo += "Tuannya"

    Array_indo += "Seorang budak"
    Array_indo += "Melahirkan"
    Array_indo += "Ia bersabda"
    Array_indo += "Tanda-tanda nya"
    Array_indo += "Tentang"
    Array_indo += "Beritahukan kepadaku"
    Array_indo += "Ia berkata"
    Array_indo += "Yang bertanya"
    Array_indo += "Dari"
    Array_indo += "Lebih tau"

    Array_indo += "Ditanya"
    Array_indo += "Tidak"
    Array_indo += "Ia berkata"
    Array_indo += "Hari kiamat"
    Array_indo += "Tentang"
    Array_indo += "Beritahukan kepadaku"
    Array_indo += "Ia berkata"
    Array_indo += "Ia melihatmu"
    Array_indo += "Sesungguhnya"
    Array_indo += "Melihatnya"

    Array_indo += "Keadaan mu"
    Array_indo += "Tidak"
    Array_indo += "Maka jika"
    Array_indo += "Melihat-Nya"
    Array_indo += "Seakan-akan engkau"
    Array_indo += "(Kepada) Allah"
    Array_indo += "Engkau beribadah"
    Array_indo += "Ia berkata"
    Array_indo += "Ihsan"
    Array_indo += "Tentang"

    Array_indo += "Beritahukan kepadaku"
    Array_indo += "Ia berkata"
    Array_indo += "Engkau benar"
    Array_indo += "Ia berkata"
    Array_indo += "Yang buruk"
    Array_indo += "Dan"
    Array_indo += "Yang baik"
    Array_indo += "Kepada takdir"
    Array_indo += "Engkau beriman"
    Array_indo += "Dan"

    Array_indo += "Akhir"
    Array_indo += "Hari"
    Array_indo += "Dan"
    Array_indo += "Rasul-rasul-Nya"
    Array_indo += "Dan"
    Array_indo += "Kitab-kitab-Nya"
    Array_indo += "Dan"
    Array_indo += "Malaikat-malaikat-Nya"
    Array_indo += "Dan"
    Array_indo += "Kepada Allah"

    Array_indo += "Engkau beriman"
    Array_indo += "Ia bersabda"
    Array_indo += "Iman"
    Array_indo += "Tentang"
    Array_indo += "Beritahukan kepadaku"
    Array_indo += "Ia berkata"
    Array_indo += "Ia yang membenarkan nya"
    Array_indo += "Dan"
    Array_indo += "Ia yang bertanya"
    Array_indo += "Padanya"

    Array_indo += "Kamipun menjadi heran"
    Array_indo += "Engkau benar"
    Array_indo += "Ia berkata"
    Array_indo += "jalan"
    Array_indo += "Padanya"
    Array_indo += "Jika engkau mampu"
    Array_indo += "Ke baitullah"
    Array_indo += "Engkau berhaji"
    Array_indo += "Dan"
    Array_indo += "Ramadhan"

    Array_indo += "Engkau puasa"
    Array_indo += "Dan"
    Array_indo += "Zakat"
    Array_indo += "Engkau menunaikan"
    Array_indo += "Dan"
    Array_indo += "Shalat"
    Array_indo += "Engkau mendirikan"
    Array_indo += "Dan"
    Array_indo += "Utusan Allah"
    Array_indo += "Muhammad itu"

    Array_indo += "Bahwasanya"
    Array_indo += "Dan"
    Array_indo += "Allah"
    Array_indo += "Kecuali"
    Array_indo += "Ilah"
    Array_indo += "Tidak ada"
    Array_indo += "Bahwasanya"
    Array_indo += "Engkau bersaksi"
    Array_indo += "Islam itu"

    Array_indo += " "
    Array_indo += "Rasulullah"
    Array_indo += "Maka bersabda"
    Array_indo += "Islam"
    Array_indo += "Tentang"
    Array_indo += "Beritahukan kepadaku"
    Array_indo += "Muhammad"
    Array_indo += "Wahai"
    Array_indo += "Ia berkata"

    Array_indo += "dan"
    Array_indo += "Pahanya"
    Array_indo += "Di atas"
    Array_indo += "Kedua  telapak tangannya"
    Array_indo += "Ia meletakkan"
    Array_indo += "Dan"
    Array_indo += "Kedua lutut nabi"
    Array_indo += "Ke"
    Array_indo += "Kedua lututnya"
    Array_indo += "Lalu menempelkan"

    Array_indo += " "
    Array_indo += "Nabi"
    Array_indo += "Di (hadapan)"
    Array_indo += "Ia Duduk"
    Array_indo += "Kemudian"
    Array_indo += "Seorangpun"
    Array_indo += "Diantara kami"
    Array_indo += "Mengenalnya"
    Array_indo += "Tidak"
    Array_indo += "Dan"

    Array_indo += "Perjalanan"
    Array_indo += "Bekas"
    Array_indo += "Padanya"
    Array_indo += "Terlihat"
    Array_indo += "Tidak"
    Array_indo += "Rambut"
    Array_indo += "Hitam"
    Array_indo += "Sangat"
    Array_indo += "Baju"
    Array_indo += "Putih"

    Array_indo += "Sangat"
    Array_indo += "Seorang laki-laki"
    Array_indo += "Kepada kami"
    Array_indo += "Tiba-tiba datanglah"
    Array_indo += "Hari"
    Array_indo += "Pada suatu"
    Array_indo += " "
    Array_indo += "Rasulullah"
    Array_indo += "Bersama"

    Array_indo += "Sedang duduk"
    Array_indo += "Kami"
    Array_indo += "Ketika"
    Array_indo += "Ia berkata "
    Array_indo += "Juga"
    Array_indo += "Padanya"
    Array_indo += "Allah"
    Array_indo += "Semoga meridhoi"
    Array_indo += "Umar"
    Array_indo += "Dari"

    for (i in 0..5){
        Array_logat += Quadruple(2,i,2,"P2")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(3,i,1,"S2")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(6,i,2,"P2")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(8,i,1,"S1")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(9,i,2,"P1")
        iterasi++
    }
    for (i in 4..10){
        Array_logat += Quadruple(15,i,2,"P2")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(17,i,1,"S2")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(18,i,1,"S2")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(19,i,1,"S2")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(20,i,1,"S2")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(21,i,1,"S2")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(22,i,1,"S2")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(23,i,1,"S2")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(25,i,2,"P3")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(27,i,1,"S3")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(28,i,1,"S3")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(31,i,2,"P2")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(33,i,1,"S2")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(35,i,2,"P2")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(39,i,2,"P2")
        iterasi++
    }
    for (i in 0..12){
        Array_logat += Quadruple(40,i,3,"O")
        iterasi++
    }
    for (i in 0..6){
        Array_logat += Quadruple(44,i,2,"P2")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(45,i,3,"O")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(49,i,2,"P2")
        iterasi++
    }
    for (i in 0..11){
        Array_logat += Quadruple(52,i,2,"Pp")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(53,i,3,"O")
        iterasi++
    }
    for (i in 0..11){
        Array_logat += Quadruple(54,i,3,"O")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(55,i,2,"P2")
        iterasi++
    }
    for (i in 0..13){
        Array_logat += Quadruple(56,i,1,"S2")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(58,i,1,"S1")
        iterasi++
    }
    for (i in 0..12){
        Array_logat += Quadruple(59,i,2,"P1")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(70,i,2,"P2")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(71,i,3,"O")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(73,i,2,"P2")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(74,i,3,"O")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(76,i,2,"P2")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(79,i,2,"P2")
        iterasi++
    }
    for (i in 3..10){
        Array_logat += Quadruple(81,i,2,"P2")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(84,i,2,"P2")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(85,i,2,"P2")
        iterasi++
    }
    for (i in 0..11){
        Array_logat += Quadruple(86,i,2,"P2")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(93,i,3,"O")
        iterasi++
    }
    for (i in 0..11){
        Array_logat += Quadruple(94,i,3,"O")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(95,i,2,"P2")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(97,i,3,"O")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(98,i,3,"O")
        iterasi++
    }
    for (i in 0..12){
        Array_logat += Quadruple(99,i,3,"O")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(100,i,3,"O")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(101,i,3,"O")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(102,i,3,"O")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(103,i,3,"O")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(104,i,3,"O")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(105,i,3,"O")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(106,i,3,"O")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(109,i,3,"O")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(110,i,3,"O")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(111,i,3,"O")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(112,i,3,"O")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(113,i,2,"P2")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(114,i,2,"P2")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(115,i,2,"P2")
        iterasi++
    }
    for (i in 0..13){
        Array_logat += Quadruple(116,i,2,"P2")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(117,i,3,"O")
        iterasi++
    }
    for (i in 0..11){
        Array_logat += Quadruple(118,i,3,"O")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(119,i,2,"P2")
        iterasi++
    }
    for (i in 5..6){
        Array_logat += Quadruple(120,i,1,"S1") // ???
        iterasi++
    }
    for (i in 6..12){
        Array_logat += Quadruple(120,i,2,"P2")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(121,i,3,"O")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(130,i,2,"P2")
        iterasi++
    }
    for (i in 1..6){
        Array_logat += Quadruple(131,i,2,"P2")
        iterasi++
    }
    for (i in 8..13){
        Array_logat += Quadruple(131,i,3,"O")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(132,i,3,"O")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(133,i,3,"O")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(134,i,2,"P2")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(140,i,2,"P2")
        iterasi++
    }
    for (i in 1..9){
        Array_logat += Quadruple(141,i,2,"P2")
        iterasi++
    }
    for (i in 9..13){
        Array_logat += Quadruple(141,i,3,"O")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(142,i,3,"O")
        iterasi++
    }
    for (i in 0..12){
        Array_logat += Quadruple(143,i,3,"O")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(144,i,3,"O")
        iterasi++
    }
    for (i in 5..9){
        Array_logat += Quadruple(145,i,2,"P2")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(146,i,1,"S2")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(147,i,3,"O")
        iterasi++
    }
    for (i in 5..6){
        Array_logat += Quadruple(149,i,1,"S2")
        iterasi++
    }
    for (i in 7..10){
        Array_logat += Quadruple(149,i,2,"P2")
        iterasi++
    }
    for (i in 0..29){
        Array_logat += Quadruple(150,i,3,"O")
        iterasi++
    }
    for (i in 0..7){
        Array_logat += Quadruple(151,i,3,"O")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(152,i,3,"O")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(153,i,2,"P2")
        iterasi++
    }
    for (i in 11..15){
        Array_logat += Quadruple(153,i,1,"S2")
        iterasi++
    }
    for (i in 0..3){
        Array_logat += Quadruple(154,i,3,"O")
        iterasi++
    }
    for (i in 0..11){
        Array_logat += Quadruple(155,i,3,"O")
        iterasi++
    }
    for (i in 0..9){
        Array_logat += Quadruple(157,i,2,"P2")
        iterasi++
    }
    for (i in 2..7){
        Array_logat += Quadruple(158,i,2,"P2")
        iterasi++
    }
    for (i in 8..10){
        Array_logat += Quadruple(158,i,1,"S2")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(161,i,2,"P2")
        iterasi++
    }
    for (i in 2..3){
        Array_logat += Quadruple(164,i,1,"S1")
        iterasi++
    }
    for (i in 4..9){
        Array_logat += Quadruple(164,i,2,"P1")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(164,i,1,"S1")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(164,i,2,"P1")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(165,i,1,"S1")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(166,i,2,"P1")
        iterasi++
    }
    for (i in 0..4){
        Array_logat += Quadruple(167,i,2,"P2")
        iterasi++
    }
    for (i in 5..6){
        Array_logat += Quadruple(167,i,1,"S2")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(168,i,1,"S1")
        iterasi++
    }
    for (i in 0..2){
        Array_logat += Quadruple(169,i,1,"S1")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(170,i,1,"S1")
        iterasi++
    }
    for (i in 0..8){
        Array_logat += Quadruple(171,i,2,"P1")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(172,i,2,"P2")
        iterasi++
    }
    for (i in 0..5){
        Array_logat += Quadruple(175,i,2,"P2")
        iterasi++
    }
    for (i in 6..9){
        Array_logat += Quadruple(175,i,3,"O")
        iterasi++
    }
    for (i in 0..1){
        Array_logat += Quadruple(176,i,1,"S2")
        iterasi++
    }
    for (i in 2..8){
        Array_logat += Quadruple(176,i,2,"P2")
        iterasi++
    }
    for (i in 9..13){
        Array_logat += Quadruple(176,i,3,"O")
        iterasi++
    }
    for (i in 0..10){
        Array_logat += Quadruple(177,i,3,"O")
        iterasi++
    }

    Array_logat_B += Pair(0,"Pp")
    Array_logat_B += Pair(1,"N1")
    Array_logat_B += Pair(2,"V1")
    Array_logat_B += Pair(3,"N")
    Array_logat_B += Pair(4,"Pp")
    Array_logat_B += Pair(6,"V")
    Array_logat_B += Pair(8,"N")
    Array_logat_B += Pair(9,"N")
    Array_logat_B += Pair(10,"P1")
    Array_logat_B += Pair(13,"Pt")
    Array_logat_B += Pair(16,"Pp")
    Array_logat_B += Pair(17,"N1")
    Array_logat_B += Pair(26,"Fp")
    Array_logat_B += Pair(29,"Ko")
    Array_logat_B += Pair(33,"N1")
    Array_logat_B += Pair(34,"Ko")
    Array_logat_B += Pair(35,"V1")
    Array_logat_B += Pair(36,"Pp")
    Array_logat_B += Pair(37,"N1")
    Array_logat_B += Pair(39,"Ko")
    Array_logat_B += Pair(40,"N2")
    Array_logat_B += Pair(41,"Pp")
    Array_logat_B += Pair(42,"N2")
    Array_logat_B += Pair(44,"V1")
    Array_logat_B += Pair(45,"N2")
    Array_logat_B += Pair(46,"Pp")
    Array_logat_B += Pair(47,"Ko")
    Array_logat_B += Pair(48,"Ko")
    Array_logat_B += Pair(49,"V1")
    Array_logat_B += Pair(52,"Vnl")
    Array_logat_B += Pair(53,"Pp")
    Array_logat_B += Pair(56,"N1")
    Array_logat_B += Pair(58,"N")
    Array_logat_B += Pair(59,"Vnl")
    Array_logat_B += Pair(69,"Ko")
    Array_logat_B += Pair(70,"Vnl")
    Array_logat_B += Pair(71,"N")
    Array_logat_B += Pair(72,"Ko")
    Array_logat_B += Pair(73,"Vnl")
    Array_logat_B += Pair(74,"N")
    Array_logat_B += Pair(75,"Ko")
    Array_logat_B += Pair(76,"Vnl")
    Array_logat_B += Pair(77,"N")
    Array_logat_B += Pair(79,"Vnl")
    Array_logat_B += Pair(80,"N")
    Array_logat_B += Pair(82,"Pp")
    Array_logat_B += Pair(84,"V1")
    Array_logat_B += Pair(85,"V1")
    Array_logat_B += Pair(93,"Pp")
    Array_logat_B += Pair(95,"V")
    Array_logat_B += Pair(96,"Vnl")
    Array_logat_B += Pair(97,"Pp")
    Array_logat_B += Pair(98,"Ko")
    Array_logat_B += Pair(99,"N")
    Array_logat_B += Pair(100,"N")
    Array_logat_B += Pair(101,"N")
    Array_logat_B += Pair(102,"N")
    Array_logat_B += Pair(103,"N")
    Array_logat_B += Pair(104,"N")
    Array_logat_B += Pair(105,"N")
    Array_logat_B += Pair(106,"N")
    Array_logat_B += Pair(108,"Vnl")
    Array_logat_B += Pair(109,"Pp")
    Array_logat_B += Pair(121,"N")
    Array_logat_B += Pair(130,"V1")
    Array_logat_B += Pair(134,"V")
    Array_logat_B += Pair(138,"Pp")
    Array_logat_B += Pair(139,"N1")
    Array_logat_B += Pair(140,"V1")
    Array_logat_B += Pair(142,"Pp")
    Array_logat_B += Pair(143,"N")
    Array_logat_B += Pair(144,"V1")
    Array_logat_B += Pair(145,"Vnl")
    Array_logat_B += Pair(148,"Ko")
    Array_logat_B += Pair(149,"Vnl")
    Array_logat_B += Pair(153,"Vnl")
    Array_logat_B += Pair(154,"Pp")
    Array_logat_B += Pair(156,"Ko")
    Array_logat_B += Pair(158,"Ko")
    Array_logat_B += Pair(160,"Ko")
    Array_logat_B += Pair(161,"V1")
    Array_logat_B += Pair(167,"V1")
    Array_logat_B += Pair(172,"V1")
    Array_logat_B += Pair(174,"N")
    Array_logat_B += Pair(175,"V1")
    Array_logat_B += Pair(176,"Vnl")

    ArtiFull = "Dari ‘Umar ra. juga berkata: “Ketika kami sedang duduk bersama Rasulullah saw. pada suatu hari, tiba-tiba datanglah kepada kami seorang laki-laki yang mengenakan baju yang sangat putih dan berambut sangat hitam, tidak ditampakkan padanya kelelahan bekas perjalanan jauh dan tidak ada seorangpun di antara kami mengenalnya. Kemudian laki-laki itu duduk di hadapan Nabi saw. lalu menempelkan kedua lututnya pada lututnya Nabi saw. serta meletakkan tangannya di atas paha Nabi saw. laki-laki itu berkata: “Ya Muhammad! Beritahukan kepadaku tentang Islam!” Maka Rasulullah saw. bersabda: “Islam adalah engkau bersaksi bahwa sesungguhnya tidak ada Illah yang berhak disembah kecuali Allah, dan sesungguhnya Nabi Muhammad saw. adalah utusan Allah, engkau mendirikan shalat, engkau menunaikan zakat, engkau berpuasa di bulan Ramadhan, dan berhaji ke Baitullah jika engkau mampu.” Kemudian laki-laki itu berkata: “Engkau benar”. Kamipun menjadi heran kepada laki-laki itu, ia yang bertanya ia pula yang membenarkannya. Kemudian laki-laki itu berkata lagi: “Beritahukan kepadaku tentang iman!” Lalu Nabi saw. menjawab: “Engkau beriman kepada Allah, malaikat-malaikat-Nya, kitab-kitab-Nya, rasul-rasul-Nya, dan hari akhir dan engkau beriman pada takdir yang baik maupun yang buruk.” Kemudian laki-laki itu berkata: “Engkau benar”. Dan dia berkata lagi: “Beritahukan kepadaku tentang ihsan!”. Nabi saw bersabda: “Ihsan adalah engkau beribadah kepada Allah seakan-akan engkau melihatnya, dan jika engkau tidak melihatnya maka sesungguhnya Dia melihatmu.” Laki-laki itu berkata lagi: “Beritahukan kepadaku tentang hari kiamat!”. Nabi menjawab: “Yang ditanya tidak lebih tahu dari yang bertanya”. Laki-laki itu berkata: “Beritahukan kepadaku tentang tanda-tandanya!”, Nabi Saw menjawab: “Jika seorang budak melakirkan tuannya dan jika engkau melihat orang yang tidak beralas kaki, tidak berpakaian, miskin dan penggembala kambing, mereka saling bermegah-megahan meningggikan bangunan.” Kemudian laki-laki itu pergi. Beberapa saat setelah kepergiannya Nabi saw. bertanya kepadaku: “Wahai ‘Umar, tahukah engkau siapa yang bertanya tadi?” Aku menjawab: “Allah dan Rasul-Nya lebih mengetahui.” Nabi berkata: “Dia adalah Malaikat Jibril yang datang untuk mengajarkan kepadamu tentang agamamu.”"
    Penjelasan = "Penjelasan hadist\n" +
            "Allah menurunkan wahyu kepada Nabi Muhammad Saw. dapat diturunkan melalui mimpi, dibisikkan ke dalam hati, atau seperti hadits di atas yaitu malaikat Jibril datang secara langsung dalam wujud seorang laki-laki. \n" +
            "Secara bahasa, kata “Ihsan”, berasal dari Bahasa Arab yaitu أَحْسَنَ- يحسِنُ- إحسانًا  yang berarti berbuat baik. Berbeda maknanya dengan bentuk dasar, kata أَحْسَنَ merupakan bentuk turunan (Tsulatsi Mazid) dari kata حسُن- يحسُن  yang berarti baik.\n" +
            "Ihsan berarti berbuat baik, yaitu berbuat baik dalam menunaikan kewajiban kita kepada Allah dengan melakukan ibadah secara ikhlas dan mengikuti tuntunan Rasulullah saw.\n" +
            "Menurut hadits kedua dalam kitab arba’in an-nawawi, Nabi saw. bersabda: “Ihsan itu adalah engkau beribadah kepada Allah seakan-akan engkau melihatnya, dan jika engkau tidak melihatnya maka sesungguhnya Allah melihatmu.”\n" +
            "Menurut Syaikh As-Sa’di, ihsan itu terbagi dua, yaitu ihsan dalam ibadah dan ihsan dalam menunaikan hak sesama makhluk (mu’amalah).\n" +
            "a.   \tIhsan dalam ibadah maknanya beribadah kepada Allah seolah-olah Allah melihatnya atau ia merasa diawasi oleh Allah. Contohnya lebih meningkatkan kualitas shalat.\n" +
            "b.  \tIhsan dalam menunaikan hak sesama makhluk adalah menunaikan hak mereka, contohnya dengan kedudukan dan harta. Ihsan dengan kedudukan, yaitu dengan mempermudah orang lain dalam urusan pemerintah. Ihsan dengan harta yaitu dengan membayar zakat dan shadaqah.\n" +
            "Menurut Syaikh Ibnu ‘Utsaimin, derajat ihsan ada dua, yaitu derajat thalab dan derajat harb. Derajat thalab adalah derajat yang paling tinggi dibandingkan derajat harb, karena derajat thalab bermakna bahwa manusia menyembah Allah seolah-olah dia melihatnya dalam melaksanakan ibadah yang bersifat permohonan dan rasa cinta. Sedangkan derajat harb adalah menyembah Allah tetapi tidak bisa bersikap seakan-akan Allah melihatnya. \n" +
            "As-sa'ah berarti hari kebangkitan di mana manusia menghadap Allah \n" +
            "Ilmu tentang hari kiamat hanyalah milik Allah, tidak ada seorangpun yang mengetahui begitu pula dengan nabi muhammad. \n" +
            "Kiamat akan terjadi setelah melewati tanda-tandanya, diantaranya yang telah disebutkan dalam hadits; Jika seorang budak melakirkan tuannya dan jika engkau melihat orang yang tidak beralas kaki, tidak berpakaian, miskin dan penggembala kambing, mereka saling bermegah-megahan meningggikan bangunan. \n" +
            "\n"

    var uniqueFirstElements2 = Array_logat.map { it.first }.toSet()
    var resultArray2 = uniqueFirstElements2.map { uniqueElement ->
        val index = Array_logat.indexOfFirst { it.first == uniqueElement }
        Pair(uniqueElement, index)
    }.toTypedArray()

    val hadist2 = HalamanBelajar("Hadist Arbain No. 2","(Iman, Islam, dan Ihsan) Hana" , resultArray2 ,Array_indo.reversedArray(), Array_arab.reversedArray(), Array_logat,  ArtiFull , Array_logat_B, Array_Duplicate ,Penjelasan)
    Hadist.add(hadist2)
}