package com.example.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class bicepcurl : AppCompatActivity() {

    lateinit var textView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bicepcurl)

        textView = findViewById(R.id.textView)


        object : CountDownTimer(30000, 1000) {


            override fun onTick(millisUntilFinished: Long) {
                textView.setText(" " + millisUntilFinished / 1000)
            }


            override fun onFinish() {
                textView.setText("done!")
            }
        }.start()
    }
}