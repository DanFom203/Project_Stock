package com.itis.stock_app.main_screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.stock_app.R
import com.itis.stock_app.databinding.FragmentMainAboutAppBinding

class AboutAppFragment: Fragment(R.layout.fragment_main_about_app) {
    private var binding: FragmentMainAboutAppBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainAboutAppBinding.bind(view)
        binding?.btnExitToMainScreen?.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}