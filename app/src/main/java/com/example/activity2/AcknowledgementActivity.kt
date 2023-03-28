package com.example.activity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity2.databinding.ActivityAcknowledgementBinding

class AcknowledgementActivity : AppCompatActivity() {
    lateinit var binding: ActivityAcknowledgementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAcknowledgementBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAcknowledgementBack.setOnClickListener {
            val intent = Intent(this@AcknowledgementActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}