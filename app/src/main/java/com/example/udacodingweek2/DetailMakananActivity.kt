package com.example.udacodingweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_makanan.*
import kotlinx.android.synthetic.main.activity_detail_wisata.*
import kotlinx.android.synthetic.main.activity_detail_wisata.detaildesk
import kotlinx.android.synthetic.main.activity_detail_wisata.detailimg

class DetailMakananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan)
        var judul = intent.getStringExtra("jdl")
        var img = intent.getIntExtra("photo",0)
        var desk = intent.getStringExtra("desk")
        detailimg.setImageResource(img)
        txtjudulmakanan.text = judul
        detaildeskmakanan.text = desk
    }
}