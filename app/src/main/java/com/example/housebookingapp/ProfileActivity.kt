package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val backeditprofile = findViewById<ImageView>(R.id.backeditprofile)

        backeditprofile.setOnClickListener{
            val intent = Intent (this, HomeActivity::class.java)
            startActivity(intent)
        }

        val btnEditProfile = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnEditProfile)

        btnEditProfile.setOnClickListener{
            val intent = Intent (this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        val btnLogout = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnLogout)

        btnLogout.setOnClickListener{
            val intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}