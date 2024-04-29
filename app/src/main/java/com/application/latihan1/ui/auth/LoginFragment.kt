package com.application.latihan1.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.application.latihan1.databinding.FragmentLoginBinding

class LoginFragment : Fragment(){

    private var _binding : FragmentLoginBinding? = null

    val binding get() = _binding!!

    fun initComponent(title:String){
        (activity as AppCompatActivity).setSupportActionBar(binding.myToolbar)
        val actionBar = (activity as AppCompatActivity).supportActionBar
        actionBar!!.title = title

        actionBar.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val root:View = binding.root

        initComponent("Sign in")
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }





}