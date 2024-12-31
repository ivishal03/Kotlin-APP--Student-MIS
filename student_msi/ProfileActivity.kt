package com.example.student_msi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.imageview.ShapeableImageView

class ProfileActivity : AppCompatActivity() {

    private lateinit var profileImage: ShapeableImageView
    private lateinit var nameTextView: TextView
    private lateinit var rollNoTextView: TextView
    private lateinit var departmentTextView: TextView
    private lateinit var semesterTextView: TextView
    private lateinit var cgpaTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var phoneTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Initialize Views
        initViews()

        // Display dummy data (replace with actual data as needed)
        displayProfileData()
    }

    private fun initViews() {
        profileImage = findViewById(R.id.profile_image)
        nameTextView = findViewById(R.id.tv_name)
        rollNoTextView = findViewById(R.id.tv_roll_no)
        departmentTextView = findViewById(R.id.tv_department)
        semesterTextView = findViewById(R.id.tv_semester)
        cgpaTextView = findViewById(R.id.tv_cgpa)
        emailTextView = findViewById(R.id.tv_email)
        phoneTextView = findViewById(R.id.tv_phone)
    }

    private fun displayProfileData() {
        // Dummy data to display
        val name = "John Doe"
        val rollNo = "123456"
        val department = "Computer Science"
        val semester = "6"
        val cgpa = "8.5"
        val email = "john.doe@example.com"
        val phone = "+1234567890"
        val profileImageUrl = "https://example.com/profile_image.jpg" // Replace with actual image URL

        // Update UI with dummy data
        nameTextView.text = name
        rollNoTextView.text = rollNo
        departmentTextView.text = department
        semesterTextView.text = "Semester: $semester"
        cgpaTextView.text = "CGPA: $cgpa"
        emailTextView.text = email
        phoneTextView.text = phone

        // Load profile image using Glide
   //     loadProfileImage(profileImageUrl)
    }

  //  private fun loadProfileImage(imageUrl: String) {
  //      Glide.with(this)
   //         .load(imageUrl)
     //       .placeholder(R.drawable.ic_profile_placeholder) // Replace with your placeholder image
       //     .into(profileImage)
    //   }
}
