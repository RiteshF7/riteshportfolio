package com.binayshaw7777.kotfolio.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.binayshaw7777.kotfolio.utils.Constants
import com.binayshaw7777.kotfolio.utils.Res
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.document
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.dpi
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.w3c.dom.HTMLAnchorElement

val FooterStyle by ComponentStyle.base {
    Modifier.padding(topBottom = 1.5.cssRem, leftRight = 10.percent)
}

@Composable
fun Footer(breakpoint: Breakpoint, modifier: Modifier = Modifier) {

    val footerColor = when (ColorMode.current) {
        ColorMode.LIGHT -> Res.Colors.FOOTER_COLOR_LIGHT
        ColorMode.DARK -> Res.Colors.FOOTER_COLOR_DARK
    }

    var isHorizontal by remember { mutableStateOf(true) }

    isHorizontal = breakpoint >= Breakpoint.MD

    val footerTextAlignment = if (isHorizontal) TextAlign.Start else TextAlign.Center
    val footerColumnAlignment = if (isHorizontal) Alignment.Start else Alignment.CenterHorizontally


    FooterContent(breakpoint, footerTextAlignment, footerColumnAlignment, footerColor, modifier)
}

@Composable
fun EmailButton(ctx: PageContext) {
    Link(
        path = Constants.MAIL_TO,
        text = "EMAIL ME ⮚    ",
        modifier = Modifier
            .fontFamily(Res.Fonts.DM_SANS)
            .color(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Colors.Black
                    ColorMode.DARK -> Colors.White
                }
            )
            .margin(right = 4.px)
    )

}

@Composable
fun DownloadResumeFromGitHub(ctx: PageContext) {
    Link(
        path = Constants.DOWNLOAD_RESUME,
        text = "Resume ⮚",
        modifier = Modifier
            .fontFamily(Res.Fonts.DM_SANS)
            .color(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Colors.Black
                    ColorMode.DARK -> Colors.White
                }
            )
            .margin(right = 4.px)
    )

}


fun triggerGitHubDownload(fileUrl: String) {
    val anchor = document.createElement("a") as HTMLAnchorElement
    anchor.href = fileUrl           // Raw GitHub URL to the PDF
    anchor.download = "ritesh_resume_2025.pdf"  // Desired download file name
    document.body?.appendChild(anchor)
    anchor.click()
    document.body?.removeChild(anchor)
}

@Composable
fun EmailAndResume(ctx: PageContext) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        EmailButton(ctx)
        DownloadResumeFromGitHub(ctx)
    }
}

@Composable
fun FooterContent(
    breakpoint: Breakpoint,
    footerTextAlignment: TextAlign,
    footerColumnAlignment: Alignment.Horizontal,
    footerColor: Color.Rgb,
    modifier: Modifier
) {

    Box(
        FooterStyle.toModifier().backgroundColor(footerColor).fontFamily(Res.Fonts.DM_SANS)
            .then(modifier),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier.fillMaxWidth().margin(top = 2.cssRem),
            horizontalAlignment = footerColumnAlignment
        ) {

            SpanText(
                text = "Feel free to reach out to me via mail or any of the listed mediums",
                modifier = Modifier
                    .fillMaxWidth()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.Gray
                            ColorMode.DARK -> Colors.DimGray
                        }
                    )
                    .textAlign(footerTextAlignment)
                    .fontSize(FontSize.Small)
            )

            val ctx = rememberPageContext()

            if (breakpoint >= Breakpoint.MD) {

                Row(
                    modifier = Modifier.fillMaxWidth().padding(topBottom = 2.cssRem),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    EmailAndResume(ctx)

                    Spacer()

                    NetworkingIconButtons(ctx)
                }
            } else {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(topBottom = 2.cssRem),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    EmailAndResume(ctx)

                    Spacer()

                    NetworkingIconButtons(ctx, Modifier.margin(top = 2.cssRem))
                }
            }
        }
    }
}

@Composable
fun NetworkingIconButtons(ctx: PageContext, modifier: Modifier = Modifier) {
    SimpleGrid(
        modifier = modifier,
        numColumns = numColumns(base = 5)
    ) {
        Link(
            path = Constants.LINKEDIN_URL,
            text = "LinkedIn ⮚    ",
            modifier = Modifier
                .fontFamily(Res.Fonts.DM_SANS)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Black
                        ColorMode.DARK -> Colors.White
                    }
                )
                .margin(right = 4.px)
        )
        Link(
            path = Constants.GITHUB_URL,
            text = "Github ⮚",
            modifier = Modifier
                .fontFamily(Res.Fonts.DM_SANS)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Black
                        ColorMode.DARK -> Colors.White
                    }
                )
                .margin(right = 14.px)
        )

//        IconButtonNoHover(
//            onClick = { ctx.router.navigateTo(Constants.TWITTER_URL) }
//        ) {
//            AppearanceAwareImage(src = Res.Images.TWITTER_X)
//        }

    }
}