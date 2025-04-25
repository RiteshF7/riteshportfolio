package com.binayshaw7777.kotfolio.pages

import androidx.compose.runtime.Composable
import com.binayshaw7777.kotfolio.components.layouts.PageLayout
import com.binayshaw7777.kotfolio.components.sections.About
import com.binayshaw7777.kotfolio.components.sections.Experience
import com.binayshaw7777.kotfolio.components.sections.Home
import com.binayshaw7777.kotfolio.components.sections.Project
import com.binayshaw7777.kotfolio.components.sections.SkillsAndTools
import com.binayshaw7777.kotfolio.utils.Res
import com.binayshaw7777.kotfolio.utils.getElgoProject
import com.binayshaw7777.kotfolio.utils.getPhotographProject
import com.binayshaw7777.kotfolio.utils.getProCodeProject
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    PageLayout("Home") {
        Row(
            Modifier.fillMaxWidth().fontFamily(Res.Fonts.Space_Grotesk).id("home")
        ) {
            Box {

                Column {

                    Home()

                    About()

                    Experience()

                    SkillsAndTools()


                    Project(getElgoProject())

                    Project(getProCodeProject())

//                    Project(getPhotographProject())


                }
            }
        }
    }
}