package com.github.daniele_f.diablo4_glyph_upgrade_calculator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform