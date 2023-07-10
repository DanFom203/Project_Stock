package com.itis.stock_app.exam_sem1

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.itis.stock_app.R
import com.itis.stock_app.databinding.ItemSubjectSem1Binding

class SubjectSem1Item(
    private val binding: ItemSubjectSem1Binding,
    private val onItemClick: (SubjectSem1) -> Unit,
    ) : ViewHolder(binding.root) {

    private val options: RequestOptions = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.NONE)

        fun onBind(subjectSem1: SubjectSem1) {
            binding.run {
                tvTitleSem1.text = subjectSem1.name
                Glide.with(binding.root)
                    .load(subjectSem1.imageUrl)
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .apply(options)
                    .into(ivSubjectSem1Image)

                root.setOnClickListener {
                    onItemClick(subjectSem1)
                }
            }
        }
}