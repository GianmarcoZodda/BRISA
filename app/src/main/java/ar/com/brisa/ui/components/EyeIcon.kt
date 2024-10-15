package ar.com.brisa.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ar.com.brisa.R
import ar.com.brisa.ui.theme.BRISATheme


@Composable
fun EyeIcon(
    modifier: Modifier = Modifier
) {
    val isDarkTheme = isSystemInDarkTheme()
    val eye = if (isDarkTheme) {
        R.drawable.black_eye_brisa // Imagen para modo oscuro
    } else {
        R.drawable.white_eye_brisa // Imagen para modo claro
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = eye),
            contentDescription = null,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview
@Composable
fun EyeIconPreview() {
    BRISATheme {
        EyeIcon()
    }
}
