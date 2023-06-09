package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.traineeingproject.databinding.ActivityNumberListUsingRecyclerViewBinding

class NumberListUsingRecyclerView : AppCompatActivity() {
    private val nrBinding by lazy {
        ActivityNumberListUsingRecyclerViewBinding.inflate(LayoutInflater.from(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(nrBinding.root)

        var list: ArrayList<Data> = gererateData()
        var recyclerView = nrBinding.recyclerview
        var adapter: RecyclerviewItemAdapter = RecyclerviewItemAdapter(list,this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

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