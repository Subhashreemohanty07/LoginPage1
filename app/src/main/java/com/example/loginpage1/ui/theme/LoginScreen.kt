package com.example.loginpage.ui.theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginpage1.R
@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize())
        {
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .background(
                        color = Color(0xFFDFF1F7),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(25.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Jetpack Compose",
                        fontSize = 35.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF1D4D70),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    Image(
                        painter = painterResource(id = com.example.loginpage1.R.drawable.logo),
                        contentDescription = "Logo",
                        modifier = Modifier.size(100.dp)
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Login",
                            fontSize = 30.sp,
                            color = Color(0xFF08C22F)
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    var email by remember { mutableStateOf("") }
                    var password by remember { mutableStateOf("") }

                    OutlinedTextField(value = email, onValueChange = {email=it}, label = {
                        Text(
                            text = "Email ID or Mobile Number",
                            color = Color.Black,
                            fontSize = 15.sp
                        )
                    })
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },

                        label = {
                            Text(
                                text = "Password",
                                color = Color.Black,
                                fontSize = 15.sp
                            )
                        },
                        trailingIcon = {
                            // Add your trailing icon here
                            Icon(painterResource(id = R.drawable.hide), contentDescription = "Visibility")
                        }

                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Forgot Password?",
                            modifier = Modifier.clickable { },
                            color = Color(0xFF049E24)
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Button(
                            onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2))

                        ) {
                            Text(
                                text = "Login",
                                Modifier.padding(horizontal = 20.dp, vertical = 7.dp), color = Color.White
                            )
                        }
                    }

                }
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Text(
                    text = "Don't have an account? ",
                )
                Text(
                    text = "Register",
                    color = Color(0xFF1976D2),
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.clickable { }
                )
            }
        }

    }
}
