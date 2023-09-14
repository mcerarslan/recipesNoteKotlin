package com.mcerarslan.yemektariflerikotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycle_row.view.*

class ListeRecycleAdapter(val yemekListesi: ArrayList<String>, val idListesi: ArrayList<Int>) : RecyclerView.Adapter<ListeRecycleAdapter.YemekHolder>(){

    class YemekHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YemekHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycle_row,parent,false)
        return YemekHolder(view)
    }
    override fun getItemCount(): Int {
        return yemekListesi.size
    }
    override fun onBindViewHolder(holder: YemekHolder, position: Int) {
        holder.itemView.recycleViewText.text = yemekListesi[position]
        holder.itemView.setOnClickListener{
            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment("reyclerdangeldim",idListesi[position])
            Navigation.findNavController(it).navigate(action)
        }
    }


}