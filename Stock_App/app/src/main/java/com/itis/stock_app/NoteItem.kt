package com.itis.stock_app

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.itis.stock_app.databinding.ItemNoteBinding
import java.text.DateFormat

class NoteItem(
    private val binding: ItemNoteBinding
    ) : ViewHolder(binding.root) {

        fun onBind(note: Note) {
            binding.run {
                tvTitle.text = note.title
                tvDesc.text = note.description
                tvTime.text = DateFormat.getDateTimeInstance().format(note.createdTime)
            }
        }
    }