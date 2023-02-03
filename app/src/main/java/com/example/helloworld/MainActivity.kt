package com.example.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

/** Single screen app: an image, an introduction and two buttons that show a toast. */
class MainActivity : AppCompatActivity() {

    private companion object {
        /** Tag for log messages written by this screen. */
        const val TAG = "MainActivity"
    }

    /** Inflates the layout and attaches the click handlers of both buttons. */
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloButton = findViewById<Button>(R.id.button)
        helloButton.setOnClickListener{
            Log.v(TAG, "Hello button clicked")
            Toast.makeText(this, R.string.toast_hello, Toast.LENGTH_SHORT).show()
        }
        val greetButton = findViewById<Button>(R.id.buttongreet)
        greetButton.setOnClickListener{
            Toast.makeText(this, R.string.toast_greet, Toast.LENGTH_SHORT).show()
        }
    }
}