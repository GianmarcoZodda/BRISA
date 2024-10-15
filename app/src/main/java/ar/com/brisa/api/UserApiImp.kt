package ar.com.brisa.api

import ar.com.brisa.mapper.UserMapper
import ar.com.brisa.model.User
import ar.com.brisa.repository.UserRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//uso la interaz users para usar su metodo. tambien recibo el mapper para la transformacion
class UserApiImp(private val userMapper: UserMapper = UserMapper()): UserRepository {

    private val retrofit: Retrofit = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://rickandmortyapi.com/api/"/*reemplazar x api de juanse*/)
        .build()
    private val api = retrofit.create(UserApi::class.java)


    //esta es la funcion de la interfaz Users
    override suspend fun getAll(): List<User>? {

        //este es el metodo que esta en la interfaz
        val response = api.getUsers()

        return if (response.isSuccessful) {
            // la lista de dtos es el results (ver interfaz ApiResponse) del body de la response
            val userDtoList = response.body()?.results

            //si la lista no es nula...
            userDtoList?.let {
                //el mapper recibe la lista de dtos (ya no la response) y transforma los elements en users
                val result = userMapper.userDtoListToUserList(it)
                if (result.isNotEmpty()) {
                    //si hay elementos en la api, creo una nueva list agregarndole lo que obtuve
                    //se crea antes un user vacio, es buena practica
                    listOf(User("Not Found", "Unknown", "", "", emptyList())) + result
                } else {
                    result
                }
            }
        } else {
            null
        }
    }

}