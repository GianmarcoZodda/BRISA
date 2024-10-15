package ar.com.brisa.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ar.com.brisa.R
import ar.com.brisa.ui.components.Btn
import ar.com.brisa.ui.components.Logo
import ar.com.brisa.ui.theme.BRISATheme

@Composable
fun WelcomeScreen(
    onClick: () -> Unit,
) {    //agregar el componente de navegacion ppara ir a las diferentes pestañas {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Logo(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.75f) //cambiar luego x fillmaxsize y saca el boton, para dejarla como pantalla de carga

        )
        Btn(
            onClick = { onClick() },
            text = R.string.continuar,
            backgroundColor = MaterialTheme.colorScheme.primary
        )
    }
}


@Preview(showBackground = true, showSystemUi = false)
@Composable
fun WelcomeScreenPreview() {
    BRISATheme {
        WelcomeScreen(onClick = {})
    }
}
