package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail15Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail15)

        val btn_back15 = findViewById<Button>(R.id.btn_back15)

        btn_back15.setOnClickListener {
            val intent = Intent(this, List3Activity::class.java)
            startActivity(intent)
        }
    }
}