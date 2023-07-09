package com.itis.stock_app.exam_sem1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.stock_app.R
import com.itis.stock_app.databinding.FragmentExamSem1Binding

class ExamSem1Fragment : Fragment(R.layout.fragment_exam_sem1) {
    private var binding: FragmentExamSem1Binding? = null
    private var adapter: SubjectSem1Adapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentExamSem1Binding.bind(view)
        initAdapter()

        binding?.run {
            btnExitSem1.setOnClickListener {
                findNavController().navigate(R.id.action_examSem1Fragment_to_examFragment)
            }
        }
    }


    private fun initAdapter() {
        adapter = SubjectSem1Adapter(SubjectSem1Repository.list) {
            subjectSem1 ->
            val bundle = SubjectSem1Fragment.createBundle(subjectSem1.id)
            findNavController().navigate(
                R.id.action_examSem1Fragment_to_subjectSem1Fragment,
            bundle)
        }
        binding?.rvSubjectsSem1?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}