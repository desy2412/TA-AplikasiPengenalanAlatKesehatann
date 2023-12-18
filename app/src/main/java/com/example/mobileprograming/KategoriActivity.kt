package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class KategoriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        val diagnostik = findViewById<CardView>(R.id.diagnostik)

        diagnostik.setOnClickListener {
            val intent = Intent(this@KategoriActivity, ListActivity::class.java)
            startActivity(intent)

        val terapi = findViewById<CardView>(R.id.terapi)

            terapi.setOnClickListener {
                val intent = Intent(this@KategoriActivity, List1Activity::class.java)
                startActivity(intent)

        val labor = findViewById<CardView>(R.id.labor)

            labor.setOnClickListener {
                val intent = Intent(this@KategoriActivity, List2Activity::class.java)
                    startActivity(intent)

        val bedah = findViewById<CardView>(R.id.bedah)

            bedah.setOnClickListener {
                val intent = Intent(this@KategoriActivity, List3Activity::class.java)
                startActivity(intent)

        val btn_back = findViewById<Button>(R.id.btn_back)

                btn_back.setOnClickListener {
                    val intent = Intent(this@KategoriActivity, HomeActivity::class.java)
                    startActivity(intent)
                        }

                    }

                }
            }
        }
    }
}