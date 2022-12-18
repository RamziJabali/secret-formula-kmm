package io.etip.mobile.android.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.etip.mobile.android.ui.design.SpinnerSize

@Composable
fun LoadingScreen() {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Loading...")
        LoadingSpinner()
    }
}

@Composable
private fun LoadingSpinner() {
    CircularProgressIndicator(modifier = Modifier.size(SpinnerSize.xxxl))
}