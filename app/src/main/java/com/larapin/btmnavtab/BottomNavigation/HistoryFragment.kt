package com.larapin.btmnavtab

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.larapin.btmnavtab.BottomNavigation.HistoryPagerAdapter

class HistoryFragment : Fragment() {
    private lateinit var viewPager: ViewPager
    private lateinit var tabs: TabLayout


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_history, container, false)
        viewPager = view.findViewById(R.id.viewpager_main)
        tabs = view.findViewById(R.id.tabs_main)

        val fragmentAdapter = HistoryPagerAdapter(childFragmentManager)
        viewPager.adapter = fragmentAdapter
        tabs.setupWithViewPager(viewPager)

        return view
    }

}// Required empty public constructor