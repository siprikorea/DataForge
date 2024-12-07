package view.element

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ViewElementTitle(title: String) {
    val COLOR = Color(86, 134, 78)
    Text(
        text = title,
        color = COLOR,
        fontWeight = FontWeight.Bold,
    )
}
