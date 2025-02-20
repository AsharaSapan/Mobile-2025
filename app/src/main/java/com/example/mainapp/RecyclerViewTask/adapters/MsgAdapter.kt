package com.example.mainapp.RecyclerViewTask.adapters

import android.icu.util.Calendar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mainapp.R


class MsgAdapter(private val msgList: MutableList<String>) :
    RecyclerView.Adapter<MsgAdapter.NameViewHolder>() {

    class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textShow: TextView = itemView.findViewById(R.id.msg_list)
        val timeShow: TextView = itemView.findViewById(R.id.current_time)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_msg_list, parent, false)
        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
//        val timeShow = Calendar.getInstance().time
        holder.textShow.text = msgList[position]
//        holder.timeShow.text = timeShow.toString()
    }

    override fun getItemCount(): Int {
        return msgList.size
    }

    fun addName(msg: String) {
        val add = msgList.add(msg)
        notifyItemInserted(msgList.size - 1) // Notify RecyclerView to update UI
    }
}

