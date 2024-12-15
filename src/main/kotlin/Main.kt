import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import view.screen.ViewDataMain
import view.theme.DarkColorScheme
import view.theme.LightColorScheme

@Composable
@Preview
fun App(
    darkTheme: Boolean = isSystemInDarkTheme()
) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = LightColorScheme
    ) {
        ViewDataMain()
    }
}

fun main() = application {
    Window(title = "Data Forge", onCloseRequest = ::exitApplication) {
        App()
    }
}
