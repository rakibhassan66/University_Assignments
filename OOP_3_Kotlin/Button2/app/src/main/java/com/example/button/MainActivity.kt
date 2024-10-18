package com.example.button

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var display1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by ID
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        display1 = findViewById(R.id.display1)

        // Set click listener for button1
        button1.setOnClickListener {
            display1.text = "Log in success"
        }

        // Set click listener for button2
        button2.setOnClickListener {
            display1.text = "Log out"
        }
    }
    fun xmlbutton(view: View){
        display1.text = "this is clicked "
    }
}
