package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)

        val backeditprofile = findViewById<ImageView>(R.id.backeditprofile)

        backeditprofile.setOnClickListener{
            val intent = Intent (this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val btn_done = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btn_done)

        btn_done.setOnClickListener{
            val intent = Intent (this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}