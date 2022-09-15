package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class absfull : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.absfull)


        val button1 = findViewById(R.id.btn_crunch) as Button;

        button1.setOnClickListener {
            val intent1 = Intent(this, abs_crunch::class.java);
            startActivity(intent1);
        }

        val button2 = findViewById(R.id.btn_legraise) as Button;

        button2.setOnClickListener {
            val intent2 = Intent(this, abs_legraise::class.java);
            startActivity(intent2);
        }

        val button3 = findViewById(R.id.btn_plank) as Button;

        button3.setOnClickListener {
            val intent3 = Intent(this, abs_plank::class.java);
            startActivity(intent3);
        }
    }
}