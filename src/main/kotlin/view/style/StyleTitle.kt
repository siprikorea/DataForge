package view.style

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import view.layout.LayoutTitle

@Composable
fun StyleTitle(
    icon: ImageVector,
    title: String
) {
    LayoutTitle(
        icon = {
            Icon(
                imageVector = icon,
                contentDescription = ""
            )
        },
        title = {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = StyleConstant.FontLarge,
            )
        }
    )
}
