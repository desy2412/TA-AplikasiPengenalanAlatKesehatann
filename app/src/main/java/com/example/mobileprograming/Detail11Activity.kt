package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail11Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail11)

        val btn_back11 = findViewById<Button>(R.id.btn_back11)

        btn_back11.setOnClickListener {
            val intent = Intent(this, List2Activity::class.java)
            startActivity(intent)
        }
    }
}