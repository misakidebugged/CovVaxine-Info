package com.misakicodes.covvaxineinfo

import android.content.Intent
import android.net.Uri
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun VaccineVarriantSelector( //Reusable composable for displaying basic Card info of the available vaccines
    image: Painter,
    imageContentDescription: String,
    title: String,
    cardDetails: String,
    modifier: Modifier = Modifier,
    txtTitleColorR: Int,
    txtTitleColorG: Int,
    txtTitleColorB: Int
) {
    Card( //Parent Card to contain the following stackable items
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp
    ) {
        Box( //Master Box Containing our Content
            modifier = Modifier.height(140.dp)
        ) {
            Image( // Background card image displaying the Companies Headquarters
                painter = image,
                contentDescription = imageContentDescription,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Box( // Provides a background color to make the description readable
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(90, 87, 95, 200))
            ) {

            }
            Box( //Provides the text and formats our Description
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp), contentAlignment = Alignment.TopStart
            ) {
                Column {
                    Text( //-------------------------------------------------------------------------- Title for Card
                        title,
                        style = TextStyle(
                            color = Color(
                                txtTitleColorR,
                                txtTitleColorG,
                                txtTitleColorB
                            ), fontSize = 23.sp, fontWeight = FontWeight.Bold,
                            shadow = Shadow(
                                color = Color.Black,
                                offset = Offset(4f, 4f),
                                blurRadius = 8f
                            )
                        )
                    )
                    Spacer(modifier = Modifier.padding(2.dp))
                    Text( //---------------------------------------------------------------------------- Info for Card
                        cardDetails,
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 11.sp,
                            textAlign = TextAlign.Left,
                            fontStyle = FontStyle.Italic, shadow = Shadow(
                                color = Color.Black,
                                offset = Offset(4f, 4f),
                                blurRadius = 8f
                            )
                        )
                    )
                    Spacer(modifier = Modifier.padding(2.dp))
                    Text(
                        text = "CLICK TO LEARN MORE", style = TextStyle(
                            color = Color(
                                txtTitleColorR,
                                txtTitleColorG,
                                txtTitleColorB
                            ), fontSize = 9.sp, fontWeight = FontWeight.Bold, shadow = Shadow(
                                color = Color.Black,
                                offset = Offset(4f, 4f),
                                blurRadius = 8f
                            )
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun TopBar( // Simple bar displaying app name
    titleBar: String,
    barColorR: Int,
    barColorG: Int,
    barColorB: Int
) {
    Box(
        modifier = Modifier
            .height(55.dp)
            .fillMaxWidth()
            .background(color = Color(barColorR, barColorG, barColorB)),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = titleBar,
            textAlign = TextAlign.Left,
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(10.dp)
        )
    }
}

@Composable
fun WHOMainCard( // Simple Card providing disclaimer from the WHO
    title: String,
    details: String
) {
    Card(
        //Parent Card to contain the following stackable items
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp,
    )
    {
        Box(modifier = Modifier.height(240.dp)) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(92, 11, 240, 255),
                                Color(25, 118, 210, 255)
                            )
                        )
                    )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(18.dp),
                    contentAlignment = Alignment.TopStart
                ) {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = title,
                                color = Color.White,
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                style = TextStyle(
                                    shadow = Shadow(
                                        color = Color(0, 0, 0, 100),
                                        offset = Offset(4f, 4f),
                                        blurRadius = 8f
                                    )
                                )
                            )
                        }

                        Spacer(modifier = Modifier.padding(5.dp))
                        Text(
                            text = details,
                            color = Color.White,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Justify,
                            style = TextStyle(
                                fontFamily = fontSignikaFamily,
                                shadow = Shadow(
                                    color = Color.Black,
                                    offset = Offset(4f, 4f),
                                    blurRadius = 8f
                                )
                            )
                        )
                    }
                }
            }

        }

    }
}

