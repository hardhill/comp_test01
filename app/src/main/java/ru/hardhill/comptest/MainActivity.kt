package ru.hardhill.comptest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import org.intellij.lang.annotations.JdkConstants


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            NewText()
        }
    }
}

@OptIn(ExperimentalUnitApi::class)
@Preview(showBackground = true)
@Composable
fun NewText() {
    Row(modifier = Modifier
        .background(color = Color.LightGray).fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(text = "Hello", fontSize = TextUnit(16f, TextUnitType.Sp))
        Text(text = "Madrid", fontSize = TextUnit(16f, TextUnitType.Sp))
        Text(text = "Girona", fontSize = TextUnit(16f, TextUnitType.Sp))
    }

}

