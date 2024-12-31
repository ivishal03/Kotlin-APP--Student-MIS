package com.example.student_msi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        val loginButton: MaterialButton = findViewById(R.id.loginButton)

        // Set click listeners for navigation
        loginButton.setOnClickListener {
            // Navigate to Login Activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
