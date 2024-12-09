package view.layout

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import view.style.DefaultBorderModifier

@Composable
fun LayoutTitle(icon: @Composable () -> Unit, title: @Composable () -> Unit) {
    Row(
        modifier = DefaultBorderModifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = DefaultBorderModifier
        ) {
            icon()
        }
        Column(
            modifier = DefaultBorderModifier
                .padding(start = LayoutConstant.PaddingNarrow)
        ) { }
        Column(
            modifier = DefaultBorderModifier
                .fillMaxWidth()
        ) {
            title()
        }
    }
}