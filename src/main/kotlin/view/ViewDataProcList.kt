package view

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import model.ModelDataProcManager

@Composable
fun ViewDataProcList() {
    val processors = ModelDataProcManager.processors

    Column {
        for (processor in processors) {
            Text(text = processor.name)
        }
    }
}