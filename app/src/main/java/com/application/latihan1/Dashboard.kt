package com.application.latihan1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Dashboard: AppCompatActivity() {

    private lateinit var sign_in: Button
    private lateinit var sign_up: Button

    fun initComponen(){
        sign_in= findViewById(R.id.sign_in)
        sign_up = findViewById(R.id.sign_up)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        Log.e("passing", "masuk di main")
        initComponen()

        sign_in.setOnClickListener( View.OnClickListener {
            val activity_signin = Intent(this, AuthActivity::class.java)
            startActivity(activity_signin)
        })

        sign_up.setOnClickListener( View.OnClickListener {
            val activity_signin = Intent(this, AuthActivity::class.java)
            startActivity(activity_signin)
        })

    }
}