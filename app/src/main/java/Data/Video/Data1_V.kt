package Data.Video

import Object.Quadruple
import Object.HalamanMateri
import Object.Video
import androidx.compose.runtime.Composable

@Composable
fun Data1_V(){

    var videoUrl : String = ""
    videoUrl = "uL-2-ykMMfE"

    val video1 = HalamanMateri("Ragam Subjek", "" , videoUrl)
    Video.add(video1)
}