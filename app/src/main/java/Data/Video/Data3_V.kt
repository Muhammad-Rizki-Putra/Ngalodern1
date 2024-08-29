package Data.Video

import Object.Quadruple
import Object.HalamanMateri
import Object.Video
import androidx.compose.runtime.Composable

@Composable
fun Data3_V(){

    var videoUrl : String = ""
    videoUrl = "xM4aY_m3oGU"



    val video3 = HalamanMateri("Kata Arab-Sunda", "" , videoUrl)
    Video.add(video3)
}