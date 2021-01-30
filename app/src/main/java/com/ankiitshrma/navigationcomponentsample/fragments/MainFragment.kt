package com.ankiitshrma.navigationcomponentsample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.ankiitshrma.navigationcomponentsample.R


class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        val btn = view.findViewById<Button>(R.id.btn_go)

        btn.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_midFragment)
        }

    }

}