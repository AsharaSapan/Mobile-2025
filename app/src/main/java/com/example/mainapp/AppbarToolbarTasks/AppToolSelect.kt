package com.example.mainapp.AppbarToolbarTasks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mainapp.R

class AppToolSelect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_tool_select)

        val buttonAppBar: Button = findViewById(R.id.Appbar)
        buttonAppBar.setOnClickListener {
            val intentAppTool = Intent(this, AppBarTask::class.java)
            startActivity(intentAppTool)
        }

        val buttonToolBar: Button = findViewById(R.id.Toolbar)
        buttonToolBar.setOnClickListener {
            val intentAppTool = Intent(this, ToolBarTask::class.java)
            startActivity(intentAppTool)
        }

        val buttonCollapsing: Button = findViewById(R.id.Collapsing_Toolbar)
        buttonCollapsing.setOnClickListener {
            val intentAppTool = Intent(this, CollapsingToolBarTask::class.java)
            startActivity(intentAppTool)
        }
    }
}