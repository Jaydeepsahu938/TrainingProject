package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.traineeingproject.databinding.ActivityDefinationBinding
import com.example.traineeingproject.databinding.ActivityDictionaryAppBinding

class DictionaryApp : AppCompatActivity() {
    private val dBinding by lazy {
       ActivityDictionaryAppBinding.inflate(LayoutInflater.from(this))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(dBinding.root)
    }
}