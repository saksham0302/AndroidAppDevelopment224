package com.example.cse224_notes.unit_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.cse224_notes.R

class LogDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_demo)

        val mail = findViewById<EditText>(R.id.mail)
        val pwd = findViewById<EditText>(R.id.pwd)
        val submit = findViewById<Button>(R.id.submit)

        submit.setOnClickListener {
            if (mail.text.toString().isEmpty() || pwd.text.toString().isEmpty()) {
                Toast.makeText(this, "enter your username and password to continue", Toast.LENGTH_LONG).show()
                Log.i("Username Empty", "Enter Username")
                Log.i("Password Empty", "Enter password")
            }
        }
    }
}