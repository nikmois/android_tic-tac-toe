package com.example.moissejev_31032022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val shag = arrayOf("X","0")
        var N=0
        var winner = ""
        val bundle = Bundle()
        val btn00 = findViewById<Button>(R.id.button00)
        val btn01 = findViewById<Button>(R.id.button01)
        val btn02 = findViewById<Button>(R.id.button02)
        val btn10 = findViewById<Button>(R.id.button10)
        val btn11 = findViewById<Button>(R.id.button11)
        val btn12 = findViewById<Button>(R.id.button12)
        val btn20 = findViewById<Button>(R.id.button20)
        val btn21 = findViewById<Button>(R.id.button21)
        val btn22 = findViewById<Button>(R.id.button22)
        btn00.setOnClickListener{
            if(btn00.text==""){
                btn00.setText(shag[N])
                N=1-N
                if(btn00.text!=="" && btn00.text == btn02.text && btn00.text == btn01.text ||
                    btn00.text!=="" && btn00.text == btn10.text && btn00.text == btn20.text ||
                    btn00.text!=="" && btn00.text == btn11.text && btn00.text == btn22.text)
                    {
                        winner = btn00.text.toString()
                        bundle.putString("winner", winner)
                        val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                        intent.putExtras(bundle)
                        startActivity(intent)
                    }
                else if(btn00.text!=="" && btn01.text!=="" && btn02.text!=="" && btn10.text!=="" &&
                btn11.text!=="" && btn12.text!=="" && btn20.text!=="" && btn21.text!=="" && btn22.text!=="")
                    {
                        winner = "DRAW"
                        bundle.putString("winner", winner)
                        val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                        intent.putExtras(bundle)
                        startActivity(intent)
                    }

            }
        }

        btn01.setOnClickListener{
            if(btn01.text==""){
                btn01.setText(shag[N])
                N=1-N
                if(btn01.text!=="" && btn01.text == btn11.text && btn01.text == btn21.text ||
                    btn01.text!=="" && btn01.text == btn00.text && btn01.text == btn02.text)
                {
                    winner = btn01.text.toString()
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                else if(btn00.text!=="" && btn01.text!=="" && btn02.text!=="" && btn10.text!=="" &&
                    btn11.text!=="" && btn12.text!=="" && btn20.text!=="" && btn21.text!=="" && btn22.text!=="")
                {
                    winner = "DRAW"
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }

        btn02.setOnClickListener{
            if(btn02.text==""){
                btn02.setText(shag[N])
                N=1-N
                if(btn02.text!=="" && btn02.text == btn00.text && btn02.text == btn01.text ||
                    btn02.text!=="" && btn02.text == btn12.text && btn02.text == btn22.text ||
                    btn02.text!=="" && btn02.text==btn11.text && btn02.text == btn20.text)
                {
                    winner = btn02.text.toString()
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                else if(btn00.text!=="" && btn01.text!=="" && btn02.text!=="" && btn10.text!=="" &&
                    btn11.text!=="" && btn12.text!=="" && btn20.text!=="" && btn21.text!=="" && btn22.text!=="")
                {
                    winner = "DRAW"
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }

        btn10.setOnClickListener{
            if(btn10.text==""){
                btn10.setText(shag[N])
                N=1-N
                if(btn10.text!=="" && btn10.text == btn00.text && btn10.text == btn20.text ||
                    btn10.text!=="" && btn10.text == btn11.text && btn10.text == btn12.text)
                {
                    winner = btn10.text.toString()
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                else if(btn00.text!=="" && btn01.text!=="" && btn02.text!=="" && btn10.text!=="" &&
                    btn11.text!=="" && btn12.text!=="" && btn20.text!=="" && btn21.text!=="" && btn22.text!=="")
                {
                    winner = "DRAW"
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }

        btn11.setOnClickListener{
            if(btn11.text==""){
                btn11.setText(shag[N])
                N=1-N
                if(btn11.text!=="" && btn11.text == btn10.text && btn11.text == btn12.text ||
                    btn11.text!=="" && btn11.text == btn01.text && btn11.text == btn21.text)
                {
                    winner = btn11.text.toString()
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                else if(btn00.text!=="" && btn01.text!=="" && btn02.text!=="" && btn10.text!=="" &&
                    btn11.text!=="" && btn12.text!=="" && btn20.text!=="" && btn21.text!=="" && btn22.text!=="")
                {
                    winner = "DRAW"
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }

        btn12.setOnClickListener{
            if(btn12.text==""){
                btn12.setText(shag[N])
                N=1-N
                if(btn12.text!=="" && btn12.text == btn10.text && btn12.text == btn11.text ||
                    btn12.text!=="" && btn12.text == btn02.text && btn12.text == btn22.text)
                {
                    winner = btn12.text.toString()
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                else if(btn00.text!=="" && btn01.text!=="" && btn02.text!=="" && btn10.text!=="" &&
                    btn11.text!=="" && btn12.text!=="" && btn20.text!=="" && btn21.text!=="" && btn22.text!=="")
                {
                    winner = "DRAW"
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }

        btn20.setOnClickListener{
            if(btn20.text==""){
                btn20.setText(shag[N])
                N=1-N
                if(btn20.text!=="" && btn20.text == btn00.text && btn20.text == btn10.text ||
                    btn20.text!=="" && btn20.text == btn21.text && btn20.text == btn22.text ||
                    btn20.text!=="" && btn20.text == btn11.text && btn20.text == btn02.text)
                {
                    winner = btn20.text.toString()
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                else if(btn00.text!=="" && btn01.text!=="" && btn02.text!=="" && btn10.text!=="" &&
                    btn11.text!=="" && btn12.text!=="" && btn20.text!=="" && btn21.text!=="" && btn22.text!=="")
                {
                    winner = "DRAW"
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }

        btn21.setOnClickListener{
            if(btn21.text==""){
                btn21.setText(shag[N])
                N=1-N
                if(btn21.text!=="" && btn21.text == btn20.text && btn21.text == btn22.text ||
                    btn21.text!=="" && btn21.text == btn11.text && btn21.text == btn01.text)
                {
                    winner = btn21.text.toString()
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                else if(btn00.text!=="" && btn01.text!=="" && btn02.text!=="" && btn10.text!=="" &&
                    btn11.text!=="" && btn12.text!=="" && btn20.text!=="" && btn21.text!=="" && btn22.text!=="")
                {
                    winner = "DRAW"
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }

        btn22.setOnClickListener{
            if(btn22.text==""){
                btn22.setText(shag[N])
                N=1-N
                if(btn22.text!=="" && btn22.text == btn20.text && btn22.text == btn21.text ||
                    btn22.text!=="" && btn22.text == btn12.text && btn22.text == btn02.text ||
                    btn22.text!=="" && btn22.text == btn11.text && btn22.text == btn00.text)
                {
                    winner = btn22.text.toString()
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                else if(btn00.text!=="" && btn01.text!=="" && btn02.text!=="" && btn10.text!=="" &&
                    btn11.text!=="" && btn12.text!=="" && btn20.text!=="" && btn21.text!=="" && btn22.text!=="")
                {
                    winner = "DRAW"
                    bundle.putString("winner", winner)
                    val intent= Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }
        val btnPerehod = findViewById<Button>(R.id.buttonExt)
        btnPerehod.setOnClickListener{
            val intent= Intent(this@MainActivity2, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}