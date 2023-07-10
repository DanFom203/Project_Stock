package com.itis.stock_app.set_off

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.itis.stock_app.R
import com.itis.stock_app.databinding.ItemSetOffBinding

class SetOffItem(
    private val binding: ItemSetOffBinding,
    private val glide: RequestManager,
    private val onItemClick: (SetOff) -> Unit,
) : ViewHolder(binding.root) {

    private val options: RequestOptions = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.NONE)

    fun onBind(setOff: SetOff) {
        binding.run {
            tvTitle.text = setOff.name

            glide
                .load(setOff.urlSetOffPicture)
                .placeholder(R.drawable.load)
                .error(R.drawable.error)
                .apply(options)
                .into(ivImage)

            root.setOnClickListener {
                onItemClick(setOff)
            }
        }
    }
}