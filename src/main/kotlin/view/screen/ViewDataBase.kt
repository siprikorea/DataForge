package view.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import view.element.ElementOptions
import view.element.ElementTitle


@Composable
fun ViewDataBase(
    icon: ImageVector,
    title: String,
    options: Map<String, List<String>> = mapOf(),
    content: @Composable (modifier: Modifier) -> Unit,
) {
    LayoutFrame(
        title = { ElementTitle(icon, title) },
        option = { ElementOptions(options) },
        content = { content(Modifier.fillMaxSize()) }
    )
}
