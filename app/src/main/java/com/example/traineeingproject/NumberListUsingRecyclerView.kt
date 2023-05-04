package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NumberListUsingRecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_number_list_using_recycler_view)

        var list:ArrayList<Data> = gererateData()
        var recyclerView=findViewById<RecyclerView>(R.id.recyclerview)
        var adapter:RecyclerviewItemAdapter= RecyclerviewItemAdapter(list,baseContext)
        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(baseContext)

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