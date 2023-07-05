package com.itis.stock_app.exam_sem2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.stock_app.R
import com.itis.stock_app.databinding.FragmentExamSem2Binding

class ExamSem2Fragment : Fragment(R.layout.fragment_exam_sem2) {
    private var binding: FragmentExamSem2Binding? = null
    private var adapter: SubjectSem2Adapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentExamSem2Binding.bind(view)
        initAdapter()

        binding?.run {
            btnExitSem2.setOnClickListener {
                findNavController().navigate(R.id.action_examSem2Fragment_to_examFragment)
            }
        }
    }


    private fun initAdapter() {
        adapter = SubjectSem2Adapter(SubjectSem2Repository.list) {
            subjectSem2 ->
            val bundle = SubjectSem2Fragment.createBundle(subjectSem2.id)
            findNavController().navigate(
                R.id.action_examSem2Fragment_to_subjectSem2Fragment,
            bundle)
        }
        binding?.rvSubjectsSem2?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}