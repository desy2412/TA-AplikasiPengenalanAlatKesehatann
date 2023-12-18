package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail7)

        val btn_back7 = findViewById<Button>(R.id.btn_back7)

        btn_back7.setOnClickListener {
            val intent = Intent(this, List1Activity::class.java)
            startActivity(intent)
        }
    }
}