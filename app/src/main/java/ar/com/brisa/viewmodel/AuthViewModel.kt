package ar.com.brisa.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AuthViewModel : ViewModel() {
    var email by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set
    var name by mutableStateOf("")  //la dejo aca x si hacemos un username o algo x el estilo
        private set
    var surname by mutableStateOf("")  //la dejo aca x si hacemos un username o algo x el estilo
        private set
    var confirmPassword by mutableStateOf("")
        private set

    // Funciones que la UI puede usar para actualizar el estado
    fun onEmailChanged(newEmail: String) {
        email = newEmail
    }

    fun onPasswordChanged(newPassword: String) {
        password = newPassword
    }

    //usar para el nomre de usuario si hace falta...
    fun onNameChanged(newName: String) {
        name = newName
    }

    fun onSurnameChanged(newSurname: String) {
        surname = newSurname
    }

    //modificar con logica
    private fun checkPassword(confirmPassword: String): Boolean {
        return this.password == confirmPassword
    }

    fun onConfirmPasswordChanged(password: String) {
        if (checkPassword(password))
            confirmPassword = password
    }

    // Ejemplo de función para manejar el login (copiado de chatgpt)
    fun login(onResult: (Boolean) -> Unit) {
        viewModelScope.launch { //coroutines para ejecutar funciones asincrónicas, en estos casos es la autenticacion de los users
            // Aquí va la lógica de autenticación
            val success =
                email == "user@example.com" && password == "password" //modificar segun lo que necesitemos
            onResult(success)
        }
    }

    // Ejemplo de función para manejar el registro      (copiado de chat)
    fun register(onResult: (Boolean) -> Unit) {
        viewModelScope.launch {
            // Aquí va la lógica para registrar un usuario
            onResult(true)  // Asume éxito (modificar)
        }
    }
}
