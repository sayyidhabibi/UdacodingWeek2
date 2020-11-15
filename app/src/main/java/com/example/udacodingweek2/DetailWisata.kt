package com.example.udacodingweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_wisata.*

class DetailWisata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_wisata)
        var judul = intent.getStringExtra("jdl")
        var img = intent.getIntExtra("img",0)
        var desk = intent.getStringExtra("desk")
        detailimg.setImageResource(img)
        txtdetailwisata.text = judul
        detaildesk.text = desk
    }
    }