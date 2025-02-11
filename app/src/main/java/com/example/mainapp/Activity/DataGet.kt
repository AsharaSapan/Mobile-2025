package com.example.mainapp.Activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mainapp.R

class DataGet : AppCompatActivity() {
    private val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            val message = data?.getStringExtra("message")
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_get)
        val button: Button = findViewById(R.id.getdata)
        button.setOnClickListener {
            val intent = Intent(this, DataSend::class.java)
            resultLauncher.launch(intent)
        }
    }
}