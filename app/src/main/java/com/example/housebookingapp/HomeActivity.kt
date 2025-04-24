package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val housebtn = findViewById<LinearLayout>(R.id.housebtn)

        housebtn.setOnClickListener{
            val intent = Intent (this, HouseActivity::class.java)
            startActivity(intent)
        }

        val apartmentbtn = findViewById<LinearLayout>(R.id.apartmentbtn)

        apartmentbtn.setOnClickListener{
            val intent = Intent (this, ApartmentActivity::class.java)
            startActivity(intent)
        }

        val villabtn = findViewById<LinearLayout>(R.id.villabtn)

        villabtn.setOnClickListener{
            val intent = Intent (this, VillaActivity::class.java)
            startActivity(intent)
        }

        val image_profilpic = findViewById<ImageView>(R.id.image_profilpic)

        image_profilpic.setOnClickListener{
            val intent = Intent (this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val hhouse = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.hhouse)

        hhouse.setOnClickListener{
            val intent = Intent (this, HouseActivity::class.java)
            startActivity(intent)
        }

        val hapartment = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.hapartment)

        hapartment.setOnClickListener{
            val intent = Intent (this, ApartmentActivity::class.java)
            startActivity(intent)
        }


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navigationBar)

        bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(
                        Intent(
                            this@HomeActivity,
                            HomeActivity::class.java
                        )
                    )
                    return@OnItemSelectedListener true
                }
                R.id.search -> {
                    return@OnItemSelectedListener true
                }

                R.id.favorite -> {
                    startActivity(
                        Intent(
                            this@HomeActivity,
                            ProfileActivity::class.java
                        )
                    )
                    return@OnItemSelectedListener true
                }

                R.id.profile -> {
                    startActivity(
                        Intent(
                            this@HomeActivity,
                            ProfileActivity::class.java
                        )
                    )
                    return@OnItemSelectedListener true
                }
            }
            false
        })


    }
}