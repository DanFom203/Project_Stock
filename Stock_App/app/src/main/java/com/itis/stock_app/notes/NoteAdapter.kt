package com.itis.stock_app.notes

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.itis.stock_app.R
import com.itis.stock_app.databinding.ItemNoteBinding
import io.realm.Realm
import io.realm.RealmResults

class NoteAdapter(
    private var context: Context,
    private var notesList: RealmResults<Note>
) : RecyclerView.Adapter<NoteItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            NoteItem = NoteItem(
        ItemNoteBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        )
    )


    override fun getItemCount(): Int {
        return notesList.size
    }

    override fun onBindViewHolder(holder: NoteItem, position: Int) {
        holder.onBind(notesList[position]!!)

        holder.itemView.setOnLongClickListener {
            val popupMenu: PopupMenu = PopupMenu(context, holder.itemView)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action_delete -> {
                        val realm: Realm = Realm.getDefaultInstance()
                        realm.beginTransaction()
                        notesList[position]!!.deleteFromRealm()
                        realm.commitTransaction()
                        Toast.makeText(context, "Удалено", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> true
                }
            })
            popupMenu.show()
            true
        }
    }
}