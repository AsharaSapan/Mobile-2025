package com.example.mainapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSix:Button = findViewById(R.id.viewpager)
        buttonSix.setOnClickListener {
            val intent6=Intent(this,ViewpagerTask::class.java)
            startActivity(intent6)

        }
    }
}