package io.etip.mobile.android.ui.design

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import io.etip.mobile.android.R

object Fonts {
    val Graphik = FontFamily(
        Font(R.font.graphik_light, FontWeight.W300),
        Font(R.font.graphik_regular, FontWeight.W400),
        Font(R.font.graphik_medium, FontWeight.W500),
        Font(R.font.graphik_semibold, FontWeight.W600),
        Font(R.font.graphik_bold, FontWeight.W700),
        Font(R.font.graphik_black, FontWeight.W800)
    )
}