package com.valenpatel.navigationcomponentpractice.views.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.valenpatel.navigationcomponentpractice.R


class SendCashFragment : Fragment(R.layout.fragment_send_cash){

    private val args : SendCashFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recieverName = args.recieverName
        val amount = args.amount

        view.findViewById<TextView>(R.id.recieverNameTxt).text = "Send Cash to : $recieverName"
        view.findViewById<TextView>(R.id.amountEditTxtSendCash).text = "Rs. $amount"
    }
}
