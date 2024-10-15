package ar.com.brisa.api

import retrofit2.Response
import retrofit2.http.GET


//la api de usuarios me devuelve una lista del tipo apiresponse (que contiene una lista con los dtos)
interface UserApi {
    @GET("Users")
    suspend fun getUsers(): Response<ApiResponse>

}