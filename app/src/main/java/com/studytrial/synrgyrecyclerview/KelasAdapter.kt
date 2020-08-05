package com.studytrial.synrgyrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*

class KelasAdapter(val listKelasData: ArrayList<KelasData>) :
    RecyclerView.Adapter<KelasAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    //Method yang menyiapkan layout baris
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KelasAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKelasData.size
    }

    override fun onBindViewHolder(holder: KelasAdapter.ViewHolder, position: Int) {
        holder.itemView.textView.setText(listKelasData[position].name)
        holder.itemView.textView2.setText(listKelasData[position].asal)
        holder.itemView.textView3.setText(listKelasData[position].jumlah.toString())
    }
}