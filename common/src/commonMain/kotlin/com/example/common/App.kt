package com.example.common

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        items(16) {
            Card(Modifier.padding(10.dp)) {
                Text("Multiplatform LazyVerticalGrid")
            }
        }
    }
}
