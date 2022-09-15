package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class dietplan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dietplan)

        val button4 =  findViewById(R.id.Buttongain) as ImageButton;

        button4.setOnClickListener {
            val intent1 = Intent(this, weightgain::class.java);
            startActivity(intent1);
        }


        val button3 =  findViewById(R.id.imageButton) as ImageButton;

        button3.setOnClickListener {
            val intent1 = Intent(this, weightloss::class.java);
            startActivity(intent1);
        }
    }
}