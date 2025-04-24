package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        val text_haveacc = findViewById<TextView>(R.id.text_haveacc)

        text_haveacc.setOnClickListener{
            val intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }

        val btn_signup = findViewById<AppCompatButton>(R.id.btn_signup)

        btn_signup.setOnClickListener{
            val intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}