package view.style

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import view.layout.LayoutTitle
import javax.swing.Spring.scale

@Composable
fun StyleTitle(
    color: Color,
    title: String
) {
    LayoutTitle(
        icon = {
            Canvas(modifier = Modifier.size(18.dp)) {
                drawCircle(color = color)
            }
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
