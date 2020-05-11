package com.mochluxman.kanesaapp.bottomNavigation.Store.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mochluxman.kanesaapp.bottomNavigation.Store.DigitalFragment
import com.mochluxman.kanesaapp.bottomNavigation.Store.ProdukFragment
import com.mochluxman.kanesaapp.bottomNavigation.Store.ServiceFragment

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