package com.example.toast

import android.content.Context
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNumber: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize EditText and TextView fields
        editTextNumber = findViewById(R.id.editTextNumber)
        editTextPassword = findViewById(R.id.editTextPassword)
        displayTextView = findViewById(R.id.displayTextView)
    }

    // Method triggered when the "Save" button is clicked
    fun xmlbutton(view: View) {
        // 1. Get the input from EditText fields
        val number = editTextNumber.text.toString()
        val password = editTextPassword.text.toString()

        // 2. Display the input in TextView
        displayTextView.text = "Number: $number\nPassword: $password"

        // 3. Show a Toast message
        Toast.makeText(this, "Information saved", Toast.LENGTH_SHORT).show()

        // 4. Trigger vibration
        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE))
        }

        // 5. Hide the keyboard
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
