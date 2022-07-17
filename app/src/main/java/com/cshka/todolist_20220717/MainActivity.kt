package com.cshka.todolist_20220717

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cshka.todolist_20220717.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mPagerAdapter

        mainViewPager.offscreenPageLimit = 3

        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}