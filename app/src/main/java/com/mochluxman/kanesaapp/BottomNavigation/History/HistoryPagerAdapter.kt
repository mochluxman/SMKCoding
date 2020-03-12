package com.mochluxman.kanesaapp.BottomNavigation.History

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mochluxman.kanesaapp.BottomNavigation.AktifitasFragment
import com.mochluxman.kanesaapp.BottomNavigation.TransaksiFragment

class HistoryPagerAdapter(fm: FragmentManager) :FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                AktifitasFragment()
            }
            else -> {
                return TransaksiFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Aktifitas"
            else -> {
                return "Transaksi"
            }
        }
    }
}