package com.example.traineeingproject

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RecyclerviewItemAdapter(private val itemList: ArrayList<Data>, val context: Context) :
    RecyclerView.Adapter<RecyclerviewItemAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_recyclerview, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentItem = itemList.get(position)
        holder.textview.setText(currentItem.textNumber)
        val imageValue = holder.audio
        var mediaplayer: MediaPlayer?
        imageValue?.setOnClickListener {
            mediaplayer = MediaPlayer.create(
                context,
                context?.resources!!.getIdentifier(
                    itemList[position].audioNumber,
                    "raw",
                    context?.packageName
                )
            )
            mediaplayer?.start()
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textview: TextView = itemView.findViewById(R.id.tv_list_item_rv)
        val audio: ImageView = itemView.findViewById(R.id.im_list_item_rv)
    }

}