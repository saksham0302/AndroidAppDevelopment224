package com.example.cse224_notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EditTextDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text_demo)

        val et1 = findViewById<EditText>(R.id.et_1)
        val et2 = findViewById<EditText>(R.id.et_2)
        //val tv1 = findViewById<TextView>(R.id.tv_1)
        //val tv2 = findViewById<TextView>(R.id.tv_2)
        val tv3 = findViewById<TextView>(R.id.tv_3)
        val bt1 = findViewById<Button>(R.id.bt_1)

        bt1.setOnClickListener {

            if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty())
                tv3.text = "Please fill the text into Text box!"
            else
                tv3.text = et1.text.toString() + " " + et2.text.toString()

        }
    }
}