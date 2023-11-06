package com.example.secondnavcomp

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.secondnavcomp.databinding.ActivityMainBinding
import com.example.secondnavcomp.databinding.FragmentCBinding


class CFragment : Fragment() {

    lateinit var binding: FragmentCBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentCBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cFragment.setOnClickListener { v->
            Navigation.findNavController(v).navigate(R.id.action_c_to_d)
        }
    }

}