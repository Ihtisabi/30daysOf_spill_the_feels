package com.example.basicscodelab.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color

// Define the dark color scheme
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF00796B),
    secondary = Color(0xFF03DAC6)
)

// Define the light color scheme with orange background
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF00796B),
    onPrimary = Color.White,
    secondary = Color(0xFF03DAC6),
    // Set the background color to orange
    background = Color(0xFFFFA500), // Orange
    onBackground = Color.Black, // Text color for better contrast
    surface = Color(0xFFFFA500), // Optionally set surface to orange too
    onSurface = Color.Black // Text color on surface
)

// Main theme composable function
@Composable
fun BasicsCodelabTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme // Use the updated LightColorScheme with orange background
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
