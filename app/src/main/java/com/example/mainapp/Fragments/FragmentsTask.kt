package com.example.mainapp.Fragments

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.mainapp.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FragmentsTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments_task)

        val tabLayout_fragments: TabLayout = findViewById(R.id.tabLayout_fragments)
        val viewPager_fragments: ViewPager2 = findViewById(R.id.viewpager2_fragments)

        val adapter = AdapterViewpager(this)
        viewPager_fragments.adapter = adapter

        TabLayoutMediator(tabLayout_fragments, viewPager_fragments) { tab, position ->
            tab.text = when (position) {
                0 -> "Fragment A"
                1 -> "Fragment B"
                else -> "Fragment C"
            }
        }.attach()

    }
}