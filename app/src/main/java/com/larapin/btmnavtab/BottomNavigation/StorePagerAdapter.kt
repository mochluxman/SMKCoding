package com.larapin.btmnavtab.BottomNavigation

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

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