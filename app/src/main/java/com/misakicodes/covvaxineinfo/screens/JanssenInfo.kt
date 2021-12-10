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

class JanssenInfo : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {

                val imageJanssenDistributionMap = painterResource(id = R.drawable.janssenmap)
                val imageJanssen = painterResource(id = R.drawable.janseenmini)
                val titleBarMessageAZ = "JANSSEN (Johnson & Johnson)"

                Column(modifier = Modifier.fillMaxSize()) {
                    TopBar(titleBar = titleBarMessageAZ, barColorR = 92, barColorG = 11, barColorB = 240)
                    VaccineDetailedInformation(
                        relatedImage = imageJanssen,
                        imageDescription = descJanssen,
                        screenHeaderTitle = titleJanssen,
                        screenTextDetailsInFull = detailsInFullJanssen,
                        txtAreasWhereVaccineIsApproved = areasVaccineApprovedJanssen,
                        imageAboutItsDistribution = imageJanssenDistributionMap,
                        imageMapDescription = descMapJanssen,
                        txtTitleToControversies = titleToControversiesJanssen,
                        screenTextControversies = controversiesJanssen,
                        linkForMoreInfo = webpageAstraZeneca,
                        startPadding = 16,
                        endPadding= 16,
                        prosContentTxt = prosContentJanssen,
                        consContentTxt = consContentJanssen,
                        numberOfDosesNeededAndBoosterShots = NODNABSJanssen,
                        cardImageTextColorR = 178,
                        cardImageTextColorG = 191,
                        cardImageTextColorB = 73
                    )
                }
            }
        }
    }

}