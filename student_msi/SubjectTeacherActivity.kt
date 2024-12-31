package com.example.student_msi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView

class SubjectTeacherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_teacher)

        val recyclerView = findViewById<RecyclerView>(R.id.rvSubjectsTeachers)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Sample data for subjects and teachers
        val subjectsTeachers = listOf(
            Pair("Advance mobile application devlopment", "Mr. Johnson"),
            Pair("Internet of Things", "Dr. David"),
            Pair("Business Communication", "Ms. Drake"),
            Pair("Minor Project", "Ms. Davis"),
            Pair("Python programming", "Dr. Smith"),
            Pair("Advanced Internet Programming ", "Ms. Brown"),
            Pair("Database Management Systems", "Mr. John"),
        )

        // Set adapter
        recyclerView.adapter = SubjectTeacherAdapter(subjectsTeachers)
    }
}

class SubjectTeacherAdapter(private val data: List<Pair<String, String>>) :
    RecyclerView.Adapter<SubjectTeacherAdapter.SubjectTeacherViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectTeacherViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_subject_teacher, parent, false)
        return SubjectTeacherViewHolder(view)
    }

    override fun onBindViewHolder(holder: SubjectTeacherViewHolder, position: Int) {
        val (subject, teacher) = data[position]
        holder.subjectTextView.text = subject
        holder.teacherTextView.text = teacher
    }

    override fun getItemCount(): Int = data.size

    class SubjectTeacherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val subjectTextView: MaterialTextView = view.findViewById(R.id.tvSubject)
        val teacherTextView: MaterialTextView = view.findViewById(R.id.tvTeacher)
    }
}
