package org.siprikorea

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

@Composable
fun NodeEditor() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        // Draw nodes
        drawCircle(color = Color.Blue, radius = 50f, center = Offset(100f, 100f))
        // Draw connections
        drawLine(
            color = Color.Black,
            start = Offset(100f, 100f),
            end = Offset(200f, 200f),
            strokeWidth = 2f
        )
    }
}
