package com.example.mainapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class NatureAdapter(fragment: FragmentActivity): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->Nature_1_Fragment()
            1->Nature_2_Fragment()
            2->Nature_3_Fragment()

            else-> Nature_1_Fragment()
        }
    }

}