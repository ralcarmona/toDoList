package com.example.simpletodo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //lets detect when the user clicks the button
        findViewById<Button>(R.id.button).setOnClickListener{
            Log.i("rob", "button clicked")
        }
    }
}