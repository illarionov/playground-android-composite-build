package com.example.feature.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val AppTypography: Typography = Typography(
    labelLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.1.sp,
        lineHeight = 20.sp,
        fontSize = 13.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.sp,
        lineHeight = 16.sp,
        fontSize = 12.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.8.sp,
        lineHeight = 16.sp,
        fontSize = 10.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.3.sp,
        lineHeight = 24.sp,
        fontSize = 16.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.3.sp,
        lineHeight = 16.sp,
        fontSize = 12.sp,
    ),
    headlineLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Light,
        letterSpacing = 0.sp,
        lineHeight = 40.sp,
        fontSize = 32.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Light,
        letterSpacing = (-0.5).sp,
        lineHeight = 36.sp,
        fontSize = 28.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Light,
        letterSpacing = (-0.5).sp,
        lineHeight = 32.sp,
        fontSize = 24.sp,
    ),
    displayLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 64.sp,
        fontSize = 55.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 52.sp,
        fontSize = 43.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 44.sp,
        fontSize = 35.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.15).sp,
        lineHeight = 28.sp,
        fontSize = 21.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 24.sp,
        fontSize = 16.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        letterSpacing = (-0.1).sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
    ),
)
