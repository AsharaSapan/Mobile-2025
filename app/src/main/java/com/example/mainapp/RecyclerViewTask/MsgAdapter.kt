package com.example.mainapp.RecyclerViewTask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mainapp.R

class MsgAdapter(private val msgList: MutableList<String>) :
    RecyclerView.Adapter<MsgAdapter.NameViewHolder>() {

    class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MsgAdapter.NameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_msg_list, parent, false)
        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: MsgAdapter.NameViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return msgList.size
    }
    fun addName(list: String) {
        msgList.add(list)
        notifyItemInserted(msgList.size - 1) // Notify RecyclerView to update UI
    }
}
}