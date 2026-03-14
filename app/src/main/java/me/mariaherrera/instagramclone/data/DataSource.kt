// 📁 data/DataSource.kt
package me.mariaherrera.instagramclone.data

import me.mariaherrera.instagramclone.model.Post
import me.mariaherrera.instagramclone.model.Story

object DataSource {

    fun getPosts(): List<Post> = listOf(
        Post(
            id = 1,
            username = "android_developer",
            profileImageUrl = "https://picsum.photos/seed/user1/200/200",
            imageUrl = "https://picsum.photos/seed/post1/800/800",
            likes = 1204,
            caption = "Explorando Jetpack Compose #Android #Kotlin"
        ),
        Post(
            id = 2,
            username = "kotlin_ninja",
            profileImageUrl = "https://picsum.photos/seed/user2/200/200",
            imageUrl = "https://picsum.photos/seed/post2/800/800",
            likes = 847,
            caption = "Data classes son la mejor feature de Kotlin",
            isLiked = true
        ),

        Post(
            id = 3,
            username = "kotlin_ninja",
            profileImageUrl = "https://picsum.photos/seed/user3/200/200",
            imageUrl = "https://picsum.photos/seed/post3/800/800",
            likes = 847,
            caption = "Data classes son la mejor feature de Kotlin",
            isLiked = true
        ),

        Post(
            id = 4,
            username = "kotlin_ninja",
            profileImageUrl = "https://picsum.photos/seed/user4/200/200",
            imageUrl = "https://picsum.photos/seed/post4/800/800",
            likes = 847,
            caption = "Ay, ayuda",
            isLiked = true
        )


    )

    fun getStories(): List<Story> = listOf(
        Story(1, "Tu historia", ""),
        Story(2, "android_dev", "https://picsum.photos/seed/s2/200/200"),
        Story(3, "kotlin_fan", "https://picsum.photos/seed/s3/200/200"),
        Story(4, "google_io", "https://picsum.photos/seed/s4/200/200", hasSeen = true),
        Story(5, "google_io", "https://picsum.photos/seed/s5/200/200", hasSeen = true),


    )
}
