package com.example.mainapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mainapp.LayoutViews.LayoutTasks
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mainapp.Drawables.DrawablesTasks
import com.example.mainapp.Activity.ActivityTasks

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ButtonThree: Button= findViewById(R.id.drawables)
        ButtonThree.setOnClickListener {

            val intent3 = Intent(this, DrawablesTasks::class.java)
            startActivity(intent3)
        val ButtonTwo: Button= findViewById(R.id.layout_views)
        ButtonTwo.setOnClickListener {

            val intent2 = Intent(this, LayoutTasks::class.java)
            startActivity(intent2)
        }

        val ButtonOne: Button = findViewById(R.id.activity)
        ButtonOne.setOnClickListener {
            val intent1 = Intent(this, ActivityTasks::class.java)
            startActivity(intent1)
        }
    }
}
