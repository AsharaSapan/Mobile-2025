package com.example.mainapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mainapp.Drawables.DrawablesTasks


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ButtonThree: Button= findViewById(R.id.drawables)
        ButtonThree.setOnClickListener {

            val intent3 = Intent(this, DrawablesTasks::class.java)
            startActivity(intent3)
        }
    }
}