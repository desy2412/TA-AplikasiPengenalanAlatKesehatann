package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail8Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail8)

        val btn_back8 = findViewById<Button>(R.id.btn_back8)

        btn_back8.setOnClickListener {
            val intent = Intent(this, List2Activity::class.java)
            startActivity(intent)
        }
    }
}