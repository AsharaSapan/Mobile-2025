package com.example.mainapp

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewpagerTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager_task)
        var tabLayout:TabLayout=findViewById(R.id.tabLayout)
        var viewPager:ViewPager2=findViewById(R.id.viewPager)
        viewPager.adapter=PagerAdapter(this)
        TabLayoutMediator(tabLayout,viewPager){tab,index->
            tab.text=when(index){
                0->{"First"}
                1->{"Second"}
                2->{"Third"}
                else ->{throw Resources.NotFoundException("Not found")}
            }
        }.attach()
    }
}