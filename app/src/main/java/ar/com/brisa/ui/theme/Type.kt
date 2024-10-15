package ar.com.brisa.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import ar.com.brisa.R

//hechos por mi (a modificar....)
//creo mi propia fuente

val barlow = FontFamily(
    Font(R.font.barlow_bold, FontWeight.Bold),
    Font(R.font.barlow_medium, FontWeight.Medium),
    Font(R.font.barlow_regular, FontWeight.SemiBold)

)
/*
val lilita = FontFamily(
    Font(R.font.lilita_one_regular, FontWeight.SemiBold),
)
*/


val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = barlow,
        fontWeight = FontWeight.Bold,
        fontSize = 88.sp,
        lineHeight = 0.sp,
        letterSpacing = 0.5.sp
    ),
    displayMedium = TextStyle(
        fontFamily = barlow,
        fontWeight = FontWeight.Bold,
        fontSize = 56.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = barlow,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Center
    ),
    bodyMedium = TextStyle(
        fontFamily = barlow,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Center
    ),
)


//esta la comento porque usa lilita, definir cuando hay que mecharla entre la de arriba
/*
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = lilita,
        fontWeight = FontWeight.Bold,
        fontSize = 88.sp,
        lineHeight = 0.sp,
        letterSpacing = 0.5.sp
    ),
    displayMedium = TextStyle(
        fontFamily = lilita,
        fontWeight = FontWeight.Bold,
        fontSize = 56.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = lilita,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Center
    ),
    bodyMedium = TextStyle(
        fontFamily = lilita,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Center
    ))

 */


