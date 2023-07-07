package com.itis.stock_app.set_off

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.itis.stock_app.databinding.ItemSetOffBinding

class SetOffAdapter(
    private var list: List<SetOff>,
    private val glide: RequestManager,
    private val onItemClick: (SetOff) -> Unit,
) : RecyclerView.Adapter<SetOffItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            SetOffItem = SetOffItem(
        ItemSetOffBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        ),
        glide = glide,
        onItemClick = onItemClick,
    )

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SetOffItem, position: Int) {
        holder.onBind(list[position])
    }
}