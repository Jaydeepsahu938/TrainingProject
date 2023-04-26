package com.example.traineeingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changetextcolorbtn = findViewById<Button>(R.id.btn1)
        changetextcolorbtn.setOnClickListener {
            val Intent = Intent(this, ChangeTextColor::class.java)
            startActivity(Intent)
        }

        val composingmail = findViewById<Button>(R.id.btn2)
        composingmail.setOnClickListener {
            val Intent = Intent(this, ComposingMail::class.java)
            startActivity(Intent)
        }

        val diceapp = findViewById<Button>(R.id.btn3)
        diceapp.setOnClickListener {
            val Intent = Intent(this, DiceApp::class.java)
            startActivity(Intent)
        }

        val calculatorbtn = findViewById<Button>(R.id.btn4)
        calculatorbtn.setOnClickListener {
            val Intent = Intent(this, Calculator::class.java)
            startActivity(Intent)
        }
        val btn_Mail_jpc = findViewById<Button>(R.id.btn5)
        btn_Mail_jpc.setOnClickListener {
            val Intent = Intent(this, MailUsingJetpackCompose::class.java)
            startActivity(Intent)
        }
        val btn_ViewBinding = findViewById<Button>(R.id.btn6)
        btn_ViewBinding.setOnClickListener {
            val Intent = Intent(this, ExViewBinding::class.java)
            startActivity(Intent)
        }
        val btn_GuessMyNUmber = findViewById<Button>(R.id.btn7)
        btn_GuessMyNUmber.setOnClickListener {
            val Intent = Intent(this,GeussMyNumber::class.java)
            startActivity(Intent)
        }
        val btn_BMIapp = findViewById<Button>(R.id.btn8)
        btn_BMIapp.setOnClickListener {
            val Intent = Intent(this, BMIApp::class.java)
            startActivity(Intent)
        }
    }
}