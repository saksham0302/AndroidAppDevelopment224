package com.example.cse224_notes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.constraintlayout.widget.ConstraintLayout

class ListViewDemo : AppCompatActivity() {
    lateinit var lstView: ListView
    lateinit var layoutMain: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_demo)

        lstView = findViewById(R.id.lst_view)
        layoutMain = findViewById(R.id.layout_main)

        val arr = arrayOf(Color.RED, Color.BLUE, Color.GRAY, Color.CYAN, Color.YELLOW)
        val b = arrayOf("RED", "BLUE", "GRAY", "CYAN", "YELLOW")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, b)
        lstView.adapter = adapter
        lstView.setOnItemClickListener {adapterView, view, i, l ->
            layoutMain.setBackgroundColor(arr[i])
        }
    }
}