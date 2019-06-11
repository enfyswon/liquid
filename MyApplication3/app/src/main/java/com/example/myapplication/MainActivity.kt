package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var micButton = findViewById(R.id.micButton) as ImageView
        var departText = findViewById(R.id.departText) as EditText
        var arriveText = findViewById(R.id.arriveText) as EditText
        var searchButton = findViewById(R.id.searchButton) as Button
        var searchButton1 = findViewById(R.id.searchButton1) as ImageButton
        var searchButton2 = findViewById(R.id.searchButton2) as ImageButton


        micButton.setOnClickListener{
            val departIntent = Intent(this, departActivity::class.java)
            startActivity(departIntent)
        }

        searchButton.setOnClickListener {
            val searchIntent = Intent(this, RouteResultActivity::class.java)
            startActivity(searchIntent)
        }
    }
}
