package com.mochluxman.kanesaapp.bottomNavigation.Store


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.mochluxman.kanesaapp.R

/**
 * A simple [Fragment] subclass.
 */
class ProdukFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_produk, container, false)
    }


}
