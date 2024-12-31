package com.example.student_msi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize UI components
        val menuButton: MaterialButton = findViewById(R.id.menuButton)

        // Initialize BottomNavigationView
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // Set the selected item on BottomNavigationView
        bottomNavigationView.selectedItemId = R.id.bottom_navigation

        // BottomNavigationView item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_sports -> {
                    val intent = Intent(this, SportsActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_cultural -> {
                    val intent = Intent(this, CulturalActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_other_events -> {
                    val intent = Intent(this, OtherEventsActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_feedback -> {
                    val intent = Intent(this, FeedbackSuggestionsActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_logout -> {
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    finish() // Call finish() to remove this activity from the back stack
                    true
                }
                else -> false
            }
        }

        // Menu button click listener
        menuButton.setOnClickListener {
            // Start the MenuActivity
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
