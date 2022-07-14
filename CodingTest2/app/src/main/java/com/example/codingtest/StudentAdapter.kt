package com.example.codingtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import okio.Utf8.size
import java.nio.file.Files.size

class StudentAdapter(students: Students):
    RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    class ViewHolder(view:View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.recyclerView)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cardview, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val viewModel = Students[position]

        holder.textView.setText = Students

    }

    override fun getItemCount(): Int {
        return Students.size
    }

    class Viewholder(ItemView: View) :
        RecyclerView.ViewHolder(ItemView) {
        val textView: TextView = itemView.findViewById(R.id.firstname)
        val textView: TextView = itemView.findViewById(R.id.lastname)
        val textView: TextView = itemView.findViewById(R.id.roll)
        val textView: TextView = itemView.findViewById(R.id.age)

    }


}