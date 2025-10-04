package com.example.materialv.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// FUENTES PERSONALIZADAS
val AppTypography = Typography(
    titleLarge = TextStyle(
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold //Se pueden declarar con numeros tambien 500
    ),
    bodyMedium = TextStyle(
        fontSize = 15.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp
    ),
    labelLarge = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium
    )
)
