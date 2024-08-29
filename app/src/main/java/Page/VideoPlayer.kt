@file:Suppress("PreviewMustBeTopLevelFunction", "PreviewMustBeTopLevelFunction")

package Page

import android.content.Context
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.LifecycleOwner
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

//@Composable
//fun VideoPlayer(modifier: Modifier = Modifier, videoUrl: String) {
//    val context = LocalContext.current
////    val videoUrl = ""
//    val player = ExoPlayer.Builder(context).build().apply {
//        setMediaItem(MediaItem.fromUri(videoUrl))
//    }
//    val playerView = PlayerView(context)
//    val playWhenReady by rememberSaveable {
//        mutableStateOf(true)
//    }
//
//    playerView.player = player
//
//    LaunchedEffect(player) {
//        player.prepare()
//        player.playWhenReady = playWhenReady
//    }
//
//    AndroidView(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp)
//            .height(200.dp)
//            .clip(RoundedCornerShape(16.dp)),
//        factory = {
//            playerView
//        })
//
//}

//@Composable
//fun VideoPlayer(modifier: Modifier, videoUrl: String, lifecycleOwner: LifecycleOwner) {
//
//    AndroidView(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp)
//            .clip(RoundedCornerShape(16.dp)),
//        factory = { context ->
//            YouTubePlayerView(context = context).apply {
//                lifecycleOwner.lifecycle.addObserver(this)
//
//                addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
//                    override fun onReady(youTubePlayer: YouTubePlayer) {
//                        youTubePlayer.loadVideo(videoUrl, 0f)
//                    }
//                })
//            }
//        })
//
//}


@Composable
fun VideoPlayer(modifier: Modifier = Modifier, videoUrl: String) {
    val ctx = LocalContext.current
    AndroidView(factory = {
        var view = YouTubePlayerView(it)
        val fragment = view.addYouTubePlayerListener(
            object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer:
                                     YouTubePlayer) {
                    super.onReady(youTubePlayer)
                    youTubePlayer.loadVideo(videoUrl, 0f)
                }
            }
        )
        view
    })}
