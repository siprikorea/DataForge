package view.element

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ViewElementTitle(icon: ImageVector, title: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = ViewConstant.SizePadding)
    ) {
        Icon(
            icon,
            contentDescription = "",
            modifier = Modifier.size(ViewConstant.SizeTitleIcon)
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = ViewConstant.FontSizeTitle,
            modifier = Modifier.padding(start = ViewConstant.SizePadding)
        )
    }
}
