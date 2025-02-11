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

        val buttonOne: Button = findViewById(R.id.activity)
        buttonOne.setOnClickListener {
            val intent1 = Intent(this, ActivityTasks::class.java)
            startActivity(intent1)
        }

        val buttonTwo: Button= findViewById(R.id.layout_views)
        buttonTwo.setOnClickListener {
            val intent2 = Intent(this, LayoutTasks::class.java)
            startActivity(intent2)
        }

        val buttonThree: Button= findViewById(R.id.drawables)
        buttonThree.setOnClickListener {
            val intent3 = Intent(this, DrawablesTasks::class.java)
            startActivity(intent3)
        }

    }
}
