package com.example.student_msi

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class FeedbackSuggestionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback_suggestions)

        // Initialize UI components
        val nameEditText: TextInputEditText = findViewById(R.id.nameEditText)
        val emailEditText: TextInputEditText = findViewById(R.id.emailEditText)
        val feedbackEditText: TextInputEditText = findViewById(R.id.feedbackEditText)
        val submitButton: MaterialButton = findViewById(R.id.submitButton)

        // Set click listener for Submit button
        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val feedback = feedbackEditText.text.toString()

            if (name.isEmpty() || email.isEmpty() || feedback.isEmpty()) {
                Toast.makeText(this, "Please fill all the fields.", Toast.LENGTH_SHORT).show()
            } else {
                // Handle submission logic here (e.g., save to Firebase, send an email, etc.)
                Toast.makeText(this, "Thank you for your feedback!", Toast.LENGTH_SHORT).show()

                // Optionally, clear the input fields after submission
                nameEditText.text?.clear()
                emailEditText.text?.clear()
                feedbackEditText.text?.clear()
            }
        }
    }
}
