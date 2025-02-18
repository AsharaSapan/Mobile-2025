package com.example.mainapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.mainapp.R

class ShowFragmentTask : Fragment() {

    private lateinit var textShow: TextView
    private lateinit var buttonDelete: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_show_task, container, false)
        textShow = view.findViewById(R.id.text_show)
        buttonDelete = view.findViewById(R.id.button_delete)

        //Getting data from A
        parentFragmentManager.setFragmentResultListener("sendToShow", this) { _, bundle ->
            val dataFromAb = bundle.getString("sendMsg")?.uppercase()
            textShow.text = dataFromAb
        }
        //Getting modified data from B
        parentFragmentManager.setFragmentResultListener("modifiedMsgShow", this) { _, bundle ->
            val dataFromB = bundle.getString("modifiedMsg")?.uppercase()
            textShow.text = dataFromB
        }

        //Resetting all fragments data to empty
        buttonDelete.setOnClickListener {
            textShow.text = ""
            parentFragmentManager.setFragmentResult("deleteSend", Bundle())
            parentFragmentManager.setFragmentResult("deleteModify", Bundle())
        }

        return view
    }
}