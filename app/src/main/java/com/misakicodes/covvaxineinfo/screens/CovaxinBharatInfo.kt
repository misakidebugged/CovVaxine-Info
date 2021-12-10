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

class CovaxinBharatInfo : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {

                val imageCovaxinBharatDistributionMap = painterResource(id = R.drawable.covaxinmap)
                val imageCovaxinBharat = painterResource(id = R.drawable.covaxin_bharat)
                val titleBarMessageAZ = "COVAXIN"

                Column(modifier = Modifier.fillMaxSize()) {
                    TopBar(titleBar = titleBarMessageAZ, barColorR = 92, barColorG = 11, barColorB = 240)
                    VaccineDetailedInformation(
                        relatedImage = imageCovaxinBharat,
                        imageDescription = descCovaxinBharat,
                        screenHeaderTitle = titleCovaxinBharat,
                        screenTextDetailsInFull = detailsInFullCovaxinBharat,
                        txtAreasWhereVaccineIsApproved = areasVaccineApprovedCovaxinBharat,
                        imageAboutItsDistribution = imageCovaxinBharatDistributionMap,
                        imageMapDescription = descMapCovaxinBharat,
                        txtTitleToControversies = titleToControversiesCovaxinBharat,
                        screenTextControversies = controversiesCovaxinBharat,
                        linkForMoreInfo = webpageCovaxinBharat,
                        startPadding = 16,
                        endPadding= 16,
                        prosContentTxt = prosContentCovaxinBharat,
                        consContentTxt = consContentCovaxinBharat,
                        numberOfDosesNeededAndBoosterShots = NODNABSCovaxinBharat,
                        cardImageTextColorR = 99,
                        cardImageTextColorG = 169,
                        cardImageTextColorB = 175
                    )
                }
            }
        }
    }

}