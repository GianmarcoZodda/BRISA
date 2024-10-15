package ar.com.brisa.model

/* el modelo, a diferencia del DTO, tiene solo lo q necesito */
data class User(
    val email: String,
    val password: String,
    val name: String,
    val surname: String,
    val images: List<String>
)
