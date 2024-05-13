package net.ezra.ui.services


import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.ui.theme.AppTheme



@Composable
fun ServicesScreen(navController: NavHostController) {
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()
    

    ){
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(text = "Job Application Form",
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 120.dp)
                        )
                }

                Spacer(modifier = Modifier.height(20.dp))


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp, bottom = 8.dp)

                ) {

                    var name1 by remember { mutableStateOf("") }

                    OutlinedTextField(
                        value = name1,
                        onValueChange = { name1 = it },
                        placeholder = { Text("First Name") },
                        modifier = Modifier
                            .width(170.dp)
                            .height(25.dp),
                        shape = RoundedCornerShape(2.dp)
                    )

                    Spacer(modifier = Modifier.width(30.dp))

                    var name by remember { mutableStateOf("") }

                    OutlinedTextField(
                        value = name,
                        onValueChange = { name = it },
                        label = { Text("Last Name") },
                        modifier = Modifier
                            .width(180.dp)
                            .height(25.dp),
                        shape = RoundedCornerShape(2.dp)
                    )


                }
                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp, bottom = 8.dp)

                ) {

                    var name1 by remember { mutableStateOf("") }

                    OutlinedTextField(
                        value = name1,
                        onValueChange = { name1 = it },
                        label = { Text(" First Name") },
                        modifier = Modifier
                            .width(170.dp)
                            .height(25.dp),
                        shape = RoundedCornerShape(2.dp)
                    )

                    Spacer(modifier = Modifier.width(30.dp))

                    var name by remember { mutableStateOf("") }

                    OutlinedTextField(
                        value = name,
                        onValueChange = { name = it },
                        label = { Text("Last Name") },
                        modifier = Modifier
                            .width(180.dp)
                            .height(25.dp),
                        shape = RoundedCornerShape(2.dp)
                    )


                }
                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp, bottom = 8.dp)

                ) {

                    var name1 by remember { mutableStateOf("") }

                    OutlinedTextField(
                        value = name1,
                        onValueChange = { name1 = it },
                        label = { Text(" First Name") },
                        modifier = Modifier
                            .width(170.dp)
                            .height(25.dp),
                        shape = RoundedCornerShape(2.dp)
                    )

                    Spacer(modifier = Modifier.width(30.dp))

                    var name by remember { mutableStateOf("") }

                    OutlinedTextField(
                        value = name,
                        onValueChange = { name = it },
                        label = { Text("Last Name") },
                        modifier = Modifier
                            .width(180.dp)
                            .height(25.dp),
                        shape = RoundedCornerShape(2.dp)
                    )


                }









            }
        }
    }






}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ServicesScreen(rememberNavController())
}

