package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class legsFull : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.legsfull)

        val button1 = findViewById(R.id.btn_legpress) as Button;

        button1.setOnClickListener {
            val intent1 = Intent(this, legpress::class.java);
            startActivity(intent1);
        }

        val button2 = findViewById(R.id.btn_squat) as Button;

        button2.setOnClickListener {
            val intent2 = Intent(this, legsquats::class.java);
            startActivity(intent2);
        }

        val button3 = findViewById(R.id.btn_legextension) as Button;

        button3.setOnClickListener {
            val intent3 = Intent(this, legextension::class.java);
            startActivity(intent3);
        }
    }
}