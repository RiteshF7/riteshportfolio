package com.binayshaw7777.kotfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.dom.Source
import org.jetbrains.compose.web.dom.Video

@Composable
fun MinimalVideoPlayer(videoUrl: String) {
    Video(
        attrs = Modifier
            .fillMaxWidth()
            .toAttrs {
                attr("autoplay", "true") // Enable autoplay
                attr("muted", "true")    // Mute to comply with autoplay restrictions in browsers
                attr("playsinline", "true") // Allow playback inline in mobile browsers
                attr("preload", "metadata") // Load metadata for quicker playback
            }
    ) {
        Source(
            attrs = {
                attr("src", videoUrl)  // Video URL
                attr("type", "video/mp4")  // MIME type for MP4 videos
            }
        )
        org.jetbrains.compose.web.dom.Text("Your browser does not support the video tag.")
    }
}