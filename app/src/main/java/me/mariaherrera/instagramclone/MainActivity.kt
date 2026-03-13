package me.mariaherrera.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.mariaherrera.instagramclone.model.Post
import me.mariaherrera.instagramclone.ui.theme.FeedInstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val post = Post(
            id = 1,
            username = "yo",
            profileImageUrl = "https://example.com/yo.jpg",
            imageUrl = "https://example.com/foto.jpg",
            likes = 120,
            caption = "Mi primera publicación",
            isLiked = false
        )

        println(post)

        setContent {
            FeedInstagramTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PostItem(post = post, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun PostItem(post: Post, modifier: Modifier = Modifier) {
    Text(
        text = "${post.username}: ${post.caption}",
        modifier = modifier
    )
}

@Preview(showSystemUi = true)
@Composable
fun PostPreview() {
    FeedInstagramTheme {
        PostItem(
            post = Post(
                id = 1,
                username = "yo",
                profileImageUrl = "https://example.com/yo.jpg",
                imageUrl = "https://example.com/foto.jpg",
                likes = 120,
                caption = "Mi primera publicación",
                isLiked = false
            )
        )
    }
}
