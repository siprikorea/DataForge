package view.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import view.element.ViewConstant
import view.element.ViewElementOptions
import view.element.ViewElementTitle


@Composable
fun ViewDataBase(
    icon: ImageVector,
    title: String,
    options: Map<String, List<String>> = mapOf(),
    content: @Composable (modifier: Modifier) -> Unit,
) {
    Column(
        modifier = Modifier
            .border(2.dp, ViewConstant.ColorBorder, shape = RoundedCornerShape(24.dp))
            .height(480.dp)
            .padding(ViewConstant.PaddingOutside)
            .width(240.dp)
    ) {
        ViewElementTitle(icon, title)
        ViewElementOptions(options)
        content(Modifier.fillMaxSize())
    }
}
