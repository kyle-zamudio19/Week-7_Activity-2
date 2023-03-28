package com.example.activity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity2.databinding.ActivityReferencesBinding

class ReferencesActivity : AppCompatActivity() {
    lateinit var binding: ActivityReferencesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReferencesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnReferencesBack.setOnClickListener {
            val intent = Intent(this@ReferencesActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}