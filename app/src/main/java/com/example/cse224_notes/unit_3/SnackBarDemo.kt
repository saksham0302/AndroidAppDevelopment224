package com.example.cse224_notes.unit_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.cse224_notes.R
import com.google.android.material.snackbar.Snackbar

class SnackBarDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar_demo)

        val view = findViewById<ConstraintLayout>(R.id.view)
        val txt = findViewById<TextView>(R.id.textView2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener() {
            val snack = Snackbar.make(view, "Example SnackBar", Snackbar.LENGTH_LONG)
            snack.setAction("Click Me") {
                txt.setText("SnackBar Action invoked!!")
            }
            snack.show()
        }
    }
}