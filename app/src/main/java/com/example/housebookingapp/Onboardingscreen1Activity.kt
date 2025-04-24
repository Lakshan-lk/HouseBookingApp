package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboardingscreen1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboardingscreen1)

        val btn_next1 = findViewById<TextView>(R.id.btn_next1)

        btn_next1.setOnClickListener{
            val intent = Intent (this, Onboardingscreen2Activity::class.java)
            startActivity(intent)
        }

    }
}