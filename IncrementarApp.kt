package org.example.project

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp




@Composable
fun MatrizApp2() {
    val matriz = remember { mutableStateListOf(*Array(4) { mutableStateListOf(*Array(4) { 0 }) }) }

    Column {
        for (fila in 0 until 4) {
            Row {
                for (col in 0 until 4) {
                    Box(Modifier.size(60.dp).border(1.dp, Color.Black).clickable { matriz[fila][col]++ }) {
                        Text("${matriz[fila][col]}")
                    }
                }
            }
        }
    }
}