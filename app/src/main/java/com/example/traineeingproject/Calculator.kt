package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import java.sql.Types.NULL

class Calculator : AppCompatActivity() {

    var number:String=" "
    var numberOne:Float=0.0F
    var numberTwo:Float=0.0F
    var isAddition:Boolean=false
    var isSubtraction:Boolean=false
    var isDivision:Boolean=false
    var isMultiplication:Boolean=false
    var isDot=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
    }
    fun operationFunction(view: View){
       var editText:EditText=findViewById(R.id.edt_clc)
        when(view.id)
        {
            R.id.button_one->{
                number+="1"
                editText?.setText(number)}
            R.id.button_two ->{
                number+="2"
                editText?.setText(number)}
            R.id.button_three->{
                number+="3"
                editText?.setText(number)}
            R.id.button_four->{
                number+="4"
                editText?.setText(number)}
            R.id.button_five->{
            number+="5"
            editText?.setText(number)}
            R.id.button_six->{
                number+="6"
                editText?.setText(number)}
            R.id.button_seven->{
                number+="7"
                editText?.setText(number)}
            R.id.button_eight->{
                number+="8"
                editText?.setText(number)}
            R.id.button_nine->{
                number+="9"
                editText?.setText(number)}
            R.id.button_zero->{
                number+="0"
                editText?.setText(number)}
            R.id.button_dot->{
                if(isDot==false) {
                    number += "."
                    editText?.setText(number)
                    isDot=true
                }
                else
                {
                    Toast.makeText(this,"Invalide",Toast.LENGTH_SHORT).show()
                }
                }
            R.id.button_clear->{
                isDot=false
                number=""
                editText?.setText("")}
            R.id.button_add->{
                isDot=false
                if(number.isNullOrBlank())
                {
                    number=""
                }
                else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isAddition=true
                    number=""
                }
            }
            R.id.button_sub->{
                isDot=false
                if(number.isNullOrBlank())
                {
                    number=""
                }
                else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isSubtraction=true
                    number=""
                }

            }
            R.id.button_divide->{
                isDot=false
                if(number.isNullOrBlank())
                {
                    number=""
                }
                else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isDivision=true
                    number=""
                }
            }

            R.id.button_equle->{
                if(isAddition==true)
                {
                    numberTwo=number.toFloat()
                    number= (numberOne+numberTwo).toString()
                    editText?.setText(number)
                    numberOne=0.0F
                    numberTwo=0.0F
                    isAddition=false
                }
                if(isSubtraction==true)
                {
                    numberTwo=number.toFloat()
                    number= (numberOne-numberTwo).toString()
                    editText?.setText(number)
                    numberOne=0.0F
                    numberTwo=0.0F
                    isSubtraction=false
                }
                if(isDivision==true)
                {
                    numberTwo=number.toFloat()
                    number= (numberOne/numberTwo).toString()
                    editText?.setText(number)
                    numberOne=0.0F
                    numberTwo=0.0F
                    isDivision=false
                }

            }
        }
    }


}


