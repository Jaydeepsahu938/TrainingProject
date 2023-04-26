package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.traineeingproject.databinding.ActivityBmiappBinding
import com.example.traineeingproject.databinding.ActivityExViewBindingBinding

class BMIApp : AppCompatActivity() {
    private lateinit var binding: ActivityBmiappBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiappBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun calculate(view: View) {
        val weight: Double
        val height: Double
        val myBMI: Float

        weight = binding.weightTextView.text.toString().toDouble()
        height = binding.heightTextView.text.toString().toDouble()

        myBMI = calculateBMI(weight, height)
        binding.bmiTextView.text = myBMI.toString()

        if (myBMI < 18.5) binding.imageView.setImageResource(R.drawable.underweight)
        else if (myBMI > 18.5 && myBMI < 24.9) binding.imageView.setImageResource(R.drawable.healthy)
        else if (myBMI > 24.9 && myBMI < 29.9) binding.imageView.setImageResource(R.drawable.overweight)
        else binding.imageView.setImageResource(R.drawable.obesity)

    }

    fun calculateBMI(weight: Double, height: Double): Float {
        var myBMI: Float
        myBMI = ((weight * 0.45) / ((height * 0.025) * (height * 0.025))).toFloat()
        return myBMI
    }
}