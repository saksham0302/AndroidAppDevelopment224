package com.example.cse224_notes.unit_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cse224_notes.R

class ExplicitIntentDemo1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_demo_1)

        val goBack = findViewById<Button>(R.id.goBack)

        goBack.setOnClickListener() {

            val intent = Intent(this, ExplicitIntentDemo2::class.java)
            startActivity(intent)
        }
    }
}