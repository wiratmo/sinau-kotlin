package com.application.latihan1.ui.auth

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

import com.application.latihan1.R
import com.application.latihan1.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    private var _binding: FragmentDashboardBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root


        binding.signIn.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_nav_dashboard_to_nav_auth_signin2)
        })
        
        binding.signUp.setOnClickListener(View.OnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_nav_dashboard_to_nav_auth_signup)
        })
        return root

    }
}