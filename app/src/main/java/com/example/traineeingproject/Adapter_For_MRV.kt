package com.example.traineeingproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.contracts.Returns

 class Adapter_For_MRV(context: Context, list: ArrayList<Data_for_MRV>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val VIEW_TYPE_ONE = 1
        const val VIEW_TYPE_TWO = 2
    }

    private val context: Context = context
    var list: ArrayList<Data_for_MRV> = list

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        if (viewType == VIEW_TYPE_ONE) {
            return View1ViewHolder(
                LayoutInflater.from(context).inflate(R.layout.item_view_1, parent, false)
            )
        }
        return View2ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_view_2, parent, false)
        )
    }

     override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
         if(list[position].viewType== VIEW_TYPE_ONE) {
             (holder as View1ViewHolder).bind(position)
         }
         else{
             (holder as View2ViewHolder).bind(position)
         }
     }

     override fun getItemCount(): Int {
        return list.size
    }


    private inner class View1ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var message: TextView = itemView.findViewById(R.id.tv_mrv1)
        fun bind(position: Int) {
            val recyclerViewModel = list[position]
            message.text = recyclerViewModel.textData
        }
    }

    private inner class View2ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var message: TextView = itemView.findViewById(R.id.tV_mrv2)
        fun bind(position: Int) {
            val recyclerViewModel = list[position]
            message.text = recyclerViewModel.textData
        }
    }
    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }
}