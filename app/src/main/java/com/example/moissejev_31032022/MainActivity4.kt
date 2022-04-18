package com.example.moissejev_31032022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val btnPerehod = findViewById<Button>(R.id.buttonFirst)
        btnPerehod.setOnClickListener{
            val intent= Intent(this@MainActivity4, MainActivity::class.java)
            startActivity(intent)
        }
        val btnPerehod1 = findViewById<Button>(R.id.Exit)
        btnPerehod1.setOnClickListener{
            finishAffinity()
        }
    }
}