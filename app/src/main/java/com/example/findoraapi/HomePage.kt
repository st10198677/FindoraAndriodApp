package com.example.findoraapi

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class HomePage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
       Thread.sleep(3000)
        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home_page)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
     //   }

        // Your main activity logic goes here
        val spinner = findViewById<Spinner>(R.id.finderSpinner)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.finderSpinner,
            R.layout.simple_spinner_item // Custom item layout
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        val spinner2 = findViewById<Spinner>(R.id.eventSpinner)
        val adapter2 = ArrayAdapter.createFromResource(
            this,
            R.array.eventCategories,
            R.layout.simple_spinner_item // Custom item layout
        )
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner2.adapter = adapter2

        val spinner3 = findViewById<Spinner>(R.id.daytimeSpinner)
        val adapter3 = ArrayAdapter.createFromResource(
            this,
            R.array.daytimeSpinner,
            R.layout.simple_spinner_item // Custom item layout
        )
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner3.adapter = adapter3


        findViewById<Button>(R.id.btnHostnext).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}