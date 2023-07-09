package com.itis.stock_app.exam_sem1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.itis.stock_app.databinding.ItemSubjectSem1Binding

class SubjectSem1Adapter(
    private var list: List<SubjectSem1>,
    private val onItemClick: (SubjectSem1) -> Unit,
) : RecyclerView.Adapter<SubjectSem1Item>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            SubjectSem1Item = SubjectSem1Item (
        ItemSubjectSem1Binding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        ),
        onItemClick = onItemClick
    )

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SubjectSem1Item, position: Int) {
        holder.onBind(list[position])
    }

    fun getItem(position: Int): SubjectSem1 {
        return list[position]
    }
}