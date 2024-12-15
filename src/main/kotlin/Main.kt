import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import view.screen.ViewDataMain

@Composable
@Preview
fun App(
    darkTheme: Boolean = isSystemInDarkTheme()
) {
    //val colors = if (darkTheme) {
    //    darkColorScheme()
    //} else {
    //    lightColorScheme()
    //}
    val colors = lightColorScheme()

    MaterialTheme(
        colorScheme = colors
    ) {
        ViewDataMain()
    }
}

fun main() = application {
    Window(title = "Data Forge", onCloseRequest = ::exitApplication) {
        App()
    }
}
