package com.example.basicview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find and set the click listener for the "Open Assignment Activity" button
        val assignmentButton = findViewById<Button>(R.id.open_assignment_button)
        assignmentButton.setOnClickListener {
            val intent = Intent(this, AssignmentActivity::class.java)
            startActivity(intent)
        }

        // Find and set the click listener for the "Open Scroll Activity" button
        val scrollButton = findViewById<Button>(R.id.open_scroll_button)
        scrollButton.setOnClickListener {
            val intent = Intent(this, ScrollActivity::class.java)
            startActivity(intent)
        }
    }
}
