package com.example.traineeingproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.util.Dictionary

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
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
        val btn_NumberListApp = findViewById<Button>(R.id.btn9)
        btn_NumberListApp.setOnClickListener {
            val Intent = Intent(this, NumberListApp::class.java)
            startActivity(Intent)
        }
        val btn_MultiViewTypeRecyclerView= findViewById<Button>(R.id.btn10)
        btn_MultiViewTypeRecyclerView.setOnClickListener {
            val Intent = Intent(this,NumberListUsingRecyclerView::class.java)
            startActivity(Intent)
        }
        val btn_DictionaryApp = findViewById<Button>(R.id.btn11)
        btn_DictionaryApp.setOnClickListener {
            val Intent = Intent(this, DictionaryApp::class.java)
            startActivity(Intent)
        }
        val btn_ALC = findViewById<Button>(R.id.btn12)
        btn_ALC.setOnClickListener {
            val Intent = Intent(this,LifeCycleAvt::class.java)
            startActivity(Intent)
        }
        val btn_hrv=findViewById<Button>(R.id.btn13)
        btn_hrv.setOnClickListener{
            val Intent = Intent(this,HorizontalRCV::class.java)
            startActivity(Intent) }
        val btn_mvrv=findViewById<Button>(R.id.btn14)
        btn_mvrv.setOnClickListener{
            val Intent = Intent(this,MultiViewRecyclerView::class.java)
            startActivity(Intent) }
    }

}