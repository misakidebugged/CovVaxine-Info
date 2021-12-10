package com.misakicodes.covvaxineinfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class MainScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {

            setContent {


                //Image Assets for cards
                val imageAstraZeneca = painterResource(id = R.drawable.astra_zenecamini)
                val imageCoronaVacsinoVac = painterResource(id = R.drawable.corona_vacsinovacmini)
                val imageCovaxinBharat = painterResource(id = R.drawable.covaxin_bharat)
                val imageJanssen = painterResource(id = R.drawable.janseenmini)
                val imageModerna = painterResource(id = R.drawable.modernamini)
                val imagePfizer = painterResource(id = R.drawable.pfizermini)
                val imageSinopharm = painterResource(id = R.drawable.sinopharmmini)



                Column(modifier = Modifier.fillMaxSize()) {
                    TopBar(titleBar = apptitledesc, barColorR = 92, barColorG = 11, barColorB = 240)
                    LazyColumn(
                        modifier = Modifier
                            .background(color = Color(68, 60, 92, 255))
                    ) {
                        //Spacer
                        item { Spacer(modifier = Modifier.height(5.dp)) }

                        item {
                            Box(modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)) {
                                WHOMainCard(title = WHOTitleNotice, details = WHOCardDetails)
                            }
                        }

                        //Janssen (Johnson and Johnson) Card
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight(0.3f)
                                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
                                    .clickable { findNavController().navigate(R.id.actGOTO_janssenInfo) }
                            ) {
                                VaccineVarriantSelector(
                                    image = imageJanssen,
                                    imageContentDescription = descJanssen,
                                    title = titleJanssen,
                                    cardDetails = cardDetailsJanssen,
                                    txtTitleColorR = 178,
                                    txtTitleColorG = 191,
                                    txtTitleColorB = 73
                                )
                            }
                        }

                        //SinoPharm Card
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight(0.3f)
                                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
                                    .clickable { findNavController().navigate(R.id.actGOTO_sinoPharmInfo) }
                            ) {
                                VaccineVarriantSelector(
                                    image = imageSinopharm,
                                    imageContentDescription = descSinoPharm,
                                    title = titleSinoPharm,
                                    cardDetails = cardDetailsSinoPharm,
                                    txtTitleColorR = 214,
                                    txtTitleColorG = 79,
                                    txtTitleColorB = 85
                                )
                            }
                        }

                        //Moderna Card
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight(0.3f)
                                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
                                    .clickable { findNavController().navigate(R.id.actGOTO_modernaInfo) }
                            ) {
                                VaccineVarriantSelector(
                                    image = imageModerna,
                                    imageContentDescription = descModerna,
                                    title = titleModerna,
                                    cardDetails = cardDetailsModerna,
                                    txtTitleColorR = 196,
                                    txtTitleColorG = 226,
                                    txtTitleColorB = 224
                                )
                            }
                        }

                        //Astra Zeneca Card
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight(0.3f)
                                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
                                    .clickable { findNavController().navigate(R.id.actGOTO_astraZenecaInfo) }
                            ) {
                                VaccineVarriantSelector(
                                    image = imageAstraZeneca,
                                    imageContentDescription = descAstraZeneca,
                                    title = titleAstraZeneca,
                                    cardDetails = cardDetailsAstraZeneca,
                                    txtTitleColorR = 234,
                                    txtTitleColorG = 191,
                                    txtTitleColorB = 61
                                )
                            }
                        }
                        //Pfizer Card
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight(0.3f)
                                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
                                    .clickable { findNavController().navigate(R.id.actGOTO_pfizerInfo) }
                            ) {
                                VaccineVarriantSelector(
                                    image = imagePfizer,
                                    imageContentDescription = descPfizer,
                                    title = titlePfizer,
                                    cardDetails = cardDetailsPfizer,
                                    txtTitleColorR = 103,
                                    txtTitleColorG = 167,
                                    txtTitleColorB = 221
                                )
                            }
                        }

                        //Covaxin Bharat Card
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight(0.3f)
                                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
                                    .clickable { findNavController().navigate(R.id.actGOTO_covaxinBharatInfo) }
                            ) {
                                VaccineVarriantSelector(
                                    image = imageCovaxinBharat,
                                    imageContentDescription = descCovaxinBharat,
                                    title = titleCovaxinBharat,
                                    cardDetails = cardDetailsCovaxinBharat,
                                    txtTitleColorR = 99,
                                    txtTitleColorG = 168,
                                    txtTitleColorB = 175
                                )
                            }
                        }
                        //CoronaVac (SinoVac) Card
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight(0.3f)
                                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
                                    .clickable { findNavController().navigate(R.id.actGOTO_coronaVacInfo) }
                            ) {
                                VaccineVarriantSelector(
                                    image = imageCoronaVacsinoVac,
                                    imageContentDescription = descSinovac,
                                    title = titleSinoVac,
                                    cardDetails = cardDetailsSinoVac,
                                    txtTitleColorR = 248,
                                    txtTitleColorG = 104,
                                    txtTitleColorB = 117
                                )
                            }
                        }
                    }


                }
            }
        }
    }

}