package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val menu1 = findViewById<CardView>(R.id.menu1)

        menu1.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        val menu2 = findViewById<CardView>(R.id.menu2)

        menu2.setOnClickListener{
            val intent = Intent(this, KategoriActivity::class.java)
            startActivity(intent)
        }
        val menu3 = findViewById<CardView>(R.id.menu3)

        menu3.setOnClickListener{
            val intent = Intent(this@HomeActivity, TentangActivity::class.java)
            startActivity(intent)
        }

    }
}