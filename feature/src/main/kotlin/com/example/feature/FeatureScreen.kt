package com.example.feature

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.feature.theme.ExampleTheme

@Composable
public fun FeatureScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Greeting(
            "Android",
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
    }
}

@Composable
private fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
public fun FeatureScreenPreview() {
    ExampleTheme {
        FeatureScreen()
    }
}

