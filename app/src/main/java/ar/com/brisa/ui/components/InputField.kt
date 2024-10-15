package ar.com.brisa.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable //creo un componente de input para usar en las vistas
fun InputField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,          //va a ser la etiqueta que diga: nombre de usuario, mail, password.....
    isPassword: Boolean = false,     //al agregarle esto, me va a servir para mails, texto y passwords
    modifier: Modifier = Modifier
) {
    OutlinedTextField(  //lo mismo que textfield, pero con un borde delineado
        value = value,  //aca le asigno a value lo que me escriba el usuario (su contra, email, lo que sea)
        onValueChange = onValueChange,  //lama a la funcion que esta en los parametros (es para actualizar el state del texto)
        label = { Text(label) },    //este label esta dentro del input, hasta que el usuario empiece a escribir. Esto: Text(label) crea un text y lo pone como label
        modifier = modifier, //esto conviene recibirlo por parametro, para que sea mas adaptable el boton
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None
        //si es password, PasswordVisualTransformation() pone los *, sino no hay transforation, corta
    )
}
