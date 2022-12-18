package io.etip.mobile.android.ui.design

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

// Set of Material typography styles to start with
object Typography {
    val GraphikTypography = Typography(
        h1 = TextStyle(
            fontFamily = Fonts.Graphik,
            fontWeight = FontWeight.W500,
            fontSize = TextSize.xxl,
            color = Color.EtipBlue
        ),
        h2 = TextStyle(
            fontFamily = Fonts.Graphik,
            fontWeight = FontWeight.W500,
            fontSize = TextSize.xl,
            color = Color.EtipBlue
        ),
        h3 = TextStyle(
            fontFamily = Fonts.Graphik,
            fontWeight = FontWeight.W500,
            fontSize = TextSize.l,
            color = Color.EtipBlue
        ),
        h4 = TextStyle(
            fontFamily = Fonts.Graphik,
            fontWeight = FontWeight.W400,
            fontSize = TextSize.m,
            color = Color.EtipBlue
        ),
        h5 = TextStyle(
            fontFamily = Fonts.Graphik,
            fontWeight = FontWeight.W400,
            fontSize = TextSize.s,
            color = Color.EtipBlue
        ),
        h6 = TextStyle(
            fontFamily = Fonts.Graphik,
            fontWeight = FontWeight.W400,
            fontSize = TextSize.xs,
            color = Color.EtipBlue
        ),
        subtitle1 = TextStyle(
            fontFamily = Fonts.Graphik,
            fontWeight = FontWeight.W400,
            fontSize = TextSize.xs,
        ),
        subtitle2 = TextStyle(
            fontFamily = Fonts.Graphik,
            fontWeight = FontWeight.W400,
            fontSize = TextSize.xxs
        ),
        button = TextStyle(
            fontFamily = Fonts.Graphik,
            fontWeight = FontWeight.W400,
            fontSize = TextSize.xs,
            color = Color.White
        )
    )
}
