package com.example.activity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity2.databinding.ActivityPersonalInfoBinding

class PersonalInfoActivity : AppCompatActivity() {
    lateinit var binding: ActivityPersonalInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonalInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPInfoBack.setOnClickListener {
            val intent = Intent(this@PersonalInfoActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}