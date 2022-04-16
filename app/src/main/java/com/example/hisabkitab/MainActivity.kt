package com.example.hisabkitab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hisabkitab.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.calculateid.setOnClickListener{
            calculateTip()
        
        }

    }

    fun calculateTip() {
        TODO("Not yet implemented")


    }
}




















