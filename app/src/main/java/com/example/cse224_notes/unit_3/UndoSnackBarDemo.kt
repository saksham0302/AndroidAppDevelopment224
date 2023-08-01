package com.example.cse224_notes.unit_3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.cse224_notes.R
import com.google.android.material.snackbar.Snackbar

class UndoSnackBarDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_undo_snack_bar_demo)

        val layout = findViewById<ConstraintLayout>(R.id.layout)
        val et1 = findViewById<EditText>(R.id.url)
        val b: Button = findViewById(R.id.button3)
        val t = findViewById<TextView>(R.id.textView)

        b.setOnClickListener {
            val name:String = et1.text.toString()
            t.text ="Hi $name, you are registered!"
// we can use it or layout in snackbar below
            val s: Snackbar = Snackbar.make(it, "this is a snackbar text", Snackbar.LENGTH_SHORT)
            s.setAction("undo"){
                t.setText("$name Successfully deregistered!")
                val s: Snackbar = Snackbar.make(layout, "Undone", Snackbar.LENGTH_SHORT)
                s.show()
            }
            s.setTextColor(Color.WHITE)
            s.setBackgroundTint(Color.RED)
            s.show()
        }
    }
}