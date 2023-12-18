package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail14Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail14)

        val btn_back14 = findViewById<Button>(R.id.btn_back14)

        btn_back14.setOnClickListener {
            val intent = Intent(this, List3Activity::class.java)
            startActivity(intent)
        }
    }
}