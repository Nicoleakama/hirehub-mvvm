package net.ezra.ui.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

@Composable
fun ProductsScreen(navController: NavHostController) {
LazyColumn {
    item {
        Column (
            modifier = Modifier
                .fillMaxSize()

        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black)
                    .height(100.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = "Welcome To My ",
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold

                    )
                    Spacer(modifier = Modifier.width(10.dp))


                    Image(painter = painterResource(id = R.drawable.edit),
                        contentDescription = "",
                        modifier = Modifier
                            .size(30.dp)
                            .padding(top = 5.dp),


                        )

                }


                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(text = "Portfolio",
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontSize = 30.sp,
                        fontWeight= FontWeight.ExtraBold)

                }


            }




               Column (
                 modifier = Modifier
                     .background(Color.White)
               ){
                  Row(
                     modifier = Modifier
                         .fillMaxWidth(),

                  ) {

                      Image(painter = painterResource(id = R.drawable.kindpng) ,
                          contentDescription = null ,
                          modifier = Modifier
                              .padding(start = 16.dp)
                              .height(100.dp)
                              .offset(y = (-50).dp))
                      
                      Spacer(modifier = Modifier.width(225.dp))
                      

                     Image(painter = painterResource(id = R.drawable.ball),
                         contentDescription = "",
                         modifier = Modifier
                             .size(16.dp)
                     )

                       Spacer(modifier = Modifier.width(10.dp))


                     Image(painter = painterResource(id = R.drawable.instagram),
                         contentDescription = "",
                         modifier = Modifier.size(15.dp)

                     )
                  }

                   Spacer(modifier = Modifier.height(0.dp))

                   Row (
                       modifier = Modifier
                           .fillMaxWidth()
                           .padding(start = 16.dp)
                   ){
                       Text(text = "Grace William",
                          color = Color.Black,
                          fontWeight = FontWeight.ExtraBold,
                          fontSize = 30.sp
                       )

                       Spacer(modifier = Modifier.width(5.dp))



                       Image(painter = painterResource(id = R.drawable.edit),
                           contentDescription = "",
                           modifier = Modifier
                               .size(30.dp)
                       )
                       
                   }
                   
                   Row (
                       modifier = Modifier
                           .fillMaxWidth()
                           .padding(start = 16.dp)
                       
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.location),
                           contentDescription = "",
                           modifier = Modifier.size(18.dp)
                       )
                       
                       
                       Spacer(modifier = Modifier.width(6.dp))

                       Text(
                           text = "Sylhet,Bangladesh",
                           color = Color.Black,
                           fontSize = 12.sp
                       )
                   }


                   Spacer(modifier = Modifier .height(10.dp))
                   Card(
                       modifier = Modifier
                           .padding(start = 16.dp)
                           .width(280.dp)
                           .height(160.dp),
                       shape = RoundedCornerShape(15.dp),
                       colors = CardDefaults.cardColors(Color(0xffCBC3E3))
                   ) {
                       Column(
                           modifier = Modifier
                               .fillMaxSize()
                       ) {
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 10.dp, top = 5.dp)
                        ){
                         Image(painter = painterResource(id = R.drawable.message),
                             contentDescription ="",
                             modifier = Modifier.size(30.dp)
                             )

                            Spacer(modifier = Modifier.weight(1f))

                            Image(painter = painterResource(id = R.drawable.edit),
                                contentDescription ="",
                                modifier = Modifier.size(30.dp)
                            )

                        }

                           Spacer(modifier = Modifier.height(7.dp))


                       Row (
                           modifier = Modifier
                               .padding(start = 10.dp)

                       ){
                           Text(text = "Mobile App Designer",
                               color = Color.Black,
                               fontWeight = FontWeight.ExtraBold)
                       }


                           Spacer(modifier = Modifier.height(5.dp))


                           Column(
                               modifier = Modifier
                                   .fillMaxWidth()
                                   .fillMaxHeight()

                           ) {
                               Text(text = "My name is Grace William and I am  Mobile App Designer with 5years of experience."
                                       +
                                       "I have always been passionate about creating work that is part of a bigger picture, work that is innovative .",

                                   modifier = Modifier
                                       .padding(start = 10.dp, end = 10.dp)
                               )

                           }

                       }


                   }

                   Spacer(modifier = Modifier .height(10.dp))



                   Card (
                       modifier = Modifier
                           .padding(start = 16.dp)
                           .width(280.dp)
                           .height(160.dp),
                       shape = RoundedCornerShape(15.dp),
                       colors = CardDefaults.cardColors(Color(0xffFFB6C1
                       ))

                   ){
                       Column(
                           modifier = Modifier
                               .fillMaxSize()
                       ) {
                           Row(
                               modifier = Modifier
                                   .fillMaxWidth()
                                   .padding(start = 10.dp, end = 10.dp, top = 5.dp)
                           ) {
                               Image(
                                   painter = painterResource(id = R.drawable.message),
                                   contentDescription = "",
                                   modifier = Modifier.size(30.dp)
                               )

                               Spacer(modifier = Modifier.weight(1f))

                               Image(
                                   painter = painterResource(id = R.drawable.edit),
                                   contentDescription = "",
                                   modifier = Modifier.size(30.dp)
                               )

                           }


                           Row (
                               modifier = Modifier
                                   .fillMaxWidth()
                                   .padding(start = 10.dp, end = 10.dp, top = 5.dp),
                               horizontalArrangement = Arrangement.Center

                           ) {

                               Text(
                                   text = "Work Hours",
                               )
                           }

                               Spacer(modifier = Modifier.height(40.dp))


                               Column(
                                   modifier = Modifier
                                       .fillMaxSize()
                                       .padding(start = 50.dp)
                               ) {
                                 Card(
                                     modifier = Modifier
                                         .height(70.dp)
                                         .width(180.dp),
                                     colors = CardDefaults.cardColors(Color(0xffFFFFFF))

                                 ) {
                                     Text(text = " Office jobs_ 8-5PM ",
                                         modifier = Modifier
                                             .padding(start = 5.dp, end = 5.dp, top = 5.dp)
                                     )

                                     Spacer(modifier = Modifier.height(10.dp))


                                     Text(text = " Remote jobs _ 8-10PM",
                                         modifier = Modifier
                                             .padding(start = 5.dp, end = 5.dp, top = 5.dp)
                                     )





                                 }



                               }
















                       }



                   }





































               }















        }
    }
}

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}

