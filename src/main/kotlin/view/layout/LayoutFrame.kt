package view.screen

import androidx.compose.foundation.background
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
            .background(StyleConstant.ColorBackground, shape = RoundedCornerShape(24.dp))
            .border(2.dp, StyleConstant.ColorBorder, shape = RoundedCornerShape(24.dp))
            .height(320.dp)
            .padding(LayoutConstant.PaddingWide)
            .width(240.dp)
    ) {
        Row(
            modifier = DefaultBorderModifier.height(32.dp).fillMaxWidth()
        ) {
            title()
        }
        Spacer(modifier = Modifier.height(LayoutConstant.PaddingNarrow))
        Row(
            modifier = DefaultBorderModifier
                .height(32.dp)
                .fillMaxWidth()
        ) {
            option()
        }
        Spacer(modifier = Modifier.height(LayoutConstant.PaddingNarrow))
        Row(
            modifier = DefaultBorderModifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            content()
        }
    }
}
