package view.layout

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun LayoutTitle(icon: @Composable () -> Unit, title: @Composable () -> Unit) {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            icon()
        }
        Spacer(
            modifier = Modifier.width(LayoutConstant.PaddingNarrow)
        )
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            title()
        }
    }
}