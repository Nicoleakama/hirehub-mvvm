
package net.ezra.ui.shop

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.ui.contact.BottomBar
import net.ezra.ui.contact.ClickableSearchBar


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShopScreen(navController: NavHostController) {
    LazyColumn (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize(),

    ) {
        item {
            Row(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth()

            ) {
                var searchText by remember { mutableStateOf("") }

                TextField(
                    value = searchText,
                    onValueChange = { searchText = it },
                    modifier = Modifier
                        .clickable {}
                        .fillMaxWidth()
                        .background(Color.Transparent)
                        .padding(start = 10.dp, end = 10.dp),

                    placeholder = { Text(text = "Search...") },

                    leadingIcon = {
                        androidx.compose.material.Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "search icon",
                            tint = Color.Black
                        )
                    },

                    shape = RoundedCornerShape(20.dp),

                    colors = TextFieldDefaults.textFieldColors(

                        backgroundColor = Color.LightGray,
                        textColor = Color.Black,
                        cursorColor = Color.Black,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,

                    ),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Text
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {}
                    ),
                    singleLine = true,
                    textStyle = MaterialTheme.typography.bodyMedium
                )


            }


            Spacer(modifier = Modifier.height(15.dp))


            Card(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    Color(
                        0xFFFFB6C1

                    )
                )

            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.netflix),
                        contentDescription = "Netflix Logo",
                        modifier = Modifier.size(50.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Column {

                        Text(
                            text = "App Designer",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )


                        Text(
                            text = "Netflix",
                            color = Color.Black,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )

                    }
                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "$70/hr",
                        modifier = Modifier
                            .padding(start = 80.dp, top = 2.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawLine(
                        color = Color.Gray,
                        start = Offset(0f, size.height / 1),
                        end = Offset(size.width, size.height / 1),
                        strokeWidth = 1.dp.toPx()
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 2.dp)

                ) {

                    Image(painter = painterResource(id = R.drawable.kindpng),
                        contentDescription = "",
                        modifier = Modifier
                            .offset(x = (25).dp)

                            .size(48.dp)
                    )



                    Image(painter = painterResource(id = R.drawable.tick),
                        contentDescription = "",
                        modifier = Modifier
                            .size(45.dp))


                    Spacer(modifier = Modifier.width(2.dp))

                    Text(
                        text = "Best Match!",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0XFF008000),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                        modifier = Modifier
                            .width(280.dp)
                            .height(47.dp)
                            .padding(start = 60.dp, top = 5.dp, bottom = 5.dp),

                        colors = ButtonDefaults.buttonColors(Color(0xFF000000)),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "View Job")
                    }
                }
            }

            Spacer(modifier = Modifier.height(15.dp))


            Card(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    Color(
                        0xFFADD8E6

                    )
                )

            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.microsoft),
                        contentDescription = "Netflix Logo",
                        modifier = Modifier.size(50.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Column {

                        Text(
                            text = "Microsoft Designer",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )


                        Text(
                            text = "Microsoft",
                            color = Color.Black,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )

                    }
                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "$60/hr",
                        modifier = Modifier
                            .padding(start = 80.dp, top = 2.dp)
                    )
                }


                Spacer(modifier = Modifier.height(20.dp))

                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawLine(
                        color = Color.Gray,
                        start = Offset(0f, size.height / 1),
                        end = Offset(size.width, size.height / 1),
                        strokeWidth = 1.dp.toPx()
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Image(painter = painterResource(id = R.drawable.kindpng),
                        contentDescription = "",
                        modifier = Modifier
                            .offset(x = (25).dp)
                            .size(48.dp)
                    )



                    Image(painter = painterResource(id = R.drawable.tick),
                        contentDescription = "",
                        modifier = Modifier
                            .size(45.dp))



                    Spacer(modifier = Modifier.width(2.dp))

                    Text(
                        text = "Best Match!",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0XFF008000),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                        modifier = Modifier
                            .width(280.dp)
                            .height(47.dp)
                            .padding(start = 60.dp, top = 5.dp, bottom = 5.dp),

                        colors = ButtonDefaults.buttonColors(Color(0xFF000000)),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "View Job")
                    }
                }
            }

            Spacer(modifier = Modifier.height(15.dp))


            Card(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    Color(
                        0xFFFF89CFF)
                )

            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.slack),
                        contentDescription = "",
                        modifier = Modifier.size(50.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Column {

                        Text(
                            text = "Android Designer",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )


                        Text(
                            text = "Slack",
                            color = Color.Black,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )

                    }
                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "$30/hr",
                        modifier = Modifier
                            .padding(start = 80.dp, top = 2.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawLine(
                        color = Color.Gray,
                        start = Offset(0f, size.height / 1),
                        end = Offset(size.width, size.height / 1),
                        strokeWidth = 1.dp.toPx()
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Image(painter = painterResource(id = R.drawable.kindpng),
                        contentDescription = "",
                        modifier = Modifier
                            .offset(x = (25).dp)
                            .size(48.dp)
                    )



                    Image(painter = painterResource(id = R.drawable.tick),
                        contentDescription = "",
                        modifier = Modifier
                            .size(45.dp))


                    Spacer(modifier = Modifier.width(2.dp))

                    Text(
                        text = "Best Match!",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0XFF008000),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                        modifier = Modifier
                            .width(280.dp)
                            .height(47.dp)
                            .padding(start = 60.dp, top = 5.dp, bottom = 5.dp),

                        colors = ButtonDefaults.buttonColors(Color(0xFF000000)),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "View Job")
                    }
                }
            }


            Spacer(modifier = Modifier.height(15.dp))


            Card(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    Color(
                        0xFFDAF7A6


                    )
                )

            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "Netflix Logo",
                        modifier = Modifier.size(50.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Column {

                        Text(
                            text = "Visual Designer",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )


                        Text(
                            text = "Google",
                            color = Color.Black,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )

                    }
                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "$70/hr",
                        modifier = Modifier
                            .padding(start = 80.dp, top = 2.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawLine(
                        color = Color.Gray,
                        start = Offset(0f, size.height / 1),
                        end = Offset(size.width, size.height / 1),
                        strokeWidth = 1.dp.toPx()
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Image(painter = painterResource(id = R.drawable.kindpng),
                        contentDescription = "",
                        modifier = Modifier
                            .offset(x = (25).dp)
                            .size(48.dp)
                    )



                    Image(painter = painterResource(id = R.drawable.tick),
                        contentDescription = "",
                        modifier = Modifier
                            .size(45.dp))


                    Spacer(modifier = Modifier.width(2.dp))

                    Text(
                        text = "Best Match!",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0XFF008000),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                        modifier = Modifier
                            .width(280.dp)
                            .height(47.dp)
                            .padding(start = 60.dp, top = 5.dp, bottom = 5.dp),

                        colors = ButtonDefaults.buttonColors(Color(0xFF000000)),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "View Job")
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))


            Card(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    Color(0xFFF2D2BD)
                )

            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.instagram),
                        contentDescription = "Netflix Logo",
                        modifier = Modifier.size(50.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Column {

                        Text(
                            text = "iOS Developer ",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )


                        Text(
                            text = "Ronas IT",
                            color = Color.Black,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )

                    }
                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "$60/hr",
                        modifier = Modifier
                            .padding(start = 80.dp, top = 2.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawLine(
                        color = Color.Gray,
                        start = Offset(0f, size.height / 1),
                        end = Offset(size.width, size.height / 1),
                        strokeWidth = 1.dp.toPx()
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Image(painter = painterResource(id = R.drawable.kindpng),
                        contentDescription = "",
                        modifier = Modifier
                            .offset(x = (25).dp)
                            .size(48.dp)
                    )



                    Image(painter = painterResource(id = R.drawable.tick),
                        contentDescription = "",
                        modifier = Modifier
                            .size(45.dp))


                    Spacer(modifier = Modifier.width(2.dp))

                    Text(
                        text = "Best Match!",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0XFF008000),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                        modifier = Modifier
                            .width(280.dp)
                            .height(47.dp)
                            .padding(start = 60.dp, top = 5.dp, bottom = 5.dp),

                        colors = ButtonDefaults.buttonColors(Color(0xFF000000)),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "View Job")
                    }
                }
            }


        }


    }
}






    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
    @Composable
    fun HomeScreenPreview() {
        ShopScreen(navController = rememberNavController())
        ClickableSearchBar{}
    }


    @Composable
    fun ClickableSearchBar(onSearchClicked: ((String) -> Unit)) {

    }

















