package com.example.moissejev_31032022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    lateinit var button: Button;
    lateinit var button2: Button;
    lateinit var button3: Button;
    lateinit var button4: Button;
    lateinit var button5: Button;
    lateinit var button6: Button;
    lateinit var button7: Button;
    lateinit var button8: Button;
    lateinit var button9: Button;
    private val rows = 3;
    private val cols = 3;

    val krest = Array(rows) { Array(cols){""} };
    lateinit var znak: String;
    lateinit var znak1: String;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val r1: Int;
        val r2: Int;
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        val exit:Button = findViewById(R.id.buttonExit);
        znak = "X";
        znak1 = "0";

        exit.setOnClickListener{
            val intent= Intent(this@MainActivity5, MainActivity4::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            krest[0][0] = znak;
            button.setText(znak);
            button.isEnabled = false;
        }
        button2.setOnClickListener {
            krest[0][1] = znak;
            button2.setText(znak);
            button2.isEnabled = false;
        }
        button3.setOnClickListener {
            krest[0][2] = znak;
            button3.setText(znak);
            button3.isEnabled = false;
        }
        button4.setOnClickListener {
            krest[1][0] = znak;
            button4.setText(znak);
            button4.isEnabled = false;
        }
        button5.setOnClickListener {
            krest[1][1] = znak;
            button5.setText(znak);
            button5.isEnabled = false;
        }
        button6.setOnClickListener {
            krest[1][2] = znak;
            button6.setText(znak);
            button6.isEnabled = false;
        }
        button7.setOnClickListener {
            krest[2][0] = znak;
            button7.setText(znak);
            button7.isEnabled = false;
        }
        button8.setOnClickListener {
            krest[2][1] = znak;
            button8.setText(znak);
            button8.isEnabled = false;
        }
        button9.setOnClickListener {
            krest[2][2] = znak;
            button9.setText(znak);
            button9.isEnabled = false;
        }
    }

}