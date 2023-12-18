package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail12Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail12)

        val btn_back12 = findViewById<Button>(R.id.btn_back12)

        btn_back12.setOnClickListener {
            val intent = Intent(this, List3Activity::class.java)
            startActivity(intent)
        }
    }
}