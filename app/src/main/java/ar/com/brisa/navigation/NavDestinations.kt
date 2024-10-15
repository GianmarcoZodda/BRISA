package ar.com.brisa.navigation

import kotlinx.serialization.Serializable


//sealed = clase sellada, no se puedeen crear subclases
sealed interface NavDestinations {
    @Serializable   //sus instancias pueden ser convertidas a json, xml....
    data object Welcome : NavDestinations

    @Serializable
    data object Login : NavDestinations

    @Serializable
    data object Register: NavDestinations

    @Serializable
    data object Home : NavDestinations

    @Serializable   //cuando la screen necesita parametros, la defino como data class
    data class Details(var id: Int): NavDestinations
}