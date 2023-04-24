package com.example.traineeingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changetextcolorbtn =findViewById<Button>(R.id.btn1)
        changetextcolorbtn.setOnClickListener{

            val Intent=Intent(this,ChangeTextColor::class.java)
            startActivity(Intent)

        }

        val composingmail =findViewById<Button>(R.id.btn2)
        composingmail.setOnClickListener{

            val Intent=Intent(this,ComposingMail::class.java)
            startActivity(Intent)

        }

        val diceapp =findViewById<Button>(R.id.btn3)
        diceapp.setOnClickListener {

            val Intent = Intent(this, DiceApp::class.java)
            startActivity(Intent)
        }

            val calculatorbtn =findViewById<Button>(R.id.btn4)
            calculatorbtn.setOnClickListener{
                val Intent=Intent(this,Calculator::class.java)
                startActivity(Intent)

        }
    }
}