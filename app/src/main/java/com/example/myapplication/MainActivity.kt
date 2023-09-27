package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FaceBookSignupScreen()
//                    LoginPage()
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun FaceBookSignupScreen() {
        Column(
            modifier = Modifier.padding(
                start = 20.dp,
                end = 20.dp,
                top = 40.dp,
                bottom = 40.dp
            ),
        ) {
            var a by remember {
                mutableStateOf("")
            }
            var b by remember {
                mutableStateOf("")
            }
            var c by remember {
                mutableStateOf("")
            }
            var d by remember {
                mutableStateOf("")
            }
            Column {
                Text(text = "Sign Up", fontSize = 36.sp, fontWeight = FontWeight.Black)
                Text("It's quick and easy", color = Color.Gray)
            }
            Divider(modifier = Modifier.padding(top = 20.dp))
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier.padding(top = 20.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    TextField(
                        value = a,
                        onValueChange = { a = it },
                        placeholder = { Text(text = "First Name") },
                        modifier = Modifier.fillMaxWidth().weight(1f)
                    )
                    TextField(
                        value = b,
                        onValueChange = { b = it },
                        placeholder = { Text(text = "Surname") },
                        modifier = Modifier.fillMaxWidth().weight(1f)
                    )
                }
                TextField(
                    value = c,
                    onValueChange = { c = it },
                    placeholder = { Text(text = "Mobile Number or Email Address") },
                    modifier = Modifier.fillMaxWidth()
                )
                TextField(
                    value = d,
                    onValueChange = { d = it },
                    placeholder = { Text(text = "New Password") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Text(
                "People who use our service may have uploaded your contact information to Facebook. Learn more.",
                fontSize = 13.sp,
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
            ) {

                Button(
                    colors = ButtonDefaults.buttonColors(Color(0xff00a400)),
                    shape = RoundedCornerShape(10.dp),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Sign Up", modifier = Modifier.padding(start = 30.dp, end = 30.dp))
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun LoginPage() {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        ) {
            var a by remember {
                mutableStateOf(value = "")
            }

            var b by remember {
                mutableStateOf(value = "")
            }
            Image(painterResource(id = R.drawable.`val`), contentDescription = "")
            Text("Welcome", fontSize = 32.sp, color = Color.Blue)

            Text("Username", textAlign = TextAlign.Start, modifier = Modifier.fillMaxWidth())
            TextField(
                value = a,
                onValueChange = { a = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Enter Username") }
            )
            Text("Password", textAlign = TextAlign.Start, modifier = Modifier.fillMaxWidth())
            TextField(

                value = b,
                onValueChange = { b = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Enter Password") }
            )
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Sign In", color = Color.Black)
                }
                Button(
                    onClick = { /*TODO*/ }) {
                    Text(text = "Sign Up")
                }
            }

        }
    }
}
