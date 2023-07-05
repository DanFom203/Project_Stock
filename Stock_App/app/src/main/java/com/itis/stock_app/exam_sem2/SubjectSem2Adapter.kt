package com.itis.stock_app.exam_sem2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.itis.stock_app.databinding.ItemSubjectSem2Binding

class SubjectSem2Adapter(
    private var list: List<SubjectSem2>,
    private val onItemClick: (SubjectSem2) -> Unit,
) : RecyclerView.Adapter<SubjectSem2Item>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            SubjectSem2Item = SubjectSem2Item (
        ItemSubjectSem2Binding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        ),
        onItemClick = onItemClick
    )

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SubjectSem2Item, position: Int) {
        holder.onBind(list[position])
    }

    fun getItem(position: Int): SubjectSem2 {
        return list[position]
    }
}