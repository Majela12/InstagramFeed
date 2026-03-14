package me.mariaherrera.instagramclone.model

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class Post (
        val id: Int,
        val username: String,
        val profileImageUrl: String,
        val imageUrl: String,
        val likes: Int,
        val caption: String,
        val isLiked: Boolean = false
)


