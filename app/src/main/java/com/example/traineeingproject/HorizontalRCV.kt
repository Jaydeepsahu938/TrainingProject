package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.traineeingproject.databinding.ActivityBmiappBinding
import com.example.traineeingproject.databinding.ActivityHorizontalRcvBinding

class HorizontalRCV : AppCompatActivity() {
    private val hBinding by lazy {
      ActivityHorizontalRcvBinding.inflate(LayoutInflater.from(this))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(hBinding.root)

        var list: ArrayList<Data> = gererateData()
        var recyclerView = hBinding.horizontalRecyclerView
        var adapter: RecyclerviewItemAdapter = RecyclerviewItemAdapter(list, baseContext)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

    }
    private fun gererateData(): ArrayList<Data> {
        // ArrayList<Number> mList = new ArrayList();
        var mList: ArrayList<Data> = ArrayList()
        mList.add(Data("Zero", "zeroaudio"))
        mList.add(Data("One", "oneaudio"))
        mList.add(Data("Two", "twoaudio"))
        mList.add(Data("Three", "threeaudio"))
        mList.add(Data("Four", "fouraudio"))
        mList.add(Data("Five", "fiveaudio"))
        mList.add(Data("Six", "sixaudio"))
        mList.add(Data("Seven", "sevenaudio"))
        mList.add(Data("Eight", "eightaudio"))
        mList.add(Data("Nine", "nineaudio"))
        mList.add(Data("Ten", "tenaudio"))

        return mList
    }
}