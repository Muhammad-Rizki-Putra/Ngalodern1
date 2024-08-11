package Data.Video

import Object.Quadruple
import Object.HalamanMateri
import Object.Video
import androidx.compose.runtime.Composable

@Composable
fun Data1_V(){

    var videoUrl : String = ""
    videoUrl = "https://drive.google.com/file/d/1I1l3FpJZ8pgExW0TPbQTiUCL2hruvYG5/view?usp=drive_link"



    val video1 = HalamanMateri("Ragam Subjek", "" , videoUrl)
    Video.add(video1)
}