package com.itis.stock_app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.itis.stock_app.databinding.FragmentNotesBinding
import io.realm.Realm
import io.realm.RealmChangeListener
import io.realm.RealmResults
import io.realm.Sort


class NotesFragment : Fragment(R.layout.fragment_notes) {
    private var binding: FragmentNotesBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNotesBinding.bind(view)

        binding?.run {
            btnAddNote.setOnClickListener {
                findNavController().navigate(R.id.action_notesFragment_to_addNoteFragment)
            }
        }

        Realm.init(requireContext())
        val realm: Realm = Realm.getDefaultInstance()
        val notesList: RealmResults<Note> = realm.where(Note::class.java).findAll().sort("createdTime", Sort.DESCENDING)

        binding?.run {
            rvNotes.layoutManager = LinearLayoutManager(requireContext())
            val noteAdapter = NoteAdapter(requireContext(), notesList)
            rvNotes.adapter = noteAdapter

            notesList.addChangeListener(RealmChangeListener<RealmResults<Note?>?> {
                noteAdapter.notifyDataSetChanged()
            })
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}

