package com.example.mainapp.Fragments

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class AdapterViewpager(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SendFragmentTask()
            1 -> ModifyFragmentTask()
            2 -> ShowFragmentTask()
            else -> {
                throw Resources.NotFoundException("Not found")
            }
        }
    }
}