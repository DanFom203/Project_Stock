package com.itis.stock_app.main_screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.itis.stock_app.R
import com.itis.stock_app.databinding.FragmentMainBinding
import com.itis.stock_app.set_off.InformationFragment
import com.itis.stock_app.set_off.SetOffAdapter
import com.itis.stock_app.set_off.SetOffRepository

class MainFragment : Fragment(R.layout.fragment_main) {
    private var binding: FragmentMainBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding?.run{
            btnAboutProgram.setOnClickListener{
                findNavController().navigate(R.id.action_mainFragment_to_aboutAppFragment)
            }
            btnAboutCreators.setOnClickListener{
                findNavController().navigate(R.id.action_mainFragment_to_aboutCreatorsFragment)
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
