package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        val btn_get_start = findViewById<Button>(R.id.btn_get_start)

        btn_get_start.setOnClickListener{
            val intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}