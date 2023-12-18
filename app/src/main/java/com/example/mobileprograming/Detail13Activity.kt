package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail13Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail13)

        val btn_back13 = findViewById<Button>(R.id.btn_back13)

        btn_back13.setOnClickListener {
            val intent = Intent(this, List3Activity::class.java)
            startActivity(intent)
        }
    }
}