package view.screen

import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.*

@Composable
fun ViewDataProcBase64Encoder() = ViewDataBase(
    icon = Icons.Rounded.ShoppingCart,
    "Base64 Encoder"
) {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
    )
}