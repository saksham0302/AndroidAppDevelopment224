package com.example.cse224_notes.unit_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.cse224_notes.R

class ToastDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_demo)

        var btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            // Toast.makeText(this, "hey toaster!", Toast.LENGTH_LONG).show()
            var t1 = Toast.makeText(this, "hello it is toast!", Toast.LENGTH_SHORT)
            // t1.show()

            val t2 = Toast.makeText(this, "Toast with gravity", Toast.LENGTH_SHORT)
            // t2.setGravity(Gravity.TOP,0,0)
            //            t2.setGravity(Gravity.TOP | Gravity.LEFT,200,200)
            t2.show()
        }
    }
}