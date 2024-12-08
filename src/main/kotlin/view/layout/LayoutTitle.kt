package view.layout

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import view.element.DefaultBorderModifier
import view.element.ElementConstant

@Composable
fun LayoutTitle(icon: @Composable () -> Unit, title: @Composable () -> Unit) {
    Row(
        modifier = DefaultBorderModifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = DefaultBorderModifier
                .width(ElementConstant.IconLarge)
        ) {
            icon()
        }
        Column(
            modifier = DefaultBorderModifier
                .padding(start = ElementConstant.PaddingNarrow)
        ) { }
        Column(
            modifier = DefaultBorderModifier
                .fillMaxWidth()
        ) {
            title()
        }
    }
}