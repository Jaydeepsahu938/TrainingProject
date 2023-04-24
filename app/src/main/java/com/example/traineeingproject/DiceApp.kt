package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class DiceApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_app)

        val rollbutton=findViewById<Button>(R.id.rollbtn)
        val firstdice=findViewById<ImageView>(R.id.first_dice)
        val seconddice=findViewById<ImageView>(R.id.second_dice)
        rollbutton.setOnClickListener(){
            val randomnumber1= Random().nextInt(6)+1
            val randomnumber2= Random().nextInt(6)+1
            val resourcenumber1=when(randomnumber1){
                1->R.drawable.dice1
                2->R.drawable.dice2
                3->R.drawable.dice3
                4->R.drawable.dice4
                5->R.drawable.dice5
                6->R.drawable.dice6
                else ->R.drawable.dice6
            }
            val resourcenumber2=when(randomnumber2){
                1->R.drawable.dice1
                2->R.drawable.dice2
                3->R.drawable.dice3
                4->R.drawable.dice4
                5->R.drawable.dice5
                6->R.drawable.dice6
                else ->R.drawable.dice6
            }

            firstdice.setImageResource(resourcenumber1)
            seconddice.setImageResource(resourcenumber2)
        }
    }
}