package com.binayshaw7777.kotfolio.components.widgets

import androidx.compose.runtime.Composable
import com.binayshaw7777.kotfolio.components.model.WorkExperience
import com.binayshaw7777.kotfolio.components.styles.WorkExperienceItemOrgStyle
import com.binayshaw7777.kotfolio.components.styles.WorkExperienceItemRoleAndDurationStyle
import com.binayshaw7777.kotfolio.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.layout.HorizontalDivider
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun WorkExperienceBlock(
    modifier: Modifier = Modifier,
    workExperience: WorkExperience
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth().padding(leftRight = 0.5.cssRem).margin(bottom = 2.cssRem)
            .fontFamily(Res.Fonts.DM_SANS).margin(leftRight = 0.5.cssRem).then(modifier)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(leftRight = 0.5.cssRem)
                .border(
                    width = 1.px, style = LineStyle.Solid, color = when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.DimGray
                    }
                )
                .borderRadius(10.px)
                .margin(top = 2.cssRem)
                .padding(top = 30.px, bottom = 24.px, leftRight = 24.px),
        ) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {

                    SpanText(
                        text = workExperience.organization,
                        modifier = WorkExperienceItemOrgStyle.toModifier()
                            .fillMaxWidth()
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Colors.Black
                                    ColorMode.DARK -> Colors.White
                                }
                            )
                            .fontFamily(Res.Fonts.Space_Grotesk)
                            .fontWeight(FontWeight.Bold)
                    )
                    SpanText(
                        text = workExperience.role,
                        modifier = WorkExperienceItemRoleAndDurationStyle.toModifier()
                            .fillMaxWidth()
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Colors.Gray
                                    ColorMode.DARK -> Colors.DimGray
                                }
                            )
                            .fontWeight(FontWeight.Bold)
                    )

                }
                ExperienceDuration(workExperience)
            }

            HorizontalDivider(
                Modifier.height(1.px).color(Color.dimgray).backgroundColor(Color.dimgray)
            )

            WorkExperienceHighlights(
                points = workExperience.experienceHighlights
            )
            Box(Modifier.height(2.cssRem))
        }

        SpanText(
            text = workExperience.sequenceNumber,
            modifier = Modifier.fontSize(3.cssRem)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Black
                        ColorMode.DARK -> Colors.White
                    }
                )
                .margin(left = 2.cssRem)
                .align(Alignment.TopStart)
                .fontWeight(FontWeight.Bold)
                .fontFamily(Res.Fonts.Space_Grotesk)
        )
    }
}

