package com.example.login_ui.ui.components

import android.graphics.drawable.Icon
import android.provider.CalendarContract.Colors
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.net.PasswordAuthentication

@Composable
fun UserInputField(
    modifier: Modifier = Modifier,
    label: String = "Email",
    icon: ImageVector = Icons.Default.Email,
    value: String = "",
    onValueChange: (String) ->Unit={},
    isFocused: Boolean = false,

    ) {
    OutlinedTextField(value = value, onValueChange = onValueChange,
        label = { Text(label) },
        leadingIcon = {
            Icon(
                icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 24.dp)
            )
        },
        shape = MaterialTheme.shapes.extraLarge,
        modifier = modifier,
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Blue,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.Transparent
        )

        )

}

@Composable
fun RoundedButton(
    modifier: Modifier= Modifier,
    text:String = "Login",
    onClick : () -> Unit = {},
) {
    Button(onClick = onClick,
        modifier = modifier.width(180.dp),
        colors = ButtonDefaults.buttonColors(containerColor = if (isSystemInDarkTheme()) Color.Yellow else Color.Blue,
            contentColor = if (isSystemInDarkTheme()) Color.Yellow else Color.White)) {
        Text(text =  text)
        
    }
}

@Preview
@Composable
fun UserInputFieldPreview() {
    UserInputField()
}

@Preview
@Composable
fun ButtonPreview() {
    RoundedButton()
    
}