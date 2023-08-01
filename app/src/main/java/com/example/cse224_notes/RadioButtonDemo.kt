package com.example.cse224_notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class RadioButtonDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button_demo)

        val rgrp=findViewById<RadioGroup>(R.id.rgrp)
        val submit=findViewById<Button>(R.id.bt1)
        val reset=findViewById<Button>(R.id.bt2)
        val out=findViewById<TextView>(R.id.out)

        submit.setOnClickListener(){
            var selectId=rgrp.checkedRadioButtonId
            if(selectId==-1){
                Toast.makeText(this,"Please select any one ", Toast.LENGTH_SHORT).show()
            }else{
                val rb =rgrp.findViewById<RadioButton>(selectId)
                out.text="Result :${rb.text}"
            }
        }

        reset.setOnClickListener() {
            rgrp.clearCheck()
            out.text=""
        }
    }
}