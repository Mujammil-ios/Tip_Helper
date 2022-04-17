package com.example.hisabkitab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hisabkitab.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

//    To use ViewBinding, you need to declare it as supported in your module-level
//    build.gradle file under the android section.

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//Writting onclick listner to bind the calculatetip().

        binding.calculateid.setOnClickListener{
            calculateTip()
        
        }

    }

    private fun calculateTip() {
//        TODO("Not yet implemented")

//In our activity stringInTextField is in double bt some case it can be null to show the
//restlt to user we need to convert that field to level of input .

        val stringInTextField = binding.billAmount.text.toString()
        val cost = stringInTextField.toDoubleOrNull()

//        If input is null show blank result.


        if (cost == null) {
            binding.tipFinal.text = ""
            return
        }


//When radio button selected to one of them or auto select give the data for calculate percantage.

        val tipPercentage = when (binding.bestChoice.checkedRadioButtonId) {
            R.id.amzingid -> 0.20
            R.id.goodid -> 0.15
            else -> 0.10
        }


//The exuation of app SIMPLE AND EASY.

        var tip = tipPercentage * cost
        if (binding.switchtip.isChecked) {
            tip = kotlin.math.ceil(tip)
        }

//show the result on textview with currency inctace and formation.

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipFinal.text = getString(R.string.tip_res, formattedTip)


    }
}




















