package com.example.mainapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FestivalsAdapter(fragment: FragmentActivity): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->Festivals_1_Fragment()
            1->Festivals_2_Fragment()
            2->Festivals_3_Fragment()

            else-> Festivals_1_Fragment()
        }
    }

}