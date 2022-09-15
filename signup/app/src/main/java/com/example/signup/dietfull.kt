package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class dietfull : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dietfull)

        val button1 =  findViewById(R.id.btn_calorie) as Button;

        button1.setOnClickListener {
            val intent1 = Intent(this, calorieinfo::class.java);
            startActivity(intent1);
        }


        val button2 =  findViewById(R.id.btn_diet) as Button;

        button2.setOnClickListener {
            val intent1 = Intent(this, dietplan::class.java);
            startActivity(intent1);
        }
    }
}