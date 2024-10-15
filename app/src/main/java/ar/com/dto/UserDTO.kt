package ar.com.dto

import com.google.gson.annotations.SerializedName

/*un DTO es tutti lo que me llega de la api/bd con los 2 mil atributos q tenga... */
data class UserDTO (
    @SerializedName("id") val id: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("name") val name: String,
    @SerializedName("surname") val surname: String,
    @SerializedName("images") val images: List<String>
)





