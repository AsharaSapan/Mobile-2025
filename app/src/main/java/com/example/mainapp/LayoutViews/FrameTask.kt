package com.example.mainapp.LayoutViews

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.example.mainapp.Activity.ActivityTasks
import com.example.mainapp.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FrameTask : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_task)
        val redFrame: FrameLayout= findViewById(R.id.frame1)
        val whiteFrame: FrameLayout= findViewById(R.id.frame2)
        val blueFrame: FrameLayout= findViewById(R.id.frame3)
        redFrame.setOnClickListener {
            it.visibility = FrameLayout.GONE
        }
        whiteFrame.setOnClickListener {
            it.visibility = FrameLayout.GONE
        }
        blueFrame.setOnClickListener {
            it.visibility = FrameLayout.GONE
        }
    }
}