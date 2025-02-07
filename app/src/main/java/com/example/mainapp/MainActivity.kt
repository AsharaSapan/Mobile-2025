package com.example.mainapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mainapp.LayoutViews.LayoutTasks

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ButtonTwo: Button= findViewById(R.id.layout_views)
        ButtonTwo.setOnClickListener {

            val intent2 = Intent(this, LayoutTasks::class.java)
            startActivity(intent2)
        }

    }
}