package com.olive.homly.ui.theme.screens.LoginScreen

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.olive.homly.MainActivity
import com.olive.homly.R

@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    var name by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }
    val context= LocalContext.current

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {
        Image(painter = painterResource(id = R.drawable.homlylogo), contentDescription = "logo" )
        Text(text = "Login or Create an Account.",
            color = Color.Magenta,
            fontSize = 25.sp
        )

        Icon(imageVector = Icons.Default.Person, contentDescription = "profile")
        OutlinedTextField(
            value = name,
            onValueChange = {name=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person" ) },
            label = { Text(text = "Enter Name",
                color = Color.DarkGray,
                fontSize = 20.sp
            )},

            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = email,
            onValueChange = {email=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "icon" )},
            label = { Text(text = "Enter Email",
                color = Color.DarkGray,
                fontSize = 20.sp
            )},

            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "lock" )},
            label = { Text(text = "Enter Password",
                color = Color.DarkGray,
                fontSize = 20.sp
            )},

            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = confirmpassword,
            onValueChange = {confirmpassword=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "cpass" ) },
            label = { Text(text = "Confirm Password",
                color = Color.DarkGray,
                fontSize = 20.sp
            )},

            modifier = Modifier.fillMaxWidth()
        )



        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            val intent= Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        },
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Transparent)) {
            Text(text ="Log In",
                fontSize = 20.sp,
                color = Color.DarkGray)

        }


    }

}


@Preview
@Composable
private fun Loginprev() {
    LoginScreen(rememberNavController())
}