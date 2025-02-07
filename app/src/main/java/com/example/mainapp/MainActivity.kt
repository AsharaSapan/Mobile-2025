package com.example.mainapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mainapp.Selector_Tasks.DrawableSelectorTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonOne:Button = findViewById(R.id.selector)
        buttonOne.setOnClickListener {
            val intent4=Intent(this,DrawableSelectorTask ::class.java)
            startActivity(intent4)
        }
    }
}