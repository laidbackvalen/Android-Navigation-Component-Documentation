package com.valenpatel.navigationcomponentpractice.views.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.valenpatel.navigationcomponentpractice.R


class ChooseRecieverFragment : Fragment(R.layout.fragment_choose_reciever) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        view.findViewById<Button>(R.id.next_Button).setOnClickListener {
//
//            val navOption = NavOptions.Builder()
//                .setEnterAnim(R.anim.slide_in_right)
//                .setExitAnim(R.anim.slide_out_left)
//                .setPopEnterAnim(R.anim.slide_in_left)
//                .setPopExitAnim(R.anim.slide_out_right)
//                .build()
//
//            val recieverName = view.findViewById<EditText>(R.id.recieverNameEdTxt).text.toString()
//            if (recieverName.isEmpty()) {
//                view.findViewById<EditText>(R.id.recieverNameEdTxt).setError("Enter Reciever Name")
//            } else {
//                val args = Bundle()
//                args.putString("recieverName", recieverName)
//                findNavController().navigate(R.id.sendCashFragment, args, navOption)
//            }
//        }

        view.findViewById<Button>(R.id.next_Button).setOnClickListener {
            val recieverName = view.findViewById<EditText>(R.id.recieverNameEdTxt).text.toString()
            val recieverAmount = view.findViewById<EditText>(R.id.recieverAmtEdTxt).text.toString()

            val action = ChooseRecieverFragmentDirections.actionChooseRecieverFragmentToSendCashFragment(recieverName, recieverAmount.toLong())
            findNavController().navigate(action)
        }

    }
}