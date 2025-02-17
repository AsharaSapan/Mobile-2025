package com.example.mainapp.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.mainapp.R

class SendFragmentTask : Fragment() {

    private lateinit var editTextSend: EditText
    private lateinit var buttonSend: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_send_task, container, false)

        editTextSend = view.findViewById(R.id.text_send)
        buttonSend = view.findViewById(R.id.button_send)

        buttonSend.setOnClickListener {
            val enteredText = editTextSend.text.toString()
            val bundle = Bundle().apply {
                putString("sendMsg", enteredText)
            }
            parentFragmentManager.setFragmentResult("sendToModify", bundle)
            parentFragmentManager.setFragmentResult("sendToShow", bundle)
        }
//        parentFragmentManager.setFragmentResultListener(
//            "modifiedMsg",
//            this
//        ) { _, bundle ->
//            val textChange = bundle.getString("modifiedMsg")
//            editTextSend.text = textChange
//        }
        parentFragmentManager.setFragmentResultListener("deleteSend", this) { _, _ ->
            editTextSend.text.clear()
        }

        return view
    }

}