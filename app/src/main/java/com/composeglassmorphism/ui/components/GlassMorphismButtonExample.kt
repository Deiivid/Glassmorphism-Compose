package com.composeglassmorphism.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.composeglassmorphism.modifier.glassMorphism

@Composable
fun GlassMorphismButtonExample() {
    Button(
        onClick = { /* Action */ },
        modifier = Modifier
            .glassMorphism {
                radius = 5
                blurColor= Color.Yellow
            }

    ) {
        Text(text = "Glass Button")
    }
}
