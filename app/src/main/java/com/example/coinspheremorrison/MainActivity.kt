package com.example.coinspheremorrison

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinspheremorrison.components.TableTitle
import com.example.coinspheremorrison.components.TopCard
import com.example.coinspheremorrison.ui.theme.Background
import com.example.coinspheremorrison.ui.theme.CoinSphereMorrisonTheme
import com.example.coinspheremorrison.ui.theme.TextDim
import com.example.coinspheremorrison.ui.theme.TextMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoinSphereMorrisonTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Background)
    ) {
        Text("CoinSphere",
            color = TextMain,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(5.dp).padding(start = 5.dp))

        TopCard("Global Market Cap", "$2.18T")
        TopCard("Fear & Greed", "Neutral (54)")
        TopCard("Altcoin Season", "No")

        TableTitle()
        HorizontalDivider(
            thickness = 1.dp,
            color = TextDim
        )

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoinSphereMorrisonTheme {
        HomeScreen()
    }
}