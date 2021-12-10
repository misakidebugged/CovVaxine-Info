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

class ModernaInfo : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {

                val imageModernaDistributionMap = painterResource(id = R.drawable.modernamap)
                val imageModerna = painterResource(id = R.drawable.modernamini)
                val titleBarMessageAZ = "MODERNA"

                Column(modifier = Modifier.fillMaxSize()) {
                    TopBar(titleBar = titleBarMessageAZ, barColorR = 92, barColorG = 11, barColorB = 240)
                    VaccineDetailedInformation(
                        relatedImage = imageModerna,
                        imageDescription = descModerna,
                        screenHeaderTitle = titleModerna,
                        screenTextDetailsInFull = detailsInFullModerna,
                        txtAreasWhereVaccineIsApproved = areasVaccineApprovedModerna,
                        imageAboutItsDistribution = imageModernaDistributionMap,
                        imageMapDescription = descMapModerna,
                        txtTitleToControversies = titleToControversiesModerna,
                        screenTextControversies = controversiesModerna,
                        linkForMoreInfo = webpageModerna,
                        startPadding = 16,
                        endPadding= 16,
                        prosContentTxt = prosContentModerna,
                        consContentTxt = consContentModerna,
                        numberOfDosesNeededAndBoosterShots = NODNABSModerna,
                        cardImageTextColorR = 196,
                        cardImageTextColorG = 226,
                        cardImageTextColorB = 224
                    )
                }
            }
        }
    }

}