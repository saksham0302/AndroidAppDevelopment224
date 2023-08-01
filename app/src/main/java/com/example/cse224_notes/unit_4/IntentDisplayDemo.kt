package com.example.cse224_notes.unit_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cse224_notes.R

class IntentDisplayDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_display_demo)

        val res = findViewById<TextView>(R.id.resu)

        val t1 = intent.getStringExtra("name")
        val t2 = intent.getStringExtra("pass")
        val t3 = intent.getStringExtra("email")
        val t4 = intent.getStringExtra("date")
        val t5 = intent.getStringExtra("phone")
        val option = intent.getStringExtra("course")

        res.text = " Entered Values are : \n " +
                "Name : ${t1} \n" +
                "Password : ${t2} \n" +
                "Email : ${t3} \n" +
                "Date : ${t4} \n" +
                "Phone No. : ${t5} \n " +
                "Course : ${option}"

    }
}