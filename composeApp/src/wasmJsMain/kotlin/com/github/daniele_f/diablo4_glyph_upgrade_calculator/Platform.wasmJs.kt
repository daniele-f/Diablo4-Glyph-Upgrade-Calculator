package com.github.daniele_f.diablo4_glyph_upgrade_calculator

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()