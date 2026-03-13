package me.mariaherrera.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.mariaherrera.instagramclone.model.Post
import me.mariaherrera.instagramclone.model.Story
import me.mariaherrera.instagramclone.ui.components.StoriesRow
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

        val stories = listOf(
            Story(1, "maria", "https://example.com/maria.jpg", "https://example.com/story.jpg"),
            Story(2, "juan", "https://example.com/juan.jpg", "https://example.com/story2.jpg", hasSeen = true)
        )

        println(post)

        setContent {
            FeedInstagramTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        // Primero las historias
                        StoriesRow(stories = stories)

                        // Luego el post
                        PostItem(post = post)
                    }
                }
            }
        }
    }
}

@Composable
fun PostItem(post: Post, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Text(text = "👤 Usuario: ${post.username}")
        Text(text = "📸 Caption: ${post.caption}")
        Text(text = "❤️ Likes: ${post.likes}")
    }
}

@Preview(showSystemUi = true)
@Composable
fun PostPreview() {
    FeedInstagramTheme {
        Column {
            StoriesRow(
                stories = listOf(
                    Story(1, "maria", "https://example.com/maria.jpg", "https://example.com/story.jpg"),
                    Story(2, "juan", "https://example.com/juan.jpg", "https://example.com/story2.jpg", hasSeen = true)
                )
            )
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
}
