package com.example.activity2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    private lateinit var personalInfoButton: AppCompatButton
    private lateinit var educationButton: AppCompatButton
    private lateinit var employmentButton: AppCompatButton
    private lateinit var referencesButton: AppCompatButton
    private lateinit var acknowledgementButton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        personalInfoButton()
        educationButton()
        employmentButton()
        referencesButton()
        acknowledgementButton()
    }

    private fun personalInfoButton() {
        personalInfoButton = findViewById(R.id.btn_personal_info)
        personalInfoButton.setOnClickListener {
            val intent = Intent(this, PersonalInfoActivity::class.java)
            startActivity(intent)
        }
    }

    private fun educationButton() {
        educationButton = findViewById(R.id.btn_education)
        educationButton.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
    }

    private fun employmentButton() {
        employmentButton = findViewById(R.id.btn_employment)
        employmentButton.setOnClickListener {
            val intent = Intent(this, EmploymentActivity::class.java)
            startActivity(intent)
        }
    }

    private fun referencesButton() {
        referencesButton = findViewById(R.id.btn_references)
        referencesButton.setOnClickListener {
            val intent = Intent(this, ReferencesActivity::class.java)
            startActivity(intent)
        }
    }

    private fun acknowledgementButton() {
        acknowledgementButton = findViewById(R.id.btn_acknowledgement)
        acknowledgementButton.setOnClickListener {
            val intent = Intent(this, AcknowledgementActivity::class.java)
            startActivity(intent)
        }
    }
}