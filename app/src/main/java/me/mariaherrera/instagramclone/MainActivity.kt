package me.mariaherrera.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import me.mariaherrera.instagramclone.ui.screens.FeedScreen
import me.mariaherrera.instagramclone.ui.theme.FeedInstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeedInstagramTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    FeedScreen()
                }
            }
        }
    }
}


