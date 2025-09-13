package com.example.coinspheremorrison.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinspheremorrison.ui.theme.Surface
import com.example.coinspheremorrison.ui.theme.TextDim
import com.example.coinspheremorrison.ui.theme.TextMain

@Composable
fun TopCard(title: String, content: String){

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 5.dp)
        .padding(horizontal = 10.dp)
        .clip(RoundedCornerShape(10.dp))
        .background(Surface)
        .padding(7.dp)

    ){
        Text(text = title,
            color = TextDim,
            fontSize = 10.sp)
        Text(text = content,
            color = TextMain,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold)
    }
}