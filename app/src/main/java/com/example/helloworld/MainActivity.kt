package com.example.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button)
        button1.setOnClickListener{
            Log.v("hello","aa ")
            Toast.makeText(this,"Hello! Thank You for pressing me.",Toast.LENGTH_SHORT).show()
        }
        val button2 = findViewById<Button>(R.id.buttongreet)
        button2.setOnClickListener{
            Toast.makeText(this,"Hi! Good Morning.", Toast.LENGTH_SHORT).show()
        }
    }
}