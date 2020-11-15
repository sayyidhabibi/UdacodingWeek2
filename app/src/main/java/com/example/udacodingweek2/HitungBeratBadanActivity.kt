package com.example.udacodingweek2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_hitung_berat_badan.*
import java.util.*

class HitungBeratBadanActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_berat_badan)
        val genre = findViewById<Spinner>(R.id.kelamin)
        ArrayAdapter.createFromResource(
            this,
            R.array.name,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            genre.adapter = adapter

        }
        val spinner: Spinner = findViewById(R.id.kelamin)
        spinner.onItemSelectedListener = this
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        btnHitungBerat.setOnClickListener {
            var kelamin: String = p0?.getItemAtPosition(p2).toString()
            var tinggi = edtTinggiBadan.text.toString()
            var beratbadan: Double?
            if (tinggi.toIntOrNull() != null) {
                when (kelamin) {
                    "Laki Laki" -> {
                        beratbadan = (tinggi.toInt() - 100) - ((tinggi.toInt() - 100) * 0.1)
                        txtOutput.text = " BERAT BADAN IDEAL ANDA : $beratbadan KG"
                    }
                    "Perempuan" -> {
                        beratbadan = (tinggi.toInt() - 100) - ((tinggi.toInt() - 100) * 0.15)
                        txtOutput.text = "BERAT BADAN IDEAL ANDA : $beratbadan KG"
                    }
                }
            }else{
                Toast.makeText(this, "UPSSSSS", Toast.LENGTH_SHORT).show()
            }

        }

    }

}