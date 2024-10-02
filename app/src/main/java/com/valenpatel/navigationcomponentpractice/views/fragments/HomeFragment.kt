package com.valenpatel.navigationcomponentpractice.views.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.valenpatel.navigationcomponentpractice.R


class HomeFragment : Fragment(R.layout.fragment_home){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()



        view.findViewById<Button>(R.id.viewBalanceBtnHomeFragment).setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment()
            navController.navigate(action)
        }

        view.findViewById<Button>(R.id.viewTransactionsBtnHomeFragment).setOnClickListener {
            val navOption = NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build()
            navController.navigate(R.id.action_homeFragment_to_viewTransactionFragment,null,navOption)
        }

        view.findViewById<Button>(R.id.sendMoneyBtnHomeFragment).setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_chooseRecieverFragment)
        }

    }
}
