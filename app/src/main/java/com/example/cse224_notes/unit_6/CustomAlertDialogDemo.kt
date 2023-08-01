package com.example.cse224_notes.unit_6

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.cse224_notes.R
import java.util.*
import kotlin.collections.ArrayList

class CustomAlertDialogDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialog_demo)

        val simpleBtn = findViewById<Button>(R.id.SBtn)
        val customBtn = findViewById<Button>(R.id.CBtn)
        val alertBtn = findViewById<Button>(R.id.ABtn)

        simpleBtn.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setTitle("It is simple alert")
                .setMessage("It is simple alert message!!")
                .setPositiveButton("OK") { dialog, which ->
                    Toast.makeText(this, "OK Button Clicked..", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Not OK") { dialog, which ->
                    Toast.makeText(this, "Not OK Button Clicked..", Toast.LENGTH_SHORT).show()
                }
                .setCancelable(true)
                .show()
        }

        customBtn.setOnClickListener{

            val item = arrayOf("CSE", "ECE", "EEE", "Civil", "Other Engg.")
            val builder= AlertDialog.Builder(this)
            builder.setTitle("List of Items")
                .setItems(item) {dialog, which ->
                    Toast.makeText(this, item[which] + "clicked", Toast.LENGTH_SHORT).show()}
                .setPositiveButton("OK", null)
                .setNegativeButton("Cancel", null)
                .setNeutralButton("Nothing", null)
                .setCancelable(true)
            val ad= builder.create()
            ad.show()
        }

        alertBtn.setOnClickListener {

            val item = arrayOf("Apple", "Banana", "Orange", "Grapes")
            val selectedItem = ArrayList<String>()
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Multiple choice options...")
                .setMultiChoiceItems(item, null) {dialog, which, isChecked ->
                    if (isChecked)
                        selectedItem.add(item[which])

                    else if (selectedItem.contains(item[which]))
                        selectedItem.remove(item[which])
                }
                .setPositiveButton("Done") {dialog, i ->
                    Toast.makeText(this, "Item Selected: " + Arrays.toString(selectedItem.toTypedArray()), Toast.LENGTH_SHORT).show()
                }
            builder.show()
        }
    }
}