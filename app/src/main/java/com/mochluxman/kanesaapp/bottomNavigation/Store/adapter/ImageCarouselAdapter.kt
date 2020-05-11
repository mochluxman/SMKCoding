package com.mochluxman.kanesaapp.bottomNavigation.Store.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mochluxman.kanesaapp.R
import com.mochluxman.kanesaapp.bottomNavigation.Store.model.CarouselImage
import kotlinx.android.synthetic.main.image_carousel.view.*

// Image Carousel Adapter with list of Carousel Image
class ImageCarouselAdapter(
        private var images: List<CarouselImage>
) : RecyclerView.Adapter<ImageCarouselAdapter.ImageCarouselViewHolder>() {

    inner class ImageCarouselViewHolder(
            itemView: View
    ) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageCarouselViewHolder {
        // Set the layout inflater to inflate this layout and put it into ImageCarouselViewHolder
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_carousel, parent, false)
        return ImageCarouselViewHolder(view)
    }

    override fun getItemCount(): Int = images.count()

    override fun onBindViewHolder(holder: ImageCarouselViewHolder, position: Int) {
        val imageUrl = images[position]
        Glide.with(holder.itemView)
                .load(imageUrl.url)
                .centerCrop()
                .into(holder.itemView.ivBannerImage)
    }
}