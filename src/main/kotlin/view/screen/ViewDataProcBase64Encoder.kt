package view.screen

import androidx.compose.material.TextField
import androidx.compose.runtime.*

@Composable
fun ViewDataProcBase64Encoder() = ViewDataBase("Base64 Encoder") {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
    )
}