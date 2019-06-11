package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class ArriveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arrive)

        var backButton = findViewById(R.id.backImage) as ImageView
        var searchButton = findViewById(R.id.searchImage) as ImageView

        backButton.setOnClickListener {
            val backIntent = Intent(this, departActivity::class.java)
            startActivity(backIntent)
        }

        searchButton.setOnClickListener {
            val searchIntent = Intent(this, RouteResultActivity::class.java)
            startActivity(searchIntent)
        }
    }

}
