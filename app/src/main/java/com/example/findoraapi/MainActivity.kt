package com.example.findoraapi

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Events Page
        findViewById<Button>(R.id.btnNext).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }
        // Your main activity logic goes here
        val spinner = findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.eventSpinner,
            R.layout.simple_spinner_item // Custom item layout
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

}
    }
