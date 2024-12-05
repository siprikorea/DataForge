package view

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ViewDataProc(
    title: String,
    content: @Composable () -> Unit,
) {
    Column {
        Text(title)
        content()
    }
}