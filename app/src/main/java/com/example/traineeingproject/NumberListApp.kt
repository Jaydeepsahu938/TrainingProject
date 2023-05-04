package com.example.traineeingproject

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.core.content.getSystemService
import com.example.traineeingproject.databinding.ActivityNumberListAppBinding
import android.content.Context as Context1

class NumberListApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_list_app)
        var listView:ListView
       // val arrayOfStrings= arrayOf<String>("zero","one","two","three","four","five","six","seven","eight","nine","ten")
        //val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayOfStrings)
       // binding.listView.adapter=adapter
        var arrayList=ArrayList<Data>()
        var data=Data("zero","audio")
        arrayList.add(Data("zero","zeroaudio"))
        arrayList.add(Data("one","oneaudio"))
        arrayList.add(Data("two","twoaudio"))
        arrayList.add(Data("three","threeaudio"))
        arrayList.add(Data("four","fouraudio"))
        arrayList.add(Data("five","fiveaudio"))
        arrayList.add(Data("six","sixaudio"))
        arrayList.add(Data("seven","sevenaudio"))
        arrayList.add(Data("eight","eightaudio"))
        arrayList.add(Data("nine","nineaudio"))
        arrayList.add(Data("ten","tenaudio"))
        listView=findViewById(R.id.list_view)
        var adapter:NumberAdapter=NumberAdapter(this,arrayList)
        listView.adapter=adapter


    }
}
class NumberAdapter:BaseAdapter{

    var arrayList= ArrayList<Data>()
    var context: Context1?

    constructor(context: Context1, arrayList:ArrayList<Data>){
        this.arrayList=arrayList
        this.context=context
    }
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    @SuppressLint("SuspiciousIndentation")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
      var view:View
      val inflater:LayoutInflater= context?.getSystemService(Context1.LAYOUT_INFLATER_SERVICE) as LayoutInflater
      val holder:ViewHolder

        if(convertView==null)
        {
            view=inflater.inflate(R.layout.list_item,parent,false)
            holder=ViewHolder()
            holder.text=view.findViewById(R.id.tv_list_item)
            holder.image=view.findViewById(R.id.im_list_item)
            view.tag=holder
        }else
        {
              view=convertView
              holder=convertView.tag as ViewHolder
        }
        val textValue=holder.text
        textValue?.text=arrayList[position].textNumber

        val imageValue=holder.image
        var mediaplayer:MediaPlayer?
        imageValue?.setOnClickListener{
            mediaplayer=MediaPlayer.create(context,context?.resources!!.getIdentifier(arrayList[position].audioNumber,"raw",context?.packageName))
            mediaplayer?.start()
        }
        return view
    }

    private class ViewHolder{
        var text:TextView?=null
        var image:ImageView?=null
    }

}