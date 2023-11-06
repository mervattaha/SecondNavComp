package com.example.secondnavcomp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.secondnavcomp.databinding.FragmentABinding


class AFragment : Fragment() {

    lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentABinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.aFragment.setOnClickListener {v->
            val action = AFragmentDirections.actionAToB("mobile App developer Eng. Mervat Taha")
            Navigation.findNavController(v).navigate(action)
        }
        binding.bFragment.setOnClickListener { v->
            Navigation.findNavController(v).navigate(R.id.action_a_to_c)
        }

    }

}