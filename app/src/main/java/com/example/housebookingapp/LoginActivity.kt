package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)



        val btn_login = findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener{
            val intent = Intent (this, HomeActivity::class.java)
            startActivity(intent)
        }

        val text_noacc = findViewById<TextView>(R.id.text_noacc)

        text_noacc.setOnClickListener{
            val intent = Intent (this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}