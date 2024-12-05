package view

import androidx.compose.material.TextField
import androidx.compose.runtime.*

@Composable
fun ViewDataProcBase64Encoder() = ViewDataProc("Base64 Encoder") {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
    )
}