package org.example.project

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
//import org.example.project.vista.MatrizApp


fun main() = application {

    Window(
        onCloseRequest = ::exitApplication,
        title = "Matriz que se incrementa",
        state = rememberWindowState(width = 600.dp, height = 700.dp)
    ) {
        MatrizApp()
    }
}