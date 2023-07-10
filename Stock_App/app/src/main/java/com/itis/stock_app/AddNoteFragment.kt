package com.itis.stock_app

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.stock_app.databinding.FragmentAddNoteBinding
import io.realm.Realm


class AddNoteFragment : Fragment(R.layout.fragment_add_note) {

    private var binding: FragmentAddNoteBinding? = null
    private var count = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddNoteBinding.bind(view)

        Realm.init(requireContext())
        val realm: Realm = Realm.getDefaultInstance()

        binding?.run {
            btnSave.setOnClickListener {
                val title: String = etTitle.text.toString()
                val desc: String = etDesc.text.toString()
                val createdTime: Long = System.currentTimeMillis()

                realm.beginTransaction()
                val note: Note = realm.createObject(Note::class.java)
                note.title = title
                note.description = desc
                note.createdTime = createdTime
                realm.commitTransaction()
                Toast.makeText(context, "Сохранено", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_addNoteFragment_to_notesFragment)
            }

            btnExit.setOnClickListener {
                findNavController().navigate(R.id.action_addNoteFragment_to_notesFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        private const val ARG_COUNT = "ARG_COUNT"
    }
}