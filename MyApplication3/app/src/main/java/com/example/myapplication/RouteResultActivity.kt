package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class RouteResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route_result)

        var searchView = findViewById(R.id.searchView) as ImageView
        var guideVIew = findViewById(R.id.guideView) as ImageView

        searchView.setOnClickListener {
            val searchIntent = Intent(this, MainActivity::class.java)
            startActivity(searchIntent)
        }

        guideVIew.setOnClickListener {
            val guideIntent = Intent(this, GuideActivity::class.java)
            startActivity(guideIntent)
        }
    }
}
