package Object

import Data.Hadist.*
import Data.Dongeng.*
import Data.Soal.Tingkat_1.Stage_1.*
import Data.Soal.Tingkat_1.Stage_2.*
import Data.Soal.Tingkat_1.Stage_3.*
import Data.Soal.Tingkat_2.Stage_1.*
import Data.Soal.Tingkat_2.Stage_2.*

import androidx.compose.runtime.Composable

var sizehd: Int = 0
var sizedg: Int = 0
var sizesl: Int = 0
// rai nambah ini
var sizemd: Int = 0
var sizevd: Int = 0


var Hadist: MutableList<HalamanBelajar> = mutableListOf()
var Dongeng: MutableList<HalamanBelajar> = mutableListOf()
// rai nambah ini
var Modul: MutableList<HalamanMateri> = mutableListOf()
var Video: MutableList<HalamanMateri> = mutableListOf()

var Soal_11: MutableList<HalamanSoal> = mutableListOf()
var Soal_12: MutableList<HalamanSoal> = mutableListOf()
var Soal_13: MutableList<HalamanSoal> = mutableListOf()
var Soal_21: MutableList<HalamanSoal> = mutableListOf()
var Soal_22: MutableList<HalamanSoal> = mutableListOf()

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

    //*== Format Logat Atas: ==*/
    //      for (i in *awal*..*akhir*){
    //          Array_logat += Quadruple(*urutan*,i,*warna*,"*logat*")
    //          iterasi++
    //      }

    //*== Format Logat Bawah: ==*/
    //      Array_logat_B += Pair(*urutan*,"*logat*")

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

/*==============================================Soal==============================================*/
    // Tingkat 1 Stage 1
    Soal_1101()
    Soal_1102()
    Soal_1103()
    Soal_1104()
    Soal_1105()
    Soal_1106()
    Soal_1107()
    Soal_1108()
    Soal_1109()
    Soal_1110()

    // Tingkat 1 Stage 2
    Soal_1201()
    Soal_1202()
    Soal_1203()
    Soal_1204()
    Soal_1205()

    // Tingkat 1 Stage 3
    Soal_1301()
    Soal_1302()
    Soal_1303()
    Soal_1304()
    Soal_1305()

    // Tingkat 2 Stage 1
    Soal_2101()
    Soal_2102()
    Soal_2103()
    Soal_2104()
    Soal_2105()
    Soal_2106()
    Soal_2107()
    Soal_2108()
    Soal_2109()
    Soal_2110()

    // Tingkat 2 Stage 2
    Soal_2201()
    Soal_2202()
    Soal_2203()
    Soal_2204()
    Soal_2205()
    Soal_2206()
    Soal_2207()
    Soal_2208()
    Soal_2209()
    Soal_2210()

}

fun get_sizehd(): Int{
    sizehd = Hadist.size
    return sizehd
}

fun get_sizedg(): Int{
    sizedg = Dongeng.size
    return sizedg
}

fun get_Hadist(): List<HalamanBelajar>{
    return Hadist
}

fun get_Dongeng(): List<HalamanBelajar>{
    return Dongeng
}

fun get_Soal_11(): List<HalamanSoal>{
    return Soal_11
}

fun get_Soal_12(): List<HalamanSoal>{
    return Soal_12
}

fun get_Soal_13(): List<HalamanSoal>{
    return Soal_13
}

fun get_Soal_21(): List<HalamanSoal>{
    return Soal_21
}

fun get_Soal_22(): List<HalamanSoal>{
    return Soal_22
}


fun get_sizemd(): Int{
    sizemd = Modul.size
    return sizemd
}
fun get_sizevd(): Int{
    sizevd = Video.size
    return sizevd
}

fun get_Modul(): List<HalamanMateri>{
    return Modul
}

fun get_Video(): List<HalamanMateri>{
    return Video
}