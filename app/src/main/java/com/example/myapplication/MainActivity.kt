package com.example.helloworld

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class

MainActivity : AppCompatActivity() {
    override

    fun

            onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameTextView = findViewById<TextView>(R.id.username_text_view)
        usernameTextView.text = "Username:"

        val usernameEditText = findViewById<EditText>(R.id.username_edit_text)
        usernameEditText.hint = "Enter your username..."
    }
}
