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

class AstraZenecaInfo : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {

                val imageAstraZenecaDistributionMap = painterResource(id = R.drawable.astrazeneca_map_white)
                val imageAstraZeneca = painterResource(id = R.drawable.astra_zenecamini)
                val titleBarMessageAZ = "OXFORD-ASTRAZENECA"

                Column(modifier = Modifier.fillMaxSize()) {
                    TopBar(titleBar = titleBarMessageAZ, barColorR = 92, barColorG = 11, barColorB = 240)
                    VaccineDetailedInformation(
                        relatedImage = imageAstraZeneca,
                        imageDescription = descAstraZeneca,
                        screenHeaderTitle = titleAstraZeneca,
                        screenTextDetailsInFull = detailsInFullAstrazeneca,
                        txtAreasWhereVaccineIsApproved = areasVaccineApprovedAstraZeneca,
                        imageAboutItsDistribution = imageAstraZenecaDistributionMap,
                        imageMapDescription = descMapAstraZeneca,
                        txtTitleToControversies = titleToControversiesAstraZeneca,
                        screenTextControversies = controversiesAstraZeneca,
                        linkForMoreInfo = webpageAstraZeneca,
                        startPadding = 16,
                        endPadding= 16,
                        prosContentTxt = prosContentAstraZeneca,
                        consContentTxt = consContentAstraZeneca,
                        numberOfDosesNeededAndBoosterShots = NODNABSAstraZeneca,
                        cardImageTextColorR = 234,
                        cardImageTextColorG = 191,
                        cardImageTextColorB = 61
                    )
                }
            }
        }
    }

}