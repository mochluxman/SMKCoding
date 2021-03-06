package com.mochluxman.kanesaapp

import com.mochluxman.kanesaapp.bottomNavigation.Roaming.RoamingFragment
import com.mochluxman.kanesaapp.bottomNavigation.Store.StoreFragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mochluxman.kanesaapp.bottomNavigation.Account.AccountFragment
import com.mochluxman.kanesaapp.bottomNavigation.History.HistoryFragment
import com.mochluxman.kanesaapp.bottomNavigation.Home.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var content : FrameLayout? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.home_menu -> {
                val fragment = HomeFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.roaming_menu -> {
                val fragment = RoamingFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.store_menu -> {
                val fragment = StoreFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.history_menu -> {
                val fragment = HistoryFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.account_menu -> {
                val fragment = AccountFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
                .replace(R.id.content, fragment, fragment.javaClass.simpleName)
                .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val fragment = HomeFragment()
        addFragment(fragment)
    }

}
