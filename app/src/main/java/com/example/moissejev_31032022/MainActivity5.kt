package com.example.moissejev_31032022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.concurrent.schedule

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
        var r1: Int = 0;
        var r2: Int = 0;
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
        var winner = ""
        val bundle = Bundle()

        exit.setOnClickListener{
            val intent= Intent(this@MainActivity5, MainActivity4::class.java)
            startActivity(intent)
        }

        fun getPlace() {
            if (krest[0][0].equals("0") && krest[0][1].equals("0") && button3.text == ""){
                r1 = 0;
                r2 = 2;
            } else if (krest[0][0].equals("0") && krest[0][2].equals("0") && button2.text == ""){
                r1 = 0;
                r2 = 1;
            } else if (krest[0][1].equals("0") && krest[0][2].equals("0") && button.text == ""){
                r1 = 0;
                r2 = 0;
            } else if (krest[1][0].equals("0") && krest[1][1].equals("0") && button6.text == ""){
                r1 = 1;
                r2 = 2;
            }else if (krest[1][0].equals("0") && krest[1][2].equals("0") && button5.text == ""){
                r1 = 1;
                r2 = 1;
            }else if (krest[1][1].equals("0") && krest[1][2].equals("0") && button4.text == ""){
                r1 = 1;
                r2 = 0;
            }else if (krest[2][0].equals("0") && krest[2][2].equals("0") && button8.text == ""){
                r1 = 2;
                r2 = 1;
            }else if (krest[2][0].equals("0") && krest[2][1].equals("0") && button9.text == ""){
                r1 = 2;
                r2 = 2;
            }else if (krest[2][1].equals("0") && krest[2][2].equals("0") && button7.text == ""){
                r1 = 2;
                r2 = 0;
            }else if (krest[0][0].equals("0") && krest[1][0].equals("0") && button7.text==""){
                r1 = 2;
                r2 = 0;
            }else if (krest[0][0].equals("0") && krest[2][0].equals("0") && button4.text == ""){
                r1 = 1;
                r2 = 0;
            }else if (krest[2][0].equals("0") && krest[1][0].equals("0") && button.text ==""){
                r1 = 0;
                r2 = 0;
            }else if (krest[0][1].equals("0") && krest[1][1].equals("0") && button8.text == ""){
                r1 = 2;
                r2 = 1;
            }else if (krest[0][1].equals("0") && krest[2][1].equals("0") && button5.text == ""){
                r1 = 1;
                r2 = 1;
            }else if (krest[1][1].equals("0") && krest[2][1].equals("0") && button2.text == ""){
                r1 = 0;
                r2 = 1;
            }else if (krest[0][2].equals("0") && krest[1][2].equals("0") && button9.text == ""){
                r1 = 2;
                r2 = 2;
            }else if (krest[0][2].equals("0") && krest[2][2].equals("0") && button6.text == ""){
                r1 = 1;
                r2 = 2;
            }else if (krest[1][2].equals("0") && krest[2][2].equals("0") && button3.text == ""){
                r1 = 0;
                r2 = 2;
            }else{
                r1 = ((0+(Math.random()*3)).toInt());
                r2 = ((0+(Math.random()*3)).toInt());
            }
        }

        fun smotr() {
            button.text = krest[0][0];
            if (button.text !== ""){
                button.isEnabled = false
            }
            button2.text = krest[0][1];
            if (button2.text !== ""){
                button2.isEnabled = false
            }
            button3.text = krest[0][2];
            if (button3.text !== ""){
                button3.isEnabled = false
            }
            button4.text = krest[1][0];
            if (button4.text !== ""){
                button4.isEnabled = false
            }
            button5.text = krest[1][1];
            if (button5.text !== ""){
                button5.isEnabled = false
            }
            button6.text = krest[1][2];
            if (button6.text !== ""){
                button6.isEnabled = false
            }
            button7.text = krest[2][0];
            if (button7.text !== ""){
                button7.isEnabled = false
            }
            button8.text = krest[2][1];
            if (button8.text !== ""){
                button8.isEnabled = false
            }
            button9.text = krest[2][2];
            if (button9.text !== ""){
                button9.isEnabled = false
            }

        }


        fun proverka() {
            if(button.text!==""&&button2.text!==""&&button3.text!==""&&button4.text!==""&&button5.text!==""&&button6.text!==""&&button7.text!==""&&button8.text!==""&&button9.text!==""){
                winner = "DRAW"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if((button.text.equals("X"))&&(button2.getText().equals("X"))&&(button3.getText().equals("X"))){
                winner = "X"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if((button.getText().equals("X"))&&(button4.getText().equals("X"))&&(button7.getText().equals("X"))){
                winner = "X"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button.text=="X"&&button5.text=="X"&&button9.text=="X"){
                winner = "X"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }

            if(button2.text=="X"&&button5.text=="X"&&button8.text=="X"){
                winner = "X"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button3.text=="X"&&button6.text=="X"&&button9.text=="X"){
                winner = "X"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button4.text=="X"&&button5.text=="X"&&button6.text=="X"){
                winner = "X"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button7.text=="X"&&button8.text=="X"&&button9.text=="X"){
                winner = "X"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button3.text=="X"&&button5.text=="X"&&button7.text=="X"){
                winner = "X"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if((button.text.equals("0"))&&(button2.getText().equals("0"))&&(button3.getText().equals("0"))){
                winner = "0"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if((button.getText().equals("0"))&&(button4.getText().equals("0"))&&(button7.getText().equals("0"))){
                winner = "0"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button.text=="0"&&button5.text=="0"&&button9.text=="0"){
                winner = "0"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button2.text=="0"&&button5.text=="0"&&button8.text=="0"){
                winner = "0"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button3.text=="0"&&button6.text=="0"&&button9.text=="0"){
                winner = "0"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button4.text=="0"&&button5.text=="0"&&button6.text=="0"){
                winner = "0"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button7.text=="0"&&button8.text=="0"&&button9.text=="0"){
                winner = "0"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
            if(button3.text=="0"&&button5.text=="0"&&button7.text=="0"){
                winner = "0"
                bundle.putString("winner", winner)
                val intent= Intent(this@MainActivity5, MainActivity3::class.java)
                intent.putExtras(bundle)
                Timer().schedule(500){
                    startActivity(intent)
                }
            }
        }

        fun obratHod(){
            proverka();
            getPlace();
            while(krest[r1][r2] !== ""){
                if(button.text!==""&&button2.text!==""&&button3.text!==""&&button4.text!==""&&button5.text!==""&&button6.text!==""&&button7.text!==""&&button8.text!==""&&button9.text!==""){
                    return
                }else{
                    getPlace()
                }
            }
                krest[r1][r2]=znak1;
                smotr();
                proverka();
        }


        button.setOnClickListener {
            krest[0][0] = znak;
            button.setText(znak);
            button.isEnabled = false;
            proverka();
            obratHod();
        }
        button2.setOnClickListener {
            krest[0][1] = znak;
            button2.setText(znak);
            button2.isEnabled = false;
            proverka();
            obratHod();
        }
        button3.setOnClickListener {
            krest[0][2] = znak;
            button3.setText(znak);
            button3.isEnabled = false;
            proverka();
            obratHod();
        }
        button4.setOnClickListener {
            krest[1][0] = znak;
            button4.setText(znak);
            button4.isEnabled = false;
            proverka();
            obratHod();
        }
        button5.setOnClickListener {
            krest[1][1] = znak;
            button5.setText(znak);
            button5.isEnabled = false;
            proverka();
            obratHod();
        }
        button6.setOnClickListener {
            krest[1][2] = znak;
            button6.setText(znak);
            button6.isEnabled = false;
            proverka();
            obratHod();
        }
        button7.setOnClickListener {
            krest[2][0] = znak;
            button7.setText(znak);
            button7.isEnabled = false;
            proverka();
            obratHod();
        }
        button8.setOnClickListener {
            krest[2][1] = znak;
            button8.setText(znak);
            button8.isEnabled = false;
            proverka();
            obratHod();
        }
        button9.setOnClickListener {
            krest[2][2] = znak;
            button9.setText(znak);
            button9.isEnabled = false;
            proverka();
            obratHod();
        }

    }

}