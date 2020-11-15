package com.example.udacodingweek2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.udacodingweek2.R
import com.example.udacodingweek2.model.Data


class ListViewWisata(private val context: Context,private val data: List<Data>?):BaseAdapter() {
    override fun getView(position: Int, contextview: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_item,parent,false)
        var foto = view.findViewById<ImageView>(R.id.profile_image)
        var nama = view.findViewById<TextView>(R.id.txtNama)
        var desk = view.findViewById<TextView>(R.id.txtDeskripsi)
        var item = data?.get(position)
        foto.setImageResource(item?.photo ?:0)
        nama.text =item?.nama
        desk.text = item?.detail
        return view
    }

    override fun getItem(position: Int): Any {
        return data?.get(position) ?:0
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
    }

    override fun getCount():Int = data?.size ?:0

}