package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail6)

        val btn_back6 = findViewById<Button>(R.id.btn_back6)

        btn_back6.setOnClickListener {
            val intent = Intent(this, List1Activity::class.java)
            startActivity(intent)
        }
    }
}