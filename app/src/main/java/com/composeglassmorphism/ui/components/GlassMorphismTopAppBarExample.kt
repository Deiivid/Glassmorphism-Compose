package com.composeglassmorphism.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.composeglassmorphism.modifier.glassMorphism

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GlassMorphismTopAppBarExample(title: String) {
    TopAppBar(
        title = {
            Text(
                text = title,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .glassMorphism {
                radius = 10
                blurColor = Color.Green
            },
    )
}
