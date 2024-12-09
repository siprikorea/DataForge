package view.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun ViewDataInput() = ViewDataBase(
    icon = Icons.Filled.CheckCircle,
    title = "Input",
    options = mapOf("Type" to listOf("Hex", "String"))
) {
    var text by remember { mutableStateOf("") }

    TextField(
        modifier = Modifier.fillMaxSize(),
        value = text,
        onValueChange = { text = it },
    )
}