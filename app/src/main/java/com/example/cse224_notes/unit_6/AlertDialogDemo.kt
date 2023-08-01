package com.example.cse224_notes.unit_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.cse224_notes.R

class AlertDialogDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog_demo)

        val btnAlert = findViewById<Button>(R.id.adb)

        btnAlert.setOnClickListener {

            val builder = AlertDialog.Builder(this)

            builder.setTitle("My Alert Dialog")
                .setMessage("Do you want to close it..? :")
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes"){dialogInterface, which ->
                Toast.makeText(
                    this,
                    "Yes option clicked",
                    Toast.LENGTH_SHORT
                ).show()}

            builder.setNegativeButton("No"){dialogInterface, which ->
                Toast.makeText(
                    this,
                    "No option clicked",
                    Toast.LENGTH_SHORT
                ).show()}

            builder.setNeutralButton("Cancel"){dialogInterface, which ->
                Toast.makeText(
                    this,
                    "Cancel option clicked",
                    Toast.LENGTH_SHORT
                ).show()}

            val ad: AlertDialog = builder.create()
            ad.show()
        }
    }
}