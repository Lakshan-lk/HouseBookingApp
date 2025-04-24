package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ApartmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_apartment)

        val bapartment = findViewById<ImageView>(R.id.bapartment)

        bapartment.setOnClickListener{
            val intent = Intent (this, HomeActivity::class.java)
            startActivity(intent)
        }





    }
}