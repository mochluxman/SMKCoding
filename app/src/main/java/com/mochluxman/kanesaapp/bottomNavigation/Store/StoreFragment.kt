package com.mochluxman.kanesaapp.bottomNavigation.Store

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.mochluxman.kanesaapp.R
import com.mochluxman.kanesaapp.bottomNavigation.Store.adapter.ImageCarouselAdapter
import com.mochluxman.kanesaapp.bottomNavigation.Store.adapter.StorePagerAdapter
import com.mochluxman.kanesaapp.bottomNavigation.Store.model.CarouselImage
import kotlinx.android.synthetic.main.fragment_store.*


// Simplify to load the layout without those LayoutInflater BoilerPlate codes :p
// What a waste of resources xD
class StoreFragment : Fragment(R.layout.fragment_store) {
    private lateinit var viewPager: ViewPager
    private lateinit var tabs: TabLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager = view.findViewById(R.id.viewPager_str)
        tabs = view.findViewById(R.id.tabs_str)

        val fragmentAdapter = StorePagerAdapter(childFragmentManager)
        viewPager.adapter = fragmentAdapter
        tabs.setupWithViewPager(viewPager)
        initCarousel()
    }

    private fun initCarousel() {
        // Create list of images
        val images = listOf(
                CarouselImage("Image 1", "https://www.lemoot.com/engine/wp-content/uploads/2018/05/ramadhan-ekstra.jpg"),
                CarouselImage("Image 2", "https://ecs7.tokopedia.net/img/blog/seller/2018/03/Banner-Cara-Pasang-Iklan-Headline.jpg"),
                CarouselImage("Image 3", "https://i2.wp.com/thidiweb.com/wp-content/uploads/2018/07/ide-berdirinya-tokopedia.jpg?resize=940%2C340&ssl=1"),
                CarouselImage("Image 4", "https://media.cdn.gradconnection.com/Tokopedia_banner_SgDTOzp.jpg"),
                CarouselImage("Image 5", "https://media.cdn.gradconnection.com/Tokopedia_-_Banner2_EJHv4JU.jpeg")
        )
        // set the adapter
        val adapter = ImageCarouselAdapter(images)

        // input the adapter into banner holder (ViewPager2)
        vpBannerHolder.adapter = adapter

        // set the count indicator same as adapter total size
        indicator.count = adapter.itemCount

        // set the indicator to be moving along with the ViewPager2
        // create the anonymous object with the type of ViewPager2.OnPageChangeCallback() to read the position of the current page selected
        vpBannerHolder.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                indicator.setSelected(position)
            }
        })
    }


}