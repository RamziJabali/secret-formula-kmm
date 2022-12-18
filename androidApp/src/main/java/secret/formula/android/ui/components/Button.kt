package io.etip.mobile.android.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.etip.mobile.android.ui.design.Color
import io.etip.mobile.android.ui.design.CornerRadius
import io.etip.mobile.android.ui.design.Spacing

@Composable
fun EtipButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    border: BorderStroke? = null,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        elevation = elevation,
        shape = RoundedCornerShape(CornerRadius.xxl),
        border = border,
        colors = ButtonDefaults.buttonColors(Color.EtipGreen),
        contentPadding = PaddingValues(Spacing.Surrounding.s),
    ) {
        Text(text = text)
    }
}