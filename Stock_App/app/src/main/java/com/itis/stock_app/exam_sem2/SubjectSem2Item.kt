package com.itis.stock_app.exam_sem2

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.itis.stock_app.databinding.ItemSubjectSem2Binding

class SubjectSem2Item(
    private val binding: ItemSubjectSem2Binding,
    private val onItemClick: (SubjectSem2) -> Unit,
    ) : ViewHolder(binding.root) {

        fun onBind(subjectSem2: SubjectSem2) {
            binding.run {
                tvTitleSem2.text = subjectSem2.name
                Glide.with(binding!!.root)
                    .load(subjectSem2.imageUrl)
                    .into(ivSubjectSem2Image)

                root.setOnClickListener {
                    onItemClick(subjectSem2)
                }
            }
        }
}