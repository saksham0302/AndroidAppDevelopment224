package com.example.cse224_notes.unit_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import com.example.cse224_notes.R

class PopUpMenuDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up_menu_demo)

        val btn: Button =findViewById(R.id.pm1)
        btn.setOnClickListener {
            val pMenu = PopupMenu(this, btn)
            pMenu.menuInflater.inflate(R.menu.pop_up_menu, pMenu.menu)
            pMenu.setOnMenuItemClickListener {
                Toast.makeText(this, "You have selected "+it.title, Toast.LENGTH_SHORT).show()
                true
            }
            pMenu.show()
        }
    }
}