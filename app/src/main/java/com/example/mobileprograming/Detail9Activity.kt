package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail9)

        val btn_back9 = findViewById<Button>(R.id.btn_back9)

        btn_back9.setOnClickListener {
            val intent = Intent(this, List2Activity::class.java)
            startActivity(intent)
        }
    }
}