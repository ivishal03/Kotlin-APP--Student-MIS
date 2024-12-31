package com.example.student_msi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView

class MarksResultAdapter(private val marksResults: List<MarksResult>) :
    RecyclerView.Adapter<MarksResultAdapter.MarksResultViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarksResultViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_marks_result, parent, false)
        return MarksResultViewHolder(view)
    }

    override fun onBindViewHolder(holder: MarksResultViewHolder, position: Int) {
        val (subject, marks, result) = marksResults[position]
        holder.subjectTextView.text = subject
        holder.marksTextView.text = "Marks: $marks"
        holder.resultTextView.text = "Result: $result"
    }

    override fun getItemCount(): Int = marksResults.size

    class MarksResultViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val subjectTextView: MaterialTextView = view.findViewById(R.id.tvSubject)
        val marksTextView: MaterialTextView = view.findViewById(R.id.tvMarks)
        val resultTextView: MaterialTextView = view.findViewById(R.id.tvResult)
    }
}