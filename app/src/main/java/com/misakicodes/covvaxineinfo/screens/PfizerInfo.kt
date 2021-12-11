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

class PfizerInfo : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {

                val imagePfizerDistributionMap = painterResource(id = R.drawable.pfizermap)
                val imagePfizer = painterResource(id = R.drawable.pfizermini)
                val titleBarMessageAZ = "Pfizer-BIONTECH (Comirnaty)"

                Column(modifier = Modifier.fillMaxSize()) {
                    TopBar(titleBar = titleBarMessageAZ, barColorR = 92, barColorG = 11, barColorB = 240)
                    VaccineDetailedInformation(
                        relatedImage = imagePfizer,
                        imageDescription = descPfizer,
                        screenHeaderTitle = titlePfizer,
                        screenTextDetailsInFull = detailsInFullPfizer,
                        txtAreasWhereVaccineIsApproved = areasVaccineApprovedPfizer,
                        imageAboutItsDistribution = imagePfizerDistributionMap,
                        imageMapDescription = descMapPfizer,
                        txtTitleToControversies = titleToControversiesPfizer,
                        screenTextControversies = controversiesPfizer,
                        linkForMoreInfo = webpagePfizer,
                        startPadding = 16,
                        endPadding= 16,
                        prosContentTxt = prosContentPfizer,
                        consContentTxt = consContentPfizer,
                        numberOfDosesNeededAndBoosterShots = NODNABSPfizer,
                        cardImageTextColorR = 103,
                        cardImageTextColorG = 167,
                        cardImageTextColorB = 223
                    )
                }
            }
        }
    }

}