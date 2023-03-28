package com.example.activity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity2.databinding.ActivityEducationBinding

class EducationActivity : AppCompatActivity() {
    lateinit var binding: ActivityEducationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEducationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnEducationBack.setOnClickListener {
            val intent = Intent(this@EducationActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}