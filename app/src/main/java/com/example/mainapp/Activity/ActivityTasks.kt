package com.example.mainapp.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mainapp.R

class ActivityTasks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tasks)
        val ButtonOne: Button = findViewById(R.id.logcat)
        ButtonOne.setOnClickListener {
            val intent1 = Intent(this, LogcatTask::class.java)
            startActivity(intent1)
        }
        val ButtonTwo: Button = findViewById(R.id.dataget)
        ButtonTwo.setOnClickListener {
            val intent2 = Intent(this, DataGet::class.java)
            startActivity(intent2)
        }
    }
}