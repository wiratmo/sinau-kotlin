package com.application.latihan1


import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.application.latihan1.databinding.DashboardBinding

class Dashboard: AppCompatActivity() {

    private lateinit var binding : DashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DashboardBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val navController = findNavController(R.id.nav_fragment_main)

    }
}