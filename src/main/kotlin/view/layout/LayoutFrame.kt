package view.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import view.layout.LayoutConstant
import view.style.DefaultBorderModifier
import view.style.StyleConstant


@Composable
fun LayoutFrame(
    title: @Composable () -> Unit,
    option: @Composable () -> Unit,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier
            .border(2.dp, StyleConstant.ColorBorder, shape = RoundedCornerShape(24.dp))
            .height(320.dp)
            .padding(LayoutConstant.PaddingWide)
            .width(240.dp)
    ) {
        Row(
            modifier = DefaultBorderModifier
                .height(32.dp)
                .fillMaxWidth()
        ) {
            title()
        }
        Row(modifier = Modifier.padding(top = LayoutConstant.PaddingNarrow)) {}
        Row(
            modifier = DefaultBorderModifier
                .height(32.dp)
                .fillMaxWidth()
        ) {
            option()
        }
        Row(modifier = Modifier.padding(top = LayoutConstant.PaddingNarrow)) {}
        Row(
            modifier = DefaultBorderModifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            content()
        }
    }
}
