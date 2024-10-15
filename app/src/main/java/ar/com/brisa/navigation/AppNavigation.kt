package ar.com.brisa.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ar.com.brisa.ui.screens.WelcomeScreen
import ar.com.brisa.ui.screens.auth.LoginScreen
import ar.com.brisa.ui.screens.auth.RegisterScreen
import ar.com.brisa.viewmodel.AuthViewModel

@Composable
fun AppNavigation(authViewModel: AuthViewModel) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavDestinations.Welcome
    ) {

        composable<NavDestinations.Welcome> {
            WelcomeScreen(
                onClick = { navController.navigate(NavDestinations.Login) },
            )
        }

        composable<NavDestinations.Login> { /*backStackEntry ->
            val login = backStackEntry.toRoute<NavDestinations.Login>()*/
            LoginScreen(
                viewModel = authViewModel,
                goToRegister = { navController.navigate(NavDestinations.Register) },
                onLoginSuccess = {
                    navController.navigate(NavDestinations.Home)
                }
            )
        }

        composable<NavDestinations.Register> { /*backStackEntry ->
            val register = backStackEntry.toRoute<NavDestinations.Register>()*/
            RegisterScreen(
                viewModel = authViewModel,
                /*onRegisterSuccess = { navController.navigate(NavDestinations.Home(user.id)) } (le dejo el id asi porque podriamos poner un bienvenid + nombre del user*/
            ) {

            }
        }
    }
}