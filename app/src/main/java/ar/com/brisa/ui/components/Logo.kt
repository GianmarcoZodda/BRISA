package ar.com.brisa.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ar.com.brisa.R

@Composable
fun Logo(modifier: Modifier = Modifier) {
    val isDarkTheme = isSystemInDarkTheme()
    val logoImage = if (isDarkTheme) {
        R.drawable.brisa // Imagen para modo oscuro
    } else {
        R.drawable.white_brisa // Imagen para modo claro
    }
    Image(
        painter = painterResource(id = logoImage),
        contentDescription = stringResource(id = R.string.logo),
        modifier,
    )
}


@Preview(showBackground = true)
@Composable
fun LogoPreview() {
    Logo(
        modifier = Modifier.size(width = 300.dp, height = 300.dp),
    )
}