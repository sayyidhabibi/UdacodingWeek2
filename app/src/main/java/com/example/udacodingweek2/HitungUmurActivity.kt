package com.example.udacodingweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_hitung_umur.*
import java.util.*

class HitungUmurActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_umur)
        btn_hitungU.setOnClickListener {
            var tahunlahir = edt_tahun.text.toString()
            val tahunnow = Calendar.getInstance().get(Calendar.YEAR)
            var umur = 0
            if ( tahunlahir.toIntOrNull()!= null){
                umur =   tahunnow - tahunlahir.toInt()
                txt_umur.text = "$umur Tahun"
                when (umur){
                    1 -> {
                        Toast.makeText(this, "Masih Bayi", Toast.LENGTH_SHORT).show()
                    }
                    in 2..10 -> {
                        Toast.makeText(this, "Masih Bocah", Toast.LENGTH_SHORT).show()
                    }
                    in 11..19 ->{
                        Toast.makeText(this, "Udh Mulai Idep", Toast.LENGTH_SHORT).show()
                    }
                    in 20..60 -> {
                        Toast.makeText(this, "Ciee Udh Dewasa", Toast.LENGTH_SHORT).show()
                    }
                    else -> {
                        Toast.makeText(this, "AYOOO Persiapann ", Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(this, "UPSSSS", Toast.LENGTH_SHORT).show()
            }


        }
    }
}