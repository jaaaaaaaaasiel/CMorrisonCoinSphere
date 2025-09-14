package com.example.coinspheremorrison.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.coinspheremorrison.models.coniList
import com.example.coinspheremorrison.ui.theme.Surface
import com.example.coinspheremorrison.ui.theme.TextMain

@Composable
fun ScrollTableCoins(){
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 5.dp)

    ) {
        items(coniList) { coin ->
            Row(modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(15.dp))
                .background(Surface)
                .padding(9.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text("${coin.num}",
                    color = TextMain,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f))

                AsyncImage(
                    model = coin.image,
                    contentDescription = coin.name,
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .padding(start = 5.dp)
                )
                Text(coin.name,
                    color = TextMain,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(11f).padding(start = 8.dp))
                Text(coin.price,
                    color = TextMain,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(13f))
            }
        }
    }
}