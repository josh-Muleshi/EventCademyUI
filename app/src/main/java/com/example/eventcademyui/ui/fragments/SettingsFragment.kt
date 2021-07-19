package com.example.eventcademyui.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.eventcademyui.R

class SettingsFragment : Fragment() {

    private lateinit var settingBtn : ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.fragment_settings, container, false)
        settingBtn = view.findViewById(R.id.setting_btn)

        settingBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_profilFragment_to_settingsFragment)
        }
        return view
    }

}