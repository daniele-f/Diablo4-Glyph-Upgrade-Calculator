package com.github.daniele_f.diablo4_glyph_upgrade_calculator

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Diablo4-Glyph-Upgrade-Calculator",
    ) {
        App()
    }
}