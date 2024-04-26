package com.application.latihan1

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.application.latihan1.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

    private fun initActionBar(title:String){
        setSupportActionBar(findViewById(R.id.my_toolbar))

        val actionBar = supportActionBar

        actionBar!!.title = title

        actionBar.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("passing", "masuk di auth activity")
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initActionBar(" Sign In")

    }

}