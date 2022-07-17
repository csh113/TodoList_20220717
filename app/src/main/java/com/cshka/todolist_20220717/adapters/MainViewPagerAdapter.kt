package com.cshka.todolist_20220717.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.cshka.todolist_20220717.fragments.TodoFragment
import com.cshka.todolist_20220717.fragments.GoalFragment
import com.cshka.todolist_20220717.fragments.SettingFragment

class MainViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> return TodoFragment()
            1 -> return GoalFragment()
            else -> return SettingFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> return "TodoList"
            1 -> return "Goal"
            else -> return "Setting"
        }
    }


}