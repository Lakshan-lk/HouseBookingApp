package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboardingscreen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboardingscreen2)

        val btn_next2 = findViewById<TextView>(R.id.btn_next2)

        btn_next2.setOnClickListener{
            val intent = Intent (this, Onboardingscreen3Activity::class.java)
            startActivity(intent)
        }
    }
}