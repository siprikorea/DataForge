package view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ViewDataMain() {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.LightGray)
        ) {
            ViewDataProcList()
        }

        Column(
            modifier = Modifier
                .weight(2f)
                .fillMaxHeight()
                .background(Color.White)
        ) {
            ViewDataInput()
            ViewDataProcBase64Encoder()
        }
    }
}