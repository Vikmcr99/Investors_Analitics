package com.example.analiticsinvertidors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.analiticsinvertidors.databinding.ActivityResultsBinding

class Results : AppCompatActivity() {

    lateinit var binding : ActivityResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun investorProfile(){

    }
}