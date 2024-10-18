package com.example.tryfirst

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Uncomment the line below if you need edge-to-edge support
        // enableEdgeToEdge()

        // Configure the action bar
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setLogo(R.drawable.baseline_home_24)
            setDisplayUseLogoEnabled(true)
            setDisplayShowTitleEnabled(true)
            setTitle("hellloo brats")
        }

        setContentView(R.layout.activity_main)

        // Setting insets for the layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Get references to the views
        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.textView1)
        val button = findViewById<Button>(R.id.button)

        // Set button click listener to update TextView with EditText content
        button.setOnClickListener {
            val inputText = editText.text.toString()
            textView.text = inputText
        }
    }
}
