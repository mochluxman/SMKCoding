package com.mochluxman.kanesaapp.bottomNavigation.Account

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PersonalPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                PortofolioFragment()
            }
            1 -> {
                ResumeFragment()
            }
            else -> {
                return FaqFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Portofolio"
            1 -> "Resume"
            else -> {
                return "FAQ"
            }
        }
    }
}