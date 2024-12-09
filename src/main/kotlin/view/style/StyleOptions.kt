package view.style

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun StyleOptions(options: Map<String, List<String>>) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (options.isEmpty()) {
            return
        }

        options.forEach { (key, options) ->
            Text(
                text = "$key:",
                fontSize = StyleConstant.FontMedium,
            )
            Option(options)
        }
    }
}

@Composable
fun Option(options: List<String>) {
    var expanded by remember { mutableStateOf(true) }
    var selectedIndex by remember { mutableStateOf(0) }
    if (options.isEmpty()) {
        return
    }

    Text(
        options[selectedIndex],
        modifier = Modifier
            .clickable(onClick = { expanded = true } )
    )
    DropdownMenu(
        expanded = expanded, onDismissRequest = { expanded = false }
    ) {
        options.forEachIndexed { index, s ->
            DropdownMenuItem(onClick = {
                selectedIndex = index
                expanded = false
            }) {
                Text(text = s)
            }
        }
    }
}
