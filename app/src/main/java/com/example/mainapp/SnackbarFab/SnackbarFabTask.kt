package com.example.mainapp.SnackbarFab

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mainapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class SnackbarFabTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar_fab_task)
        val buttonDel: Button = findViewById(R.id.button_delete)
        val buttonGreetings: Button = findViewById(R.id.button_hello)
        val buttonFab: FloatingActionButton = findViewById(R.id.fab_fav)

        buttonDel.setOnClickListener {
            Snackbar.make(
                buttonDel, "Message Deleted", Snackbar.LENGTH_SHORT
            ).setAction("Action", null).show()
        }
        buttonGreetings.setOnClickListener {
            Snackbar.make(
                buttonGreetings, "Hello world! This is how snackbar works", Snackbar.LENGTH_LONG
            ).setAction("Action", null).show()
        }
        buttonFab.setOnClickListener { view ->
            Snackbar.make(buttonFab, "Added to favourite", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
        }

    }
}