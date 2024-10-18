package com.example.ts

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Declare TextView as a variable
    private lateinit var name1: TextView
    private lateinit var name2: TextView
    private lateinit var name3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize TextView
        name1 = findViewById(R.id.name1)
        name2 = findViewById(R.id.name2)
        name3 = findViewById(R.id.name3)

        // Set the text for the TextView
        name1.text = "Try first"
        name2.text = "Try fir 2"
        name3.text = "Try name 3"

        // Apply window insets for system bars handling
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
