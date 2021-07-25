package com.example.eventcademyui.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.eventcademyui.R
import com.example.eventcademyui.databinding.FragmentProfilBinding

class ProfilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentProfilBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_profil, container, false)

        binding.settingBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_profilFragment_to_settingsFragment)
        }

        binding.txtProfilName.setOnClickListener {
            it.findNavController().navigate(R.id.action_profilFragment_to_detailFragment)
        }
        return binding.root
    }
}