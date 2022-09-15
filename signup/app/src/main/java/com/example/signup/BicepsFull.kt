package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BicepsFull : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biceps_full)


        val button1 =  findViewById(R.id.btn_bicepcurl) as Button;

        button1.setOnClickListener {
            val intent1 = Intent(this, bicepcurl::class.java);
            startActivity(intent1);
        }

        val button2 =  findViewById(R.id.btn_hammercurl) as Button;

        button2.setOnClickListener {
            val intent2 = Intent(this, Hammercurl::class.java);
            startActivity(intent2);
        }

        val button3 =  findViewById(R.id.btn_concentrationcurl) as Button;

        button3.setOnClickListener {
            val intent3 = Intent(this, concentrationCurl::class.java);
            startActivity(intent3);
        }
    }

}