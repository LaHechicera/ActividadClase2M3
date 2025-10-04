package com.example.materialv.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme

//Paleta basica de colores para la APP
val Primary = Color(0xFFEE9ACB)
val Secondary = Color(0xFF7AD3C5)
val BackgroundLight = Color(0xFFF7F9F6)
val BackgroundDark = Color(0xFF121212)

//Enlace de valores a Material3
val LightColors = lightColorScheme(
    primary = Primary,
    secondary = Secondary,
    background = BackgroundLight,
    surface = Color.White, //Contenedor, todo lo que cree se hara con color blanco
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color(0xFF111318),
    onSurface = Color(0xFF111318)
)

//Enlace para colores oscuros
val DarkColors = darkColorScheme(
    primary = Primary,
    secondary = Secondary,
    background = BackgroundDark,
    surface = Color(0xFF1B1B1B), //Contenedor, todo lo que cree se hara con color blanco
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color(0xFFEAEAEA),
    onSurface = Color(0xFFEAEAEA)
)