package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier)
{
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.weight(1F)
        ) {
            QuadrantText(
                boldText = name,
                bodyText = name,
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1F)
            )
            QuadrantText(
                boldText = name,
                bodyText = name,
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1F)
            )
        }
        Row(
            modifier = Modifier.weight(1F))
        {
            QuadrantText(
                boldText = name,
                bodyText = name,
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1F)
            )
            QuadrantText(
                boldText = name,
                bodyText = name,
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1F)
            )
        }
    }

}

@Composable
fun QuadrantText(
    boldText: String,
    bodyText: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello $boldText!",
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Hello $bodyText!",
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview()
{
    ComposeQuadrantTheme {
        Greeting("Android")
    }
}