package Object

class Data {
//    dongeng
    val dongeng1: Dongeng = Dongeng("Judul 1", "Sub judul 1", "isi 1" , "عن N1أَمِيْرِالْمُؤْمِنِيْنَ N1أَبِيْ حَفْصٍ عُمَرَ بْنِ الْخَطَّابِ VlرَضِيَP2 اللهُS2 Ppعَنْهُ VlقَالَP2: VlسَمِعْتُP2+S2  N1رَسُوْلَ اللهِ صلّى الله عليه و سَلَّمَO: إنَّمَا N+الأعمَالُS1 PpبالنِّيَّاتِP1 Koوإِنَّما لِكُلِّ امريءٍ ما نَوَى فَمَنْS1 كَانَتْ هِجْرَتُهُ إلى اللهِ ورَسُولِهِ فهِجْرَتُهُ Ppإلى اللهِ Koورَسُوْلِهِ KoومَنْS1 كَانَتْ هِجْرَتُهُ Ppلِدُنْيَا VnlيُصِيْبُهاP2 Koأو N1امرأةٍ VnlيَنْكِحُهَاP2 فهِجْرَتُهُ Ppإلى ما VlهَاجَرَP2 Ppإليهِ")
    val dongeng2: Dongeng = Dongeng()
    val dongeng3: Dongeng = Dongeng()
    val dongeng4: Dongeng = Dongeng()

    val dongengList: List<Dongeng> = listOf(dongeng1, dongeng2, dongeng3, dongeng4)
    val sizedg = dongengList.size

//    hadits
val arabicText = arrayOf(
    "صَلَّى",
    "رَسُوْلَ",
    "اللهِ",
    "سَمِعْتُ",
    "قَالَ",
    "عَنْهُ",
    "اللهُ",
    "رَضِيَ",
    "أَبِيْ",
    "حَفْصٍ",
    "عُمَرَ",
    "بْنِ",
    "الْخَطَّابِ",
    "أَمِيْرِالْمُؤْمِنِيْنَ",
    "عن",
    "إِنَّما",
    "و",
    "بِالنِّيَّاتِ",
    "الأعمَالُ",
    "إنَّمَا",
    "سَلَّمَ",
    "و",
    "عليه",
    "الله",
    "هِجْرَ",
    "تُهُ",
    "كَانَتْ",
    "فَمَنْ",
    "نَوَى",
    "ما",
    "امريءٍ",
    "لِكُلِّ",
    "اللهِ",
    "إلى",
    "فَهِجْرَتُهُ",
    "رَسُولِهِ",
    "و",
    "اللهِ",
    "إلى",
    "لِدُنْيَا",
    "هِجْرَتُهُ",
    "كَانَتْ",
    "مَنْ",
    "و",
    "رَسُوْلِهِ",
    "و",
    "ما",
    "إلى",
    "فهِجْرَ",
    "تُهُ",
    "يَنْكِحُهَا",
    "امرأةٍ",
    "أو",
    "يُصِيْبُهَا",
    "إليْهِ",
    "هَاجَرَ"
)
    val textArray = arrayOf(
        "Semoga shalawat",
        "Rasulullah",
        "Aku mendengar",
        "Ia berkata",
        "Padanya",
        "Allah",
        "Semoga meridhoi",
        "Abi Hafs Umar bin Khatthab",
        "Pemimpin bagi orang-orang beriman",
        "Dari",
        "Hanyasaja",
        "Dan",
        "(Tergantung)dengan niat",
        "Amal-amal itu",
        "Hanyasaja",
        "Salam",
        "Dan",
        "Pada nabi muhammad",
        "Allah (limpahkan)",
        "Hijrahnya",
        "Keadaan",
        "Maka barang siapa",
        "Ia niatkan",
        "Apa-apa",
        "Orang",
        "Bagi setiap",
        "Allah",
        "Kepada",
        "Maka hijrahnya",
        "Rasul-Nya",
        "Dan",
        "Allah",
        "Kepada",
        "Bagi dunia",
        "Hijrahnya",
        "Keadaan",
        "Barang siapa",
        "Dan",
        "Rasulnya",
        "Dan",
        "Apa",
        "Kepada",
        "Maka hijrahnya",
        "Yang dinikahinya",
        "Perempuan",
        "Atau",
        "Mencarinya",
        "Kepadanya",
        "Ia hijrah"
    )


    val hadist1: Hadist = Hadist("Judul 1", "Sub judul 1", "isi 1" ,textArray, arabicText)


    val hadistList: List<Hadist> = listOf(hadist1)
    val sizehd = hadistList.size
}