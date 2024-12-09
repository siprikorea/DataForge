package view.screen

import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import view.style.StyleOptions
import view.style.StyleTitle
import kotlin.math.roundToInt


@Composable
fun ViewDataBase(
    icon: ImageVector,
    title: String,
    options: Map<String, List<String>> = mapOf(),
    content: @Composable (modifier: Modifier) -> Unit,
) {
    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }

    Box(modifier = Modifier
        .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
        .pointerInput(Unit) {
            detectDragGestures { change, dragAmount ->
                change.consume()
                offsetX += dragAmount.x
                offsetY += dragAmount.y
            }
        }) {
        LayoutFrame(
            title = { StyleTitle(icon, title) },
            option = { StyleOptions(options) },
            content = { content(Modifier.fillMaxSize()) }
        )
    }
}
