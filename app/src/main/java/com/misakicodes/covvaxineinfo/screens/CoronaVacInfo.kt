package com.misakicodes.covvaxineinfo.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.fragment.app.Fragment
import com.misakicodes.covvaxineinfo.*
import com.misakicodes.covvaxineinfo.screentextdata.*

class CoronaVacInfo : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {

                val imageCoronaVacMap = painterResource(id = R.drawable.coronavacmap)
                val imageCoronaVac = painterResource(id = R.drawable.corona_vacsinovacmini)
                val titleBarMessageAZ = "CORONAVAC"

                Column(modifier = Modifier.fillMaxSize()) {
                    TopBar(titleBar = titleBarMessageAZ, barColorR = 92, barColorG = 11, barColorB = 240)
                    VaccineDetailedInformation(
                        relatedImage = imageCoronaVac,
                        imageDescription = descSinovac,
                        screenHeaderTitle = titleSinoVac,
                        screenTextDetailsInFull = detailsInFullCoronaVac,
                        txtAreasWhereVaccineIsApproved = areasVaccineApprovedCoronaVac,
                        imageAboutItsDistribution = imageCoronaVacMap,
                        imageMapDescription = descMapCoronaVac,
                        txtTitleToControversies = titleToControversiesCoronaVac,
                        screenTextControversies = controversiesCoronaVac,
                        linkForMoreInfo = webpageCoronaVac,
                        startPadding = 16,
                        endPadding= 16,
                        prosContentTxt = prosContentCoronaVac,
                        consContentTxt = consContentCoronaVac,
                        numberOfDosesNeededAndBoosterShots = NODNABSCoronaVac,
                        cardImageTextColorR = 248,
                        cardImageTextColorG = 104,
                        cardImageTextColorB = 117
                    )
                }
            }
        }
    }

}