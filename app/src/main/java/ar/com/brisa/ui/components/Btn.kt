package ar.com.brisa.ui.components

import androidx.annotation.StringRes
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource

@Composable
fun Btn(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    @StringRes text: Int,   //preguntar si es una buena forma, porque tambien podria ser :String, pero cuando lo use en las screens tengo que poner stringresource(id = R.string.xxxx)
    backgroundColor: Color = Color.Cyan //color por defecto
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor // Establece el color del botón
        )
    ) {
        Text(stringResource(text))
    }
}