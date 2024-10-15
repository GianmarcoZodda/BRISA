package ar.com.brisa.ui.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ar.com.brisa.R
import ar.com.brisa.ui.components.Btn
import ar.com.brisa.ui.components.EyeIcon
import ar.com.brisa.ui.components.InputField
import ar.com.brisa.ui.theme.BRISATheme
import ar.com.brisa.viewmodel.AuthViewModel

@Composable
fun RegisterScreen(
      /*no todo el controller, solo la funcionalidad q necesito*/
    viewModel: AuthViewModel,
    onRegisterSuccess: () -> Unit
) {
    Column( /*fijarse de usar lazycolumn, porque si roto el celu no me entra en la pantalla*/
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EyeIcon()

        Spacer(modifier = Modifier.height(16.dp))
        //para dar separacion entre los componentes
        InputField(
            value = viewModel.name,
            onValueChange = { viewModel.onNameChanged(it) },
            label = "Name",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))
        InputField(
            value = viewModel.surname,
            onValueChange = { viewModel.onSurnameChanged(it) },
            label = "Surname",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        InputField(
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

        Spacer(modifier = Modifier.height(8.dp))

        InputField(
            value = viewModel.confirmPassword,
            onValueChange = { viewModel.onConfirmPasswordChanged(it) },
            label = "Confirm Password",
            isPassword = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Btn(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                viewModel.register { success ->
                    if (success) onRegisterSuccess()
                }
            },
            text = R.string.registrarme,
            backgroundColor = MaterialTheme.colorScheme.primary
        )
    }
}


@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    BRISATheme {
        RegisterScreen(
            viewModel = AuthViewModel(),
            onRegisterSuccess = {}
        )
    }
}