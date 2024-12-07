import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import view.screen.ViewDataMain

@Composable
@Preview
fun App() {
    MaterialTheme {
        ViewDataMain()
    }
}

fun main() = application {
    Window(title = "Data Forge", onCloseRequest = ::exitApplication) {
        App()
    }
}
