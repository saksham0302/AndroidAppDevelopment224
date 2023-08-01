package com.example.cse224_notes.unit_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.cse224_notes.R

class OptionalMenuDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_optional_menu_demo)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optional_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {

            R.id.settings -> {
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show()
            }

            R.id.payment -> {
                Toast.makeText(this, "Payment selected", Toast.LENGTH_SHORT).show()
            }

            R.id.new_group -> {
                Toast.makeText(this, "New Group selected", Toast.LENGTH_SHORT).show()
            }

            else->
                Toast.makeText(this, "No option selected!!!!", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }
}