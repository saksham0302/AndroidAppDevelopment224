package com.example.cse224_notes.unit_4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import com.example.cse224_notes.R

class ImplicitIntentDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent_demo)

        val eturl = findViewById<EditText>(R.id.urlText)
        val btn = findViewById<Button>(R.id.btnUrl)
        val btn1 = findViewById<Button>(R.id.dialler)
        val btn2 = findViewById<Button>(R.id.camera)
        val btn3 = findViewById<Button>(R.id.clogs)
        val btn4 = findViewById<Button>(R.id.contact)
        val btn5 = findViewById<Button>(R.id.gallery)

        btn.setOnClickListener {
            var url: String = eturl.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        btn1.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel: +918054863709"))
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val cam_int = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cam_int)
        }

        btn3.setOnClickListener {
            val clogsint = Intent(Intent.ACTION_VIEW)
            clogsint.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(clogsint)
        }

        btn4.setOnClickListener {
            val contact_int = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(contact_int)
        }

        btn5.setOnClickListener {
            val gly_int = Intent()
            gly_int.action = Intent.ACTION_VIEW
            gly_int.type = "image/"
            startActivity(gly_int)
        }
    }
}