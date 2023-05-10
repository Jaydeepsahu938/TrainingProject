package com.example.traineeingproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AlertDialog.Builder
import com.example.traineeingproject.databinding.ActivityDailogsBinding

class Dailogs : AppCompatActivity() {
    private val dBinding by lazy {
        ActivityDailogsBinding.inflate(LayoutInflater.from(this))
    }
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(dBinding.root)

      var btn_exit=dBinding.btnExit
      var builder: Builder = Builder(this)
        btn_exit.setOnClickListener{
            builder.setTitle("Alert!")
                .setMessage("Do you want to exit ?")
                .setCancelable(true)
                .setPositiveButton("Yes"){dialogInterface,it->
                    finish()
                }
                .setNegativeButton("No"){dialogInterface,it->
                    dialogInterface.cancel()
                }
                .setNeutralButton("Help"){dialogInterface,it->
                    Toast.makeText(this,"Help Clicked",Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        var btn_rate=dBinding.btnRate
        btn_rate.setOnClickListener{
            val dailog=CustomDialogFragment()

            dailog.show(supportFragmentManager,"customDialog")
        }
    }
}