package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class VillaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_villa)

        val bvilla = findViewById<ImageView>(R.id.bvilla)

        bvilla.setOnClickListener{
            val intent = Intent (this, HomeActivity::class.java)
            startActivity(intent)
        }


    }
}