package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class departActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_depart)


        var backButton = findViewById(R.id.backImage) as ImageView
        var arriveButton = findViewById(R.id.searchImage) as ImageView

        backButton.setOnClickListener {
            val backIntent = Intent(this, MainActivity::class.java)
            startActivity(backIntent)
        }

        arriveButton.setOnClickListener {
            val arriveIntent = Intent(this, ArriveActivity::class.java)
            startActivity(arriveIntent)
        }

    }

}

