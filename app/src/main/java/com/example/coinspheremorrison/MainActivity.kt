package com.example.coinspheremorrison

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coinspheremorrison.ui.theme.Background
import com.example.coinspheremorrison.ui.theme.CoinSphereMorrisonTheme
import com.example.coinspheremorrison.ui.theme.Surface
import com.example.coinspheremorrison.ui.theme.TextDim
import com.example.coinspheremorrison.ui.theme.TextMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoinSphereMorrisonTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(innerPadding)
                }
            }
        }
    }
}

@Composable
fun Greeting(innerpadding: PaddingValues) {
    Column (modifier = Modifier 
        .background(Background)
        .fillMaxSize()
    ) {
        Text(
            text = "Prueba Colores",
            color = TextMain,
            modifier  = Modifier.weight(2f)
        )

        Row (modifier = Modifier
            .background(Surface)
            .fillMaxWidth()
            .weight(1f)
        ) {
            Text("Surface", color = TextDim)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoinSphereMorrisonTheme {
        Greeting(PaddingValues(1.dp))
    }
}