@Composable
fun VaccineDetailedInformation( //Composable for each vaccine screen
    relatedImage: Painter,
    imageDescription: String,
    screenHeaderTitle: String,
    screenTextDetailsInFull: String,
    txtAreasWhereVaccineIsApproved: String,
    imageAboutItsDistribution: Painter,
    imageMapDescription: String,
    txtTitleToControversies: String,
    screenTextControversies: String,
    linkForMoreInfo: String,
    startPadding: Int,
    endPadding: Int,
    prosContentTxt: String,
    consContentTxt: String,
    numberOfDosesNeededAndBoosterShots: String,
    cardImageTextColorR: Int,
    cardImageTextColorG: Int,
    cardImageTextColorB: Int
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(68, 60, 92, 255))
    ) { //Master Column

        //Column with Content
        LazyColumn() { //Content Column

            // Image Item
            item {
                Card(
                    elevation = 50.dp, shape = RoundedCornerShape(0.dp), modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                ) {
                    Image(
                        // Background card image displaying the Companies Headquarters --------------------------BG Image
                        painter = relatedImage,
                        contentDescription = imageDescription,
                        contentScale = ContentScale.Crop,
                    )
                }
            }

            // Artistic Gradient
            item {
                Card(elevation = 50.dp, shape = RoundedCornerShape(0.dp), modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)) {
                    Box(
                        modifier = Modifier
                            .height(20.dp)
                            .background(
                                Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(92, 11, 240, 255),
                                        Color(229, 57, 53, 255),
                                        Color(67, 160, 71, 255),
                                        Color(92, 11, 240, 255)
                                    )
                                )
                            )
                    ) {

                    }
                }

            }

            item { Spacer(modifier = Modifier.padding(12.dp)) }

            //Screen Title -----------------------------------------------------------------------------//Screen Title
            item {
                Box(
                    modifier = Modifier
                        .padding(start = startPadding.dp, end = endPadding.dp)
                        .fillMaxWidth(), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = screenHeaderTitle,
                        color = Color.White,
                        fontSize = 33.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(
                            fontFamily = fontVollkronFamily,
                            shadow = Shadow(
                                color = Color(0, 0, 0, 180),
                                offset = Offset(4f, 4f),
                                blurRadius = 8f
                            )
                        )
                    )
                }

            }

            item { Spacer(modifier = Modifier.padding(12.dp)) }

            // Text displaying number of shots needed and booster shots --------------------------------- Doses Needed Text
            item {
                Text(
                    text = numberOfDosesNeededAndBoosterShots,
                    color = Color(cardImageTextColorR,cardImageTextColorG,cardImageTextColorB),
                    fontSize = 17.sp,
                    textAlign = TextAlign.Left,
                    style = TextStyle(
                        fontFamily = fontSignikaFamily,
                        shadow = Shadow(
                            color = Color(0, 0, 0, 100),
                            offset = Offset(4f, 4f),
                            blurRadius = 8f
                        )
                    ), modifier = Modifier.padding(start = startPadding.dp, end = endPadding.dp)
                )
            }

            item { Spacer(modifier = Modifier.padding(15.dp)) }

            //Two Cards detailing the pros and cons ---------------------------------------------------- Pros and Cons Cards
            item {
                Column(
                    modifier = Modifier
                        .padding(start = startPadding.dp, end = endPadding.dp)
                        .fillMaxWidth()
                ) {
                    Row() {
                        Card(
                            // Card for the Pros
                            modifier = Modifier
                                .fillMaxWidth(0.485f)
                                .height(170.dp),
                            shape = RoundedCornerShape(10.dp),
                            elevation = 10.dp,
                        )
                        {
                            Box() {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color(92, 11, 240, 255),
                                                    Color(67, 160, 71, 255),
                                                    Color(67, 160, 71, 255),
                                                    Color(67, 160, 71, 255)
                                                )
                                            )
                                        )
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .padding(18.dp),
                                        contentAlignment = Alignment.TopStart
                                    ) {
                                        Column {
                                            Box(
                                                modifier = Modifier.fillMaxWidth(),
                                                contentAlignment = Alignment.Center
                                            ) {
                                                Text(
                                                    text = "PROS",
                                                    color = Color.White,
                                                    fontSize = 28.sp,
                                                    textAlign = TextAlign.Center,
                                                    fontWeight = FontWeight.Bold,
                                                    style = TextStyle(
                                                        shadow = Shadow(
                                                            color = Color(0, 0, 0, 100),
                                                            offset = Offset(4f, 4f),
                                                            blurRadius = 8f
                                                        )
                                                    )
                                                )
                                            }

                                            Spacer(modifier = Modifier.padding(5.dp))
                                            Text(
                                                text = prosContentTxt,
                                                color = Color.White,
                                                fontSize = 13.sp,
                                                textAlign = TextAlign.Left,
                                                style = TextStyle(
                                                    fontFamily = fontSignikaFamily,
                                                    shadow = Shadow(
                                                        color = Color.Black,
                                                        offset = Offset(4f, 4f),
                                                        blurRadius = 8f
                                                    )
                                                )
                                            )
                                        }
                                    }
                                }

                            }

                        }
                        Spacer(modifier = Modifier.padding(5.dp))
                        Card(
                            //Card For the Cons
                            modifier = Modifier
                                .height(170.dp),
                            shape = RoundedCornerShape(10.dp),
                            elevation = 10.dp,
                        )
                        {
                            Box() {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color(92, 11, 240, 255),
                                                    Color(229, 57, 53, 255),
                                                    Color(229, 57, 53, 255)
                                                )
                                            )
                                        )
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .padding(18.dp),
                                        contentAlignment = Alignment.TopStart
                                    ) {
                                        Column {
                                            Box(
                                                modifier = Modifier.fillMaxWidth(),
                                                contentAlignment = Alignment.Center
                                            ) {
                                                Text(
                                                    text = "CONS",
                                                    color = Color.White,
                                                    fontSize = 28.sp,
                                                    textAlign = TextAlign.Center,
                                                    fontWeight = FontWeight.Bold,
                                                    style = TextStyle(
                                                        shadow = Shadow(
                                                            color = Color(0, 0, 0, 100),
                                                            offset = Offset(4f, 4f),
                                                            blurRadius = 8f
                                                        )
                                                    )
                                                )
                                            }

                                            Spacer(modifier = Modifier.padding(5.dp))
                                            Text(
                                                text = consContentTxt,
                                                color = Color.White,
                                                fontSize = 13.sp,
                                                textAlign = TextAlign.Left,
                                                style = TextStyle(
                                                    fontFamily = fontSignikaFamily,
                                                    shadow = Shadow(
                                                        color = Color.Black,
                                                        offset = Offset(4f, 4f),
                                                        blurRadius = 8f
                                                    )
                                                )
                                            )
                                        }
                                    }
                                }

                            }

                        }
                    }
                }
            }

            item { Spacer(modifier = Modifier.padding(15.dp)) }

            //Vaccine Info Details ---------------------------------------------------------------------- Text Body Details
            item {
                Text(
                    text = screenTextDetailsInFull,
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Justify,
                    style = TextStyle(
                        fontFamily = fontSignikaFamily,
                        shadow = Shadow(
                            color = Color(0, 0, 0, 55),
                            offset = Offset(4f, 4f),
                            blurRadius = 8f
                        )
                    ), modifier = Modifier.padding(start = startPadding.dp, end = endPadding.dp)
                )
            }

            item { Spacer(modifier = Modifier.padding(20.dp)) }

            //Button to go to the website -------------------------------------------------------------- Button to Website
            item {
                Box(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(), contentAlignment = Alignment.Center
                ) {
                    GoToWebsiteButton(
                        webAdress = linkForMoreInfo
                    )
                }
            }

            item { Spacer(modifier = Modifier.padding(20.dp)) }

            //Title for the distribution Map ----------------------------------------------------------- Title to Map
            item {
                Box(
                    modifier = Modifier
                        .padding(start = startPadding.dp, end = endPadding.dp)
                         , contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = txtAreasWhereVaccineIsApproved,
                        color = Color.White,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontFamily = fontVollkronFamily,
                            shadow = Shadow(
                                color = Color(0, 0, 0, 180),
                                offset = Offset(4f, 4f),
                                blurRadius = 8f
                            )
                        )
                    )
                }
            }

            item { Spacer(modifier = Modifier.padding(10.dp)) }

            //Map on distribution ------------------------------------------------------------------------ Map Card
            item {
                Card(
                    elevation = 18.dp, modifier = Modifier
                        .padding(start = startPadding.dp, end = endPadding.dp)
                        .fillMaxWidth()
                ) {
                    Image(
                        // Image displaying Map division of the vaccines distribution
                        painter = imageAboutItsDistribution,
                        contentDescription = imageMapDescription,
                        contentScale = ContentScale.FillWidth
                    )
                }
            }

            item { Spacer(modifier = Modifier.padding(15.dp)) }

            // Title to some controversies on the vaccine ------------------------------------------ Title to Controversies
            item {
                Box(
                    modifier = Modifier
                        .padding(start = startPadding.dp, end = endPadding.dp)
                        .fillMaxWidth(), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = txtTitleToControversies,
                        color = Color.White,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontFamily = fontVollkronFamily,
                            shadow = Shadow(
                                color = Color(92, 11, 240, 180),
                                offset = Offset(4f, 4f),
                                blurRadius = 8f
                            )
                        )
                    )
                }
            }

            item { Spacer(modifier = Modifier.padding(12.dp)) }

            //Controversies and Side-effects --------------------------------------------------------- Controversies Body Text
            item {
                Text(
                    text = screenTextControversies,
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Justify,
                    style = TextStyle(
                        fontFamily = fontSignikaFamily,
                        shadow = Shadow(
                            color = Color(0, 0, 0, 55),
                            offset = Offset(4f, 4f),
                            blurRadius = 8f
                        )
                    ), modifier = Modifier.padding(start = startPadding.dp, end = endPadding.dp)
                )
            }

            item { Spacer(modifier = Modifier.padding(30.dp)) }

            //Button to go to the website -------------------------------------------------------------- Button to Website
            item {
                Box(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(), contentAlignment = Alignment.Center
                ) {
                    GoToWebsiteButton(
                        webAdress = linkForMoreInfo
                    )
                }
            }

            item { Spacer(modifier = Modifier.padding(20.dp)) }

        }
    }
}

@Composable
fun GoToWebsiteButton( //Button Intent to Wikipedia for more in depth information (Will become redundant in future updates)
    webAdress: String
) {
    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(webAdress)) }

    Button(onClick = { context.startActivity(intent) }) {
        Text(text = "LINK TO WIKIPEDIA PAGE", fontWeight = FontWeight.Bold)
    }
}
