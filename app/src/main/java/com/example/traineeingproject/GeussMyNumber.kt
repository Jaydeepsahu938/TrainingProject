package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.compose.runtime.snapshots.SnapshotApplyResult
import com.example.traineeingproject.databinding.ActivityGeussMyNumberBinding

class GeussMyNumber : AppCompatActivity() {

    private lateinit var binding: ActivityGeussMyNumberBinding
    var number: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding =
            ActivityGeussMyNumberBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvQuestion.text = resources.getString(R.string.first_question)
        number = 5;
    }

    fun arrowDownbtn(view: View?) {
        if (number == 5) {
            number = 3
            binding.tvQuestion.text = resources.getString(R.string.second_question)

        }
        else if(number==3)
        {
            binding.tvQuestion.text=resources.getString(R.string.third_question)
            number=2
        }
        else if(number==2)
        {
            binding.tvQuestion.text=resources.getString(R.string.fourth_question)
            number=1
        }
        else if(number==7)
        {
            binding.tvQuestion.text=resources.getString(R.string.ninth_question)
            number=6
        }
        else if(number==9)
        {
            binding.tvQuestion.text=resources.getString(R.string.eight_question)
            number=8
        }
    }

    fun Successbtn(view: View) {
        binding.tvSuccess.visibility = View.VISIBLE
        binding.tvQuestion.visibility=View.INVISIBLE
        binding.tvTargetNumber.visibility=View.VISIBLE
        binding.tvTargetNumber.text= String.format(resources.getString(R.string.target_number),number)
    }

    fun arrowUpbtn(view: View) {
        if (number == 5) {
            number = 7
            binding.tvQuestion.text = resources.getString(R.string.sixth_question)

        }
        else if(number==7)
        {
            binding.tvQuestion.text=resources.getString(R.string.seventh_question)
            number=9
        }
        else if(number==9)
        {
            binding.tvQuestion.text=resources.getString(R.string.tenth_question)
            number=10
        }
        else if(number==3)
        {
            binding.tvQuestion.text=resources.getString(R.string.fifth_question)
            number=4
        }

    }

    fun resetbtn(view: View) {
        binding.tvQuestion.visibility=View.VISIBLE
        binding.tvQuestion.text = resources.getString(R.string.first_question)
        number = 5
        binding.tvSuccess.visibility=View.INVISIBLE
        binding.tvTargetNumber.visibility=View.INVISIBLE
    }


}