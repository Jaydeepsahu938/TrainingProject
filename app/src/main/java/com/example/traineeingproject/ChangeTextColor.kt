package com.example.traineeingproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.traineeingproject.R.id
import org.w3c.dom.Text
import kotlin.random.nextInt
import kotlin.random.Random as Random

class ChangeTextColor : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_text_color)

        val btn=findViewById<Button>(R.id.btnctc)
        val txt=findViewById<TextView>(R.id.tv)
        btn.setOnClickListener(){
            val num= Random.nextInt(6)+1
            val colorchange=when(num){

                1->R.color.clr1
                2->R.color.clr2
                3->R.color.clr3
                4->R.color.clr4
                5->R.color.clr5
                else -> R.color.clr6
            }
          txt.setTextColor(resources.getColor(colorchange))
        }
    }
}