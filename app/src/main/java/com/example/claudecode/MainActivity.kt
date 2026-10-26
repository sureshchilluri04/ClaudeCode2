package com.example.claudecode

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
import com.example.claudecode.ui.theme.ClaudeCodeTheme

/**
 * Single entry-point activity that hosts the Compose UI.
 *
 * The whole screen is built with Jetpack Compose (Material 3) inside [ClaudeCodeTheme];
 * there are no XML layouts or fragments.
 */
class MainActivity : ComponentActivity() {

    /**
     * Enables edge-to-edge rendering and sets the Compose content: a full-screen [Scaffold]
     * that shows a [Greeting].
     *
     * @param savedInstanceState previously saved state, or `null` on a fresh launch (unused;
     * Compose restores its own state)
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Draw behind the system bars; insets are applied via Scaffold's innerPadding below.
        enableEdgeToEdge()
        setContent {
            // Apply the app's Material 3 theme (colors, typography) to everything below.
            ClaudeCodeTheme {
                // Scaffold provides the basic screen structure and computes the system-bar insets.
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Pass the padding down so content isn't hidden under the system bars.
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/**
 * Displays a greeting for [name].
 *
 * @param name who to greet
 * @param modifier modifier applied to the underlying [Text]
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

/** Android Studio preview of [Greeting] on a plain background. */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ClaudeCodeTheme {
        Greeting("Android")
    }
}