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

class SinoPharmInfo : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {

                val imageSinoPharmDistributionMap = painterResource(id = R.drawable.sinopharmmap)
                val imageSinoPharm = painterResource(id = R.drawable.sinopharmbig)
                val titleBarMessageAZ = "Sinopharm BBIBP-CorV"

                Column(modifier = Modifier.fillMaxSize()) {
                    TopBar(titleBar = titleBarMessageAZ, barColorR = 92, barColorG = 11, barColorB = 240)
                    VaccineDetailedInformation(
                        relatedImage = imageSinoPharm,
                        imageDescription = descSinoPharm,
                        screenHeaderTitle = titleSinoPharm,
                        screenTextDetailsInFull = detailsInFullSinoPharm,
                        txtAreasWhereVaccineIsApproved = areasVaccineApprovedSinoPharm,
                        imageAboutItsDistribution = imageSinoPharmDistributionMap,
                        imageMapDescription = descMapSinoPharm,
                        txtTitleToControversies = titleToControversiesSinoPharm,
                        screenTextControversies = controversiesSinoPharm,
                        linkForMoreInfo = webpageSinoPharm,
                        startPadding = 16,
                        endPadding= 16,
                        prosContentTxt = prosContentSinoPharm,
                        consContentTxt = consContentSinoPharm,
                        numberOfDosesNeededAndBoosterShots = NODNABSSinoPharm,
                        cardImageTextColorR = 234,
                        cardImageTextColorG = 191,
                        cardImageTextColorB = 61
                    )
                }
            }
        }
    }

}