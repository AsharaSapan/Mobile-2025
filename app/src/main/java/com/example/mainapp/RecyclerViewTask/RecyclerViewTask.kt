package com.example.mainapp.RecyclerViewTask

import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainapp.R
import com.example.mainapp.RecyclerViewTask.adapters.MsgAdapter

import com.google.android.material.floatingactionbutton.FloatingActionButton

class RecyclerViewTask : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var msgText: EditText
    private lateinit var fabSendMsg: FloatingActionButton
    private lateinit var checkBoxCheck: CheckBox
    private lateinit var adapter: MsgAdapter
    private val msgList = mutableListOf<String>() // List of strings to store msg

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_task)

        recyclerView = findViewById(R.id.recyclerViewTask)
        fabSendMsg = findViewById(R.id.fabSend)
        msgText = findViewById(R.id.msg_id)
        checkBoxCheck = findViewById(R.id.send_rec_checkbox)

        // Initialize RecyclerView and Adapter
        adapter = MsgAdapter(mutableListOf())
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        fabSendMsg.setOnClickListener {

        }
    }
}