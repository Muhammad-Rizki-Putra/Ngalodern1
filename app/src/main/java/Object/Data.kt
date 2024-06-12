package Object

import Data.Hadist.*
import Data.Dongeng.*
import androidx.compose.runtime.Composable

var sizehd: Int = 0
var sizedg: Int = 0

var Hadist: MutableList<HalamanBelajar> = mutableListOf()
var Dongeng: MutableList<HalamanBelajar> = mutableListOf()

@Composable
fun Data(){
    //    Untuk penempatan kata pada data :
    //    text arab di simpan dalam bentuk String of array seperti contoh dibawah
    //    text indonesia juga sama di simpan dalam bentuk String of array seperti contoh dibawah
    //    untuk lokasi logat dapat di simpan dalam bentuk array of tripple
    //    Keterangan warna:
    //          1 = red
    //          2 = blue
    //          3 = brown
    //          4 = purple

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

    fun clearArrays() {
        Array_arab = arrayOf<String>()
        Array_indo = arrayOf<String>()
        Array_logat = arrayOf<Quadruple<Int, Int, Int, String>>()
        ArtiFull = ""
        Penjelasan = ""
        Array_logat_B = arrayOf<Pair<Int, String>>()
        Array_Duplicate = arrayOf<Pair<Int, Int>>()
        iterasi = 0
    }

//    untuk penggunaan array pakai saja yang diatas supaya tidak perlu menulis ulang (nambah memori)

/*==Data==*/
/*=============================================Hadist=============================================*/
    Data1()
    Data2()
    Data3()
    Data4()
    Data5()
    Data6()
    Data7()
    Data8()
    Data9()
    Data10()

/*=============================================Dongeng============================================*/
    Data1_D()
    Data2_D()
    Data3_D()
    Data4_D()
    Data5_D()

}

fun get_sizehd(): Int{
    return sizehd
}

fun get_sizedg(): Int{
    return sizedg
}

fun get_Hadist(): List<HalamanBelajar>{
    return Hadist
}

fun get_Dongeng(): List<HalamanBelajar>{
    return Dongeng
}