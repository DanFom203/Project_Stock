package com.itis.stock_app.exam_sem1

import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.itis.stock_app.R
import com.itis.stock_app.databinding.FragmentSubjectSem1Binding


class SubjectSem1Fragment : Fragment(R.layout.fragment_subject_sem1) {
    private val options: RequestOptions = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.ALL)

    private var countLike = 0
    private var countDislike = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentSubjectSem1Binding.bind(view)

        val adapter = SubjectSem1Adapter(SubjectSem1Repository.list) {}

        val subjId = requireArguments().getInt(ARG_ID)
        val subject = adapter.getItem(subjId)

        val pref = requireContext().getSharedPreferences("Default", MODE_PRIVATE)
        pref.getInt(ARG_LIKE_COUNT + subjId.toString(), -1).takeIf { it > -1 }?.let {
            countLike = it }

        pref.getInt(ARG_DISLIKE_COUNT + subjId.toString(), -1).takeIf { it > -1 }?.let {
            countDislike = it }

        if (savedInstanceState != null) {
            countLike = savedInstanceState.getInt(ARG_LIKE_COUNT + subjId.toString())
            countDislike = savedInstanceState.getInt(ARG_DISLIKE_COUNT + subjId.toString())
        }

        binding.run {
            tvName.text = subject.teachName
            tvComplexity.text = "Сложность: " + subject.complexity
            tvDesc.text = subject.description
            tvExamples.text = subject.example
            tvLikes.text = countLike.toString()
            tvDislikes.text = countDislike.toString()
            Glide.with(binding.root)
                .load(subject.teacherUrl)
                .placeholder(R.drawable.load)
                .error(R.drawable.error)
                .apply(options)
                .into(imgTeacher)

            btnLike.setOnClickListener {
                countLike++
                pref.edit {
                    putInt(ARG_LIKE_COUNT + subjId.toString(), countLike)
                }
                tvLikes.text = countLike.toString()
            }

            btnDislike.setOnClickListener {
                countDislike++
                pref.edit {
                    putInt(ARG_DISLIKE_COUNT + subjId.toString(), countDislike)
                }
                tvDislikes.text = countDislike.toString()
            }

            btnExit.setOnClickListener{
                findNavController().navigate(R.id.action_subjectSem1Fragment_to_examSem1Fragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    companion object {
        private const val ARG_ID = "ARG_ID"
        private const val ARG_LIKE_COUNT = "ARG_LIKE_COUNT_SEM1"
        private const val ARG_DISLIKE_COUNT = "ARG_DISLIKE_COUNT_SEM1"

        fun createBundle(idSubj: Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(ARG_ID, idSubj)
            return bundle
        }
    }
}
