package com.example.activity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity2.databinding.ActivityEmploymentBinding

class EmploymentActivity : AppCompatActivity() {
    lateinit var binding: ActivityEmploymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmploymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnEmploymentBack.setOnClickListener {
            val intent = Intent(this@EmploymentActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}