package com.example.cse224_notes.unit_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.cse224_notes.R

class ContextMenuDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu_demo)

        val tv1 = findViewById<TextView>(R.id.textview1)
        registerForContextMenu(tv1)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.option1 -> {
                Toast.makeText(this, "Option 1 selected", Toast.LENGTH_LONG).show()
            }

            R.id.option2 -> {
                Toast.makeText(this, "Option 2 selected", Toast.LENGTH_LONG).show()
            }

            else->
                Toast.makeText(this, "No option selected!!!!", Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }
}