package com.example.solutionapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.solutionapp.Circle
import com.example.solutionapp.R
import kotlinx.android.synthetic.main.row_tem.view.*
import java.util.Collections

class RecycleViewAdapter(val context: Context,val arrayList: ArrayList<Circle.model>):RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {
    class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_tem,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
arrayList.sortByDescending {
    it.area

}

        holder.itemView.name.text = "${arrayList[position].name} id: ${arrayList[position].id}"
         holder.itemView.area.text= "${arrayList[position].area.toString()} &"
        holder.itemView.perimeter.text = arrayList[position].perimeter.toString()



    }

    override fun getItemCount(): Int {
     return arrayList.size
    }
}