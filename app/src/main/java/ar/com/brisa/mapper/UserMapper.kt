package ar.com.brisa.mapper

import ar.com.brisa.model.User
import ar.com.dto.UserDTO

// mapper se usa a la par de los dto. un dto me llega de la api y el mapper lo transforma en el modelo q yom quiero (user)
class UserMapper {

    //transformo un dto de la api en un user
    private fun userDtoToUser(userDto: UserDTO): User {
        return User(
            name = userDto.name,
            surname = userDto.surname,
            email = userDto.email,
            password = userDto.password,
            images = userDto.images
        )
    }

    // Función para convertir una lista de UserDTO a User
    fun userDtoListToUserList(userDtoList: List<UserDTO>): List<User> {
        return userDtoList.map { userDtoToUser(it) }
    }
}