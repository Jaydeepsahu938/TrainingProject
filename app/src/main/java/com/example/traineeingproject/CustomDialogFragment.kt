package com.example.traineeingproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class CustomDialogFragment : DialogFragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView :View=inflater.inflate(R.layout.fragment_custom_dialog,container,false)
        var btn_cancle=rootView.findViewById<View>(R.id.cancelbtn)
        btn_cancle.setOnClickListener{
          dismiss()
        }
        var btn_submit=rootView.findViewById<View>(R.id.submitbtn)
        btn_submit.setOnClickListener{

            val selectedId=rootView.findViewById<RadioGroup>(R.id.rg_rating_radiogroup).checkedRadioButtonId
            val radio=rootView.findViewById<RadioButton>(selectedId)

            var ratingResult=radio.text.toString()

            Toast.makeText(context,"You rated: $ratingResult",Toast.LENGTH_SHORT).show()
            dismiss()
        }
        return rootView
    }
}