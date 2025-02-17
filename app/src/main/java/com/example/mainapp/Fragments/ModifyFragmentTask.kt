package com.example.mainapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import com.example.mainapp.R

class ModifyFragmentTask : Fragment() {

    private lateinit var editTextGet: EditText
    private lateinit var buttonModify: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_modify_task, container, false)
        editTextGet = view.findViewById(R.id.text_modify)
        buttonModify = view.findViewById(R.id.button_modify)

        parentFragmentManager.setFragmentResultListener("sendToModify", this) { _, bundle ->
            val textGetFromA = bundle.getString("sendMsg")
            editTextGet.setText(textGetFromA)

        }
        parentFragmentManager.setFragmentResultListener("deleteModify", this) { _, _ ->
            editTextGet.text.clear()
        }
//        buttonModify.setOnClickListener {
//            val modifiedText = editTextGet.text.toString()
//            val bundle = Bundle().apply {
//                putString("modifiedMsg", modifiedText)
//            }
//            parentFragmentManager.setFragmentResult("modifiedMsg", bundle)
//        }
        return view
    }

}
