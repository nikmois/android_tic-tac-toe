package com.example.moissejev_31032022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPerehod = findViewById<Button>(R.id.buttonUp)
        btnPerehod.setOnClickListener{
            val intent= Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
        val btnPerehod2 = findViewById<Button>(R.id.buttonUp2)
        btnPerehod2.setOnClickListener{
            val intent= Intent(this@MainActivity, MainActivity5::class.java)
            startActivity(intent)
        }
        val btnPerehod1 = findViewById<Button>(R.id.buttonDown)
        btnPerehod1.setOnClickListener{
            val intent= Intent(this@MainActivity, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}