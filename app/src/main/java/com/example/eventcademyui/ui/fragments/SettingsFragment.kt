package com.example.eventcademyui.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.eventcademyui.R
import com.example.eventcademyui.databinding.FragmentFavoriteBinding
import com.example.eventcademyui.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        val binding : FragmentSettingsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings, container, false)

        return binding.root
    }

}