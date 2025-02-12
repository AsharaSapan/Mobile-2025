package com.example.mainapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CarAdapter(fragment: FragmentActivity):FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->Car_1_Fragment()
            1->Car_2_Fragment()
            2->Car_3_Fragment()

            else-> Car_1_Fragment()
        }
    }

}