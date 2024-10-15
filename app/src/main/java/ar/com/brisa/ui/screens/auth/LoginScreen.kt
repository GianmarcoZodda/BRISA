package ar.com.brisa.ui.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ar.com.brisa.R
import ar.com.brisa.model.User
import ar.com.brisa.ui.components.Btn
import ar.com.brisa.ui.components.EyeIcon
import ar.com.brisa.ui.components.InputField
import ar.com.brisa.ui.theme.BRISATheme
import ar.com.brisa.viewmodel.AuthViewModel

@Composable
fun LoginScreen(
    viewModel: AuthViewModel,
    onLoginSuccess: () -> Unit,
    goToRegister: () -> Unit
) { //le paso el viewmodel de autenticacion (inyeccion de dependencia)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
       EyeIcon()

        Spacer(modifier = Modifier.height(16.dp))       //para dar separacion entre los componentes

        InputField( //uso el componente y le paso los parametros, menos el de password en este caso xq ya esta en false por default
            value = viewModel.email,
            onValueChange = { viewModel.onEmailChanged(it) },
            label = "Email",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        InputField(
            value = viewModel.password,
            onValueChange = { viewModel.onPasswordChanged(it) },
            label = "Password",
            isPassword = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Btn(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                viewModel.login { success ->
                    if (success) {
                        onLoginSuccess() // Llama a onLoginSuccess si el login es exitoso
                    } else {
                        // Manejar el error aca, mandar mnsj
                    }
                }
            },
            text = R.string.iniciar_sesion,
            backgroundColor = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = stringResource(id = R.string.sin_cuenta),
            color = MaterialTheme.colorScheme.primary
        )//crear componente para el texto????

        Spacer(modifier = Modifier.height(16.dp))

        Btn(
            modifier = Modifier.fillMaxWidth(),
            onClick = { goToRegister() },
            text =  R.string.registrarme,
            backgroundColor = MaterialTheme.colorScheme.primary
        )
    }
}


//para probar el dark mode
/*
@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES,
    name = "PreviewLoginScreen"
)
 */

@Preview(showBackground = true /*showSystemUi = false, widthDp = 320, heightDp = 320*/)
@Composable
fun PreviewLoginScreen() {
    BRISATheme {
        LoginScreen(
            viewModel = AuthViewModel(),
            onLoginSuccess = {},
            goToRegister = {})
    }
}
