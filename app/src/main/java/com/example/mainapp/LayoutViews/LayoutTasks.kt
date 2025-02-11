package com.example.mainapp.LayoutViews

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mainapp.R

class LayoutTasks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_tasks)

        val buttonOne: Button = findViewById(R.id.linear)
        buttonOne.setOnClickListener {
            val intent1 = Intent(this, LinearTask::class.java)
            startActivity(intent1)
        }

        val buttonTwo: Button = findViewById(R.id.constraint)
        buttonTwo.setOnClickListener {
            val intent2 = Intent(this, ConstraintTask::class.java)
            startActivity(intent2)
        }
        val buttonThree: Button = findViewById(R.id.frame)
        buttonThree.setOnClickListener {
            val intent3 = Intent(this, FrameTask::class.java)
            startActivity(intent3)
        }
    }
}