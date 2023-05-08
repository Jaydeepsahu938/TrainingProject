package com.example.traineeingproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment

class nextActivity : AppCompatActivity() {
    val TAG = "Main Activity 2"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val btn_frag = findViewById<Button>(R.id.btn_fragment)
        btn_frag.setOnClickListener {
            val myFragment = MyFragment()
            val fragment: Fragment?=

            supportFragmentManager.findFragmentByTag(MyFragment::class.java.simpleName)
            if (fragment !is MyFragment) {
                supportFragmentManager.beginTransaction().add(
                    R.id.Linear_fragmentContainer,
                    myFragment,
                    MyFragment::class.java.simpleName
                ).commit()
            }

        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }


}