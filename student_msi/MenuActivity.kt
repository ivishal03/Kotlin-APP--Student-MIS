    package com.example.student_msi

    import android.annotation.SuppressLint
    import android.content.Intent
    import android.os.Bundle
    import androidx.appcompat.app.AppCompatActivity
    import com.google.android.material.card.MaterialCardView

    class MenuActivity : AppCompatActivity() {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_menu)

            // Initialize menu items and set click listeners

            val profileCard: MaterialCardView = findViewById(R.id.profile)
            profileCard.setOnClickListener {
                // Navigate to ProfileActivity
                startActivity(Intent(this, ProfileActivity::class.java))
            }

           val marksCard: MaterialCardView = findViewById(R.id.marks_and_result)
            marksCard.setOnClickListener {
                // Navigate to MarksActivity
                startActivity(Intent(this, MarksResultActivity::class.java))
            }

            val subjectAndTeachersCard: MaterialCardView = findViewById(R.id.subject_and_teachers)
            subjectAndTeachersCard.setOnClickListener {
                // Navigate to SubjectAndTeachersActivity
                startActivity(Intent(this, SubjectTeacherActivity::class.java))
            }

            val sportsActivityCard: MaterialCardView = findViewById(R.id.sports)
            sportsActivityCard.setOnClickListener {
                // Navigate to SportsActivity
                startActivity(Intent(this, SportsActivity::class.java))
            }

            val culturalActivityCard: MaterialCardView = findViewById(R.id.cultural_activity)
            culturalActivityCard.setOnClickListener {
                // Navigate to CulturalActivity
                startActivity(Intent(this, CulturalActivity::class.java))
            }
            val otherEventsCard: MaterialCardView = findViewById(R.id.other_events)
            otherEventsCard.setOnClickListener {
                // Navigate to OtherEventsActivity
                startActivity(Intent(this, OtherEventsActivity::class.java))
            }

            val feedbackCard: MaterialCardView = findViewById(R.id.feedback_and_suggestions)
            feedbackCard.setOnClickListener {
                // Navigate to FeedbackSuggestionsActivity
                startActivity(Intent(this, FeedbackSuggestionsActivity::class.java))
            }
            val helpAndSupportCard: MaterialCardView = findViewById(R.id.help_and_support)
            helpAndSupportCard.setOnClickListener {
                // Navigate to HelpAndSupportActivity
                startActivity(Intent(this, HelpAndSupportActivity::class.java))
            }

            val aboutCard: MaterialCardView = findViewById(R.id.about)
            aboutCard.setOnClickListener {
                // Navigate to AboutActivity
                startActivity(Intent(this, AboutActivity::class.java))
            }
        }
    }
