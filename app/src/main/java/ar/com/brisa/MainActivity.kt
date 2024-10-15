package ar.com.brisa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ar.com.brisa.navigation.AppNavigation
import ar.com.brisa.ui.theme.BRISATheme
import ar.com.brisa.viewmodel.AuthViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BRISATheme {
                val authViewModel = AuthViewModel()
                /*LoginScreen(viewModel = viewModel, onLoginSuccess = { })*/
                /*RegisterScreen(viewModel = viewModel, onRegisterSuccess = {})*/
                /*WelcomeScreen(viewModel = viewModel)*/

                AppNavigation(authViewModel)
            }
        }
    }
}


