package com.itis.stock_app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.stock_app.databinding.FragmentExamBinding

class ExamFragment : Fragment(R.layout.fragment_exam) {
    private var binding: FragmentExamBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentExamBinding.bind(view)

        binding?.run {

            btn2sem.setOnClickListener{
                findNavController().navigate(R.id.action_examFragment_to_examSem2Fragment)

            btn1sem.setOnClickListener{
                findNavController().navigate(R.id.action_examFragment_to_examSem1Fragment)

            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}