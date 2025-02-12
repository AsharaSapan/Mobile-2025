package com.example.mainapp.LayoutViews

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.mainapp.R

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