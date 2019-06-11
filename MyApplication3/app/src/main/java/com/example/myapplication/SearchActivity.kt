package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        var startButton = findViewById(R.id.startButton) as Button
        var endButton = findViewById(R.id.endButton) as Button
        var searchButton = findViewById(R.id.searchButton) as Button

        startButton.setOnClickListener {
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
        }

        endButton.setOnClickListener {
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
        }

        searchButton.setOnClickListener {
            val resultIntent = Intent(this, RouteResultActivity::class.java)
            startActivity(resultIntent)
        }
    }
}
