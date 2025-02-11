package com.example.mainapp.Activity

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mainapp.R

class LogcatTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logcat_task)
        Log.i("Creating: ","onCreate is called")

    }

    override fun onStart() {
        super.onStart()
        Log.i("Starting: ","onStart is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Resumed","onResume is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Paused","onPause is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Stopped","onStop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Destroyed","Activity Destroyed")
    }
}