package com.github.daniele_f.diablo4_glyph_upgrade_calculator

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}