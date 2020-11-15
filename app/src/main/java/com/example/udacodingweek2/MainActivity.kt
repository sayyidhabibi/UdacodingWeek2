package com.example.udacodingweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnumur = findViewById<Button>(R.id.btn_Hitungumur)
        val btnberatbadan = findViewById<Button>(R.id.btn_Beratbadan)
        val btnwisata = findViewById<Button>(R.id.btn_Wisata)
        val btnmakanan = findViewById<Button>(R.id.btn_makanan)

        btnumur.setOnClickListener {
            val intent = Intent(this, HitungUmurActivity::class.java)
            startActivity(intent)

        }
        btnberatbadan.setOnClickListener {
            val intent = Intent(this, HitungBeratBadanActivity::class.java)
            startActivity(intent)

        }
        btn_Login.setOnClickListener {
            val intent = Intent(this,LoginSederhanaActivity::class.java)
            startActivity(intent)

        }
        btnmakanan.setOnClickListener {
            val intent = Intent(this, MakananActivity::class.java)
            startActivity(intent)

        }
        btnwisata.setOnClickListener {
            val intent = Intent(this, WisataActivity::class.java)
            startActivity(intent)

        }
    }
}