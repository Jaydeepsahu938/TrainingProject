package com.example.traineeingproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import com.example.traineeingproject.databinding.ActivityBmiappBinding
import com.example.traineeingproject.databinding.ActivityLifeCycleBinding

class LifeCycleAvt : AppCompatActivity() {
    val TAG="Main Activity 1"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        Log.d(TAG,"onCreate")

        val button=findViewById<Button>(R.id.btn_nextActivity)
        button.setOnClickListener{
            val Intent=Intent(this,nextActivity::class.java)
            startActivity(Intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }


}

