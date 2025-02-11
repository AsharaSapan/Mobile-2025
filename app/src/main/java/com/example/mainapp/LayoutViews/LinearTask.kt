package com.example.mainapp.LayoutViews

import android.os.Bundle
import android.os.Looper
import android.widget.Button
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.example.mainapp.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.logging.Handler

class LinearTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_task)


        val progress: ProgressBar =findViewById(R.id.progress)

        val button: Button = findViewById(R.id.submit)
        button.setOnClickListener {
            it.visibility= Button.GONE
            progress.visibility= ProgressBar.VISIBLE
            lifecycleScope.launch {
                delay(5000)
                finish()
            }
        }
    }
}