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
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Draw behind the system bars; insets are applied via Scaffold's innerPadding below.
        enableEdgeToEdge()
        setContent {
            ClaudeCodeTheme {
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