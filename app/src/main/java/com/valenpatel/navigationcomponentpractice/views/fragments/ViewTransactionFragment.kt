package com.valenpatel.navigationcomponentpractice.views.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.valenpatel.navigationcomponentpractice.R


class ViewTransactionFragment : Fragment(R.layout.fragment_view_transaction){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_test).setOnClickListener {
            val action = ViewTransactionFragmentDirections.actionViewTransactionFragmentToSendCashFragment("testName", 200) //amount default value is passed in xml "51"
            findNavController().navigate(action)

        }
    }
}