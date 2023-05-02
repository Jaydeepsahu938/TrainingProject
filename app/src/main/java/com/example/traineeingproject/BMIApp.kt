package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.traineeingproject.databinding.ActivityBmiappBinding
import com.example.traineeingproject.databinding.ActivityExViewBindingBinding

class BMIApp : AppCompatActivity() {
    private lateinit var mbinding: ActivityBmiappBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityBmiappBinding.inflate(layoutInflater)
        setContentView(mbinding.root)
    }

    fun calculate(view: View) {
        var weight: Double = 0.0
        var height: Double = 0.0
        val myBMI: Float
        val Num_eighteen: Double = 18.5
        val Num_twentyfour: Double = 24.9
        val Num_nintynine: Double = 18.5


        try {
            weight = mbinding.weightTextView.text.toString().toDouble()
            height = mbinding.heightTextView.text.toString().toDouble()
        } catch (e: java.lang.NumberFormatException) {
            Toast.makeText(this, "Plz Fill Weight and Height", Toast.LENGTH_SHORT).show()
        }


        myBMI = calculateBMI(weight, height)       //calculate BMI
        if (myBMI < Num_eighteen) mbinding.imageView.setImageResource(R.drawable.underweight)
        else if (myBMI > Num_eighteen && myBMI < Num_twentyfour) mbinding.imageView.setImageResource(
            R.drawable.healthy
        )
        else if (myBMI > Num_twentyfour && myBMI < Num_nintynine) mbinding.imageView.setImageResource(
            R.drawable.overweight
        )
        else if (myBMI >= Num_nintynine) mbinding.imageView.setImageResource(R.drawable.obesity)

    }

    fun calculateBMI(weight: Double, height: Double): Float {
        return ((weight * 0.45) / ((height * 0.025) * (height * 0.025))).toFloat()
    }
}

