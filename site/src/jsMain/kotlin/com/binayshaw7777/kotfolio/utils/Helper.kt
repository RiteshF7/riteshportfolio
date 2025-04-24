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

fun getProCodeProjectImages() = listOf(

    Pair(Res.Images.PROCODE_1, Constants.PROJECT_ELGORITHM_URL),
    Pair(Res.Images.PROCODE_2, Constants.PROJECT_ELGORITHM_URL),
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
        duration = "AUG 22 - Present",
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
        experienceHighlights = get99RoomzExperienceHighlights()
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
    "Developed an Android application for device management upon EMI non-payment, utilizing Device Policy Manager API and MVVM architecture for scalable and maintainable code.",
    "Designed and implemented key features:",
    "   - Offline/Online device locking",
    "   - Live location tracking",
    "   - Factory Reset Protection (FRP)",
    "   - Audio/video payment reminders",
    "Integrated backend with Firebase, leveraging:",
    "   - Firestore for secure data handling",
    "   - FCM for real-time notifications",
    "Automated APK deployment via CI/CD pipelines for seamless app delivery.",
    "Aligned technical implementation with product vision, optimizing user experience and incorporating market-specific needs."
)

fun getCashifyExperienceHighlights() = listOf(
    "Designed Android hardware tests for camera, speaker, mic, and display.",
    "Developed an app to detect front and back panel cracks.",
    "Built a Flutter macOS application for unrecoverable phone data wiping.",
    "Created SDKs for runtime localization of Android apps.",
    "Managed multi-module app development and CI/CD build automation.",
    "Optimized Android build time and project version management."
)

fun get99RoomzExperienceHighlights(): List<String> {
    return listOf(
        "Improved app speed by 40% through optimization efforts.",
        "Redesigned the UI for the company app, enhancing usability and aesthetics.",
        "Developed 99Tripz, a new feature section for the company.",
        "Enhanced app architecture for better performance and scalability.",
        "Managed both frontend and backend development.",
        "Implemented exclusive features like live videos for better user engagement.",
        "Contributed to the design and development of the Phunk App."
    )
}

fun getCorpzoneExperienceHighlights(): List<String> {
    return listOf(
        "Developed an app for reposting Instagram feed posts.",
        "Enhanced the company app with new features and tutorial sections.",
        "Created DIY IoT projects for the company website to showcase innovation.",
        "Trained students on various technology topics, fostering skill development."
    )
}