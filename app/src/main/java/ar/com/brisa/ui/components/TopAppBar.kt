package ar.com.brisa.ui.components

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ar.com.brisa.R
import ar.com.brisa.ui.theme.BRISATheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    @StringRes tittle: Int,
    profile: () -> Unit,
    firstIcon: ImageVector,
    @StringRes firstDescription: Int,
    menu: () -> Unit,
    secondIcon: ImageVector,
    @StringRes secondDescription: Int
) {
    CenterAlignedTopAppBar(title = { Text(text = stringResource(tittle)) },
        navigationIcon = {
            IconButton(onClick = { menu() }) {
                Icon(
                    imageVector = firstIcon,
                    contentDescription = stringResource(firstDescription)
                )
            }
        },
        actions = {
            IconButton(onClick = { profile() }) {
                Icon(
                    imageVector = secondIcon,
                    contentDescription = stringResource(secondDescription)
                )
            }
        })
}

//agregar acciones a los iconos/botones y texto mas adelante, o modificar segun lo que necesitemos
@Preview(showBackground = true)
@Composable
fun TopApVarPreview() {
    BRISATheme {
        TopAppBar(
            tittle = R.string.app_name,
            profile = {},
            firstIcon = Icons.Filled.Menu,
            firstDescription = R.string.app_name, //modificarlo por "menu", o chota, lo q quieran
            menu = {},
            secondIcon = Icons.Filled.Person,
            secondDescription = R.string.app_name   //lo mismo...
        )
    }
}