package com.example.mainapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mainapp.Activity.ActivityTasks

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ButtonOne: Button = findViewById(R.id.activity)
        ButtonOne.setOnClickListener {
            val intent1 = Intent(this, ActivityTasks::class.java)
            startActivity(intent1)
        }
    }
}
