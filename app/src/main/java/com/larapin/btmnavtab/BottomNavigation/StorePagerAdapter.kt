package com.larapin.btmnavtab.BottomNavigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class StorePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                ProdukFragment()
            }
            1 -> {
                ServiceFragment()
            }
            else -> {
                return DigitalFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Product"
            1 -> "Service"
            else -> {
                return "Digital"
            }
        }
    }
}