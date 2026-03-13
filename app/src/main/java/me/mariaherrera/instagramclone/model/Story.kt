package me.mariaherrera.instagramclone.model

data class Story (
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    val imageUrl: String,
    val hasSeen: Boolean = false
)

