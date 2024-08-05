package Object

import Data.Hadist.*
import Data.Dongeng.*
import androidx.compose.runtime.Composable

var sizehd: Int = 0
var sizedg: Int = 0
// rai nambah ini
var sizemd: Int = 0
var sizevd: Int = 0


var Hadist: MutableList<HalamanBelajar> = mutableListOf()
var Dongeng: MutableList<HalamanBelajar> = mutableListOf()
// rai nambah ini
var Modul: MutableList<HalamanMateri> = mutableListOf()
var Video: MutableList<HalamanMateri> = mutableListOf()

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