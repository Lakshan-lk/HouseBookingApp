package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboardingscreen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboardingscreen3)

        val btn_next3 = findViewById<TextView>(R.id.btn_next3)

        btn_next3.setOnClickListener{
            val intent = Intent (this, SplashActivity::class.java)
            startActivity(intent)
        }
    }
}