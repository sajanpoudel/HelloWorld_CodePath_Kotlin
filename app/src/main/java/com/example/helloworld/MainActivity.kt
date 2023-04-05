package com.example.helloworld

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import java.util.Calendar

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
        // "SAY HELLO!" logs the click and greets the user
        helloButton.setOnClickListener {
            Log.v(TAG, "Hello button clicked")
            Toast.makeText(this, R.string.toast_hello, Toast.LENGTH_SHORT).show()
        }
        val greetButton = findViewById<Button>(R.id.buttongreet)
        // "Greet Me!" shows a good morning toast
        greetButton.setOnClickListener {
            val hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
            Toast.makeText(this, greetingText(Greeting.timeOfDay(hour)), Toast.LENGTH_SHORT).show()
        }
    }

    /** The string resource that holds the greeting for a part of the day. */
    private fun greetingText(part: TimeOfDay): Int = when (part) {
        TimeOfDay.MORNING -> R.string.greeting_morning
        TimeOfDay.AFTERNOON -> R.string.greeting_afternoon
        TimeOfDay.EVENING -> R.string.greeting_evening
        TimeOfDay.NIGHT -> R.string.greeting_night
    }
}