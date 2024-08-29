package Data.Video

import Object.Quadruple
import Object.HalamanMateri
import Object.Video
import androidx.compose.runtime.Composable

@Composable
fun Data2_V(){

    var videoUrl : String = ""
    videoUrl = "csk-c50URLw"



    val video2 = HalamanMateri("Ragam Predikat", "" , videoUrl)
    Video.add(video2)
}