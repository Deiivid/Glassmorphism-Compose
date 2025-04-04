package com.composeglassmorphism.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.composeglassmorphism.modifier.glassMorphism
import kotlinx.coroutines.delay

@Composable
fun GlassMorphismListExample(items: List<String>) {
    var opacityLevel by remember { mutableFloatStateOf(1f) }
    var blurRadius by remember { mutableFloatStateOf(1f) }

    val animatedOpacity by animateFloatAsState(
        targetValue = opacityLevel,
        animationSpec = tween(durationMillis = 1000, easing = LinearEasing),
        label = "Opacity Animation"
    )

    LaunchedEffect(Unit) {
        while (true) {
            for (i in 1..10) {
                opacityLevel = i / 10f
                blurRadius = i.toFloat()
                delay(1000)
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .glassMorphism {
                radius = 5
                blurColor=Color.Yellow
            },

        contentAlignment = Alignment.Center
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(items) { item ->
                Text(
                    text = item,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(Color.White.copy(alpha = animatedOpacity)),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
