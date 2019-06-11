package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class GuideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)

        var routeView = findViewById(R.id.routeView) as ImageView

        routeView.setOnClickListener {
            val routeIntent = Intent(this, RouteResultActivity::class.java)
            startActivity(routeIntent)
        }
    }
}
