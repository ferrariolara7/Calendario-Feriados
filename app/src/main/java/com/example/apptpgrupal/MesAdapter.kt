package com.example.apptpgrupal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MesAdapter(
    private val meses: List<String>,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<MesAdapter.MesViewHolder>() {

    class MesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvMes: TextView = itemView.findViewById(R.id.tvMes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_mes, parent, false)
        return MesViewHolder(view)
    }

    override fun getItemCount(): Int = meses.size

    override fun onBindViewHolder(holder: MesViewHolder, position: Int) {
        val mes = meses[position]
        holder.tvMes.text = mes
        holder.itemView.setOnClickListener { onClick(mes) }
    }
}
