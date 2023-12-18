package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail10)

        val btn_back10 = findViewById<Button>(R.id.btn_back10)

        btn_back10.setOnClickListener {
            val intent = Intent(this, List2Activity::class.java)
            startActivity(intent)
        }
    }
}