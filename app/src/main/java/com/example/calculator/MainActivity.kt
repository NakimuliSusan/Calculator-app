package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd : Button
    lateinit var btnSubtract : Button
    lateinit var  btnMultiply : Button
    lateinit var btnModulus : Button
    lateinit var etNumber1 : EditText
    lateinit var etNumber2 : EditText
    lateinit var tvShow : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        tvShow = findViewById(R.id.tvShow)


        btnAdd.setOnClickListener {
           tvShow .text = ""
           val int_Number1 = etNumber2.text.toString()
           val int_Number2 = etNumber1.text.toString()

            if(int_Number1.isBlank()){
                etNumber2.setError("Input number")
                return@setOnClickListener
            }
            else if(int_Number2.isBlank()){
                etNumber1.setError("Input number")
                return@setOnClickListener
            }
            add(int_Number1.toDouble(),int_Number2.toDouble())
        }
        btnSubtract.setOnClickListener {
            tvShow .text = ""
            val int_Number1 = etNumber2.text.toString()
            val int_Number2 = etNumber1.text.toString()

            if(int_Number1.isBlank()){
                etNumber2.setError("Input number")
                return@setOnClickListener
            }
            else if(int_Number2.isBlank()){
                etNumber1.setError("Input number")
                return@setOnClickListener
            }
            subtract(int_Number1.toDouble(),int_Number2.toDouble())
        }
        btnMultiply.setOnClickListener {
            tvShow.text = ""
            val int_Number1 = etNumber2.text.toString()
            val int_Number2 = etNumber1.text.toString()

            if (int_Number1.isBlank()) {
                etNumber2.setError("Input number")
                return@setOnClickListener
            } else if (int_Number2.isBlank()) {
                etNumber1.setError("Input number")
                return@setOnClickListener
            }

            multiply(int_Number1.toDouble(),int_Number2.toDouble())
        }
        btnModulus.setOnClickListener {
            tvShow.text = ""
            val int_Number1 = etNumber2.text.toString()
            val int_Number2 = etNumber1.text.toString()

            if (int_Number1.isBlank()) {
                etNumber2.setError("Input number")
                return@setOnClickListener
            } else if (int_Number2.isBlank()) {
                etNumber1.setError("Input number")
                return@setOnClickListener
            }
            modulus(int_Number1.toDouble(),int_Number2.toDouble())

    }
    }
    fun add (int_Number1:Double, int_Number2:Double) {
        val sum = int_Number1 + int_Number2
        tvShow.text = sum.toString()
    }
    fun subtract (int_Number1: Double,int_Number2: Double){
        val difference = int_Number1 - int_Number2
        tvShow.text = difference.toString()
    }
    fun multiply (int_Number1:Double,int_Number2:Double) {
        val result = int_Number1 * int_Number2
        tvShow.text = result.toString()
    }
    fun modulus (int_Number1:Double,int_Number2:Double) {
        val outcome = int_Number1 % int_Number2
        tvShow.text = outcome.toString()
    }
}