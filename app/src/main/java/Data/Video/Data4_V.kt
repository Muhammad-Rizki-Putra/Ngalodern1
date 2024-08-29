package Data.Video

import Object.Quadruple
import Object.HalamanMateri
import Object.Video
import androidx.compose.runtime.Composable

@Composable
fun Data4_V(){

    var videoUrl : String = ""
    videoUrl = "qc02v_9LHUw"



    val video4 = HalamanMateri("Kalimat", "" , videoUrl)
    Video.add(video4)
}