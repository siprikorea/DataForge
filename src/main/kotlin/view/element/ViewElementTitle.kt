package view.element

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ViewElementTitle(icon: ImageVector, title: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = DefaultBorderModifier.fillMaxWidth()
    ) {
        Icon(
            icon,
            contentDescription = "",
            modifier = DefaultBorderModifier.size(ViewConstant.IconLarge)
        )

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = ViewConstant.FontLarge,
            modifier = DefaultBorderModifier.padding(start = ViewConstant.Padding, end = 0.dp, top = 0.dp, bottom = 0.dp)
        )
    }
}
