package com.itis.stock_app.set_off

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.itis.stock_app.R
import com.itis.stock_app.databinding.FragmentSetOffBinding

class SetOffFragment : Fragment(R.layout.fragment_set_off) {

    private var binding: FragmentSetOffBinding? = null
    private var adapter: SetOffAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSetOffBinding.bind(view)
        initAdapter()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        private const val ARG_NAME = "ARG_NAME"
        private const val ARG_AGE = "ARG_AGE"

        fun createBundle(name : String, age : Int) : Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_NAME, name)
            bundle.putInt(ARG_AGE, age)
            return bundle
        }
    }

    protected fun initAdapter() {
        adapter = SetOffAdapter(
            list = SetOffRepository.list,
            glide = Glide.with(this),
            onItemClick = { fruit ->
                findNavController().navigate(
                    R.id.action_setOffFragment_to_setOffInformationFragment,
                    InformationFragment.createBundle(fruit.id)
                )
            }
        )
        binding?.rvSetOff?.adapter = adapter
    }
}