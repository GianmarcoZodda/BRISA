package ar.com.brisa.repository

import ar.com.brisa.api.UserApiImp
import ar.com.brisa.mapper.UserMapper
import ar.com.brisa.model.User

//implemento los metodos en la interfaz. uso la implementacion de la llamada a la api para la logica = ooooddddddhhhhh ahhh

class UserRepositoryImp(
    private val userApi: UserApiImp = UserApiImp(UserMapper())
): UserRepository {

    override suspend fun getAll(): List<User>? {
        return userApi.getAll()
    }

}