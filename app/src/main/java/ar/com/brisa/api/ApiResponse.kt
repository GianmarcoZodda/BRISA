package ar.com.brisa.api

import ar.com.dto.UserDTO
import com.google.gson.annotations.SerializedName


//la api me va a devolver esto:
data class ApiResponse(
    @SerializedName("results") val results: List<UserDTO>
)
