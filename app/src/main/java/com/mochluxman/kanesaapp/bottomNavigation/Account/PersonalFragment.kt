package com.mochluxman.kanesaapp.bottomNavigation.Account


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

import com.mochluxman.kanesaapp.R

/**
 * A simple [Fragment] subclass.
 */
class PersonalFragment : Fragment() {
    private lateinit var viewPager: ViewPager
    private lateinit var tabs: TabLayout


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_personal, container, false)
        viewPager = view.findViewById(R.id.viewpager_acc)
        tabs = view.findViewById(R.id.tabs_acc)

        val fragmentAdapter = PersonalPagerAdapter(childFragmentManager)
        viewPager.adapter = fragmentAdapter
        tabs.setupWithViewPager(viewPager)

        return view
    }

}
