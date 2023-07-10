package com.itis.stock_app.set_off

import android.annotation.SuppressLint
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
import com.itis.stock_app.databinding.FragmentSetOffInfoBinding


class InformationFragment : Fragment(R.layout.fragment_set_off_info) {
    private var binding: FragmentSetOffInfoBinding? = null
    private val options: RequestOptions = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.ALL)
    private var likeCount = 0
    private var dislikeCount = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSetOffInfoBinding.bind(view)
        binding?.btnToSetOffFragment?.setOnClickListener {
            findNavController().navigateUp()
        }
        val setOff = getInfo()
        val setOffId = requireArguments().getInt(ARG_ID)
        setLikeCounter(savedInstanceState, setOffId)
        setDislikeCounter(savedInstanceState, setOffId)
        setInfo(setOff)
        setImage(setOff)
    }

    private fun setLikeCounter(savedInstanceState: Bundle?, setOffId: Int) {
        val pref = context?.getSharedPreferences("LikeCounter", MODE_PRIVATE)
        pref?.getInt(ARG_LIKECOUNT + setOffId, -1).takeIf { it!! > -1 }?.let {
            likeCount = it
        }

        if (savedInstanceState != null) {
            likeCount = savedInstanceState.getInt(ARG_LIKECOUNT + setOffId)
        }
        binding?.btnLike?.setOnClickListener {
            likeCount++
            pref?.edit {
                putInt(ARG_LIKECOUNT + setOffId, likeCount)
            }
            binding?.tvLikes?.text = likeCount.toString()
        }
    }

    private fun setDislikeCounter(savedInstanceState: Bundle?, setOffId: Int) {
        val pref = context?.getSharedPreferences("DislikeCounter", MODE_PRIVATE)
        pref?.getInt(ARG_DISLIKECOUNT + setOffId, -1).takeIf { it!! > -1 }?.let {
            dislikeCount = it
        }

        if (savedInstanceState != null) {
            dislikeCount = savedInstanceState.getInt(ARG_DISLIKECOUNT + setOffId)
        }

        binding?.btnDislike?.setOnClickListener {
            dislikeCount++
            pref?.edit {
                putInt(ARG_DISLIKECOUNT + setOffId, dislikeCount)
            }
            binding?.tvDislikes?.text = dislikeCount.toString()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setInfo(setOff: SetOff) {
        with(binding) {
            this?.tvName?.text = setOff.professorName
            this?.tvComplexity?.text = "Сложность: ${setOff.complexity}"
            this?.tvAdvise?.text = setOff.advices
            this?.tvExamples?.text = setOff.exampleOfTasksAndExercises
            this?.tvLikes?.text = likeCount.toString()
            this?.tvDislikes?.text = dislikeCount.toString()
        }
    }

    private fun getInfo(): SetOff {
        val id = arguments?.getInt(ARG_ID)
        return SetOffRepository.list.single { it.id == id }
    }

    private fun setImage(setOff: SetOff) {
        binding?.imgTeacher?.let {
            Glide.with(this)
                .load(setOff.urlProfessorPicture)
                .placeholder(R.drawable.load)
                .error(R.drawable.error)
                .apply(options)
                .into(binding!!.imgTeacher)
        }
    }

    companion object {
        private const val ARG_ID = "ARG_ID"
        private const val ARG_LIKECOUNT = "ARG_LIKECOUNT"
        private const val ARG_DISLIKECOUNT = "ARG_DISLIKECOUNT"

        fun createBundle(id: Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(ARG_ID, id)
            return bundle
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}