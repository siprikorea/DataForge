package view.screen

import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.*

@Composable
fun ViewDataInput() = ViewDataBase(
    icon = Icons.Rounded.ShoppingCart,
    title = "Input",
    options = mapOf("Type" to listOf("Hex", "String"))
) {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
    )
}