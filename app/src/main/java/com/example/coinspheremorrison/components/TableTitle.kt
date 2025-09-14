package com.example.coinspheremorrison.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinspheremorrison.ui.theme.TextDim

@Composable
fun TableTitle(){
    Row(modifier = Modifier
        .padding(horizontal = 12.dp)
        .padding(top = 10.dp)
        .fillMaxWidth()
    ) {
        Text("#",
            color = TextDim,
            fontSize = 8.sp,
            modifier = Modifier.weight(1f)
        )
        Text("Name",
            color = TextDim,
            fontSize = 8.sp,
            modifier = Modifier.weight(12f))
        Text("Price",
            color = TextDim,
            fontSize = 8.sp,
            modifier = Modifier.weight(12f))
    }
}