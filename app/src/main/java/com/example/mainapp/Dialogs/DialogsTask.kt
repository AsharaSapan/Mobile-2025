package com.example.mainapp.Dialogs

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.mainapp.R

class DialogsTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogs_task)
        val simpleDialog: Button = findViewById(R.id.simple)
        val confirmDialog: Button = findViewById(R.id.confirm)
        val fullscreenDialog: Button = findViewById(R.id.full_screen)

        simpleDialog.setOnClickListener {
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder.setItems(arrayOf("Item One", "Item Two", "Item Three")) { dialog, which ->
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        confirmDialog.setOnClickListener {
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder.setTitle("I am the title").setPositiveButton("Yes") { dialog, which ->

            }.setNegativeButton("No") { dialog, which ->

            }.setSingleChoiceItems(
                arrayOf("Item One", "Item Two", "Item Three"), 0
            ) { dialog, which ->

            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        fullscreenDialog.setOnClickListener {
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder.setMessage("Message is here").setTitle("Confirm")
                .setPositiveButton("Yes") { dialog, which ->

                }.setNegativeButton("No") { dialog, which ->

                }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Do you want to exit ?")
        builder.setTitle("Alert !")
        builder.setCancelable(false)
        builder.setPositiveButton("Yes") { dialog, which ->
            finish()
        }
        builder.setNegativeButton("No") { dialog, which ->
            dialog.cancel()
        }
        val alertDialog = builder.create()
        alertDialog.show()
    }


}