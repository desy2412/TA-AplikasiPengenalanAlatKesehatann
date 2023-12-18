package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        val btn_back2 = findViewById<Button>(R.id.btn_back2)

        btn_back2.setOnClickListener {
            val intent = Intent(this, List1Activity::class.java)
            startActivity(intent)
        }
    }
}