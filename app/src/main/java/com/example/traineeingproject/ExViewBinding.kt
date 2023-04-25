package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.traineeingproject.databinding.ActivityExViewBindingBinding
import com.example.traineeingproject.databinding.ActivityMainBinding
import java.util.zip.Inflater

class ExViewBinding : AppCompatActivity() {

    private lateinit var binding: ActivityExViewBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityExViewBindingBinding =
            ActivityExViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener {

            binding.ivImage.setImageResource(R.drawable.img)
            binding.tvViewBinding.setText("View Binding Features in Android")
        }

    }
}