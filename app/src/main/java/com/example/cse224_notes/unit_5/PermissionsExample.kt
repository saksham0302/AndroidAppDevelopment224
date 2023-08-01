package com.example.cse224_notes.unit_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.cse224_notes.R

class PermissionsExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissions_example)

        val btnCam = findViewById<Button>(R.id.btnCamera)
        val requestCam = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            if(it) {
                Toast.makeText(this, "Permissions Granted", Toast.LENGTH_LONG).show()
                val intentCam = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(intentCam)
                finish()
            }

            else {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_LONG).show()
            }
        }

        btnCam.setOnClickListener {
            requestCam.launch(android.Manifest.permission.CAMERA)
        }
    }
}