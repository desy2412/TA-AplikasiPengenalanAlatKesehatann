package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail5)

        val btn_back5 = findViewById<Button>(R.id.btn_back5)

        btn_back5.setOnClickListener {
            val intent = Intent(this, List1Activity::class.java)
            startActivity(intent)
        }
    }
}