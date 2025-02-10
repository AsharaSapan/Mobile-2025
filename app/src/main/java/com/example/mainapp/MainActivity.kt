package com.example.mainapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonFive:Button=findViewById(R.id.dimension)
        buttonFive.setOnClickListener {
            val intent5=Intent(this,DimensionTask::class.java)
            startActivity(intent5)
        }
    }
}