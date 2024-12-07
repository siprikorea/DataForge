package view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import view.element.ViewElementOptions
import view.element.ViewElementTitle

@Composable
fun ViewDataBase(
    title: String,
    options: Map<String, List<String>> = mapOf(),
    content: @Composable (modifier: Modifier) -> Unit,
) {
    Column(
        modifier = Modifier
            .background(color = Color(226, 239, 218))
            .height(350.dp)
            .padding(16.dp)
            .width(200.dp)
    ) {
        ViewElementTitle(title)
        ViewElementOptions(options)
        content(Modifier.fillMaxSize())
    }
}
