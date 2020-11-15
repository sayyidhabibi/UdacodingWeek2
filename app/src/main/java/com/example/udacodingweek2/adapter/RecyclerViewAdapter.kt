package com.example.udacodingweek2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.udacodingweek2.DetailMakananActivity
import com.example.udacodingweek2.R
import com.example.udacodingweek2.model.Data

class RecyclerViewAdapter(
    private val context: Context,
    private var data: List<Data>,
    private val itemclick: OnClickListener
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        var photo = view.findViewById<ImageView>(R.id.profile_image)
        var nama = view.findViewById<TextView>(R.id.txtNama)
        var desk = view.findViewById<TextView>(R.id.txtDeskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        val holder = ViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int = data.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //mengambil data
        val item = data.get(position)
        holder.nama.text = item.nama
        holder.desk.text = item.detail
        Glide.with(holder.itemView).load(item.photo).into(holder.photo)
        //action klik
        holder.itemView.setOnClickListener {
            itemclick.showData(item)
        }
    }
    interface OnClickListener{
        fun showData(item: Data)
    }

}