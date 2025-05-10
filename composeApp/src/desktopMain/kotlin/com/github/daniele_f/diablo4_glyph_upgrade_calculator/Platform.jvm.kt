package com.github.daniele_f.diablo4_glyph_upgrade_calculator

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()