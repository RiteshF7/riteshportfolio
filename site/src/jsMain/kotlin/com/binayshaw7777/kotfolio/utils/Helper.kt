package com.binayshaw7777.kotfolio.utils

import com.binayshaw7777.kotfolio.components.model.Project
import com.binayshaw7777.kotfolio.components.model.WorkExperience


fun getElgoProjectImages() = listOf(

    Pair(Res.Images.ELGO_1, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.ELGO_2, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.ELGO_3, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.ELGO_4, Constants.PROJECT_ELGORITHM_URL)
)

fun getElgoProject() = Project(
    Constants.ELGO_PROJECT_TITLE,
    Constants.ELGO_PROJECT_SECTION_TEXT,
    getElgoProjectImages()
)

fun getBoilerplateProjectImages() = listOf(

    Pair(Res.Images.BOILERPLATE_BANNER, Constants.PROJECT_BOILERPLATE_URL),
)

fun getBoilerplateProject() = Project(
    Constants.BOILERPLATE_TITLE,
    Constants.BOILERPLATE_SECTION_TEXT,
    getBoilerplateProjectImages()
)

fun getGcodeProjectImages() = listOf(

    Pair(Res.Images.GCODE_BANNER, Constants.PROJECT_GCODE_URL),
    Pair(Res.Images.GCODE_ONE_BANNER, Constants.PROJECT_GCODE_URL),
    Pair(Res.Images.GCODE_TWO_BANNER, Constants.PROJECT_GCODE_URL),
)

fun getGcodeProject() = Project(
    Constants.GCODE_TITLE,
    Constants.GCODE_SECTION_TEXT,
    getGcodeProjectImages()
)

fun getPhotographProject() = Project(
    Constants.PHOTOGRAPH_TITLE,
    Constants.PHOTOGRAPH_SECTION_TEXT,
    getPhotographProjectImages()
)

fun getPhotographProjectImages() = listOf(
    Pair(Res.Images.IMAGE_1, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_2, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_3, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_4, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_5, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_6, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_7, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_8, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_9, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_10, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_11, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.IMAGE_12, Constants.PROJECT_ELGORITHM_URL),

    )

fun getProCodeProjectImages() = listOf(

    Pair(Res.Images.PROCODE_1, Constants.PROJECT_PROCODE_URL),
    Pair(Res.Images.PROCODE_2, Constants.PROJECT_PROCODE_URL),
)

fun getProCodeProject() = Project(
    Constants
        .PRO_PROJECT_TITLE, Constants.PRO_PROJECT_SECTION_TEXT, getProCodeProjectImages()
)

fun getAllWorkExperience() = listOf(
    WorkExperience(
        sequenceNumber = "01",
        role = "Co-Founder & Lead Developer",
        organization = "EMI Shield",
        duration = "JAN 23 - Present",
        experienceHighlights = getEmiShieldExperienceHighlights()
    ),
    WorkExperience(
        sequenceNumber = "02",
        role = "SDE-2",
        organization = "Cashify.in",
        duration = "MAY 21 - AUG 22",
        experienceHighlights = getCashifyExperienceHighlights()

    ),
    WorkExperience(
        sequenceNumber = "03",
        role = "SDE-1",
        organization = "99roomz.LLP",
        duration = "MAR 19 - Mar 21",
        experienceHighlights = getRoomzAndTripsExperienceHighlights()
    ),
    WorkExperience(
        sequenceNumber = "04",
        role = "Android developer",
        organization = "Corpzone Pvt.Ltd",
        duration = "JAN 18 - Mar 19",
        experienceHighlights = getCorpzoneExperienceHighlights()
    )
)

fun getAllPhotographs() =
    listOf(
        Res.Images.IMAGE_1,
        Res.Images.IMAGE_2,
        Res.Images.IMAGE_3,
        Res.Images.IMAGE_4,
        Res.Images.IMAGE_5,
        Res.Images.IMAGE_6,
        Res.Images.IMAGE_7,
        Res.Images.IMAGE_8,
        Res.Images.IMAGE_9,
        Res.Images.IMAGE_10,
        Res.Images.IMAGE_11,
        Res.Images.IMAGE_12,


        )

fun getEmiShieldExperienceHighlights() = listOf(
    "Founded EMI Shield and architected a remote-locking SDK enforcing EMI compliance across Android devices",
    "Integrated FCM for secure real-time user control; registered 90K+ devices/month with wide Android compatibility",
    "Partnered with 18+ merchants, generating ₹10L+ monthly revenue via freemium-to-subscription model",
    "Engineered multi-modular architecture with parallel Gradle builds; reduced build time by 40%",
    "Implemented Communication SDK with persistent FCM and SMS fallback; 90%+ remote command delivery rate",
    "Built Location SDK with optimized battery algorithms powering 90K+ active devices/month",
    "Developed Auto-Deploy Gradle plugin enabling real-time remote app installation across thousands of devices",
    "Designed reusable REST SDK with coroutines, Flow, and MVI for high-velocity modular development",
    "Integrated Ktor server for secure device-dashboard communication; onboarded 18+ vendors with ₹10L+ MRR"
)

fun getCashifyExperienceHighlights() = listOf(
    // Scratch Detection SDK Highlights
    "Built Scratch Detection SDK for analyzing screen/panel scratches on pre-owned devices using dual-phone coordination and QR code pairing",
    "Designed custom camera workflow for high-resolution, clutter-free panel image capture suitable for ML training",
    "Optimized camera framing and focus using pixel ratios, focal length, and perspective correction for precise bounding box detection",
    "Accelerated image pipeline with Kotlin coroutines and Flow; achieved 75% latency reduction and high-fidelity outputs",
    "Reduced APK size by 60% via ProGuard, asset pruning, and WebP usage; improved CI/CD efficiency and build times by 35–40%",
    "Developed scalable socket infrastructure for asynchronous communication and telemetry sync during inspections",

    // Software Engineer I - Mobile Highlights
    "Implemented Secure Wipe Algorithm with configurable multi-pass data erasure and randomized overwrite patterns; achieved 40% faster wipe throughput",
    "Built Dynamic Translation SDK allowing runtime language switching and remote updates via getString() override; avoided Play Store redeployments",
    "Developed Device Quality Assessment SDK for automated diagnostics of SIM, WiFi, speaker, mic, and display using native Android services; enabled telemetry-based dynamic pricing"
)


fun getRoomzAndTripsExperienceHighlights() = listOf(
    // 99 Roomz App Revamp
    "Migrated legacy architecture to MVVM with LiveData, enhancing scalability and modularity",
    "Refactored screens using Epoxy framework into server-driven UI; enabled dynamic layout rendering from backend configs",
    "Reduced manual app updates and improved adaptability to remote content changes",

    // 99 Trips Feature Integration
    "Developed international travel booking module with itinerary listings, filters, and trip previews",
    "Implemented vertical media carousel similar to Instagram Reels; boosted booking conversion rate by 18% through visual storytelling",

    // Live Streaming SDK
    "Built reusable live video streaming SDK using RTMP and AWS MediaPackage for one-to-many broadcasts",
    "Achieved improved reliability across diverse Android devices via scalable infrastructure"
)



fun getCorpzoneExperienceHighlights(): List<String> {
    return listOf(
        // Instagram Repost Utility
        "Built Android utility app to automate Instagram reposts using clipboard link parsing and background image pre-processing",
        "Enabled seamless post creation and sharing through intent-based workflow, streamlining user experience",

        // Tutorial App Revamp
        "Revamped educational app UI to enhance clarity and readability for long-form study sessions",
        "Optimized typography and layout for improved user engagement and focus during extended use"
    )
}