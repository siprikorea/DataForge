package view.style

import androidx.compose.foundation.border
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val DefaultBorderModifier = Modifier.border(width = 1.dp, color = Color.Gray)

class StyleConstant {
    companion object {
        // Color
        val ColorBorder = Color(225, 225, 225)

        // Font Size
        val FontLarge = 18.sp
        val FontMedium = 16.sp
        val FontSmall = 14.sp

        // Icon Size
        val IconLarge = 20.dp
        val IconMedium = 16.dp
        val IconSmall = 14.dp
    }
}