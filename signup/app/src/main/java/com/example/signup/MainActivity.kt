package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 =  findViewById(R.id.btn_enter) as Button;

        button1.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java);
            startActivity(Intent);
        }

//            val button2 =  findViewById(R.id.testbtn) as Button;
//
//            button2.setOnClickListener{
//                val Intent = Intent(this,MainActivity3::class.java);
//                startActivity(Intent);
//        }

//        val button3 =  findViewById(R.id.testbtn) as Button;
//
//        button2.setOnClickListener{
//            val Intent = Intent(this,MainActivity3::class.java);
//            startActivity(Intent);
//        }
    }
}