package com.ankiitshrma.navigationcomponentsample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.ankiitshrma.navigationcomponentsample.R

class FinalFragment : Fragment(R.layout.fragment_final) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        val btn = view.findViewById<Button>(R.id.btn_exit)

        btn.setOnClickListener {

            val navOptions = NavOptions.Builder().setPopUpTo(R.id.mainFragment, true).build()
            navController.navigate(R.id.action_finalFragment_to_mainFragment, null, navOptions)

        }

    }

}