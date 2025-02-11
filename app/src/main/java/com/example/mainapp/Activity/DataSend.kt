package com.example.mainapp.Activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mainapp.R

class DataSend : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_send)
        val button: Button = findViewById(R.id.senddata)
        button.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("message", "Hello! I am here to give data")
            setResult(Activity.RESULT_OK, resultIntent)
            finish() // Close this activity
        }
    }
}