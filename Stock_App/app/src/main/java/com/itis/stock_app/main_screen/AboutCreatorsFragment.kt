package com.itis.stock_app.main_screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.stock_app.R
import com.itis.stock_app.databinding.FragmentMainAboutCreatorsBinding

class AboutCreatorsFragment: Fragment(R.layout.fragment_main_about_creators) {
    private var binding: FragmentMainAboutCreatorsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainAboutCreatorsBinding.bind(view)
        binding?.btnExitToMainScreen?.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}