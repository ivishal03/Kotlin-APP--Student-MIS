package com.example.student_msi

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore

class MarksResultActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var marksAdapter: MarksResultAdapter
    private var marksList = mutableListOf<MarksResult>()
    private val firestore = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marks_result)

        recyclerView = findViewById(R.id.rvMarksResults)
        recyclerView.layoutManager = LinearLayoutManager(this)
        marksAdapter = MarksResultAdapter(marksList)
        recyclerView.adapter = marksAdapter

        // Get student ID from intent
        val studentId = intent.getStringExtra("USER_ID")
        if (studentId != null) {
            fetchMarksResults(studentId)
        } else {
            Log.e("MarksResultActivity", "User ID not found")
        }
    }

    private fun fetchMarksResults(studentId: String) {
        firestore.collection("students")
            .document(studentId)
            .collection("marksandresult")
            .get()
            .addOnSuccessListener { documents ->
                for (document in documents) {
                    val marksResult = document.toObject(MarksResult::class.java)
                    marksList.add(marksResult)
                }
                marksAdapter.notifyDataSetChanged()  // Update RecyclerView once data is loaded
            }
            .addOnFailureListener { exception ->
                Log.e("FirestoreError", "Error fetching data", exception)
            }
    }
}

// MarksResult data class
data class MarksResult(
    val subject: String = "",
    val marks: Int = 0,
    val result: String = ""
)
