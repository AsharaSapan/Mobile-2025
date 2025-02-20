package com.example.mainapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mainapp.Selector_Tasks.DrawableSelectorTask
import com.example.mainapp.LayoutViews.LayoutTasks
import com.example.mainapp.Drawables.DrawablesTasks
import com.example.mainapp.Activity.ActivityTasks
import com.example.mainapp.Dialogs.DialogsTask
import com.example.mainapp.Fonts.FontsTask
import com.example.mainapp.SnackbarFab.SnackbarFabTask
import com.example.mainapp.AppbarToolbarTasks.AppToolSelect

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDialog: Button = findViewById(R.id.dialogs)
        buttonDialog.setOnClickListener {
            val intent6 = Intent(this, DialogsTask::class.java)
            startActivity(intent6)
        }

        val buttonViewpager: Button = findViewById(R.id.viewpager)
        buttonViewpager.setOnClickListener {
            val intent6 = Intent(this, ViewpagerTask::class.java)
        }
        val buttonFonts: Button = findViewById(R.id.fonts)
        buttonFonts.setOnClickListener {
            val intent6 = Intent(this, FontsTask::class.java)
            startActivity(intent6)
        }
        val buttonSnackbar: Button = findViewById(R.id.snackbar_fab)
        buttonSnackbar.setOnClickListener {
            val intent8 = Intent(this, SnackbarFabTask::class.java)
            startActivity(intent8)
        }
            val buttonAppTool: Button = findViewById(R.id.appbar_Toolbar)
            buttonAppTool.setOnClickListener {
                val intentAppTool = Intent(this, AppToolSelect::class.java)
                startActivity(intentAppTool)
            }

            val buttonSix: Button = findViewById(R.id.viewpager)
            buttonSix.setOnClickListener {
                val intent6 = Intent(this, ViewpagerTask::class.java)
                startActivity(intent6)
            }

            val dimensionButton: Button = findViewById(R.id.dimension)
            dimensionButton.setOnClickListener {
                val intent5 = Intent(this, DimensionTask::class.java)
                startActivity(intent5)
            }
            val selectorButton: Button = findViewById(R.id.selector)
            selectorButton.setOnClickListener {
                val intent4 = Intent(this, DrawableSelectorTask::class.java)
                startActivity(intent4)
            }

            val buttonOne: Button = findViewById(R.id.activity)
            buttonOne.setOnClickListener {
                val intent1 = Intent(this, ActivityTasks::class.java)
                startActivity(intent1)
            }

            val buttonTwo: Button = findViewById(R.id.layout_views)
            buttonTwo.setOnClickListener {
                val intent2 = Intent(this, LayoutTasks::class.java)
                startActivity(intent2)
            }

            val buttonThree: Button = findViewById(R.id.drawables)
            buttonThree.setOnClickListener {
                val intent3 = Intent(this, DrawablesTasks::class.java)
                startActivity(intent3)
            }

        }
    }

