package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class List3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list3)

        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            val intent = Intent(this, Detail12Activity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            val intent = Intent(this, Detail13Activity::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            val intent = Intent(this, Detail14Activity::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button4)

        button4.setOnClickListener {
            val intent = Intent(this, Detail15Activity::class.java)
            startActivity(intent)
        }

        val btn_back0 = findViewById<Button>(R.id.btn_back0)

        btn_back0.setOnClickListener {
            val intent = Intent(this, KategoriActivity::class.java)
            startActivity(intent)
        }
    }
}