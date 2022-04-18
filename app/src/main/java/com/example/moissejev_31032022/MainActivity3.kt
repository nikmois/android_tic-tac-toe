package com.example.moissejev_31032022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btnPerehod = findViewById<Button>(R.id.buttonFirst)
        btnPerehod.setOnClickListener{
            val intent= Intent(this@MainActivity3, MainActivity2::class.java)
            startActivity(intent)
        }
        val btnPerehod1 = findViewById<Button>(R.id.Exit)
        btnPerehod1.setOnClickListener{
            val intent= Intent(this@MainActivity3, MainActivity4::class.java)
            startActivity(intent)
        }
        val text = findViewById<TextView>(R.id.textView)
        val pic = findViewById<ImageView>(R.id.winnerPic)
        val bundle = intent
        val winner = bundle.getStringExtra("winner")
        if (winner=="DRAW") {
            text.setText("DRAW")
            pic.setImageResource(R.drawable.both)
        }else if(winner=="X")
        {
            text.setText("Winner is " + winner)
            pic.setImageResource(R.drawable.first)
        }else{
            text.setText("Winner is " + winner)
            pic.setImageResource(R.drawable.second)
        }
    }
}