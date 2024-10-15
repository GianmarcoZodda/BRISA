package ar.com.brisa.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.com.brisa.model.User
import ar.com.brisa.repository.UserRepositoryImp
import kotlinx.coroutines.launch

//el vm recibe el repo, que es de donde obtengo la data
class UserViewModel(private val userRepository: UserRepositoryImp = UserRepositoryImp()) :
    ViewModel() {

    //los usuarios, lista mutable que puede ser vacia (?). privada
    private val _users = mutableStateOf<List<User>?>(null)

    //users es una copia de _users. es un state
    val users: State<List<User>?> = _users

    fun fetchUsers() {
        viewModelScope.launch {
            //en result me traigo los users con el metodo del repo, que a su vez llama a la clase de la llamada a la api
            val result = userRepository.getAllUsers()
            //se lo asigno a mi lista mutable de users
            _users.value = result
        }
    }

}