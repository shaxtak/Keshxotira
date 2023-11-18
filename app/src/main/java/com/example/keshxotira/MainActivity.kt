package com.example.keshxotira

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.keshxotira.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    var count = 0
    var tasbex = "https://namozvaqti.uz/shahar/fargona"
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn2.setOnClickListener {
            count++
            writeTasbex()

        }
        binding.btn1.setOnClickListener {
            count=0
            writeTasbex()
        }
        binding.btn3.setOnClickListener {
            intent.putExtra("url",binding.btn3.text.toString())
            startActivity(intent)
        }
    }
    fun writeTasbex(){
        binding.txt1.text = count.toString()
    }
}