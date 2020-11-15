package com.example.udacodingweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.udacodingweek2.adapter.RecyclerViewAdapter
import com.example.udacodingweek2.model.Data
import kotlinx.android.synthetic.main.activity_makanan.*

class MakananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)
        val listMakanan = ArrayList<Data>()
        listMakanan.add(
            Data(
                "SOTO KUDUS",
                R.drawable.sotokudus,
                "Soto kudus adalah soto yang berasal dari Kudus. Soto kudus, hampir mirip dengan soto Lamongan, soto kudus berisi suwiran ayam dan taoge. Terkadang soto kudus juga menggunakan daging kerbau. Kuahnya lebih bening."
            )
        )
        listMakanan.add(
            Data(
                "ASINAN BETAWI",
                R.drawable.asinanbetawi,
                "Asinan adalah sejenis makanan yang dibuat dengan cara pengacaran, bahan yang diacarkan yaitu berbagai jenis sayuran dan buah-buahan. Di Indonesia, asinan menjadi salah satu hidangan khas seni kuliner Indonesia."
            )
        )
        listMakanan.add(
            Data(
                "TERAYAKI IKAN PATIN",
                R.drawable.tekoyakikanpatin,
                "Soto kudus adalah soto yang berasal dari Kudus. Soto kudus, hampir mirip dengan soto Lamongan, soto kudus berisi suwiran ayam dan taoge. Terkadang soto kudus juga menggunakan daging kerbau. Kuahnya lebih bening."
            )
        )
        listMakanan.add(
            Data(
                "KERAK TELOR",
                R.drawable.keraktelor,
                "Kerak telur adalah makanan asli daerah Jakarta, dengan bahan-bahan beras ketan putih, telur ayam atau bebek, ebi yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir."
            )
        )
        listmakanan.adapter = RecyclerViewAdapter(this,listMakanan, object : RecyclerViewAdapter.OnClickListener{
            override fun showData(item: Data) {
                val intent = Intent(this@MakananActivity,DetailMakananActivity::class.java)
                intent.putExtra("jdl", item.nama)
                intent.putExtra("desk", item.detail)
                intent.putExtra("photo", item.photo)
                startActivity(intent)
            }

        })
    }
}