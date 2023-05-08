package com.example.traineeingproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.traineeingproject.databinding.ActivityBmiappBinding
import com.example.traineeingproject.databinding.ActivityExViewBindingBinding

class BMIApp : AppCompatActivity() {
    //private lateinit var mbinding: ActivityBmiappBinding
    private val mBinding by lazy {
        ActivityBmiappBinding.inflate(LayoutInflater.from(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mbinding = ActivityBmiappBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    @SuppressLint("SuspiciousIndentation")
    fun calculate(view: View) {
        var weight: Double = 0.0
        var height: Double = 0.0
        val myBMI: Float
        val Num_eighteen: Double = 18.5
        val Num_twentyfour: Double = 24.9
        val Num_nintynine: Double = 18.5
        val text:TextView=mBinding.bmiTextView

            val obj_weight = mBinding.weightTextView.text.toString()
            if (!TextUtils.isEmpty(obj_weight)) {
                weight = obj_weight.toDouble()
            }
           val obj_height = mBinding.heightTextView.text.toString()
                if(!TextUtils.isEmpty(obj_height)){
                    height=obj_height.toDouble()
                }



        myBMI = calculateBMI(weight, height)       //calculate BMI
        text.setText(myBMI.toString()).toString()
        if (myBMI < Num_eighteen) mBinding.imageView.setImageResource(R.drawable.underweight)
        else if (myBMI > Num_eighteen && myBMI < Num_twentyfour) mBinding.imageView.setImageResource(
            R.drawable.healthy
        )
        else if (myBMI > Num_twentyfour && myBMI < Num_nintynine) mBinding.imageView.setImageResource(
            R.drawable.overweight
        )
        else if (myBMI >= Num_nintynine) mBinding.imageView.setImageResource(R.drawable.obesity)

    }

    fun calculateBMI(weight: Double, height: Double): Float {
        return ((weight * 0.45) / ((height * 0.025) * (height * 0.025))).toFloat()
    }
}



