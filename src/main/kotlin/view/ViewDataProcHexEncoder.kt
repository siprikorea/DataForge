package view

import androidx.compose.material.TextField
import androidx.compose.runtime.*

@Composable
fun ViewDataProcHexEncoder() = ViewDataProc("Hex Encoder") {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
    )
}