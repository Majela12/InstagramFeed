package me.mariaherrera.instagramclone.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import me.mariaherrera.instagramclone.data.DataSource
import me.mariaherrera.instagramclone.ui.components.PostCard
import me.mariaherrera.instagramclone.ui.components.StoriesRow

@Composable
fun FeedScreen() {
    val posts = remember { DataSource.getPosts() }
    val stories = remember { DataSource.getStories() }

    Scaffold(
        topBar = { InstagramTopBar() }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // Bloque de historias
            item(key = "stories_row") {
                StoriesRow(stories = stories)
                Divider()
            }

            // Bloque de posts
            items(posts, key = { it.id }) { post ->
                PostCard(
                    post = post,
                    onLikeClick = { likedPost ->
                        // Aquí podrías registrar el like en un Log o mostrar un Toast
                        println("Like en post de ${likedPost.username}")
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramTopBar() {
    TopAppBar(
        title = {
            Text(
                text = "Instagram",
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
            )
        }
    )
}
